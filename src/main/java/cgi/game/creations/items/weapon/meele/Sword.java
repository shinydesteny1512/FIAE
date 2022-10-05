package cgi.game.creations.items.weapon.meele;

import cgi.game.creations.Attributes;
import cgi.game.creations.items.weapon.Weapon;
import cgi.game.instance.level.GameInstance;

public class Sword extends Weapon {

    public Sword(GameInstance instance) {
        super(instance);
        this.setAttackSpeed(1.6);
        this.setAttributeBonus(Attributes.DEXTERITY);
        super.initializeDamage();
    }

}
