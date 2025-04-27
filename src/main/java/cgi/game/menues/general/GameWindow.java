package cgi.game.menues.general;

import cgi.game.creations.npcs.evil.Enemy;
import cgi.game.creations.player.Player;
import cgi.game.menues.Window;

public class GameWindow extends Window {
    public GameWindow(String windowName) {
        super(windowName);
    }

    public void gameMenu(Player player, Enemy enemy) {
        cleanScreen();

    }

}
