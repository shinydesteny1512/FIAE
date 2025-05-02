package cgi.game.menues.general;

import cgi.game.creations.npcs.evil.Enemy;
import cgi.game.creations.npcs.evil.EvilEnemyFactory;
import cgi.game.creations.player.Player;
import cgi.game.instance.level.Game;
import cgi.game.instance.tiles.Action;
import cgi.game.instance.tiles.fight.ActionFight;
import cgi.game.menues.GameFactory;
import cgi.game.menues.Window;
import cgi.game.menues.ingame.FightMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class GameWindow extends Window {

	private final List<Action> actionList = new ArrayList<>();
	private final Player player;

	public GameWindow(String windowName) {
		super(windowName);
		this.player = GameFactory.player;
	}

	public void gameMenu(Scanner sc) {
		ActionFight actionFight = new ActionFight(UUID.randomUUID(), "DebugFight");
		FightMenu fightMenu = new FightMenu("Fight:" + Game.stageTyp + Game.gameStage);

		EvilEnemyFactory evilEnemyFactory = new EvilEnemyFactory();

		List<Enemy> randomEnemyFromList = evilEnemyFactory.getRandomEnemyFromList();

		for (Enemy receivedEnemy : randomEnemyFromList) {
			fightMenu.gameViewEnemy(receivedEnemy, randomEnemyFromList.indexOf(receivedEnemy));
		}

		final String chooseEnemyInput = sc.next();

		Enemy choosenEnemy = randomEnemyFromList.get(Integer.parseInt(chooseEnemyInput));

		fightMenu.createActionFightView(actionFight, player, choosenEnemy);

	}


}
