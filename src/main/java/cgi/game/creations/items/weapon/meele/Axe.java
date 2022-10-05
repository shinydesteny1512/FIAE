package cgi.game.creations.items.weapon.meele;

import cgi.game.creations.Attributes;
import cgi.game.creations.items.weapon.Weapon;
import cgi.game.instance.level.GameInstance;

public class Axe extends Weapon {

    public Axe(GameInstance instance) {
        super(instance);
        this.setAttackSpeed(1.5);
        this.setAttributeBonus(Attributes.STRENGTH);
        super.initializeDamage();
    }

}
