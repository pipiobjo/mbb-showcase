package com.prodyna.mbb.sc.series.service;

import com.prodyna.mbb.sc.actor.service.ActorDomainObject;
import com.prodyna.mbb.sc.episode.service.EpisodeDomainObject;
import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.math.BigDecimal;
import java.util.*;

@NodeEntity
public class SeriesDomainObject {

    @Id
    @GeneratedValue
    private Long id;


    private int originalId;
    private String airsDayOfWeek;
    private String contentRating;
    private Date firstAired;
    private Date airsTime;
    private Date finaleAired;
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
    private int lastupdated;
    private String poster;
    private int tmsWantedOld;
    private String zap2ItId;


    @Relationship(type = "ACTS_IN", direction = Relationship.INCOMING)
    private Set<ActorDomainObject> actors;

    @Relationship("HAS_EPISODE")
    private Set<EpisodeDomainObject> episodes;

    public Set<ActorDomainObject> getActors() {
        return actors;
    }

    public void setActors(Set<ActorDomainObject> actors) {
        this.actors = actors;
    }

    public Set<EpisodeDomainObject> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(Set<EpisodeDomainObject> episodes) {
        this.episodes = episodes;
    }

    public int getOriginalId() {
        return originalId;
    }

    public void setOriginalId(int originalId) {
        this.originalId = originalId;
    }

    public String getAirsDayOfWeek() {
        return airsDayOfWeek;
    }

    public void setAirsDayOfWeek(String airsDayOfWeek) {
        this.airsDayOfWeek = airsDayOfWeek;
    }

    public String getContentRating() {
        return contentRating;
    }

    public void setContentRating(String contentRating) {
        this.contentRating = contentRating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
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

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getNetworkID() {
        return networkID;
    }

    public void setNetworkID(String networkID) {
        this.networkID = networkID;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
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

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public int getSeriesID() {
        return seriesID;
    }

    public void setSeriesID(int seriesID) {
        this.seriesID = seriesID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAdded() {
        return added;
    }

    public void setAdded(String added) {
        this.added = added;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getFanart() {
        return fanart;
    }

    public void setFanart(String fanart) {
        this.fanart = fanart;
    }


    public int getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(int lastupdated) {
        this.lastupdated = lastupdated;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public int getTmsWantedOld() {
        return tmsWantedOld;
    }

    public void setTmsWantedOld(int tmsWantedOld) {
        this.tmsWantedOld = tmsWantedOld;
    }

    public String getZap2ItId() {
        return zap2ItId;
    }

    public void setZap2ItId(String zap2ItId) {
        this.zap2ItId = zap2ItId;
    }

    public Date getFirstAired() {
        return firstAired;
    }

    public void setFirstAired(Date firstAired) {
        this.firstAired = firstAired;
    }

    public Date getAirsTime() {
        return airsTime;
    }

    public void setAirsTime(Date airsTime) {
        this.airsTime = airsTime;
    }

    public Date getFinaleAired() {
        return finaleAired;
    }

    public void setFinaleAired(Date finaleAired) {
        this.finaleAired = finaleAired;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeriesDomainObject that = (SeriesDomainObject) o;
        return originalId == that.originalId &&
                ratingCount == that.ratingCount &&
                runtime == that.runtime &&
                seriesID == that.seriesID &&
                lastupdated == that.lastupdated &&
                tmsWantedOld == that.tmsWantedOld &&
                Objects.equals(id, that.id) &&
                Objects.equals(airsDayOfWeek, that.airsDayOfWeek) &&
                Objects.equals(contentRating, that.contentRating) &&
                Objects.equals(firstAired, that.firstAired) &&
                Objects.equals(airsTime, that.airsTime) &&
                Objects.equals(finaleAired, that.finaleAired) &&
                Objects.equals(genre, that.genre) &&
                Objects.equals(imdbid, that.imdbid) &&
                Objects.equals(language, that.language) &&
                Objects.equals(network, that.network) &&
                Objects.equals(networkID, that.networkID) &&
                Objects.equals(overview, that.overview) &&
                Objects.equals(rating, that.rating) &&
                Objects.equals(name, that.name) &&
                Objects.equals(status, that.status) &&
                Objects.equals(added, that.added) &&
                Objects.equals(addedBy, that.addedBy) &&
                Objects.equals(banner, that.banner) &&
                Objects.equals(fanart, that.fanart) &&
                Objects.equals(poster, that.poster) &&
                Objects.equals(zap2ItId, that.zap2ItId) &&
                Objects.equals(actors, that.actors) &&
                Objects.equals(episodes, that.episodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, originalId, airsDayOfWeek, contentRating, firstAired, airsTime, finaleAired, genre, imdbid, language, network, networkID, overview, rating, ratingCount, runtime, seriesID, name, status, added, addedBy, banner, fanart, lastupdated, poster, tmsWantedOld, zap2ItId, actors, episodes);
    }

    @Override
    public String toString() {
        return "SeriesDomainObject{" +
                "id=" + id +
                ", originalId=" + originalId +
                ", airsDayOfWeek='" + airsDayOfWeek + '\'' +
                ", contentRating='" + contentRating + '\'' +
                ", firstAired=" + firstAired +
                ", airsTime=" + airsTime +
                ", finaleAired=" + finaleAired +
                ", genre='" + genre + '\'' +
                ", imdbid='" + imdbid + '\'' +
                ", language='" + language + '\'' +
                ", network='" + network + '\'' +
                ", networkID='" + networkID + '\'' +
                ", overview='" + overview + '\'' +
                ", rating=" + rating +
                ", ratingCount=" + ratingCount +
                ", runtime=" + runtime +
                ", seriesID=" + seriesID +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", added='" + added + '\'' +
                ", addedBy='" + addedBy + '\'' +
                ", banner='" + banner + '\'' +
                ", fanart='" + fanart + '\'' +
                ", lastupdated=" + lastupdated +
                ", poster='" + poster + '\'' +
                ", tmsWantedOld=" + tmsWantedOld +
                ", zap2ItId='" + zap2ItId + '\'' +
                ", actors=" + actors +
                ", episodes=" + episodes +
                '}';
    }
}
