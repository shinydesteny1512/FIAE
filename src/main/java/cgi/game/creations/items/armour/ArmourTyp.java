package cgi.game.creations.items.armour;

import lombok.Getter;

@Getter
public enum ArmourTyp {

    PLATE("PLATE", 30.0, 15.0),
    LEATHER("LEATHER", 20, 10.0),
    CLOTH("CLOTH", 10.0, 5.0);

    private final String armourTyp;

    private final double weight;

    private final double dmgReduction;

    ArmourTyp(String armourTyp, double weight, double dmgReduction) {
        this.armourTyp = armourTyp;
        this.weight = weight;
        this.dmgReduction = dmgReduction;
    }

    @Override
    public String toString() {
        return armourTyp;
    }

}
