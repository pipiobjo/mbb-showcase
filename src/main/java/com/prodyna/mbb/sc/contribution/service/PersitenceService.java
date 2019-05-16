package com.prodyna.mbb.sc.contribution.service;

import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBException;

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
public class PersitenceService {

    @Autowired
    private XmlParserService service;

    @Autowired
    private EpisodeMapperManual episodeMapper;

    @Autowired
    private SeriesMapperManual seriesMapper;

    @Autowired
    private EpisodeRepository episodeRepository;

    @Autowired
    private SeriesRepository seriesRepository;

    public void transformAndPersist(MultipartFile file) throws JAXBException, IOException {

	DataType dataType = service.unmarshal(file);

	List<EpisodeType> episodes = dataType.getEpisode();
	for (EpisodeType episodeType : episodes) {
	    EpisodeDomainObject episode = episodeMapper.toDomain(episodeType);
	    episodeRepository.save(episode);
	    log.info("saved episode: " + episode.getId());
	}

	SeriesDomainObject series = seriesMapper.getSeries(dataType.getSeries());
	seriesRepository.save(series);
	log.info("saved series: " + series.getId());

    }
}
