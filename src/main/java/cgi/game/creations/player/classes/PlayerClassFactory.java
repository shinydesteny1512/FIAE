package cgi.game.creations.player.classes;

import cgi.game.creations.Attributes;
import cgi.game.creations.items.armour.Chest;
import cgi.game.creations.items.armour.Helm;
import cgi.game.creations.items.weapon.caster.Scepter;
import cgi.game.creations.items.weapon.caster.Wand;
import cgi.game.creations.items.weapon.meele.Axe;
import cgi.game.creations.items.weapon.meele.Sword;
import cgi.game.creations.items.weapon.range.Bow;

public class PlayerClassFactory {
    private IntPlayerClass intClass;
    private StrPlayerClass strClass;
    private DexPlayerClass dexClass;

    public final IntPlayerClass createMage() {
        intClass = new IntPlayerClass();
        intClass.setPlayerClassName("Mage");
        intClass.setAttributeTyp(Attributes.INTELLIGENCE);
        intClass.initializeAttributes();
        intClass.getInventory().setWeapon(new Wand());
        setHelmAndChest(intClass);
        return intClass;

    }

    public StrPlayerClass createWarrior() {
        strClass = new StrPlayerClass();
        strClass.setPlayerClassName("Warrior");
        strClass.setAttributeTyp(Attributes.STRENGTH);
        strClass.initializeAttributes();
        strClass.getInventory().setWeapon(new Axe());
        setHelmAndChest(strClass);
        return strClass;

    }

    public DexPlayerClass createRanger() {
        dexClass = new DexPlayerClass();
        dexClass.setPlayerClassName("Ranger");
        dexClass.setAttributeTyp(Attributes.DEXTERITY);
        dexClass.initializeAttributes();
        dexClass.getInventory().setWeapon(new Bow());
        setHelmAndChest(dexClass);
        return dexClass;

    }

    public IntPlayerClass createPriest() {
        intClass = new IntPlayerClass();
        intClass.setPlayerClassName("Priest");
        intClass.setAttributeTyp(Attributes.INTELLIGENCE);
        intClass.initializeAttributes();
        intClass.getInventory().setWeapon(new Scepter());
        setHelmAndChest(intClass);
        return intClass;

    }

    public DexPlayerClass createRogue() {
        dexClass = new DexPlayerClass();
        dexClass.setPlayerClassName("Rogue");
        dexClass.setAttributeTyp(Attributes.DEXTERITY);
        dexClass.initializeAttributes();
        dexClass.getInventory().setWeapon(new Sword());
        setHelmAndChest(dexClass);
        return dexClass;

    }

    public StrPlayerClass createBarbarian() {
        strClass = new StrPlayerClass();
        strClass.setPlayerClassName("Barbarian");
        strClass.setAttributeTyp(Attributes.STRENGTH);
        strClass.initializeAttributes();
        strClass.getInventory().setWeapon(new Sword());
        setHelmAndChest(strClass);
        return strClass;

    }

    private void setHelmAndChest(PlayerClass pc) {
        pc.getInventory().setHelm(new Helm());
        pc.getInventory().setChest(new Chest());
    }

}
