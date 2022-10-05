package cgi.game.instance.tiles.shop;

public enum ShopTypes {

    WEAPON("Weapon"),
    ARMOUR("Armour"),
    ACCESSOIRES("Jewelery");

    private final String shopTyp;

    ShopTypes(String shopTyp) {
        this.shopTyp = shopTyp;
    }

    @Override
    public String toString() {
        return shopTyp;
    }
}
