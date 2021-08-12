package de.codemakers.radarr4j.model;

import java.util.List;
import java.util.Objects;

public class ReleasePushResponse {
    
    private String guid;
    private QualityQuality quality;
    private List<CustomFormat> customFormats;
    private int customFormatScore;
    private int qualityWeight;
    private int age;
    private double ageHours;
    private double ageMinutes;
    private int size;
    private int indexerId;
    private String releaseHash;
    private String title;
    private boolean sceneSource;
    private String movieTitle;
    private List<Language> languages;
    private boolean approved;
    private boolean temporarilyRejected;
    private boolean rejected;
    private int tmdbId;
    private int imdbId;
    private List<String> rejections;
    private String publishDate;
    private String downloadUrl;
    private boolean downloadAllowed;
    private int releaseWeight;
    private List<Object> indexerFlags;
    private String edition;
    private String protocol;
    
    public ReleasePushResponse() {
    }
    
    public ReleasePushResponse(String guid, QualityQuality quality, List<CustomFormat> customFormats, int customFormatScore, int qualityWeight, int age, double ageHours, double ageMinutes, int size, int indexerId, String releaseHash, String title, boolean sceneSource, String movieTitle, List<Language> languages, boolean approved, boolean temporarilyRejected, boolean rejected, int tmdbId, int imdbId, List<String> rejections, String publishDate, String downloadUrl, boolean downloadAllowed, int releaseWeight, List<Object> indexerFlags, String edition, String protocol) {
        this.guid = guid;
        this.quality = quality;
        this.customFormats = customFormats;
        this.customFormatScore = customFormatScore;
        this.qualityWeight = qualityWeight;
        this.age = age;
        this.ageHours = ageHours;
        this.ageMinutes = ageMinutes;
        this.size = size;
        this.indexerId = indexerId;
        this.releaseHash = releaseHash;
        this.title = title;
        this.sceneSource = sceneSource;
        this.movieTitle = movieTitle;
        this.languages = languages;
        this.approved = approved;
        this.temporarilyRejected = temporarilyRejected;
        this.rejected = rejected;
        this.tmdbId = tmdbId;
        this.imdbId = imdbId;
        this.rejections = rejections;
        this.publishDate = publishDate;
        this.downloadUrl = downloadUrl;
        this.downloadAllowed = downloadAllowed;
        this.releaseWeight = releaseWeight;
        this.indexerFlags = indexerFlags;
        this.edition = edition;
        this.protocol = protocol;
    }
    
    public String getGuid() {
        return guid;
    }
    
    public ReleasePushResponse setGuid(String guid) {
        this.guid = guid;
        return this;
    }
    
    public QualityQuality getQuality() {
        return quality;
    }
    
    public ReleasePushResponse setQuality(QualityQuality quality) {
        this.quality = quality;
        return this;
    }
    
    public List<CustomFormat> getCustomFormats() {
        return customFormats;
    }
    
    public ReleasePushResponse setCustomFormats(List<CustomFormat> customFormats) {
        this.customFormats = customFormats;
        return this;
    }
    
    public int getCustomFormatScore() {
        return customFormatScore;
    }
    
    public ReleasePushResponse setCustomFormatScore(int customFormatScore) {
        this.customFormatScore = customFormatScore;
        return this;
    }
    
    public int getQualityWeight() {
        return qualityWeight;
    }
    
    public ReleasePushResponse setQualityWeight(int qualityWeight) {
        this.qualityWeight = qualityWeight;
        return this;
    }
    
    public int getAge() {
        return age;
    }
    
    public ReleasePushResponse setAge(int age) {
        this.age = age;
        return this;
    }
    
    public double getAgeHours() {
        return ageHours;
    }
    
    public ReleasePushResponse setAgeHours(double ageHours) {
        this.ageHours = ageHours;
        return this;
    }
    
    public double getAgeMinutes() {
        return ageMinutes;
    }
    
    public ReleasePushResponse setAgeMinutes(double ageMinutes) {
        this.ageMinutes = ageMinutes;
        return this;
    }
    
    public int getSize() {
        return size;
    }
    
    public ReleasePushResponse setSize(int size) {
        this.size = size;
        return this;
    }
    
    public int getIndexerId() {
        return indexerId;
    }
    
    public ReleasePushResponse setIndexerId(int indexerId) {
        this.indexerId = indexerId;
        return this;
    }
    
    public String getReleaseHash() {
        return releaseHash;
    }
    
    public ReleasePushResponse setReleaseHash(String releaseHash) {
        this.releaseHash = releaseHash;
        return this;
    }
    
    public String getTitle() {
        return title;
    }
    
    public ReleasePushResponse setTitle(String title) {
        this.title = title;
        return this;
    }
    
    public boolean isSceneSource() {
        return sceneSource;
    }
    
    public ReleasePushResponse setSceneSource(boolean sceneSource) {
        this.sceneSource = sceneSource;
        return this;
    }
    
    public String getMovieTitle() {
        return movieTitle;
    }
    
    public ReleasePushResponse setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
        return this;
    }
    
    public List<Language> getLanguages() {
        return languages;
    }
    
    public ReleasePushResponse setLanguages(List<Language> languages) {
        this.languages = languages;
        return this;
    }
    
    public boolean isApproved() {
        return approved;
    }
    
    public ReleasePushResponse setApproved(boolean approved) {
        this.approved = approved;
        return this;
    }
    
    public boolean isTemporarilyRejected() {
        return temporarilyRejected;
    }
    
    public ReleasePushResponse setTemporarilyRejected(boolean temporarilyRejected) {
        this.temporarilyRejected = temporarilyRejected;
        return this;
    }
    
    public boolean isRejected() {
        return rejected;
    }
    
    public ReleasePushResponse setRejected(boolean rejected) {
        this.rejected = rejected;
        return this;
    }
    
    public int getTmdbId() {
        return tmdbId;
    }
    
    public ReleasePushResponse setTmdbId(int tmdbId) {
        this.tmdbId = tmdbId;
        return this;
    }
    
    public int getImdbId() {
        return imdbId;
    }
    
    public ReleasePushResponse setImdbId(int imdbId) {
        this.imdbId = imdbId;
        return this;
    }
    
    public List<String> getRejections() {
        return rejections;
    }
    
    public ReleasePushResponse setRejections(List<String> rejections) {
        this.rejections = rejections;
        return this;
    }
    
    public String getPublishDate() {
        return publishDate;
    }
    
    public ReleasePushResponse setPublishDate(String publishDate) {
        this.publishDate = publishDate;
        return this;
    }
    
    public String getDownloadUrl() {
        return downloadUrl;
    }
    
    public ReleasePushResponse setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    
    public boolean isDownloadAllowed() {
        return downloadAllowed;
    }
    
    public ReleasePushResponse setDownloadAllowed(boolean downloadAllowed) {
        this.downloadAllowed = downloadAllowed;
        return this;
    }
    
    public int getReleaseWeight() {
        return releaseWeight;
    }
    
    public ReleasePushResponse setReleaseWeight(int releaseWeight) {
        this.releaseWeight = releaseWeight;
        return this;
    }
    
    public List<Object> getIndexerFlags() {
        return indexerFlags;
    }
    
    public ReleasePushResponse setIndexerFlags(List<Object> indexerFlags) {
        this.indexerFlags = indexerFlags;
        return this;
    }
    
    public String getEdition() {
        return edition;
    }
    
    public ReleasePushResponse setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    
    public String getProtocol() {
        return protocol;
    }
    
    public ReleasePushResponse setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        final ReleasePushResponse that = (ReleasePushResponse) other;
        return customFormatScore == that.customFormatScore && qualityWeight == that.qualityWeight && age == that.age && Double.compare(that.ageHours, ageHours) == 0 && Double.compare(that.ageMinutes, ageMinutes) == 0 && size == that.size && indexerId == that.indexerId && sceneSource == that.sceneSource && approved == that.approved && temporarilyRejected == that.temporarilyRejected && rejected == that.rejected && tmdbId == that.tmdbId && imdbId == that.imdbId && downloadAllowed == that.downloadAllowed && releaseWeight == that.releaseWeight && Objects.equals(guid, that.guid) && Objects.equals(quality, that.quality) && Objects.equals(customFormats, that.customFormats) && Objects.equals(releaseHash, that.releaseHash) && Objects.equals(title, that.title) && Objects.equals(movieTitle, that.movieTitle) && Objects.equals(languages, that.languages) && Objects.equals(rejections, that.rejections) && Objects.equals(publishDate, that.publishDate) && Objects.equals(downloadUrl, that.downloadUrl) && Objects.equals(indexerFlags, that.indexerFlags) && Objects.equals(edition, that.edition) && Objects.equals(protocol, that.protocol);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(guid, quality, customFormats, customFormatScore, qualityWeight, age, ageHours, ageMinutes, size, indexerId, releaseHash, title, sceneSource, movieTitle, languages, approved, temporarilyRejected, rejected, tmdbId, imdbId, rejections, publishDate, downloadUrl, downloadAllowed, releaseWeight, indexerFlags, edition, protocol);
    }
    
    @Override
    public String toString() {
        return "ReleasePushResponse{" + "guid='" + guid + '\'' + ", quality=" + quality + ", customFormats=" + customFormats + ", customFormatScore=" + customFormatScore + ", qualityWeight=" + qualityWeight + ", age=" + age + ", ageHours=" + ageHours + ", ageMinutes=" + ageMinutes + ", size=" + size + ", indexerId=" + indexerId + ", releaseHash='" + releaseHash + '\'' + ", title='" + title + '\'' + ", sceneSource=" + sceneSource + ", movieTitle='" + movieTitle + '\'' + ", languages=" + languages + ", approved=" + approved + ", temporarilyRejected=" + temporarilyRejected + ", rejected=" + rejected + ", tmdbId=" + tmdbId + ", imdbId=" + imdbId + ", rejections=" + rejections + ", publishDate=" + publishDate + ", downloadUrl='" + downloadUrl + '\'' + ", downloadAllowed=" + downloadAllowed + ", releaseWeight=" + releaseWeight + ", indexerFlags=" + indexerFlags + ", edition='" + edition + '\'' + ", protocol='" + protocol + '\'' + '}';
    }
    
}
