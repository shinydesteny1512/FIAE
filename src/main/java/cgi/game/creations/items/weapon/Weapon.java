package cgi.game.creations.items.weapon;

import cgi.game.creations.Attributes;
import cgi.game.creations.items.Item;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Setter
@Getter
public abstract class Weapon extends Item {

    private String name;
    private Integer sharpness;
    private Integer minDmg;
    private Double minDmgMultiplier;
    private Integer maxDmg;
    private Double maxDmgMultiplier;
    private Integer avgDamage;
    /*
    Range of Weapons depends on the Weapon Typ:
    One-handed-Weapons = 1
        -> Sword, Mace, Axe Scepter, Wand, etc
    Two-handed-Weapons = 2
        -> Polearm, Two-Handed Axe/Sword/Mace, etc
    Ranged Weapons = 4
        -> Bow, Crossbow, Gun
     */
    private Integer range;

    // Initiative Bonus
    // + f.e.: Sword with 1.6 Attack Speed gives a 1.6 multiplier for the initiative of a Player
    private Double attackSpeed;
    private Attributes attributeBonus;
    /*
    UpgradeStage defines a Dmg boost depends on how high the Stage is.
    f.e.:
    UpgradeStage 1 = +10% DMG
     */
    private Integer upgradeCount;

    public Weapon() {
        this.sharpness = 1;
        this.upgradeCount = 0;
        this.avgDamage = generateAvgDamage();
        this.minDmgMultiplier = 0.33;
        this.maxDmgMultiplier = 0.67;
    }

    private Integer generateAvgDamage() {
        final Random random = new Random();
        return random.nextInt(40) + 20;
    }

    public void initializeDamage() {
        this.setMinDmg(
                this.getAvgDamage() != null ?
                        (int) ((((double) this.getAvgDamage() / 2) * this.getAttackSpeed()) * this.getMinDmgMultiplier()) :
                        0);

        this.setMaxDmg(
                this.getAvgDamage() != null ?
                        (int) ((((double) this.getAvgDamage() / 2) * this.getAttackSpeed()) * this.getMaxDmgMultiplier()) :
                        0);
    }

}
