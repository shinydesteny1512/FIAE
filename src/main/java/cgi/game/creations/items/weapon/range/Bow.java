package cgi.game.creations.items.weapon.range;

import cgi.game.creations.Attributes;
import cgi.game.creations.items.weapon.Weapon;

public class Bow extends Weapon {

	public Bow() {
		this.setAttackSpeed(2.3);
		this.setAttributeBonus(Attributes.DEXTERITY);
		super.initializeDamage();
	}

}
