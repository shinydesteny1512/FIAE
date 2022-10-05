package cgi.game.creations;

public enum Attributes {

    STRENGTH("STRENGTH"),
    DEXTERITY("DEXTERITY"),
    INTELLIGENCE("INTELLIGENCE");

    private String attribute;

    Attributes(String attribute) {
        this.attribute = attribute;

    }

    @Override
    public String toString() {
        return attribute;
    }
}
