package com.prodyna.mbb.sc.actor.controller;

import com.prodyna.mbb.sc.actor.service.ActorDomainObject;
import com.prodyna.mbb.sc.actor.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActorController {

    private final ActorService actorService;

    @Autowired
    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    @RequestMapping("/actor")
    public Page<ActorDomainObject> findAll(@RequestParam Integer page, @RequestParam Integer size) {
        return actorService.findAll(PageRequest.of(page, size));
    }

    @RequestMapping("/actor/{id}")
    public ActorDomainObject findById(@PathVariable Long id) {
        return actorService.findById(id);
    }

    @RequestMapping("/actor/{name}")
    public Page<ActorDomainObject> findByName(@PathVariable String name, @RequestParam Integer page, @RequestParam Integer size) {
        return actorService.findByName(name, PageRequest.of(page, size));
    }
}
