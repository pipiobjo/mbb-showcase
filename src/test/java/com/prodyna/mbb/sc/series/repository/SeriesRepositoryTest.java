package com.prodyna.mbb.sc.series.repository;

import com.prodyna.mbb.sc.contribution.DataType;
import com.prodyna.mbb.sc.contribution.EpisodeType;
import com.prodyna.mbb.sc.contribution.SeriesType;
import com.prodyna.mbb.sc.episode.mapping.EpisodeMapperManual;
import com.prodyna.mbb.sc.episode.repository.EpisodeRepository;
import com.prodyna.mbb.sc.episode.service.EpisodeDomainObject;
import com.prodyna.mbb.sc.series.mapping.SeriesMapperManual;
import com.prodyna.mbb.sc.series.service.SeriesDomainObject;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("local")
public class SeriesRepositoryTest {

    @Autowired
    private SeriesMapperManual seriesMapperManual;

    @Autowired
    private EpisodeMapperManual episodeMapperManual;

    @Autowired
    private SeriesRepository seriesRepository;

    @Test
    public void bar() throws Exception {

        File file = new File("src/test/resources/121361.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(DataType.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        DataType data = (DataType) jaxbUnmarshaller.unmarshal(file);
        assertNotNull(data);
        assertEquals(105, data.getEpisode().size());

        SeriesType series = data.getSeries();


        SeriesDomainObject seriesDomainObject = seriesMapperManual.toDomain(series);

        SeriesDomainObject saved = seriesRepository.save(seriesDomainObject);

        assertNotNull(saved);
    }

    @Test
    public void theGreatFoo() throws Exception {

        File file = new File("src/test/resources/121361.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(DataType.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        DataType data = (DataType) jaxbUnmarshaller.unmarshal(file);
        assertNotNull(data);
        assertEquals(105, data.getEpisode().size());

        SeriesType series = data.getSeries();


        SeriesDomainObject seriesDomainObject = seriesMapperManual.toDomain(series);

        Set<EpisodeDomainObject> episodes = data.getEpisode().stream()
                .map(episodeType -> episodeMapperManual.toDomain(episodeType))
                .collect(Collectors.toSet());

        seriesDomainObject.setEpisodes(episodes);

        SeriesDomainObject saved = seriesRepository.save(seriesDomainObject);

        assertNotNull(saved);
    }

}