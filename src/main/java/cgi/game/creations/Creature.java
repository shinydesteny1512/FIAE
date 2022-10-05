package cgi.game.creations;

public abstract class Creature {

    private String name;
    private Double health;
    private Double mana;
    private Double initiative;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = (double) Math.round(health);
    }

    public void initializeHealth() {
    }

    public Double getMana() {
        return mana;
    }

    public void setMana(Double mana) {
        this.mana = (double) Math.round(mana);
    }

    public void initializeMana() {
    }

    public Double getInitiative() {
        return initiative;
    }

    public void setInitiative(Double initiative) {
        this.initiative = (double) Math.round(initiative);
    }

    public void initializeInitiative() {
    }
}
