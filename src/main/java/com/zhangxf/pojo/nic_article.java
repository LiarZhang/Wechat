package com.zhangxf.pojo;

public class nic_article {
    private Integer id;

    private String thumbMediaId;

    private String author;

    private String title;

    private String contentSourceUrl;

    private String content;

    private String digest;

    private Integer showCoverPic;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getThumbMediaId() {
        return thumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        this.thumbMediaId = thumbMediaId == null ? null : thumbMediaId.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContentSourceUrl() {
        return contentSourceUrl;
    }

    public void setContentSourceUrl(String contentSourceUrl) {
        this.contentSourceUrl = contentSourceUrl == null ? null : contentSourceUrl.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest == null ? null : digest.trim();
    }

    public Integer getShowCoverPic() {
        return showCoverPic;
    }

    public void setShowCoverPic(Integer showCoverPic) {
        this.showCoverPic = showCoverPic;
    }
}