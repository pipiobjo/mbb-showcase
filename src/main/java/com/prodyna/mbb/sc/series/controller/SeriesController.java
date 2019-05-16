package com.prodyna.mbb.sc.series.controller;

import com.prodyna.mbb.sc.series.service.SeriesDomainObject;
import com.prodyna.mbb.sc.series.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeriesController {

    private final SeriesService seriesService;

    @Autowired
    public SeriesController(SeriesService seriesService) {
        this.seriesService = seriesService;
    }

    @RequestMapping("/series")
    public Page<SeriesDomainObject> findAll(@RequestParam Integer page, @RequestParam Integer size) {
        return seriesService.findAll(PageRequest.of(page, size));
    }

    @RequestMapping("/series/{id}")
    public SeriesDomainObject findById(@PathVariable Long id) {
        return seriesService.findById(id);
    }

    @RequestMapping("/series/{name}")
    public Page<SeriesDomainObject> findByName(@PathVariable String name, @RequestParam Integer page, @RequestParam Integer size) {
        return seriesService.findByName(name, PageRequest.of(page, size));
    }
}
