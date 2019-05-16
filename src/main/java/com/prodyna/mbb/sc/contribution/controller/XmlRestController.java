package com.prodyna.mbb.sc.contribution.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.prodyna.mbb.sc.contribution.service.XmlParserService;

@RestController
public class XmlRestController {

    @Autowired
    private XmlParserService service;

    @RequestMapping(value = "/upload",  method = RequestMethod.POST, consumes = {"multipart/form-data"})
    public String upload(@RequestParam MultipartFile file) throws Exception {
        try {
            service.unmarshal(file);
        } catch (Exception e) {
	    return "ERROR: " + e.getMessage();
	}
        return "OK";
    }
}
