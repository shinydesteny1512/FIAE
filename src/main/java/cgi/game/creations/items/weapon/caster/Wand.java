package cgi.game.creations.items.weapon.caster;

import cgi.game.creations.Attributes;
import cgi.game.creations.items.weapon.Weapon;
import cgi.game.instance.level.GameInstance;

public class Wand extends Weapon {

    public Wand(GameInstance instance) {
        super(instance);
        this.setAttackSpeed(1.8);
        this.setAttributeBonus(Attributes.INTELLIGENCE);
        super.initializeDamage();
    }
}
