package cgi.game.menues.general;

import cgi.game.creations.npcs.evil.Enemy;
import cgi.game.creations.npcs.evil.EvilEnemyFactory;
import cgi.game.creations.player.Player;
import cgi.game.instance.tiles.fight.ActionFight;
import cgi.game.menues.Window;
import cgi.game.util.debug.ObjectDebugger;
import java.util.UUID;

public class GameWindow extends Window {

    public GameWindow(String windowName) {
        super(windowName);
    }

    public void gameMenu(Player player) {
        cleanScreen();

        ActionFight actionFight = new ActionFight(new UUID(1L, 1L), "DebugFight");

        EvilEnemyFactory evilEnemyFactory = new EvilEnemyFactory();

        Enemy enemy = evilEnemyFactory.getRandomEnemyFromList();

        ObjectDebugger.debugEnemy(enemy);

        actionFight.battle(player, enemy);

    }



}
