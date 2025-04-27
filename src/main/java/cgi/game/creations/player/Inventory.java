package cgi.game.creations.player;

import cgi.game.creations.items.Item;
import cgi.game.creations.items.accessiore.Accessories;
import cgi.game.creations.items.armour.Chest;
import cgi.game.creations.items.armour.Helm;
import cgi.game.creations.items.weapon.Weapon;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Inventory {
    private final List<Item> backspace;
    private Weapon weapon;
    private Helm helm;
    private Chest chest;
    private Accessories accessories;

    public Inventory(Weapon weapon, Helm helm, Chest chest, Accessories accessories) {
        this.chest = chest;
        this.weapon = weapon;
        this.helm = helm;
        this.accessories = accessories;
        this.backspace = new ArrayList<>();
    }

    public void addItemToInventory(Item item) {
        backspace.add(item);
    }
}
