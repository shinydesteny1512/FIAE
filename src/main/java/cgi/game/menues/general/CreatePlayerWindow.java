package cgi.game.menues.general;

import cgi.game.creations.player.Player;
import cgi.game.creations.player.classes.PlayerClassFactory;
import cgi.game.menues.Window;
import cgi.game.menues.WindowFactory;

import java.util.Scanner;

public class CreatePlayerWindow extends Window {
    private final Player player;

    public CreatePlayerWindow(String windowName) {
        super(windowName);
        this.player = new Player();
    }

    public void startGame() {
        createPlayer(player);
        cleanScreen();
        player.debugPlayer(); // will be deleted after player info menue is build in
    }

    private void createPlayer(Player player) {
        boolean finishedCreation;
        boolean nameChosen;
        boolean classChosen;

        final Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Welcome to the World of [Uniting Worlds] \nWhat's your name?");
            do {
                final String nameInput = sc.next();
                nameChosen = isNameChosen(player, nameInput);

            } while (!nameChosen);

            System.out.println("So, {" + player.getName() + "}, which class do you want to play?");
            do {
                System.out.println("""
                        Press the number in [] to choose your class:
                         [1] Warrior
                         [2] Ranger
                         [3] Mage
                         [4] Barbarian
                         [5] Priest
                         [6] Rogue""");

                final String classAccepted = sc.next();
                classChosen = isClassChosen(player, classAccepted);

            } while (!classChosen);

            System.out.println("Are you happy with your choices");
            final String finished = sc.next();
            finishedCreation = isCreationFinished(finished);

        } while (!finishedCreation);

        System.out.println("GAMEMENU");
        WindowFactory.gameWindow.gameMenu(player);
    }

    private boolean isCreationFinished(String finished) {
        if (finished.equalsIgnoreCase("yes")) {
            return true;
        } else if (finished.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }

    }

    private boolean isClassChosen(Player player, String classAccepted) {
        setPLAYERClass(player, classAccepted);
        player.initializeHealth();
        player.initializeMana();
        player.initializeInitiative();

        System.out.println("Are you sure about your choice?");
        Scanner scanner = new Scanner(System.in);
        String playerClassAccepted = scanner.next();
        if (playerClassAccepted.equals("yes") || playerClassAccepted.equals("y")) {
            return true;
        } else {
            System.out.println("Choose again!");
            return false;
        }
    }

    private boolean isNameChosen(Player player, String nameInput) {
        player.setName(nameInput);
        System.out.println("So your name is {" + player.getName() + "}? Are you sure about that?");
        Scanner scanner = new Scanner(System.in);
        String playerNameAccepted = scanner.next();
        if (playerNameAccepted.equals("yes") || playerNameAccepted.equals("y")) {
            return true;
        } else {
            System.out.println("Repeat your Name!");
            return false;
        }
    }

    private void setPLAYERClass(Player player, String choice) {
        final PlayerClassFactory playerClassFactory = new PlayerClassFactory();
        switch (choice) {
            case "1", "!" -> {
                System.out.println("You have chosen Warrior! AHU");
                player.setMyClass(playerClassFactory.createWarrior());
            }
            case "2" -> {
                System.out.println("You have chosen Ranger! PEW PEW PEW");
                player.setMyClass(playerClassFactory.createRanger());
            }
            case "3", "§" -> {
                System.out.println("You have chosen Mage! PSHIIIIIEAUUU");
                player.setMyClass(playerClassFactory.createMage());
            }
            case "4", "$" -> {
                System.out.println("You have chosen Barb! RAWWWWRRR");
                player.setMyClass(playerClassFactory.createBarbarian());
            }
            case "5", "%" -> {
                System.out.println("You have chosen Priest! Wushhh");
                player.setMyClass(playerClassFactory.createPriest());
            }
            case "6", "&" -> {
                System.out.println("You have chosen Rogue! Kling Kling");
                player.setMyClass(playerClassFactory.createRogue());
            }
            default -> System.out.println("Wrong Input, try again");
        }

    }

}