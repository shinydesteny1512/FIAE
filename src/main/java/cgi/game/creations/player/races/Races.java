package cgi.game.creations.player.races;

import cgi.game.creations.Attributes;

public abstract class Races {
    private String bodyHeight;
    private Integer age;
    private String bodyAge;
    private Attributes attributes;

    public Races(Attributes attributes) {
        this.attributes = attributes;
    }

    public String getBodyHeight() {
        return bodyHeight;
    }

    public void setBodyHeight(String bodyHeight) {
        this.bodyHeight = bodyHeight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBodyAge() {
        return bodyAge;
    }

    public void setBodyAge(String bodyAge) {
        this.bodyAge = bodyAge;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }
}