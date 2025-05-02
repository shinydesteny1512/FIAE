package cgi.game.controller;

import cgi.game.menues.GameFactory;
import cgi.game.menues.general.MainWindow;

public class Runner {

	public static void main(String[] args) {
		MainWindow mainWindow = GameFactory.mainWindow;
		mainWindow.startWindow();

	}
}
