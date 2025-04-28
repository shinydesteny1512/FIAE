package cgi.game.creations.items.weapon.meele;

import cgi.game.creations.Attributes;
import cgi.game.creations.items.weapon.Weapon;

public class Sword extends Weapon {

	public Sword() {
		this.setAttackSpeed(1.6);
		this.setAttributeBonus(Attributes.DEXTERITY);
		super.initializeDamage();
	}

}
