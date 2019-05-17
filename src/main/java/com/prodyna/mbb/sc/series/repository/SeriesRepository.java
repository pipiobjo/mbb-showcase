package com.prodyna.mbb.sc.series.repository;

import com.prodyna.mbb.sc.series.service.SeriesDomainObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriesRepository extends Neo4jRepository<SeriesDomainObject, Long> {

    Page<SeriesDomainObject> findByName(String name, Pageable page);

    SeriesDomainObject findByOriginalId(int id);

}
