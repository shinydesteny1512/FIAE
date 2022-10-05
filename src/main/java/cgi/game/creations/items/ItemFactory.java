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
import cgi.game.instance.level.GameInstance;

import java.util.ArrayList;
import java.util.List;

public class ItemFactory {
    private final GameInstance instance;
    private final List<Armour> armourListOfStage;
    private final List<Weapon> weaponsOfStage;
    private final List<Accessoires> accessoiresListOfStage;

    public ItemFactory(GameInstance instance) {
        this.instance = instance;
        armourListOfStage = new ArrayList<>();
        weaponsOfStage = new ArrayList<>();
        accessoiresListOfStage = new ArrayList<>();
    }

    public void createArmourStagePack() {
        for (int i = 1; i <= 2; i++) {
            armourListOfStage.add(new Helm(instance, "Helm"));
            armourListOfStage.add(new Helm(instance, "Helm"));
            armourListOfStage.add(new Helm(instance, "Helm"));
            armourListOfStage.add(new Chest(instance, "Chest"));
            armourListOfStage.add(new Chest(instance, "Chest"));
            armourListOfStage.add(new Chest(instance, "Chest"));
        }

    }

    public void createWeaponStagePack() {
        for (int i = 1; i <= 2; i++) {
            weaponsOfStage.add(new Sword(instance));
            weaponsOfStage.add(new Axe(instance));
            weaponsOfStage.add(new Bow(instance));
            weaponsOfStage.add(new Gun(instance));
            weaponsOfStage.add(new Scepter(instance));
            weaponsOfStage.add(new Wand(instance));
        }

    }

    public void createAccessioresStagePack() {
        for (int i = 1; i <= 2; i++) {
            accessoiresListOfStage.add(new Belt(instance));
            accessoiresListOfStage.add(new Belt(instance));
            accessoiresListOfStage.add(new Amulet(instance));
            accessoiresListOfStage.add(new Amulet(instance));
            accessoiresListOfStage.add(new Ring(instance));
            accessoiresListOfStage.add(new Ring(instance));
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
