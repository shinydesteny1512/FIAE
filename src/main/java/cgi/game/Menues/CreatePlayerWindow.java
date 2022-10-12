package cgi.game.Menues;

import cgi.game.creations.player.Player;
import cgi.game.creations.player.classes.DexPlayerClass;
import cgi.game.creations.player.classes.IntPlayerClass;
import cgi.game.creations.player.classes.PlayerClassFactory;
import cgi.game.creations.player.classes.StrPlayerClass;

import java.util.Scanner;

public class CreatePlayerWindow extends Window {

    private Player player;

    public CreatePlayerWindow(WindowNames name) {
        super(name);
    }

    public void startGame() {
        player = new Player();
        createPlayer(player);
        cleanScreen();
        debugPlayer(player);
    }

    private void createPlayer(Player player) {
        boolean nameChosen;
        boolean classChosen;

        final Scanner sc = new Scanner(System.in);

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

    }

    public boolean isClassChosen(Player player, String classAccepted) {
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

    public boolean isNameChosen(Player player, String nameInput) {
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

    private void debugPlayer(Player player) {
        System.out.printf(String.format("""
                        #######################################################
                        PLAYER NAME: %s
                        PLAYER HEALTH: %s
                        PLAYER MANA: %s
                        PLAYER INITIATIVE: %s
                        PLAYER INITIATIVE BONUS: %s
                        PLAYER CLASS: %s
                        PLAYER CLASS ATTRIBUTE TYPE: %s
                        PLAYER CLASS STRENGTH: %s
                        PLAYER CLASS DEXTERITY: %s
                        PLAYER CLASS INTELLIGENCE: %s
                        #######################################################
                        """,
                player.getName(),
                player.getHealth(),
                player.getMana(),
                player.getInitiative(),
                player.getInitiativeBonus(),
                player.getMyClass().getPlayerClassName(),
                player.getMyClass().getAttributeTyp(),
                player.getMyClass().getStr(),
                player.getMyClass().getDex(),
                player.getMyClass().getInt()));

        if (player.getMyClass() instanceof StrPlayerClass strPlayerClass) {
            System.out.println("STR CLASS: " + strPlayerClass);
        } else if (player.getMyClass() instanceof DexPlayerClass dexPlayerClass) {
            System.out.println("DEX CLASS: " + dexPlayerClass);
        } else if (player.getMyClass() instanceof IntPlayerClass intPlayerClass) {
            System.out.println("INT CLASS: " + intPlayerClass);
        }
    }


}