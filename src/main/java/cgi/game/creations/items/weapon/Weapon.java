package cgi.game.creations.items.weapon;

import cgi.game.creations.Attributes;
import cgi.game.creations.items.Item;

import java.util.Random;

public abstract class Weapon extends Item {

    private String name;
    private Integer sharpness;
    private Integer minDmg;
    private Double minDmgMultiplier;
    private Integer maxDmg;
    private Double maxDmgMultiplier;
    private Integer avgDamage;
    private Integer range;

    // Initiative Bonus
    // + f.e.: Sword with 1.6 Attack Speed gives a 1.6 multiplier for the initiative of a Player
    private Double attackSpeed;
    private Attributes attributeBonus;
    private Integer upgradeCount;

    public Weapon() {
        this.sharpness = 1;
        this.upgradeCount = 0;
        this.avgDamage = generateAvgDamage();
        this.minDmgMultiplier = 0.33;
        this.maxDmgMultiplier = 0.67;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSharpness() {
        return sharpness;
    }

    public void setSharpness(Integer sharpness) {
        this.sharpness = sharpness;
    }

    public Integer getMinDmg() {
        return minDmg;
    }

    public void setMinDmg(Integer minDmg) {
        this.minDmg = minDmg;
    }

    public Integer getMaxDmg() {
        return maxDmg;
    }

    public void setMaxDmg(Integer maxDmg) {
        this.maxDmg = maxDmg;
    }

    public Integer getRange() {
        return range;
    }

    /*
    Range of Weapons depends on the Weapon Typ:
    One-handed-Weapons = 1
        -> Sword, Mace, Axe Scepter, Wand, etc
    Two-handed-Weapons = 2
        -> Polearm, Two-Handed Axe/Sword/Mace, etc
    Ranged Weapons = 4
        -> Bow, Crossbow, Gun
     */
    public void setRange(Integer range) {
        this.range = range;
    }

    public Integer getUpgradeCount() {
        return upgradeCount;
    }

    /*
    UpgradeStage defines a Dmg boost depends on how high the Stage is.
    f.e.:
    UpgradeStage 1 = +10% DMG
     */
    public void setUpgradeCount(Integer upgradeCount) {
        this.upgradeCount = upgradeCount;
    }

    public Double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(Double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public Attributes getAttributeBonus() {
        return attributeBonus;
    }

    public void setAttributeBonus(Attributes attributeBonus) {
        this.attributeBonus = attributeBonus;
    }

    public Integer getAvgDamage() {
        return avgDamage;
    }

    private Integer generateAvgDamage() {
        final Random random = new Random();
        return random.nextInt(40) + 20;
    }

    public void initializeDamage() {
        this.setMinDmg(
                this.getAvgDamage() != null ?
                        (int) (((this.getAvgDamage() / 2) * this.getAttackSpeed()) * this.getMinDmgMultiplier()) :
                        0);

        this.setMaxDmg(
                this.getAvgDamage() != null ?
                        (int) (((this.getAvgDamage() / 2) * this.getAttackSpeed()) * this.getMaxDmgMultiplier()) :
                        0);
    }

    public void setAvgDamage(Integer avgDamage) {
        this.avgDamage = this.avgDamage;
    }

    public Double getMinDmgMultiplier() {
        return minDmgMultiplier;
    }

    public void setMinDmgMultiplier(Double minDmgMultiplier) {
        this.minDmgMultiplier = minDmgMultiplier;
    }

    public Double getMaxDmgMultiplier() {
        return maxDmgMultiplier;
    }

    public void setMaxDmgMultiplier(Double maxDmgMultiplier) {
        this.maxDmgMultiplier = maxDmgMultiplier;
    }

}
