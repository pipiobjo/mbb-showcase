package com.prodyna.mbb.sc.mapper;

import com.prodyna.mbb.sc.contribution.DataType;
import com.prodyna.mbb.sc.contribution.EpisodeType;
import com.prodyna.mbb.sc.episode.mapping.EpisodeMapper;
import com.prodyna.mbb.sc.episode.service.EpisodeDomainObject;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest
public class EpisodeMapperTest {

    @Autowired
    private EpisodeMapper episodeMapperManual;

    @Test
    public void foo() throws Exception {

        File file = new File("src/test/resources/121361.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(DataType.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        DataType data = (DataType) jaxbUnmarshaller.unmarshal(file);
        assertNotNull(data);
        assertEquals(105, data.getEpisode().size());

        EpisodeType episodeType = data.getEpisode().get(0);

        EpisodeDomainObject episodeDomainObject = episodeMapperManual.toDomain(episodeType);

        assertNotNull(episodeDomainObject);
    }

}
