package cgi.game.creations.items.weapon.range;

import cgi.game.creations.Attributes;
import cgi.game.creations.items.weapon.Weapon;
import cgi.game.instance.level.GameInstance;

public class Gun extends Weapon {

    public Gun(GameInstance instance) {
        super(instance);
        this.setAttackSpeed(2.0);
        this.setAttributeBonus(Attributes.DEXTERITY);
        super.initializeDamage();
    }
}
