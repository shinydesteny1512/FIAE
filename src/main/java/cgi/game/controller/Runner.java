package cgi.game.controller;

import cgi.game.Menues.MainWindow;
import cgi.game.Menues.WindowNames;

public class Runner {

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow(WindowNames.MAINMENU);
        mainWindow.startWindow();

    }

}
