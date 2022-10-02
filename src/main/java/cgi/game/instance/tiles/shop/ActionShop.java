package cgi.game.instance.tiles.shop;

import cgi.game.instance.tiles.Action;
import cgi.game.instance.tiles.ActionTypes;

public class ActionShop extends Action {

    public ActionShop(int actionID, String actionName) {
        super(actionID, actionName, ActionTypes.SHOP.toString());
    }

}
