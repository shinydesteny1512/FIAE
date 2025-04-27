package cgi.game.util;

import cgi.game.creations.items.weapon.meele.Axe;
import cgi.game.creations.npcs.evil.Enemy;
import cgi.game.creations.npcs.evil.Goblin;
import cgi.game.instance.level.Game;

public class EnemyCreator {

    public static Enemy createSmallEnemy(){

        Enemy enemy = new Goblin(Game.gameStage);
        enemy.setName("Goblin");
        enemy.setHealth(200d);
        enemy.setMana(100d);
        enemy.setInitiative(6d);
        enemy.getInventory().setWeapon(new Axe());

        return enemy;
    }


}
