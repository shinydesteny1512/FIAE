package cgi.game.creations.items.weapon.range;

import cgi.game.creations.Attributes;
import cgi.game.creations.items.weapon.Weapon;
import cgi.game.instance.level.GameInstance;

public class Bow extends Weapon {

    public Bow(GameInstance instance) {
        super(instance);
        this.setAttackSpeed(2.3);
        this.setAttributeBonus(Attributes.DEXTERITY);
        super.initializeDamage();
    }

}
