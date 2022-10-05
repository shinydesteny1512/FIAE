package cgi.game.creations.items.accessiore;

import cgi.game.creations.Attributes;
import cgi.game.creations.items.Item;
import cgi.game.instance.level.GameInstance;

import java.util.Random;

public abstract class Accessoires extends Item {

    private Attributes attributes;

    private final GameInstance instance;

    public Accessoires(final GameInstance instance) {
        this.instance = instance;
        initializeAccessiores();
    }

    private void initializeAccessiores() {
        Random r = new Random();
        switch (r.nextInt(3) + 1) {
            case 1 -> this.setAttributes(Attributes.STRENGTH);
            case 2 -> this.setAttributes(Attributes.DEXTERITY);
            case 3 -> this.setAttributes(Attributes.INTELLIGENCE);
        }
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }
}
