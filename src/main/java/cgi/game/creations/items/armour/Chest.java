package cgi.game.creations.items.armour;

import cgi.game.instance.level.GameInstance;

public class Chest extends Armour {

    private final String slot;

    public Chest(GameInstance instance, String slot) {
        super(instance);
        this.slot = slot;
    }

    public String getSlot() {
        return slot;
    }
}
