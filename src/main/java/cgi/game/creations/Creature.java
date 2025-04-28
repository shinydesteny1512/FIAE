package cgi.game.creations;

import cgi.game.creations.player.Inventory;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Creature {
	private final Inventory inventory;
	private String name;
	private double health;
	private double mana;
	private double initiative;

	public Creature() {
		this.inventory = new Inventory(null, null, null, null);
	}

	public void initializeHealth() {
	}

	public void initializeMana() {
	}

	public void initializeInitiative() {
	}

}
