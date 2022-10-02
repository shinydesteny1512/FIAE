package cgi.game.creations.items.weapon;

public class Sword extends Weapon {

    public Sword(int minDmg, int maxDmg) {
        super(minDmg, maxDmg);
        this.setRange(1);
        this.setUpgradeStage(0);
    }

}
