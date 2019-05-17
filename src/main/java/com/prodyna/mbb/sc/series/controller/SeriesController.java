package com.prodyna.mbb.sc.series.controller;

import com.prodyna.mbb.sc.series.service.SeriesDomainObject;
import com.prodyna.mbb.sc.series.service.SeriesService;
import com.prodyna.mbb.sc.util.PageableUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/series")
public class SeriesController {

    private final SeriesService seriesService;

    @Autowired
    public SeriesController(SeriesService seriesService) {
        this.seriesService = seriesService;
    }

    @Value("${mvc.page.default.size}")
    private Integer defaultPageSize;

    @Value("${mvc.page.default.start}")
    private Integer defaultPageStart;

    @RequestMapping("/series")
    public Page<SeriesDomainObject> findAll(@RequestParam(required = false)  Integer page, @RequestParam(required = false)  Integer size) {
        return seriesService.findAll(PageableUtil.getPageable(page, size, defaultPageStart, defaultPageSize));
    }

    @RequestMapping("/series/id/{id}")
    public SeriesDomainObject findById(@PathVariable String id) {
        return seriesService.findById(id);
    }

    @RequestMapping("/series/name/{name:[a-zA-Z0-9]*}")
    public Page<SeriesDomainObject> findByName(@PathVariable String name, @RequestParam(required = false)  Integer page, @RequestParam(required = false)  Integer size) {
        return seriesService.findByName(name, PageableUtil.getPageable(page, size, defaultPageStart, defaultPageSize));
    }

}
