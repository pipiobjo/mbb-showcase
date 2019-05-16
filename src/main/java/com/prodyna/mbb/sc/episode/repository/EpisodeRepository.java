package com.prodyna.mbb.sc.episode.repository;

import com.prodyna.mbb.sc.episode.service.EpisodeDomainObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpisodeRepository extends Neo4jRepository<EpisodeDomainObject, Long> {

    Page<EpisodeDomainObject> findByName(String name, Pageable page);
}
