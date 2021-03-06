package com.prodyna.mbb.sc.episode.mapping;

import org.springframework.stereotype.Component;

import com.prodyna.mbb.sc.contribution.EpisodeType;
import com.prodyna.mbb.sc.episode.service.EpisodeDomainObject;

import java.util.Calendar;

@Component
public class EpisodeMapperManual implements EpisodeMapper {

    @Override
    public EpisodeDomainObject toDomain(EpisodeType et) {

        EpisodeDomainObject object = new EpisodeDomainObject();

        object.setEpisodeId(et.getId());

        object.setCombinedEpisodenumber(et.getCombinedEpisodenumber());
        object.setCombinedSeason(et.getCombinedSeason());
        object.setDvdChapter(et.getDVDChapter());
        object.setDvdDiscid(et.getDVDDiscid());
        object.setDvdEpisodenumber(et.getDVDEpisodenumber());
        object.setDvdSeason(et.getDVDSeason());
        object.setDirector(et.getDirector());
        object.setEpImgFlag(et.getEpImgFlag());
        object.setEpisodeName(et.getEpisodeName());
        object.setEpisodeNumber(et.getEpisodeNumber());

        Calendar firstAired = et.getFirstAired();
        if (null != firstAired) {
            object.setFirstAired(firstAired.getTime());
        }

        object.setGuestStars(et.getGuestStars());
        object.setImdbid(et.getIMDBID());
        object.setLanguage(et.getLanguage());
        object.setOverview(et.getOverview());
        object.setProductionCode(et.getProductionCode());
        object.setRating(et.getRating());
        object.setRatingCount(et.getRatingCount());
        object.setSeasonNumber(et.getSeasonNumber());
        object.setWriter(et.getWriter());
        object.setAbsoluteNumber(et.getAbsoluteNumber());
        object.setAirsafterSeason(et.getAirsafterSeason());
        object.setAirsbeforeEpisode(et.getAirsbeforeEpisode());
        object.setAirsbeforeSeason(et.getAirsbeforeSeason());
        object.setFilename(et.getFilename());
        object.setIsMovie(et.getIsMovie());
        object.setLastupdated(et.getLastupdated());
        object.setSeasonid(et.getSeasonid());
        object.setSeriesid(et.getSeriesid());
        object.setThumbAdded(et.getThumbAdded());
        object.setThumbHeight(et.getThumbHeight());
        object.setThumbWidth(et.getThumbWidth());

        return object;
    }

}
