package cgi.game.creations.items.weapon.caster;

import cgi.game.creations.Attributes;
import cgi.game.creations.items.weapon.Weapon;

public class Wand extends Weapon {

	public Wand() {
		this.setAttackSpeed(1.8);
		this.setAttributeBonus(Attributes.INTELLIGENCE);
		super.initializeDamage();
	}
}
