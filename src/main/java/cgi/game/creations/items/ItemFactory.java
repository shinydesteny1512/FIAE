package cgi.game.creations.items;

import cgi.game.creations.items.accessiore.Accessoires;
import cgi.game.creations.items.accessiore.Amulet;
import cgi.game.creations.items.accessiore.Belt;
import cgi.game.creations.items.accessiore.Ring;
import cgi.game.creations.items.armour.Armour;
import cgi.game.creations.items.armour.Chest;
import cgi.game.creations.items.armour.Helm;
import cgi.game.creations.items.weapon.Weapon;
import cgi.game.creations.items.weapon.caster.Scepter;
import cgi.game.creations.items.weapon.caster.Wand;
import cgi.game.creations.items.weapon.meele.Axe;
import cgi.game.creations.items.weapon.meele.Sword;
import cgi.game.creations.items.weapon.range.Bow;
import cgi.game.creations.items.weapon.range.Gun;

import java.util.ArrayList;
import java.util.List;

public class ItemFactory {
    private final List<Armour> armourListOfStage;
    private final List<Weapon> weaponsOfStage;
    private final List<Accessoires> accessoiresListOfStage;

    public ItemFactory() {
        this.armourListOfStage = new ArrayList<>();
        this.weaponsOfStage = new ArrayList<>();
        this.accessoiresListOfStage = new ArrayList<>();

    }

    public void createArmourStagePack() {
        for (int i = 1; i <= 6; i++) {
            armourListOfStage.add(new Helm());
            armourListOfStage.add(new Chest());
        }

    }

    public void createWeaponStagePack() {
        for (int i = 1; i <= 2; i++) {
            weaponsOfStage.add(new Sword());
            weaponsOfStage.add(new Axe());
            weaponsOfStage.add(new Bow());
            weaponsOfStage.add(new Gun());
            weaponsOfStage.add(new Scepter());
            weaponsOfStage.add(new Wand());
        }

    }

    public void createAccessoriesStagePack() {
        for (int i = 1; i <= 4; i++) {
            accessoiresListOfStage.add(new Belt());
            accessoiresListOfStage.add(new Amulet());
            accessoiresListOfStage.add(new Ring());
        }

    }

    public List<Weapon> getWeaponsOfStage() {
        return weaponsOfStage;
    }

    public List<Armour> getArmourListOfStage() {
        return armourListOfStage;
    }

    public List<Accessoires> getAccessoiresListOfStage() {
        return accessoiresListOfStage;
    }
}
