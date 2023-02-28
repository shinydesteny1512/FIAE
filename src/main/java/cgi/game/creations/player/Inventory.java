package cgi.game.creations.player;

import cgi.game.creations.items.Item;
import cgi.game.creations.items.accessiore.Accessoires;
import cgi.game.creations.items.armour.Chest;
import cgi.game.creations.items.armour.Helm;
import cgi.game.creations.items.weapon.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private final List<Item> backspace;
    private Weapon weapon;
    private Helm helm;
    private Chest chest;
    private Accessoires accessoires;

    public Inventory(Weapon weapon, Helm helm, Chest chest, Accessoires accessoires) {
        this.chest = chest;
        this.weapon = weapon;
        this.helm = helm;
        this.accessoires = accessoires;
        this.backspace = new ArrayList<>();
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public Chest getChest() {
        return chest;
    }

    public void setChest(Chest chest) {
        this.chest = chest;
    }

    public Accessoires getAccessoires() {
        return accessoires;
    }

    public void setAccessoires(Accessoires accessoires) {
        this.accessoires = accessoires;
    }

    public List<Item> getBackspace() {
        return backspace;
    }

    public void addItemToInventory(Item item) {
        backspace.add(item);
    }
}
