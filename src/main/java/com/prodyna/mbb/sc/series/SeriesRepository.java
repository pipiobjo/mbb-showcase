package com.prodyna.mbb.sc.series;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriesRepository extends Neo4jRepository<SeriesDomainObject, Long> {
}
