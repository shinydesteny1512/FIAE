package cgi.game.creations.items;

public enum Rarity {

    COMMON("COMMON"),
    MAGIC("MAGIC"),
    RARE("RARE"),
    EPIC("EPIC"),
    LEGENDARY("LEGENDARY");

    private final String rarity;

    Rarity(String rarity) {
        this.rarity = rarity;
    }

    @Override
    public String toString() {
        return rarity;
    }
}
