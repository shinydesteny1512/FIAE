package cgi.game.instance.tiles.fight;

import cgi.game.creations.Creature;
import cgi.game.instance.tiles.Action;
import cgi.game.instance.tiles.ActionTypes;

import java.util.Random;
import java.util.UUID;

public class ActionFight extends Action {

    public ActionFight(UUID actionID, String actionName) {
        super(actionID, actionName, ActionTypes.FIGHT.toString());
    }

    public void battle(Creature player, Creature enemy){
        while (player.getHealth() >= 0 || enemy.getHealth() >= 0){
            if (player.getHealth() <= 0){
                System.out.println("Looser");
                break;
            } else if (enemy.getHealth() <= 0) {
                System.out.println("Winner");
                break;
            } else {
                this.fight(player, enemy);
            }

        }
    }

    private void fight(Creature player, Creature enemy) {
        Random r = new Random();

        double playerDeff = 0;
        double playerAttack =
                r.nextInt(player.getInventory().getWeapon().getMaxDmg()) + player.getInventory().getWeapon().getMinDmg();

        double enemyDeff = 0;
        double enemyAttack =
                r.nextInt(enemy.getInventory().getWeapon().getMaxDmg()) + enemy.getInventory().getWeapon().getMinDmg();

        System.out.printf("\nEnemy dealt %s damage.", enemyAttack);
        player.setHealth(player.getHealth() - (enemyAttack - playerDeff));
        System.out.printf("\nPlayer has %s remaining Health", player.getHealth());

        System.out.printf("\nPlayer dealt %s damage.", playerAttack);
        enemy.setHealth(enemy.getHealth() - (playerAttack - enemyDeff));
        System.out.printf("\nEnemy has %s remaining Health", enemy.getHealth());

    }
}
