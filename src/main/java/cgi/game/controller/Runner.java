package cgi.game.controller;

import cgi.game.instance.Menu;

public class Runner {
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        menu.startGame();
    }

}
