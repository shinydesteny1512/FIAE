package cgi.game.creations.items;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Setter
@Getter
public abstract class Item {

    private Rarity rarity;

    private Double value;

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

}
