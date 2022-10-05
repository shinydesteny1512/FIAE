package cgi.game.creations.items.weapon.caster;

import cgi.game.creations.Attributes;
import cgi.game.creations.items.weapon.Weapon;
import cgi.game.instance.level.GameInstance;

public class Scepter extends Weapon {

    public Scepter(GameInstance instance) {
        super(instance);
        this.setAttackSpeed(1.5);
        this.setAttributeBonus(Attributes.INTELLIGENCE);
        super.initializeDamage();
    }
}
