package cgi.game.creations.items.weapon.caster;

import cgi.game.creations.Attributes;
import cgi.game.creations.items.weapon.Weapon;

public class Scepter extends Weapon {

    public Scepter() {
        this.setAttackSpeed(1.5);
        this.setAttributeBonus(Attributes.INTELLIGENCE);
        super.initializeDamage();
    }
}
