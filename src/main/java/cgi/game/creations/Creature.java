package cgi.game.creations;

import cgi.game.creations.player.Inventory;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Creature {
    private String name;
    private Double health;
    private Double mana;
    private Double initiative;
    private final Inventory inventory;

    public Creature() {
        this.inventory = new Inventory(null, null, null, null);
    }

    public void initializeHealth() {
    }

    public void initializeMana() {
    }

    public void initializeInitiative() {
    }

}
