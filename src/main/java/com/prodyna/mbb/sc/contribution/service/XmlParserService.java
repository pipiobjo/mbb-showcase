package com.prodyna.mbb.sc.contribution.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.prodyna.mbb.sc.contribution.DataType;

@Service
public class XmlParserService {

    public DataType unmarshal(MultipartFile xmlFile) throws JAXBException, IOException {
	if(Objects.isNull(xmlFile)) {
	    throw new RuntimeException("XML file cannot be null.");
	}
	JAXBContext jaxbContext = JAXBContext.newInstance(DataType.class);
	Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

	return (DataType) jaxbUnmarshaller.unmarshal(convertMultiPartToFile(xmlFile));
    }

    private File convertMultiPartToFile(MultipartFile file ) throws IOException
    {
        File convFile = new File( file.getOriginalFilename() );
        FileOutputStream fos = new FileOutputStream( convFile );
        fos.write( file.getBytes() );
        fos.close();
        return convFile;
    }
}
