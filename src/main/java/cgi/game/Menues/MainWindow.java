package cgi.game.Menues;

import java.util.Scanner;

public class MainWindow extends Window {

    private CreatePlayerWindow createPlayerMenu;

    public MainWindow(final WindowNames name) {
        super(name);
    }

    public final void startWindow() {
        cleanScreen();
        createPlayerMenu = new CreatePlayerWindow(WindowNames.CREATEPLAYERMENU);
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
                createPlayerMenu.startGame();
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

        cleanScreen();
    }
}
