package cgi.game.menues.ingame;

import cgi.game.instance.tiles.shop.ActionShop;
import cgi.game.menues.Window;

public class ShopMenu extends Window {

	public ShopMenu(String windowName) {
		super(windowName);
	}

	public void createActionShopView(ActionShop actionShop) {
		System.out.println(actionShop.getActionID());
	}
}
