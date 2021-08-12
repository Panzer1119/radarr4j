package de.codemakers.radarr4j.model;

import java.util.Objects;

public class ReleasePush {
    
    private String title;
    private String downloadUrl;
    private String protocol;
    private String publishDate;
    
    /**
     * @param title Title (required)
     * @param downloadUrl Download Url (required)
     * @param protocol Protocol (Usenet or Torrent) (required)
     * @param publishDate Publish Date ISO8601 Date (required)
     */
    public ReleasePush(String title, String downloadUrl, String protocol, String publishDate) {
        this.title = title;
        this.downloadUrl = downloadUrl;
        this.protocol = protocol;
        this.publishDate = publishDate;
    }
    
    public String getTitle() {
        return title;
    }
    
    public ReleasePush setTitle(String title) {
        this.title = title;
        return this;
    }
    
    public String getDownloadUrl() {
        return downloadUrl;
    }
    
    public ReleasePush setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    
    public String getProtocol() {
        return protocol;
    }
    
    public ReleasePush setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    
    public String getPublishDate() {
        return publishDate;
    }
    
    public ReleasePush setPublishDate(String publishDate) {
        this.publishDate = publishDate;
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
        final ReleasePush that = (ReleasePush) other;
        return Objects.equals(title, that.title) && Objects.equals(downloadUrl, that.downloadUrl) && Objects.equals(protocol, that.protocol) && Objects.equals(publishDate, that.publishDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(title, downloadUrl, protocol, publishDate);
    }
    
    @Override
    public String toString() {
        return "ReleasePush{" + "title='" + title + '\'' + ", downloadUrl='" + downloadUrl + '\'' + ", protocol='" + protocol + '\'' + ", publishDate='" + publishDate + '\'' + '}';
    }
    
}
