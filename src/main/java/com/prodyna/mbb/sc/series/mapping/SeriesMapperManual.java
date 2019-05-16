package com.prodyna.mbb.sc.series.mapping;

import com.prodyna.mbb.sc.contribution.SeriesType;
import com.prodyna.mbb.sc.series.service.SeriesDomainObject;

public class SeriesMapperManual implements SeriesMapper {

    @Override
    public SeriesDomainObject getSeries(SeriesType seriesType) {
        SeriesDomainObject seriesDomainObject = new SeriesDomainObject();
        seriesDomainObject.setId(seriesType.getId());
        seriesDomainObject.setActors(seriesType.getActors());
        seriesDomainObject.setAirsDayOfWeek(seriesType.getAirsDayOfWeek());
        seriesDomainObject.setAirsTime(seriesType.getAirsTime());
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
        seriesDomainObject.setFinaleAired(seriesType.getFinaleAired());
        seriesDomainObject.setLastupdated(seriesType.getLastupdated());
        seriesDomainObject.setPoster(seriesType.getPoster());
        seriesDomainObject.setTmsWantedOld(seriesType.getTmsWantedOld());
        seriesDomainObject.setZap2ItId(seriesType.getZap2ItId());
        return seriesDomainObject;
    }
}
