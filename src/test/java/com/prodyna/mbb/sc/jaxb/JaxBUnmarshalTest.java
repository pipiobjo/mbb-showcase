package com.prodyna.mbb.sc.jaxb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.prodyna.mbb.sc.contribution.DataType;


@RunWith(SpringRunner.class)
public class JaxBUnmarshalTest {

    @Test
    public void testUnmarshalling() throws JAXBException {
	File file = new File("src/test/resources/121361.xml");
	JAXBContext jaxbContext = JAXBContext.newInstance(DataType.class);
	Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	DataType data = (DataType) jaxbUnmarshaller.unmarshal(file);
	assertNotNull(data);
	assertEquals(105, data.getEpisode().size());
	data.getEpisode().stream().forEach(org.junit.Assert::assertNotNull);
    }

}
