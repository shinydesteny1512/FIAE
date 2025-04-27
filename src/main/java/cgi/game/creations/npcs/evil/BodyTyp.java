package cgi.game.creations.npcs.evil;

import lombok.Getter;

@Getter
public enum BodyTyp {

    BULKY("BULKY", 150.0, 50.0),
    NORMAL("NORMAL", 100.0, 75.0),
    QUICK("QUICK", 75.0, 125.0);

    private final double baseHP;

    private final double baseMana;

    private final String bodyTyp;

    BodyTyp(String bodyTyp, double baseHP, double baseMana) {
        this.bodyTyp = bodyTyp;
        this.baseHP = baseHP;
        this.baseMana = baseMana;
    }

    @Override
    public String toString() {
        return bodyTyp;
    }

}
