package cgi.game.creations.items.weapon.range;

import cgi.game.creations.Attributes;
import cgi.game.creations.items.weapon.Weapon;

public class Gun extends Weapon {

	public Gun() {
		this.setAttackSpeed(2.0);
		this.setAttributeBonus(Attributes.DEXTERITY);
		super.initializeDamage();
	}
}
