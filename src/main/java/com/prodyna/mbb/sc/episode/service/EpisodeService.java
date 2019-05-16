package com.prodyna.mbb.sc.episode.service;

import com.prodyna.mbb.sc.episode.repository.EpisodeRepository;
import org.springframework.stereotype.Service;

@Service
public class EpisodeService {

    private final EpisodeRepository episodeRepository;

    public EpisodeService(EpisodeRepository episodeRepository) {
        this.episodeRepository = episodeRepository;
    }
}
