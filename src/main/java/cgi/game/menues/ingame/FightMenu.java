package cgi.game.menues.ingame;

import cgi.game.creations.npcs.evil.Enemy;
import cgi.game.creations.player.Player;
import cgi.game.instance.tiles.fight.ActionFight;
import cgi.game.menues.Window;

public class FightMenu extends Window {

	public FightMenu(String windowName) {
		super(windowName);
		setTerminalName();
	}

	public void createActionFightView(ActionFight actionFight, Player player, Enemy enemy) {
		while (player.getHealth() >= 0 || enemy.getHealth() >= 0) {
			if (player.getHealth() <= 0) {
				System.out.println("\nLooser");
				break;
			} else if (enemy.getHealth() <= 0) {
				System.out.println("\nWinner");
				break;
			} else {
				actionFight.fight(player, enemy);
			}

		}
	}

	public void gameViewEnemy(Enemy enemy, int indexOfEnemy) {
		System.out.printf("""
										______________________
										| Choose: %s         |
										| Name: %s           |
										| Weapon: %s         |
										| Health: %s         |
										| Mana: %s           |
										| Initiative: %s     |
										|_____________________
										""",
						indexOfEnemy,
						enemy.getName(),
						enemy.getInventory().getWeapon(),
						enemy.getHealth(),
						enemy.getMana(),
						enemy.getInitiative());
	}
}
