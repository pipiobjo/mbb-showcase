package com.prodyna.mbb.sc.actor.service;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@Data
@NodeEntity
public class ActorDomainObject {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
