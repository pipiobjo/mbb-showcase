package com.prodyna.mbb.sc.series.repository;

import com.prodyna.mbb.sc.series.service.SeriesDomainObject;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriesRepository extends Neo4jRepository<SeriesDomainObject, Long> {
}
