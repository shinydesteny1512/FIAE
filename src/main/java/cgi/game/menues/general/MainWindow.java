package cgi.game.menues.general;

import cgi.game.menues.Window;
import cgi.game.menues.WindowFactory;

import java.util.Scanner;

public class MainWindow extends Window {

	public MainWindow(final String name) {
		super(name);
	}

	public final void startWindow() {
		cleanScreen();
		createMainMenu();
	}

	private void createMainMenu() {
		final Scanner sc = new Scanner(System.in);
		System.out.println("""
						Welcome to the World of [Uniting Worlds]
						Press the number in [] to choose your class:
						[1] New Game
						[2] Load Game
						[3] Exit
						""");

		final String menuChosen = sc.next();

		switch (menuChosen) {
			case "1", "!" -> {
				WindowFactory.createPlayerWindow.startGame();
				System.out.println("Game Started");

			}
			case "2" -> {
				System.out.println("Load Game");
				System.out.println("Unacceptable Option");

			}
			case "3", "§" -> {
				System.out.println("Are you sure, that you want to close the game?");
				closeScreen();

			}
		}

//        cleanScreen();
	}
}
