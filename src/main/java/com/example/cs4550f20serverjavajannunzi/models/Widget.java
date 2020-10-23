package com.example.cs4550f20serverjavajannunzi.models;

public class Widget {
    private String id;
    private String type;
    private String name;
    private String src;
    private String html;
    private String className;
    private Integer height;
    private Integer width;
    private String topicId;

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public Widget(String id, String type, String name, String topicId) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.topicId = topicId;
    }

    public Widget(String id, String type, String name) {
        this.id = id;
        this.type = type;
        this.name = name;
    }

    public Widget() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }
}
