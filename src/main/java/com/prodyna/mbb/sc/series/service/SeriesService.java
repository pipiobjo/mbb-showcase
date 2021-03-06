package com.prodyna.mbb.sc.series.service;

import com.prodyna.mbb.sc.series.repository.SeriesRepository;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@NodeEntity
public class SeriesService {

    private final SeriesRepository seriesRepository;

    @Autowired
    public SeriesService(SeriesRepository seriesRepository) {
        this.seriesRepository = seriesRepository;
    }

    public Page<SeriesDomainObject> findAll(Pageable page) {
        return seriesRepository.findAll(page);
    }

    public SeriesDomainObject findById(String id) {
        return seriesRepository.findByImdbid(id);
    }

    public Page<SeriesDomainObject> findByName(String name, Pageable page) {
        return seriesRepository.findByName(name, page);
    }
}
