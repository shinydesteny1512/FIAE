package cgi.game.controller;

import cgi.game.menues.WindowFactory;
import cgi.game.menues.general.MainWindow;

public class Runner {

    public static void main(String[] args) {
        MainWindow mainWindow = WindowFactory.mainWindow;
        mainWindow.startWindow();

    }
}
