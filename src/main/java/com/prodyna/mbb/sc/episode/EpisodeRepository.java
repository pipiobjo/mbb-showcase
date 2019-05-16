package com.prodyna.mbb.sc.episode;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpisodeRepository extends Neo4jRepository<EpisodeDomainObject, Long> {
}
