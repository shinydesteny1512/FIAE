package cgi.game.instance.tiles.shop;

import cgi.game.creations.items.Item;
import cgi.game.creations.items.ItemFactory;
import cgi.game.instance.tiles.Action;
import cgi.game.instance.tiles.ActionTypes;

import java.util.ArrayList;
import java.util.List;

public abstract class ActionShop extends Action {

    private final List<Item> vendorInventory;
    private final ItemFactory itemFactory;

    public ActionShop(int actionID, String actionName) {
        super(actionID, actionName, ActionTypes.SHOP.toString());
        this.vendorInventory = new ArrayList<>();
        this.itemFactory = new ItemFactory();

    }

    public String showMenu() {
        return "showMenu";
    }

    public List<Item> getVendorInventory() {
        return vendorInventory;
    }

    public void initializeVendorInventory() {
    }

    public ItemFactory getItemFactory() {
        return itemFactory;
    }
}
