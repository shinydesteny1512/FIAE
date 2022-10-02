package cgi.game.instance.tiles.shop;

public enum ShopTypen {

    WEAPON("Weapon"),
    ARMOUR("Armour"),
    ACCESSOIRES("Jewelery");

    private String shopTyp;

    ShopTypen(String shopTyp) {
        this.shopTyp = shopTyp;
    }

    @Override
    public String toString() {
        return shopTyp;
    }
}
