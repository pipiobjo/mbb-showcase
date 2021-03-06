package com.prodyna.mbb.sc.episode.controller;

import com.prodyna.mbb.sc.episode.service.EpisodeDomainObject;
import com.prodyna.mbb.sc.episode.service.EpisodeService;
import com.prodyna.mbb.sc.util.PageableUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/episode")
public class EpisodeController {

    private final EpisodeService episodeService;

    @Autowired
    public EpisodeController(EpisodeService episodeService) {
        this.episodeService = episodeService;
    }

    @Value("${mvc.page.default.size}")
    private Integer defaultPageSize;

    @Value("${mvc.page.default.start}")
    private Integer defaultPageStart;

    @RequestMapping("/episode")
    public ResponseEntity<Page<EpisodeDomainObject>> findAll(@RequestParam(required = false) Integer page, @RequestParam(required = false) Integer size) {
        return ResponseEntity.ok(episodeService.findAll(PageableUtil.getPageable(page, size, defaultPageStart, defaultPageSize)));
    }

    @RequestMapping("/episode/id/{id}")
    public EpisodeDomainObject findById(@PathVariable String id) {
        return episodeService.findById(id);
    }

    @RequestMapping("/episode/name/{name}")
    public Page<EpisodeDomainObject> findByName(@PathVariable String name, @RequestParam(required = false) Integer page, @RequestParam(required = false) Integer size) {
        return episodeService.findByName(name, PageableUtil.getPageable(page, size, defaultPageStart, defaultPageSize));
    }

}
