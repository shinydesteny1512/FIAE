package cgi.game.creations.items.armour;

import cgi.game.instance.level.GameInstance;

public class Helm extends Armour {

    private final String slot;

    public Helm(GameInstance instance, String slot) {
        super(instance);
        this.slot = slot;
    }

    public String getSlot() {
        return slot;
    }
}
