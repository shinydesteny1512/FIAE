package cgi.game.creations.items.weapon;

public abstract class Weapon {

    private String name;
    private int sharpness;
    private int minDmg;
    private int maxDmg;
    private int range;
    private int upgradeStage;
    private int initiativeBonus;
    private String attributeBonus;

    public Weapon(int minDmg, int maxDmg) {
        this.minDmg = minDmg;
        this.maxDmg = maxDmg;
        this.sharpness = 1;
        this.upgradeStage = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSharpness() {
        return sharpness;
    }

    public void setSharpness(int sharpness) {
        this.sharpness = sharpness;
    }

    public int getMinDmg() {
        return minDmg;
    }

    public void setMinDmg(int minDmg) {
        this.minDmg = minDmg;
    }

    public int getMaxDmg() {
        return maxDmg;
    }

    public void setMaxDmg(int maxDmg) {
        this.maxDmg = maxDmg;
    }

    public int getRange() {
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
    public void setRange(int range) {
        this.range = range;
    }

    public int getUpgradeStage() {
        return upgradeStage;
    }

    /*
    UpgradeStage defines a Dmg boost depends on how high the Stage is.
    f.e.:
    UpgradeStage 1 = +10% DMG
     */
    public void setUpgradeStage(int upgradeStage) {
        this.upgradeStage = upgradeStage;
    }

    public int getInitiativeBonus() {
        return initiativeBonus;
    }

    public void setInitiativeBonus(int initiativeBonus) {
        this.initiativeBonus = initiativeBonus;
    }

    public String getAttributeBonus() {
        return attributeBonus;
    }

    public void setAttributeBonus(String attributeBonus) {
        this.attributeBonus = attributeBonus;
    }
}
