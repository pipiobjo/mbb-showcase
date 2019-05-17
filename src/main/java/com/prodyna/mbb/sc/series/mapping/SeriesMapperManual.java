package com.prodyna.mbb.sc.series.mapping;

import com.prodyna.mbb.sc.actor.service.ActorDomainObject;
import com.prodyna.mbb.sc.contribution.SeriesType;
import com.prodyna.mbb.sc.series.service.SeriesDomainObject;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class SeriesMapperManual {


    public SeriesDomainObject toDomain(SeriesType seriesType) {
        SeriesDomainObject seriesDomainObject = new SeriesDomainObject();
        seriesDomainObject.setOriginalId(seriesType.getId());

        String[] actors = StringUtils.delimitedListToStringArray(seriesType.getActors(), "|");
        Set<ActorDomainObject> involvedActors = Arrays.stream(actors).map(actor -> {
            ActorDomainObject actorDomainObject = new ActorDomainObject();
            actorDomainObject.setName(actor);
            return actorDomainObject;
        }).collect(Collectors.toSet());

        seriesDomainObject.setActors(involvedActors);

   /*     seriesDomainObject.setActors(
                Arrays.stream(seriesType.getActors()
                        .split("|"))
                        .filter(StringUtils::isNotBlank)
                        .collect(Collectors.toList())
        ); */

        seriesDomainObject.setAirsDayOfWeek(seriesType.getAirsDayOfWeek());

        Calendar airsTime = seriesType.getAirsTime();
        if (null != airsTime) {
            seriesDomainObject.setAirsTime(airsTime.getTime());
        }

        Calendar finaleAired = seriesType.getFinaleAired();
        if (null != finaleAired) {
            seriesDomainObject.setFinaleAired(finaleAired.getTime());
        }

        seriesDomainObject.setContentRating(seriesType.getContentRating());
        seriesDomainObject.setGenre(seriesType.getGenre());
        seriesDomainObject.setImdbid(seriesType.getIMDBID());
        seriesDomainObject.setLanguage(seriesType.getLanguage());
        seriesDomainObject.setNetwork(seriesType.getNetwork());
        seriesDomainObject.setNetworkID(seriesType.getNetworkID());
        seriesDomainObject.setOverview(seriesType.getOverview());
        seriesDomainObject.setRating(seriesType.getRating());
        seriesDomainObject.setRatingCount(seriesType.getRatingCount());
        seriesDomainObject.setRuntime(seriesType.getRuntime());
        seriesDomainObject.setSeriesID(seriesType.getSeriesID());
        seriesDomainObject.setName(seriesType.getSeriesName());
        seriesDomainObject.setStatus(seriesType.getStatus());
        seriesDomainObject.setAdded(seriesType.getAdded());
        seriesDomainObject.setAddedBy(seriesType.getAddedBy());
        seriesDomainObject.setBanner(seriesType.getBanner());
        seriesDomainObject.setFanart(seriesType.getFanart());
        seriesDomainObject.setLastupdated(seriesType.getLastupdated());
        seriesDomainObject.setPoster(seriesType.getPoster());
        seriesDomainObject.setTmsWantedOld(seriesType.getTmsWantedOld());
        seriesDomainObject.setZap2ItId(seriesType.getZap2ItId());
        return seriesDomainObject;
    }
}
