package com.prodyna.mbb.sc.episode.service;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Calendar;

@Data
public class EpisodeDomainObject {

    private String name;

    private int id;
    private int combinedEpisodenumber;
    private int combinedSeason;
    private String dvdChapter;
    private String dvdDiscid;
    private String dvdEpisodenumber;
    private String dvdSeason;
    private String director;
    private int epImgFlag;
    private String episodeName;
    private int episodeNumber;
    private Calendar firstAired;
    private String guestStars;
    private String imdbid;
    private String language;
    private String overview;
    private int productionCode;
    private BigDecimal rating;
    private int ratingCount;
    private int seasonNumber;
    private String writer;
    private String absoluteNumber;
    private String airsafterSeason;
    private String airsbeforeEpisode;
    private String airsbeforeSeason;
    private String filename;
    private int isMovie;
    private int lastupdated;
    private int seasonid;
    private int seriesid;
    private String thumbAdded;
    private int thumbHeight;
    private int thumbWidth;

}
