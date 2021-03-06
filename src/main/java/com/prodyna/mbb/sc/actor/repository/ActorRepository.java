package com.prodyna.mbb.sc.actor.repository;

import com.prodyna.mbb.sc.actor.service.ActorDomainObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorRepository extends Neo4jRepository<ActorDomainObject, Long> {

    Page<ActorDomainObject> findByName(String name, Pageable page);

    ActorDomainObject findByName(String name);
}
