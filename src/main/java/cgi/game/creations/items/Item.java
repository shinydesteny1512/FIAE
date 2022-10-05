package cgi.game.creations.items;

import java.util.Random;

public abstract class Item {

    Rarity rarity;

    public Item() {
        initializeItem();
    }

    private void initializeItem() {

        Random r = new Random();
        int random = r.nextInt(100);

        if (random <= 35) {
            this.setRarity(Rarity.COMMON);
        } else if (random <= 65) {
            this.setRarity(Rarity.MAGIC);
        } else if (random <= 90) {
            this.setRarity(Rarity.RARE);
        } else if (random <= 98) {
            this.setRarity(Rarity.EPIC);
        } else {
            this.setRarity(Rarity.LEGENDARY);
        }

    }

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }
}
