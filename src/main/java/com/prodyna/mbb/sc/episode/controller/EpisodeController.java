package com.prodyna.mbb.sc.episode.controller;

import com.prodyna.mbb.sc.actor.service.ActorDomainObject;
import com.prodyna.mbb.sc.episode.service.EpisodeDomainObject;
import com.prodyna.mbb.sc.episode.service.EpisodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EpisodeController {

    private final EpisodeService episodeService;

    @Autowired
    public EpisodeController(EpisodeService episodeService) {
        this.episodeService = episodeService;
    }

    @RequestMapping("/episode")
    public Page<EpisodeDomainObject> findAll(@RequestParam Integer page, @RequestParam Integer size) {
        return episodeService.findAll(PageRequest.of(page, size));
    }

    @RequestMapping("/episode/{id}")
    public EpisodeDomainObject findById(@PathVariable Long id) {
        return episodeService.findById(id);
    }

    @RequestMapping("/episode/{name}")
    public Page<EpisodeDomainObject> findByName(@PathVariable String name, @RequestParam Integer page, @RequestParam Integer size) {
        return episodeService.findByName(name, PageRequest.of(page, size));
    }
}
