package cgi.game.instance;

import cgi.game.creations.player.classes.DexPlayerClass;
import cgi.game.creations.player.classes.IntPlayerClass;
import cgi.game.creations.player.classes.PlayerClassFactory;
import cgi.game.creations.player.classes.StrPlayerClass;
import cgi.game.creations.player.Player;

import java.util.Scanner;

public class Menu {

    private Player PLAYER;
    private PlayerClassFactory playerClassFactory;

    public void startGame() throws Exception {
        PLAYER = new Player();
        playerClassFactory = new PlayerClassFactory();
        createPlayer(PLAYER);
        debugPlayer();
    }

    private void createPlayer(Player player) throws Exception {
        boolean nameChosen = false;
        boolean classChosen = false;

        final Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the World of [Uniting Worlds] \n What's your name?");
        do {
            player.setName(sc.next());
            System.out.println("So your name is {" + player.getName() + "}? Are you sure about that?");
            String playerNameAccepted = sc.next();
            if (playerNameAccepted.equals("yes") || playerNameAccepted.equals("y")) {
                nameChosen = true;
            } else {
                System.out.println("Repeat your Name!");
            }
        } while (!nameChosen);

        System.out.println("So, {" + player.getName() + "}, which class do you want to play?");
        do {
            System.out.println("""
                    Press the number in [] to choose your class:\s
                     [1] Warrior
                     [2] Ranger
                     [3] Mage
                     [4] Barbarian
                     [5] Priest
                     [6] Rogue""");
            String classAccepted = sc.next();
            setPLAYERClass(player, classAccepted);
            player.initializeHealth();
            player.initializeMana();
            player.initializeInitiative();

            System.out.println("Are you sure about your choice?");
            String playerClassAccepted = sc.next();
            if (playerClassAccepted.equals("yes") || playerClassAccepted.equals("y")) {
                classChosen = true;
            } else {
                System.out.println("Choose again!");
            }

        } while (!classChosen);
    }

    private void setPLAYERClass(Player player, String choice) {
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


    private void debugPlayer() {
        System.out.println(
                "#################################################################################" +
                        "\n PLAYER NAME:" + PLAYER.getName() +
                        "\n PLAYER HEALTH: " + PLAYER.getHealth() +
                        "\n PLAYER MANA: " + PLAYER.getMana() +
                        "\n PLAYER INITIATIVE: " + PLAYER.getInitiative() +
                        "\n PLAYER INITIATIVE BONUS: " + PLAYER.getInitiativeBonus() +
                        "\n PLAYER CLASS: " + PLAYER.getMyClass().getPlayerClassName() +
                        "\n PLAYER CLASS ATTRIBUTE TYPE: " + PLAYER.getMyClass().getAttributeTyp() +
                        "\n PLAYER CLASS STRENGTH: " + PLAYER.getMyClass().getStr() +
                        "\n PLAYER CLASS DEXTERITY: " + PLAYER.getMyClass().getDex() +
                        "\n PLAYER CLASS INTELLIGENCE: " + PLAYER.getMyClass().getInt() +
                        "\n ################################################################################" +
                        "\n Class Specific Values: ");
        if (PLAYER.getMyClass() instanceof StrPlayerClass strPlayerClass) {
            System.out.println("STR CLASS");
        } else if (PLAYER.getMyClass() instanceof DexPlayerClass dexPlayerClass) {
            System.out.println("DEX CLASS");
        } else if (PLAYER.getMyClass() instanceof IntPlayerClass intPlayerClass) {
            System.out.println("INT CLASS");
        }
    }
}