package cgi.game.menues.general;

import cgi.game.creations.player.Player;
import cgi.game.menues.Window;

public class GameWindow extends Window {
    public GameWindow(String windowName) {
        super(windowName);
    }

    public void gameMenu(Player player) {
        cleanScreen();
        System.out.printf(
                """
                        Name: %s                   | bla bla bla
                        Class: %s                   | bla bla bla
                        Weapon: %S                            | bla bla bla
                        Armour: %S                            | bla bla bla
                        Accessories: %S                            | bla bla bla
                        %n""",
                player.getName(),
                player.getMyClass().getPlayerClassName(),
                player.getInventory().getWeapon(),
                player.getInventory().getHelm(),
                player.getInventory().getAccessoires());
    }

}
