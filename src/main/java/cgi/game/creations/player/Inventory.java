package cgi.game.creations.player;

import cgi.game.creations.items.Item;
import cgi.game.creations.items.accessiore.Amulet;
import cgi.game.creations.items.accessiore.Belt;
import cgi.game.creations.items.accessiore.Ring;
import cgi.game.creations.items.armour.Chest;
import cgi.game.creations.items.armour.Helm;
import cgi.game.creations.items.weapon.Weapon;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Inventory {
	private final List<Item> backspace;
	private Weapon weapon;
	private Helm helm;
	private Chest chest;
	private Amulet amulet;
	private Ring ring;
	private Belt belt;

	public Inventory(Weapon weapon, Helm helm, Chest chest, Amulet amulet, Ring ring, Belt belt) {
		this.chest = chest;
		this.weapon = weapon;
		this.helm = helm;
		this.backspace = new ArrayList<>();
		this.amulet = amulet;
		this.ring = ring;
		this.belt = belt;
	}

	public void addItemToInventory(Item item) {
		backspace.add(item);
	}

	public void removeItemFromInventory(Item item) {
		backspace.remove(item);
	}

	public boolean isAmuletEquipped() {
		return amulet != null;
	}

	public boolean isRingEquipped() {
		return ring != null;
	}

	public boolean isBeltEquipped() {
		return belt != null;
	}
}
