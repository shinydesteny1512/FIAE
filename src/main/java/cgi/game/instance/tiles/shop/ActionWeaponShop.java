package cgi.game.instance.tiles.shop;

import cgi.game.creations.items.Item;
import cgi.game.creations.items.weapon.Weapon;

public class ActionWeaponShop extends ActionShop {

    public ActionWeaponShop(int actionID, String actionName) {
        super(actionID, actionName);
        this.getItemFactory().createWeaponStagePack();
    }

    @Override
    public String showMenu() {
        StringBuilder sb = new StringBuilder();

        for (Item item : this.getVendorInventory()) {
            if (item instanceof final Weapon weapon) {
                sb.append("\n").append(weapon.getName());
            }

        }


        return sb.toString();
    }

    @Override
    public void initializeVendorInventory() {
        for (Weapon weapon : this.getItemFactory().getWeaponsOfStage()) {
            this.getVendorInventory().add(weapon);
        }
    }
}
