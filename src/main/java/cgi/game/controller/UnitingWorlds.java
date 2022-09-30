package cgi.game.controller;

import cgi.game.creations.classes.PlayerClassCreater;
import cgi.game.creations.player.Player;

import java.util.Scanner;

public class UnitingWorlds {

    private Player PLAYER;
    private PlayerClassCreater playerClassCreater;

    public void startGame() throws Exception {
        PLAYER = new Player();
        playerClassCreater = new PlayerClassCreater();
        createPlayer(PLAYER);
        debugPlayer();
    }

    private void createPlayer(Player player) throws Exception {
        boolean nameChosen = false;
        boolean classChosen = false;

        final Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the World of [Uniting Worlds] \n What's your name?");
        do {
            player.setPlayerName(sc.next());
            System.out.println("So your name is {" + player.getPlayerName() + "}? Are you sure about that?");
            String playerNameAccepted = sc.next();
            if (playerNameAccepted.equals("yes") || playerNameAccepted.equals("y")) {
                nameChosen = true;
            } else {
                System.out.println("Repeat your Name!");
            }
        } while (!nameChosen);

        System.out.println("So, {" + player.getPlayerName() + "}, which class do you want to play?");
        do {
            System.out.println("""
                    Press the number in [] to choose your class:\s
                     [1] Warrior
                     [2] Ranger
                     [3] Mage
                     [4] Barbarian
                     [5] Priest""");
            String classAccepted = sc.next();
            setPLAYERClass(player, classAccepted);
            player.initializeHealth();
            player.initializeMana();

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
                player.setMyClass(playerClassCreater.createWarrior());
            }
            case "2" -> {
                System.out.println("You have chosen Ranger! PEW PEW PEW");
                player.setMyClass(playerClassCreater.createRanger());
            }
            case "3", "§" -> {
                System.out.println("You have chosen Mage! PSHIIIIIEAUUU");
                player.setMyClass(playerClassCreater.createMage());
            }
            case "4", "$" -> {
                System.out.println("You have chosen Barb! RAWWWWRRR");
                player.setMyClass(playerClassCreater.createBarb());
            }
            case "5", "%" -> {
                System.out.println("You have chosen Priest! Wushhh");
                player.setMyClass(playerClassCreater.createPriest());
            }
            case "6", "&" -> {
                System.out.println("You have chosen Rogue! Kling Kling");
                player.setMyClass(playerClassCreater.createRogue());
            }
            default -> System.out.println("Wrong Input, try again");
        }
    }


    private void debugPlayer() {
        System.out.println(
                "#################################################################################" +
                        "\n PLAYER NAME:" + PLAYER.getPlayerName() +
                        "\n PLAYER HEALTH: " + PLAYER.getHealth() +
                        "\n PLAYER MANA: " + PLAYER.getMana() +
                        "\n PLAYER CLASS: " + PLAYER.getMyClass().getName() +
                        "\n PLAYER CLASS ATTRIBUTE TYPE: " + PLAYER.getMyClass().getAttributeTyp() +
                        "\n PLAYER CLASS STRENGTH: " + PLAYER.getMyClass().getStr() +
                        "\n PLAYER CLASS DEXTERITY: " + PLAYER.getMyClass().getDex() +
                        "\n PLAYER CLASS INTELLIGENCE: " + PLAYER.getMyClass().getInt() +
                        "\n ################################################################################"
        );
    }
}