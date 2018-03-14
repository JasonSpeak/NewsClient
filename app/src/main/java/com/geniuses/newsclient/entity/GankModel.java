package com.geniuses.newsclient.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Sch on 2018/3/14.
 */

public class GankModel implements Serializable {
    /**
     * _id : 5a9cf1f5421aa9103fff20b1
     * createdAt : 2018-03-05T15:29:57.435Z
     * desc : DirectSelect Dropdown is a selection widget with an ethereal, full-screen modal popup displaying the available choices when the widget is interact with.
     * images : ["http://img.gank.io/90db2f35-2e9d-4d75-b5a9-53ee1719b57b"]
     * publishedAt : 2018-03-12T08:44:50.326Z
     * source : web
     * type : Android
     * url : https://github.com/Ramotion/direct-select-android
     * used : true
     * who : Alex Mikhnev
     */

    private String _id;
    private String createdAt;
    private String desc;
    private String publishedAt;
    private String source;
    private String type;
    private String url;
    private boolean used;
    private String who;
    private List<String> images;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
}
