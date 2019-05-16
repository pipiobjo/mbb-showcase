package com.prodyna.mbb.sc.episode.mapping;

import com.prodyna.mbb.sc.contribution.EpisodeType;
import com.prodyna.mbb.sc.episode.service.EpisodeDomainObject;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

//@Mapper(componentModel = "spring" )
public interface EpisodeMapper {

    EpisodeDomainObject toDomain(EpisodeType et);

}