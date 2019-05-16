package com.prodyna.mbb.sc.series.service;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

@Data
public class SeriesDomainObject {

    @Id
    @GeneratedValue
    private Long id;


    private int originalId;
    private List<String> actors;
    private String airsDayOfWeek;
    private Calendar airsTime;
    private String contentRating;
    private Calendar firstAired;
    private String genre;
    private String imdbid;
    private String language;
    private String network;
    private String networkID;
    private String overview;
    private BigDecimal rating;
    private int ratingCount;
    private int runtime;
    private int seriesID;
    private String name;
    private String status;
    private String added;
    private String addedBy;
    private String banner;
    private String fanart;
    private Calendar finaleAired;
    private int lastupdated;
    private String poster;
    private int tmsWantedOld;
    private String zap2ItId;
}
