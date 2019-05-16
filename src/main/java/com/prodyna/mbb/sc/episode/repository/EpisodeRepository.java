package com.prodyna.mbb.sc.episode.repository;

import com.prodyna.mbb.sc.episode.service.EpisodeDomainObject;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpisodeRepository extends Neo4jRepository<EpisodeDomainObject, Long> {
}
