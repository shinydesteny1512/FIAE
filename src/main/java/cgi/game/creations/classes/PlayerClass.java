package cgi.game.creations.classes;

public class PlayerClass {
    private String name;
    private String attributeTyp;
    private Integer str;
    private Integer dex;
    private Integer Int;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
