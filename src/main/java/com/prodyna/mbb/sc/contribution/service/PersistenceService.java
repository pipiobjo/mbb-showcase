package com.prodyna.mbb.sc.contribution.service;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBException;

import com.prodyna.mbb.sc.actor.repository.ActorRepository;
import com.prodyna.mbb.sc.actor.service.ActorDomainObject;
import com.prodyna.mbb.sc.contribution.SeriesType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.prodyna.mbb.sc.contribution.DataType;
import com.prodyna.mbb.sc.contribution.EpisodeType;
import com.prodyna.mbb.sc.episode.mapping.EpisodeMapperManual;
import com.prodyna.mbb.sc.episode.repository.EpisodeRepository;
import com.prodyna.mbb.sc.episode.service.EpisodeDomainObject;
import com.prodyna.mbb.sc.series.mapping.SeriesMapperManual;
import com.prodyna.mbb.sc.series.repository.SeriesRepository;
import com.prodyna.mbb.sc.series.service.SeriesDomainObject;

import lombok.extern.java.Log;

@Log
@Service
public class PersistenceService {

    @Autowired
    private XmlParserService service;

    @Autowired
    private EpisodeMapperManual episodeMapper;

    @Autowired
    private SeriesMapperManual seriesMapper;

    @Autowired
    private SeriesRepository seriesRepository;

    @Autowired
    private ActorRepository actorRepository;


    @Autowired
    private EpisodeRepository episodeRepository;

    public void transformAndPersist(MultipartFile file) throws JAXBException, IOException {

        DataType dataType = service.unmarshal(file);

        SeriesType series = dataType.getSeries();

        SeriesDomainObject seriesDomainObject = seriesMapper.toDomain(series);

        Set<ActorDomainObject> actors = seriesDomainObject.getActors().stream()
                .map(actor -> {
                    ActorDomainObject entity = actorRepository.findByName(actor.getName());
                    if (null == entity) {
                        return actor;
                    } else {
                        return entity;
                    }
                })
                .collect(Collectors.toSet());
        seriesDomainObject.setActors(actors);


        Set<EpisodeDomainObject> episodes = dataType.getEpisode().stream()
                .map(episodeType -> episodeMapper.toDomain(episodeType))
                .map(episode -> {
                    EpisodeDomainObject entity = episodeRepository.findByEpisodeId(episode.getEpisodeId());
                    if (null == entity) {
                        return episode;
                    } else {
                        return entity;
                    }
                })
                .collect(Collectors.toSet());
        seriesDomainObject.setEpisodes(episodes);

        SeriesDomainObject saved = seriesRepository.save(seriesDomainObject);

        log.info("saved series: " + saved.getImdbid());
    }
}
