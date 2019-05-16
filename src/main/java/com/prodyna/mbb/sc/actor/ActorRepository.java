package com.prodyna.mbb.sc.actor;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends Neo4jRepository<ActorDomainObject, Long> {
}
