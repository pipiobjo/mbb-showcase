package com.prodyna.mbb.sc.contribution.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.prodyna.mbb.sc.contribution.service.PersistenceService;

@RestController("/contribution")
public class XmlRestController {

    @Autowired
    private PersistenceService persistenceService;

    @PreAuthorize("hasRole('Role.CONTRIBUTOR_ROLE')")
    @RequestMapping(value = "/upload",  method = RequestMethod.POST, consumes = {"multipart/form-data"})
    public ResponseEntity<String> upload(@RequestParam MultipartFile file) throws Exception {
	try {
	    persistenceService.transformAndPersist(file);
        } catch (Exception e) {
	    return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
        return new ResponseEntity<String>("File successfully uploaded", HttpStatus.OK);
    }

    @PreAuthorize("hasRole('Role.CONTRIBUTOR_ROLE')")
    @RequestMapping(value = "/uploadMulti",  method = RequestMethod.POST, consumes = {"multipart/form-data"})
    public ResponseEntity<String> uploadMulti(@RequestParam MultipartFile[] files) throws Exception {
	StringBuilder successFileNames = new StringBuilder();
	StringBuilder errorFileNames = new StringBuilder();

	for (MultipartFile file : files) {
		try {
		    persistenceService.transformAndPersist(file);
	            successFileNames.append(", ").append(file.getOriginalFilename());
	        } catch (Exception e) {
	            e.printStackTrace();
	            errorFileNames.append(", ").append(file.getOriginalFilename());
		}
	}
        return new ResponseEntity<String>(printSuccessFiles(successFileNames) +
        	printErrorFiles(errorFileNames), HttpStatus.OK);
    }

    private String printSuccessFiles(final StringBuilder sucessFileNames) {
	return printFiles("Successfully uploaded files: ", sucessFileNames);
    }

    private String printErrorFiles(final StringBuilder errorFileNames) {
	return printFiles("Files with error: ", errorFileNames);
    }

    private String printFiles(final String prefixText, final StringBuilder fileNames) {
	if(StringUtils.isEmpty(fileNames.toString())) {
	    return StringUtils.EMPTY;
	}
	return prefixText + fileNames.toString().replaceFirst(",", "")  + "\n";
    }
}
