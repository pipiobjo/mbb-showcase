package com.prodyna.mbb.sc.actor.service;

import com.prodyna.mbb.sc.actor.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ActorService {

    private final ActorRepository actorRepository;

    @Autowired
    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public Page<ActorDomainObject> findAll(Pageable page) {
        return actorRepository.findAll(page);
    }

    public ActorDomainObject findById(Long id) {
        return actorRepository.findById(id).orElseGet(null);
    }

    public Page<ActorDomainObject> findByName(String name, Pageable page) {
        return actorRepository.findByName(name, page);
    }
}
