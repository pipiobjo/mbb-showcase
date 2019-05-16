package com.prodyna.mbb.sc.jaxb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import com.prodyna.mbb.sc.contribution.DataType;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;


@RunWith(JUnitParamsRunner.class)
@SpringBootTest
public class JaxBUnmarshalTest {

    @Test
    @Parameters({
	"121361.xml, 105",
	"158661.xml, 90",
	"121361.xml, 105",
	"158661.xml, 90",
	"248741.xml, 138",
	"248742.xml, 103",
	"248835.xml, 154",
	"255316.xml, 123",
	"257655.xml, 131",
	"259972.xml, 93",
	"264108.xml, 91",
	"266189.xml, 102",
	"269586.xml, 100",
	"274431.xml, 87",
//	"70533.xml, 39", //corrupt xml
	"71663.xml, 684",
	"74608.xml, 262",
	"77398.xml, 215",
	"78804.xml, 281",
	"80379.xml, 244",
	"81670.xml, 199",
	"83462.xml, 173",
    })
    public void testUnmarshalling(String fileName, int numberEpisodes) throws JAXBException {
	File file = new File("src/test/resources/" + fileName);
	JAXBContext jaxbContext = JAXBContext.newInstance(DataType.class);
	Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	DataType data = (DataType) jaxbUnmarshaller.unmarshal(file);
	assertNotNull(data);
	assertEquals(numberEpisodes, data.getEpisode().size());
	data.getEpisode().stream().forEach(org.junit.Assert::assertNotNull);
    }

}
