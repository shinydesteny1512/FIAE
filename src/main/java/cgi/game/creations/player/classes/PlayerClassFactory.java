package cgi.game.creations.player.classes;

import cgi.game.creations.Attributes;
import cgi.game.creations.items.armour.Chest;
import cgi.game.creations.items.armour.Helm;
import cgi.game.creations.items.weapon.caster.Scepter;
import cgi.game.creations.items.weapon.caster.Wand;
import cgi.game.creations.items.weapon.meele.Axe;
import cgi.game.creations.items.weapon.meele.Sword;
import cgi.game.creations.items.weapon.range.Bow;
import cgi.game.creations.items.weapon.range.Gun;
import cgi.game.creations.player.Player;

public class PlayerClassFactory {
	private IntPlayerClass intClass;
	private StrPlayerClass strClass;
	private DexPlayerClass dexClass;

	public final void createMage(Player player) {
		intClass = new IntPlayerClass();
		intClass.setPlayerClassName("Mage");
		intClass.setAttributeTyp(Attributes.INTELLIGENCE);
		intClass.initializeAttributes();
		player.setMyPlayerClass(intClass);
		setHelmAndChest(player);
		player.getInventory().setWeapon(new Wand());

	}

	public final void createWarrior(Player player) {
		strClass = new StrPlayerClass();
		strClass.setPlayerClassName("Warrior");
		strClass.setAttributeTyp(Attributes.STRENGTH);
		strClass.initializeAttributes();
		player.setMyPlayerClass(strClass);
		setHelmAndChest(player);
		player.getInventory().setWeapon(new Axe());

	}

	public final void createRanger(Player player) {
		dexClass = new DexPlayerClass();
		dexClass.setPlayerClassName("Ranger");
		dexClass.setAttributeTyp(Attributes.DEXTERITY);
		dexClass.initializeAttributes();
		player.setMyPlayerClass(dexClass);
		setHelmAndChest(player);
		player.getInventory().setWeapon(new Bow());

	}

	public final void createPriest(Player player) {
		intClass = new IntPlayerClass();
		intClass.setPlayerClassName("Priest");
		intClass.setAttributeTyp(Attributes.INTELLIGENCE);
		intClass.initializeAttributes();
		player.setMyPlayerClass(intClass);
		setHelmAndChest(player);
		player.getInventory().setWeapon(new Scepter());

	}

	public final void createRogue(Player player) {
		dexClass = new DexPlayerClass();
		dexClass.setPlayerClassName("Rogue");
		dexClass.setAttributeTyp(Attributes.DEXTERITY);
		dexClass.initializeAttributes();
		player.setMyPlayerClass(dexClass);
		setHelmAndChest(player);
		player.getInventory().setWeapon(new Gun());

	}

	public final void createBarbarian(Player player) {
		strClass = new StrPlayerClass();
		strClass.setPlayerClassName("Barbarian");
		strClass.setAttributeTyp(Attributes.STRENGTH);
		strClass.initializeAttributes();
		player.setMyPlayerClass(strClass);
		setHelmAndChest(player);
		player.getInventory().setWeapon(new Sword());

	}

	private void setHelmAndChest(Player pc) {
		pc.getInventory().setHelm(new Helm());
		pc.getInventory().setChest(new Chest());
	}

}
