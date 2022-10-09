package cgi.game.Menues;

import java.util.Scanner;

public class MainWindow extends Window {

    private CreatePlayerWindow createPlayerMenu;

    public MainWindow(WindowNames name) {
        super(name);
    }

    public void startWindow() {
        createPlayerMenu = new CreatePlayerWindow(WindowNames.CREATEPLAYERMENU);
        cleanScreen();
        createMainMenu();
    }

    private void createMainMenu() {
        final Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the World of [Uniting Worlds]");

        System.out.println("""
                Press the number in [] to choose your class:
                 [1] New Game
                 [2] Load Game
                 [3] Exit""");

        final String menuChosen = sc.next();

        switch (menuChosen) {
            case "1", "!" -> createPlayerMenu.startGame();
            case "2" -> System.out.println("Unaccessable Option");
            case "3", "§" -> closeScreen();
        }

        cleanScreen();
    }
}
