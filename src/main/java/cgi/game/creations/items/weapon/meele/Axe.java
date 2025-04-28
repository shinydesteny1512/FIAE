package cgi.game.creations.items.weapon.meele;

import cgi.game.creations.Attributes;
import cgi.game.creations.items.weapon.Weapon;

public class Axe extends Weapon {

	public Axe() {
		this.setAttackSpeed(1.5);
		this.setAttributeBonus(Attributes.STRENGTH);
		super.initializeDamage();
	}

}
