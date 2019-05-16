//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.05.16 um 04:52:32 PM CEST 
//


package com.prodyna.mbb.sc.contribution;

import java.math.BigDecimal;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für SeriesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SeriesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Actors" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Airs_DayOfWeek" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Airs_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ContentRating" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FirstAired" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Genre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IMDB_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Network" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NetworkID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Overview" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Rating" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="RatingCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Runtime" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SeriesID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SeriesName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="added" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="addedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="banner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fanart" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="finale_aired" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="lastupdated" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="poster" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tms_wanted_old" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="zap2it_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeriesType", propOrder = {
    "id",
    "actors",
    "airsDayOfWeek",
    "airsTime",
    "contentRating",
    "firstAired",
    "genre",
    "imdbid",
    "language",
    "network",
    "networkID",
    "overview",
    "rating",
    "ratingCount",
    "runtime",
    "seriesID",
    "seriesName",
    "status",
    "added",
    "addedBy",
    "banner",
    "fanart",
    "finaleAired",
    "lastupdated",
    "poster",
    "tmsWantedOld",
    "zap2ItId"
})
public class SeriesType {

    protected int id;
    @XmlElement(name = "Actors", required = true)
    protected String actors;
    @XmlElement(name = "Airs_DayOfWeek", required = true)
    protected String airsDayOfWeek;
    @XmlElement(name = "Airs_Time", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar airsTime;
    @XmlElement(name = "ContentRating", required = true)
    protected String contentRating;
    @XmlElement(name = "FirstAired", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar firstAired;
    @XmlElement(name = "Genre", required = true)
    protected String genre;
    @XmlElement(name = "IMDB_ID", required = true)
    protected String imdbid;
    @XmlElement(name = "Language", required = true)
    protected String language;
    @XmlElement(name = "Network", required = true)
    protected String network;
    @XmlElement(name = "NetworkID", required = true)
    protected String networkID;
    @XmlElement(name = "Overview", required = true)
    protected String overview;
    @XmlElement(name = "Rating", required = true)
    protected BigDecimal rating;
    @XmlElement(name = "RatingCount")
    protected int ratingCount;
    @XmlElement(name = "Runtime")
    protected int runtime;
    @XmlElement(name = "SeriesID")
    protected int seriesID;
    @XmlElement(name = "SeriesName", required = true)
    protected String seriesName;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(required = true)
    protected String added;
    @XmlElement(required = true)
    protected String addedBy;
    @XmlElement(required = true)
    protected String banner;
    @XmlElement(required = true)
    protected String fanart;
    @XmlElement(name = "finale_aired", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar finaleAired;
    protected int lastupdated;
    @XmlElement(required = true)
    protected String poster;
    @XmlElement(name = "tms_wanted_old")
    protected int tmsWantedOld;
    @XmlElement(name = "zap2it_id", required = true)
    protected String zap2ItId;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der actors-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActors() {
        return actors;
    }

    /**
     * Legt den Wert der actors-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActors(String value) {
        this.actors = value;
    }

    /**
     * Ruft den Wert der airsDayOfWeek-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirsDayOfWeek() {
        return airsDayOfWeek;
    }

    /**
     * Legt den Wert der airsDayOfWeek-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirsDayOfWeek(String value) {
        this.airsDayOfWeek = value;
    }

    /**
     * Ruft den Wert der airsTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getAirsTime() {
        return airsTime;
    }

    /**
     * Legt den Wert der airsTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirsTime(Calendar value) {
        this.airsTime = value;
    }

    /**
     * Ruft den Wert der contentRating-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentRating() {
        return contentRating;
    }

    /**
     * Legt den Wert der contentRating-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentRating(String value) {
        this.contentRating = value;
    }

    /**
     * Ruft den Wert der firstAired-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getFirstAired() {
        return firstAired;
    }

    /**
     * Legt den Wert der firstAired-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstAired(Calendar value) {
        this.firstAired = value;
    }

    /**
     * Ruft den Wert der genre-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Legt den Wert der genre-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenre(String value) {
        this.genre = value;
    }

    /**
     * Ruft den Wert der imdbid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMDBID() {
        return imdbid;
    }

    /**
     * Legt den Wert der imdbid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMDBID(String value) {
        this.imdbid = value;
    }

    /**
     * Ruft den Wert der language-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Legt den Wert der language-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Ruft den Wert der network-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetwork() {
        return network;
    }

    /**
     * Legt den Wert der network-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetwork(String value) {
        this.network = value;
    }

    /**
     * Ruft den Wert der networkID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkID() {
        return networkID;
    }

    /**
     * Legt den Wert der networkID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkID(String value) {
        this.networkID = value;
    }

    /**
     * Ruft den Wert der overview-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverview() {
        return overview;
    }

    /**
     * Legt den Wert der overview-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverview(String value) {
        this.overview = value;
    }

    /**
     * Ruft den Wert der rating-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRating() {
        return rating;
    }

    /**
     * Legt den Wert der rating-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRating(BigDecimal value) {
        this.rating = value;
    }

    /**
     * Ruft den Wert der ratingCount-Eigenschaft ab.
     * 
     */
    public int getRatingCount() {
        return ratingCount;
    }

    /**
     * Legt den Wert der ratingCount-Eigenschaft fest.
     * 
     */
    public void setRatingCount(int value) {
        this.ratingCount = value;
    }

    /**
     * Ruft den Wert der runtime-Eigenschaft ab.
     * 
     */
    public int getRuntime() {
        return runtime;
    }

    /**
     * Legt den Wert der runtime-Eigenschaft fest.
     * 
     */
    public void setRuntime(int value) {
        this.runtime = value;
    }

    /**
     * Ruft den Wert der seriesID-Eigenschaft ab.
     * 
     */
    public int getSeriesID() {
        return seriesID;
    }

    /**
     * Legt den Wert der seriesID-Eigenschaft fest.
     * 
     */
    public void setSeriesID(int value) {
        this.seriesID = value;
    }

    /**
     * Ruft den Wert der seriesName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesName() {
        return seriesName;
    }

    /**
     * Legt den Wert der seriesName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesName(String value) {
        this.seriesName = value;
    }

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Ruft den Wert der added-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdded() {
        return added;
    }

    /**
     * Legt den Wert der added-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdded(String value) {
        this.added = value;
    }

    /**
     * Ruft den Wert der addedBy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddedBy() {
        return addedBy;
    }

    /**
     * Legt den Wert der addedBy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddedBy(String value) {
        this.addedBy = value;
    }

    /**
     * Ruft den Wert der banner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanner() {
        return banner;
    }

    /**
     * Legt den Wert der banner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanner(String value) {
        this.banner = value;
    }

    /**
     * Ruft den Wert der fanart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFanart() {
        return fanart;
    }

    /**
     * Legt den Wert der fanart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFanart(String value) {
        this.fanart = value;
    }

    /**
     * Ruft den Wert der finaleAired-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getFinaleAired() {
        return finaleAired;
    }

    /**
     * Legt den Wert der finaleAired-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinaleAired(Calendar value) {
        this.finaleAired = value;
    }

    /**
     * Ruft den Wert der lastupdated-Eigenschaft ab.
     * 
     */
    public int getLastupdated() {
        return lastupdated;
    }

    /**
     * Legt den Wert der lastupdated-Eigenschaft fest.
     * 
     */
    public void setLastupdated(int value) {
        this.lastupdated = value;
    }

    /**
     * Ruft den Wert der poster-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoster() {
        return poster;
    }

    /**
     * Legt den Wert der poster-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoster(String value) {
        this.poster = value;
    }

    /**
     * Ruft den Wert der tmsWantedOld-Eigenschaft ab.
     * 
     */
    public int getTmsWantedOld() {
        return tmsWantedOld;
    }

    /**
     * Legt den Wert der tmsWantedOld-Eigenschaft fest.
     * 
     */
    public void setTmsWantedOld(int value) {
        this.tmsWantedOld = value;
    }

    /**
     * Ruft den Wert der zap2ItId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZap2ItId() {
        return zap2ItId;
    }

    /**
     * Legt den Wert der zap2ItId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZap2ItId(String value) {
        this.zap2ItId = value;
    }

}
