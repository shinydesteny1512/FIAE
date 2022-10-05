package cgi.game.creations.items.armour;

import cgi.game.creations.Attributes;
import cgi.game.creations.items.Item;
import cgi.game.instance.level.GameInstance;

import java.util.Random;

public abstract class Armour extends Item {

    private Double dmgReduction;
    private Double durability;
    private Double weight;
    private ArmourTyp armourTyp;
    private Attributes attributes;

    private final GameInstance instance;

    public Armour(final GameInstance instance) {
        this.instance = instance;
        setDurability(100.0);
        initializeArmour();
    }

    private void initializeArmour() {
        Random r = new Random();

        switch (r.nextInt(3) + 1) {
            case 1 -> {
                this.setArmourTyp(ArmourTyp.PLATE);
                this.setWeight(this.getArmourTyp().getWeight());
                this.setDmgReduction(this.getArmourTyp().getDmgReduction());
                this.setAttributes(Attributes.STRENGTH);
            }
            case 2 -> {
                this.setArmourTyp(ArmourTyp.LEATHER);
                this.setWeight(this.getArmourTyp().getWeight());
                this.setDmgReduction(this.getArmourTyp().getDmgReduction());
                this.setAttributes(Attributes.DEXTERITY);
            }
            case 3 -> {
                this.setArmourTyp(ArmourTyp.CLOTH);
                this.setWeight(this.getArmourTyp().getWeight());
                this.setDmgReduction(this.getArmourTyp().getDmgReduction());
                this.setAttributes(Attributes.INTELLIGENCE);
            }

        }

    }

    public Double getDmgReduction() {
        return dmgReduction;
    }

    public void setDmgReduction(Double dmgReduction) {
        this.dmgReduction = dmgReduction;
    }

    public Double getDurability() {
        return durability;
    }

    public void setDurability(Double durability) {
        this.durability = durability;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public ArmourTyp getArmourTyp() {
        return armourTyp;
    }

    public void setArmourTyp(ArmourTyp armourTyp) {
        this.armourTyp = armourTyp;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }
}
