package com.prodyna.mbb.sc.actor.controller;

import com.prodyna.mbb.sc.actor.service.ActorDomainObject;
import com.prodyna.mbb.sc.actor.service.ActorService;
import com.prodyna.mbb.sc.util.PageableUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
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

    @Value("${mvc.page.default.size}")
    private Integer defaultPageSize;

    @Value("${mvc.page.default.start}")
    private Integer defaultPageStart;

    @RequestMapping("/actor")
    public Page<ActorDomainObject> findAll(@RequestParam(required = false)  Integer page, @RequestParam(required = false)  Integer size) {
        return actorService.findAll(PageableUtil.getPageable(page, size, defaultPageStart, defaultPageSize));
    }

    @RequestMapping("/actor/{id}")
    public ActorDomainObject findById(@PathVariable Long id) {
        return actorService.findById(id);
    }

    @RequestMapping("/actor/{name}")
    public Page<ActorDomainObject> findByName(@PathVariable String name, @RequestParam(required = false) Integer page, @RequestParam(required = false)  Integer size) {
        return actorService.findByName(name, PageableUtil.getPageable(page, size, defaultPageStart, defaultPageSize));
    }

}
