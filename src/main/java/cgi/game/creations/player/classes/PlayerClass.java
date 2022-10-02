package cgi.game.creations.player.classes;

import cgi.game.creations.player.Player;

public abstract class PlayerClass extends Player {
    private String playerClassName;
    private String attributeTyp;
    private Integer str;
    private Integer dex;
    private Integer Int;

    public String getPlayerClassName() {
        return playerClassName;
    }

    public void setPlayerClassName(String playerClassName) {
        this.playerClassName = playerClassName;
    }

    public String getAttributeTyp() {
        return attributeTyp;
    }

    public void setAttributeTyp(String attributeTyp) {
        this.attributeTyp = attributeTyp;
    }

    public Integer getStr() {
        return str;
    }

    public void setStr(Integer str) {
        this.str = str;
    }

    public Integer getDex() {
        return dex;
    }

    public void setDex(Integer dex) {
        this.dex = dex;
    }

    public Integer getInt() {
        return Int;
    }

    public void setInt(Integer anInt) {
        Int = anInt;
    }
}
