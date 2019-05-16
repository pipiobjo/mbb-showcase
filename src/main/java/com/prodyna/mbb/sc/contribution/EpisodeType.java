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
 * <p>Java-Klasse für EpisodeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EpisodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Combined_episodenumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Combined_season" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DVD_chapter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DVD_discid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DVD_episodenumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DVD_season" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Director" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EpImgFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EpisodeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EpisodeNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FirstAired" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GuestStars" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IMDB_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Overview" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProductionCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Rating" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="RatingCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SeasonNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Writer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="absolute_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="airsafter_season" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="airsbefore_episode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="airsbefore_season" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="is_movie" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lastupdated" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="seasonid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="seriesid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="thumb_added" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="thumb_height" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="thumb_width" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EpisodeType", propOrder = {
    "id",
    "combinedEpisodenumber",
    "combinedSeason",
    "dvdChapter",
    "dvdDiscid",
    "dvdEpisodenumber",
    "dvdSeason",
    "director",
    "epImgFlag",
    "episodeName",
    "episodeNumber",
    "firstAired",
    "guestStars",
    "imdbid",
    "language",
    "overview",
    "productionCode",
    "rating",
    "ratingCount",
    "seasonNumber",
    "writer",
    "absoluteNumber",
    "airsafterSeason",
    "airsbeforeEpisode",
    "airsbeforeSeason",
    "filename",
    "isMovie",
    "lastupdated",
    "seasonid",
    "seriesid",
    "thumbAdded",
    "thumbHeight",
    "thumbWidth"
})
public class EpisodeType {

    protected int id;
    @XmlElement(name = "Combined_episodenumber")
    protected int combinedEpisodenumber;
    @XmlElement(name = "Combined_season")
    protected int combinedSeason;
    @XmlElement(name = "DVD_chapter", required = true)
    protected String dvdChapter;
    @XmlElement(name = "DVD_discid", required = true)
    protected String dvdDiscid;
    @XmlElement(name = "DVD_episodenumber", required = true)
    protected String dvdEpisodenumber;
    @XmlElement(name = "DVD_season", required = true)
    protected String dvdSeason;
    @XmlElement(name = "Director", required = true)
    protected String director;
    @XmlElement(name = "EpImgFlag")
    protected int epImgFlag;
    @XmlElement(name = "EpisodeName", required = true)
    protected String episodeName;
    @XmlElement(name = "EpisodeNumber")
    protected int episodeNumber;
    @XmlElement(name = "FirstAired", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar firstAired;
    @XmlElement(name = "GuestStars", required = true)
    protected String guestStars;
    @XmlElement(name = "IMDB_ID", required = true)
    protected String imdbid;
    @XmlElement(name = "Language", required = true)
    protected String language;
    @XmlElement(name = "Overview", required = true)
    protected String overview;
    @XmlElement(name = "ProductionCode")
    protected int productionCode;
    @XmlElement(name = "Rating", required = true)
    protected BigDecimal rating;
    @XmlElement(name = "RatingCount")
    protected int ratingCount;
    @XmlElement(name = "SeasonNumber")
    protected int seasonNumber;
    @XmlElement(name = "Writer", required = true)
    protected String writer;
    @XmlElement(name = "absolute_number", required = true)
    protected String absoluteNumber;
    @XmlElement(name = "airsafter_season", required = true)
    protected String airsafterSeason;
    @XmlElement(name = "airsbefore_episode", required = true)
    protected String airsbeforeEpisode;
    @XmlElement(name = "airsbefore_season", required = true)
    protected String airsbeforeSeason;
    @XmlElement(required = true)
    protected String filename;
    @XmlElement(name = "is_movie")
    protected int isMovie;
    protected int lastupdated;
    protected int seasonid;
    protected int seriesid;
    @XmlElement(name = "thumb_added", required = true)
    protected String thumbAdded;
    @XmlElement(name = "thumb_height")
    protected int thumbHeight;
    @XmlElement(name = "thumb_width")
    protected int thumbWidth;

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
     * Ruft den Wert der combinedEpisodenumber-Eigenschaft ab.
     * 
     */
    public int getCombinedEpisodenumber() {
        return combinedEpisodenumber;
    }

    /**
     * Legt den Wert der combinedEpisodenumber-Eigenschaft fest.
     * 
     */
    public void setCombinedEpisodenumber(int value) {
        this.combinedEpisodenumber = value;
    }

    /**
     * Ruft den Wert der combinedSeason-Eigenschaft ab.
     * 
     */
    public int getCombinedSeason() {
        return combinedSeason;
    }

    /**
     * Legt den Wert der combinedSeason-Eigenschaft fest.
     * 
     */
    public void setCombinedSeason(int value) {
        this.combinedSeason = value;
    }

    /**
     * Ruft den Wert der dvdChapter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDVDChapter() {
        return dvdChapter;
    }

    /**
     * Legt den Wert der dvdChapter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDVDChapter(String value) {
        this.dvdChapter = value;
    }

    /**
     * Ruft den Wert der dvdDiscid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDVDDiscid() {
        return dvdDiscid;
    }

    /**
     * Legt den Wert der dvdDiscid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDVDDiscid(String value) {
        this.dvdDiscid = value;
    }

    /**
     * Ruft den Wert der dvdEpisodenumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDVDEpisodenumber() {
        return dvdEpisodenumber;
    }

    /**
     * Legt den Wert der dvdEpisodenumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDVDEpisodenumber(String value) {
        this.dvdEpisodenumber = value;
    }

    /**
     * Ruft den Wert der dvdSeason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDVDSeason() {
        return dvdSeason;
    }

    /**
     * Legt den Wert der dvdSeason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDVDSeason(String value) {
        this.dvdSeason = value;
    }

    /**
     * Ruft den Wert der director-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirector() {
        return director;
    }

    /**
     * Legt den Wert der director-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirector(String value) {
        this.director = value;
    }

    /**
     * Ruft den Wert der epImgFlag-Eigenschaft ab.
     * 
     */
    public int getEpImgFlag() {
        return epImgFlag;
    }

    /**
     * Legt den Wert der epImgFlag-Eigenschaft fest.
     * 
     */
    public void setEpImgFlag(int value) {
        this.epImgFlag = value;
    }

    /**
     * Ruft den Wert der episodeName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEpisodeName() {
        return episodeName;
    }

    /**
     * Legt den Wert der episodeName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEpisodeName(String value) {
        this.episodeName = value;
    }

    /**
     * Ruft den Wert der episodeNumber-Eigenschaft ab.
     * 
     */
    public int getEpisodeNumber() {
        return episodeNumber;
    }

    /**
     * Legt den Wert der episodeNumber-Eigenschaft fest.
     * 
     */
    public void setEpisodeNumber(int value) {
        this.episodeNumber = value;
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
     * Ruft den Wert der guestStars-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuestStars() {
        return guestStars;
    }

    /**
     * Legt den Wert der guestStars-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuestStars(String value) {
        this.guestStars = value;
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
     * Ruft den Wert der productionCode-Eigenschaft ab.
     * 
     */
    public int getProductionCode() {
        return productionCode;
    }

    /**
     * Legt den Wert der productionCode-Eigenschaft fest.
     * 
     */
    public void setProductionCode(int value) {
        this.productionCode = value;
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
     * Ruft den Wert der seasonNumber-Eigenschaft ab.
     * 
     */
    public int getSeasonNumber() {
        return seasonNumber;
    }

    /**
     * Legt den Wert der seasonNumber-Eigenschaft fest.
     * 
     */
    public void setSeasonNumber(int value) {
        this.seasonNumber = value;
    }

    /**
     * Ruft den Wert der writer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWriter() {
        return writer;
    }

    /**
     * Legt den Wert der writer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWriter(String value) {
        this.writer = value;
    }

    /**
     * Ruft den Wert der absoluteNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbsoluteNumber() {
        return absoluteNumber;
    }

    /**
     * Legt den Wert der absoluteNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbsoluteNumber(String value) {
        this.absoluteNumber = value;
    }

    /**
     * Ruft den Wert der airsafterSeason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirsafterSeason() {
        return airsafterSeason;
    }

    /**
     * Legt den Wert der airsafterSeason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirsafterSeason(String value) {
        this.airsafterSeason = value;
    }

    /**
     * Ruft den Wert der airsbeforeEpisode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirsbeforeEpisode() {
        return airsbeforeEpisode;
    }

    /**
     * Legt den Wert der airsbeforeEpisode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirsbeforeEpisode(String value) {
        this.airsbeforeEpisode = value;
    }

    /**
     * Ruft den Wert der airsbeforeSeason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirsbeforeSeason() {
        return airsbeforeSeason;
    }

    /**
     * Legt den Wert der airsbeforeSeason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirsbeforeSeason(String value) {
        this.airsbeforeSeason = value;
    }

    /**
     * Ruft den Wert der filename-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Legt den Wert der filename-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Ruft den Wert der isMovie-Eigenschaft ab.
     * 
     */
    public int getIsMovie() {
        return isMovie;
    }

    /**
     * Legt den Wert der isMovie-Eigenschaft fest.
     * 
     */
    public void setIsMovie(int value) {
        this.isMovie = value;
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
     * Ruft den Wert der seasonid-Eigenschaft ab.
     * 
     */
    public int getSeasonid() {
        return seasonid;
    }

    /**
     * Legt den Wert der seasonid-Eigenschaft fest.
     * 
     */
    public void setSeasonid(int value) {
        this.seasonid = value;
    }

    /**
     * Ruft den Wert der seriesid-Eigenschaft ab.
     * 
     */
    public int getSeriesid() {
        return seriesid;
    }

    /**
     * Legt den Wert der seriesid-Eigenschaft fest.
     * 
     */
    public void setSeriesid(int value) {
        this.seriesid = value;
    }

    /**
     * Ruft den Wert der thumbAdded-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbAdded() {
        return thumbAdded;
    }

    /**
     * Legt den Wert der thumbAdded-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbAdded(String value) {
        this.thumbAdded = value;
    }

    /**
     * Ruft den Wert der thumbHeight-Eigenschaft ab.
     * 
     */
    public int getThumbHeight() {
        return thumbHeight;
    }

    /**
     * Legt den Wert der thumbHeight-Eigenschaft fest.
     * 
     */
    public void setThumbHeight(int value) {
        this.thumbHeight = value;
    }

    /**
     * Ruft den Wert der thumbWidth-Eigenschaft ab.
     * 
     */
    public int getThumbWidth() {
        return thumbWidth;
    }

    /**
     * Legt den Wert der thumbWidth-Eigenschaft fest.
     * 
     */
    public void setThumbWidth(int value) {
        this.thumbWidth = value;
    }

}
