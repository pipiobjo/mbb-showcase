package com.prodyna.mbb.sc.episode.service;

import com.prodyna.mbb.sc.episode.repository.EpisodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EpisodeService {

    private final EpisodeRepository episodeRepository;

    @Autowired
    public EpisodeService(EpisodeRepository episodeRepository) {
        this.episodeRepository = episodeRepository;
    }

    public Page<EpisodeDomainObject> findAll(Pageable page) {
        return episodeRepository.findAll(page);
    }

    public EpisodeDomainObject findById(Long id) {
        return episodeRepository.findById(id).orElse(null);
    }

    public Page<EpisodeDomainObject> findByName(String name, Pageable page) {
        return episodeRepository.findByName(name, page);
    }
}
