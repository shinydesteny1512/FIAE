package cgi.game.instance.tiles.shop;

import org.junit.jupiter.api.Test;

class ActionShopTest {

    @Test
    void createPositiveActionShopTile(){
        ActionShop actionShop = new ActionShop(1, "shop");
        actionShop.debugTile();
    }

}