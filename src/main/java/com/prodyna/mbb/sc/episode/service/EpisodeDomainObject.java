package com.prodyna.mbb.sc.episode.service;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

@NodeEntity
public class EpisodeDomainObject {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Index
    private int episodeId;

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
    private Date firstAired;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEpisodeId() {
        return episodeId;
    }

    public void setEpisodeId(int episodeId) {
        this.episodeId = episodeId;
    }

    public int getCombinedEpisodenumber() {
        return combinedEpisodenumber;
    }

    public void setCombinedEpisodenumber(int combinedEpisodenumber) {
        this.combinedEpisodenumber = combinedEpisodenumber;
    }

    public int getCombinedSeason() {
        return combinedSeason;
    }

    public void setCombinedSeason(int combinedSeason) {
        this.combinedSeason = combinedSeason;
    }

    public String getDvdChapter() {
        return dvdChapter;
    }

    public void setDvdChapter(String dvdChapter) {
        this.dvdChapter = dvdChapter;
    }

    public String getDvdDiscid() {
        return dvdDiscid;
    }

    public void setDvdDiscid(String dvdDiscid) {
        this.dvdDiscid = dvdDiscid;
    }

    public String getDvdEpisodenumber() {
        return dvdEpisodenumber;
    }

    public void setDvdEpisodenumber(String dvdEpisodenumber) {
        this.dvdEpisodenumber = dvdEpisodenumber;
    }

    public String getDvdSeason() {
        return dvdSeason;
    }

    public void setDvdSeason(String dvdSeason) {
        this.dvdSeason = dvdSeason;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getEpImgFlag() {
        return epImgFlag;
    }

    public void setEpImgFlag(int epImgFlag) {
        this.epImgFlag = epImgFlag;
    }

    public String getEpisodeName() {
        return episodeName;
    }

    public void setEpisodeName(String episodeName) {
        this.episodeName = episodeName;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public Date getFirstAired() {
        return firstAired;
    }

    public void setFirstAired(Date firstAired) {
        this.firstAired = firstAired;
    }

    public String getGuestStars() {
        return guestStars;
    }

    public void setGuestStars(String guestStars) {
        this.guestStars = guestStars;
    }

    public String getImdbid() {
        return imdbid;
    }

    public void setImdbid(String imdbid) {
        this.imdbid = imdbid;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public int getProductionCode() {
        return productionCode;
    }

    public void setProductionCode(int productionCode) {
        this.productionCode = productionCode;
    }

    public BigDecimal getRating() {
        return rating;
    }

    public void setRating(BigDecimal rating) {
        this.rating = rating;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getAbsoluteNumber() {
        return absoluteNumber;
    }

    public void setAbsoluteNumber(String absoluteNumber) {
        this.absoluteNumber = absoluteNumber;
    }

    public String getAirsafterSeason() {
        return airsafterSeason;
    }

    public void setAirsafterSeason(String airsafterSeason) {
        this.airsafterSeason = airsafterSeason;
    }

    public String getAirsbeforeEpisode() {
        return airsbeforeEpisode;
    }

    public void setAirsbeforeEpisode(String airsbeforeEpisode) {
        this.airsbeforeEpisode = airsbeforeEpisode;
    }

    public String getAirsbeforeSeason() {
        return airsbeforeSeason;
    }

    public void setAirsbeforeSeason(String airsbeforeSeason) {
        this.airsbeforeSeason = airsbeforeSeason;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getIsMovie() {
        return isMovie;
    }

    public void setIsMovie(int isMovie) {
        this.isMovie = isMovie;
    }

    public int getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(int lastupdated) {
        this.lastupdated = lastupdated;
    }

    public int getSeasonid() {
        return seasonid;
    }

    public void setSeasonid(int seasonid) {
        this.seasonid = seasonid;
    }

    public int getSeriesid() {
        return seriesid;
    }

    public void setSeriesid(int seriesid) {
        this.seriesid = seriesid;
    }

    public String getThumbAdded() {
        return thumbAdded;
    }

    public void setThumbAdded(String thumbAdded) {
        this.thumbAdded = thumbAdded;
    }

    public int getThumbHeight() {
        return thumbHeight;
    }

    public void setThumbHeight(int thumbHeight) {
        this.thumbHeight = thumbHeight;
    }

    public int getThumbWidth() {
        return thumbWidth;
    }

    public void setThumbWidth(int thumbWidth) {
        this.thumbWidth = thumbWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EpisodeDomainObject that = (EpisodeDomainObject) o;
        return episodeId == that.episodeId &&
                combinedEpisodenumber == that.combinedEpisodenumber &&
                combinedSeason == that.combinedSeason &&
                epImgFlag == that.epImgFlag &&
                episodeNumber == that.episodeNumber &&
                productionCode == that.productionCode &&
                ratingCount == that.ratingCount &&
                seasonNumber == that.seasonNumber &&
                isMovie == that.isMovie &&
                lastupdated == that.lastupdated &&
                seasonid == that.seasonid &&
                seriesid == that.seriesid &&
                thumbHeight == that.thumbHeight &&
                thumbWidth == that.thumbWidth &&
                Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(dvdChapter, that.dvdChapter) &&
                Objects.equals(dvdDiscid, that.dvdDiscid) &&
                Objects.equals(dvdEpisodenumber, that.dvdEpisodenumber) &&
                Objects.equals(dvdSeason, that.dvdSeason) &&
                Objects.equals(director, that.director) &&
                Objects.equals(episodeName, that.episodeName) &&
                Objects.equals(firstAired, that.firstAired) &&
                Objects.equals(guestStars, that.guestStars) &&
                Objects.equals(imdbid, that.imdbid) &&
                Objects.equals(language, that.language) &&
                Objects.equals(overview, that.overview) &&
                Objects.equals(rating, that.rating) &&
                Objects.equals(writer, that.writer) &&
                Objects.equals(absoluteNumber, that.absoluteNumber) &&
                Objects.equals(airsafterSeason, that.airsafterSeason) &&
                Objects.equals(airsbeforeEpisode, that.airsbeforeEpisode) &&
                Objects.equals(airsbeforeSeason, that.airsbeforeSeason) &&
                Objects.equals(filename, that.filename) &&
                Objects.equals(thumbAdded, that.thumbAdded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, episodeId, combinedEpisodenumber, combinedSeason, dvdChapter, dvdDiscid, dvdEpisodenumber, dvdSeason, director, epImgFlag, episodeName, episodeNumber, firstAired, guestStars, imdbid, language, overview, productionCode, rating, ratingCount, seasonNumber, writer, absoluteNumber, airsafterSeason, airsbeforeEpisode, airsbeforeSeason, filename, isMovie, lastupdated, seasonid, seriesid, thumbAdded, thumbHeight, thumbWidth);
    }

    @Override
    public String toString() {
        return "EpisodeDomainObject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", episodeId=" + episodeId +
                ", combinedEpisodenumber=" + combinedEpisodenumber +
                ", combinedSeason=" + combinedSeason +
                ", dvdChapter='" + dvdChapter + '\'' +
                ", dvdDiscid='" + dvdDiscid + '\'' +
                ", dvdEpisodenumber='" + dvdEpisodenumber + '\'' +
                ", dvdSeason='" + dvdSeason + '\'' +
                ", director='" + director + '\'' +
                ", epImgFlag=" + epImgFlag +
                ", episodeName='" + episodeName + '\'' +
                ", episodeNumber=" + episodeNumber +
                ", firstAired=" + firstAired +
                ", guestStars='" + guestStars + '\'' +
                ", imdbid='" + imdbid + '\'' +
                ", language='" + language + '\'' +
                ", overview='" + overview + '\'' +
                ", productionCode=" + productionCode +
                ", rating=" + rating +
                ", ratingCount=" + ratingCount +
                ", seasonNumber=" + seasonNumber +
                ", writer='" + writer + '\'' +
                ", absoluteNumber='" + absoluteNumber + '\'' +
                ", airsafterSeason='" + airsafterSeason + '\'' +
                ", airsbeforeEpisode='" + airsbeforeEpisode + '\'' +
                ", airsbeforeSeason='" + airsbeforeSeason + '\'' +
                ", filename='" + filename + '\'' +
                ", isMovie=" + isMovie +
                ", lastupdated=" + lastupdated +
                ", seasonid=" + seasonid +
                ", seriesid=" + seriesid +
                ", thumbAdded='" + thumbAdded + '\'' +
                ", thumbHeight=" + thumbHeight +
                ", thumbWidth=" + thumbWidth +
                '}';
    }
}
