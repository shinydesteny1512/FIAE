package cgi.game.creations.items.armour;

import cgi.game.creations.Attributes;
import cgi.game.creations.items.Item;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Setter
@Getter
public abstract class Armour extends Item {

    private Double dmgReduction;
    private Double durability;
    private Double weight;
    private ArmourTyp armourTyp;
    private Attributes attributes;

    public Armour() {
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

}
