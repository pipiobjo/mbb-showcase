package com.prodyna.mbb.sc.actor.repository;

import com.prodyna.mbb.sc.actor.Domain.ActorDomainObject;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends Neo4jRepository<ActorDomainObject, Long> {
}
