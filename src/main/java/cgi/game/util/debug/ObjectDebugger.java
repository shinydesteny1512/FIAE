package cgi.game.util.debug;

import cgi.game.creations.npcs.evil.Enemy;
import cgi.game.creations.player.Player;
import cgi.game.creations.player.classes.DexPlayerClass;
import cgi.game.creations.player.classes.IntPlayerClass;
import cgi.game.creations.player.classes.StrPlayerClass;
import cgi.game.instance.tiles.Action;

public class ObjectDebugger {

	public static void debugPlayer(Player player) {
		System.out.printf(String.format("""
										#######################################################
										PLAYER NAME: %s
										PLAYER HEALTH: %s
										PLAYER MANA: %s
										PLAYER INITIATIVE: %s
										PLAYER INITIATIVE BONUS: %s
										PLAYER CLASS: %s
										PLAYER CLASS ATTRIBUTE TYPE: %s
										PLAYER CLASS STRENGTH: %s
										PLAYER CLASS DEXTERITY: %s
										PLAYER CLASS INTELLIGENCE: %s
										PLAYER CLASS WEAPON: %s
										PLAYER CLASS HELM: %s
										PLAYER CLASS ARMOUR: %s
										PLAYER CLASS ACCESSORIES: %s
										#######################################################
										""",
						player.getName(),
						player.getHealth(),
						player.getMana(),
						player.getInitiative(),
						player.getInitiativeBonus(),
						player.getMyClass().getPlayerClassName(),
						player.getMyClass().getAttributeTyp(),
						player.getMyClass().getStr(),
						player.getMyClass().getDex(),
						player.getMyClass().getInt(),
						player.getInventory().getWeapon(),
						player.getInventory().getHelm(),
						player.getInventory().getChest(),
						player.getInventory().getAccessories()));

		if (player.getMyClass() instanceof StrPlayerClass strPlayerClass) {
			System.out.println("STR CLASS: " + strPlayerClass);
		} else if (player.getMyClass() instanceof DexPlayerClass dexPlayerClass) {
			System.out.println("DEX CLASS: " + dexPlayerClass);
		} else if (player.getMyClass() instanceof IntPlayerClass intPlayerClass) {
			System.out.println("INT CLASS: " + intPlayerClass);
		}
	}

	public static void debugEnemy(Enemy enemy) {
		System.out.printf(String.format("""
										#######################################################
										ENEMY NAME: %s
										ENEMY HEALTH: %s
										ENEMY MANA: %s
										ENEMY INITIATIVE: %s
										ENEMY CLASS: %s
										ENEMY CLASS HP MULTI: %s
										ENEMY CLASS MANA MULTI: %s
										ENEMY CLASS INI MULTI: %s
										ENEMY CLASS WEAPON: %s
										ENEMY CLASS HELM: %s
										ENEMY CLASS ARMOUR: %s
										ENEMY CLASS ACCESSORIES: %s
										#######################################################
										""",
						enemy.getName(),
						enemy.getHealth(),
						enemy.getMana(),
						enemy.getInitiative(),
						enemy.getEnemyClass().getEnemyClass(),
						enemy.getEnemyClass().getHpMultiplier(),
						enemy.getEnemyClass().getManaMultiplier(),
						enemy.getEnemyClass().getInitiativeMultiplier(),
						enemy.getInventory().getWeapon(),
						enemy.getInventory().getHelm(),
						enemy.getInventory().getChest(),
						enemy.getInventory().getAccessories()));

	}

	public static void debugTile(Action action) {
		System.out.println("################################");
		System.out.println("ActionID: " + action.getActionID());
		System.out.println("ActionName: " + action.getActionName());
		System.out.println("ActionTyp: " + action.getActionTyp());
		System.out.println("################################");

	}

}
