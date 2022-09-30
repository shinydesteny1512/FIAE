package cgi.game.controller;

import cgi.game.creations.classes.PlayerClassCreater;
import cgi.game.creations.player.Player;

import java.util.Scanner;

public class UnitingWorlds {

    private Player PLAYER;
    private PlayerClassCreater playerClassCreater;

    public UnitingWorlds() {
    }

    public void startGame() throws Exception {
        PLAYER = new Player();
        playerClassCreater = new PlayerClassCreater();
        createPlayer(PLAYER);
        debugPlayer();
    }

    private void createPlayer(Player player) throws Exception {
        boolean nameChosen = false;
        boolean classChosen;

        Scanner sc = new Scanner(System.in);
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
            System.out.println("Press the number in [] to choose your class: \n [1] Warrior \n [2] Ranger \n [3] Mage");
            String classAccepted = sc.next();
            classChosen = setPLAYERClass(player, classAccepted);
            player.initializeHealth();
            player.initializeMana();

        } while (!classChosen);
    }

    private boolean setPLAYERClass(Player player, String choice) {
        boolean chosen = false;
        if (choice.equals("1") || choice.equals("!")) {
            System.out.println("You have chosen Warrior! RAWRRRR");
            chosen = true;
            player.setMyClass(playerClassCreater.createWarrior());

        } else if (choice.equals("2")) {
            System.out.println("You have chosen Ranger! PEW PEW PEW");
            chosen = true;
            player.setMyClass(playerClassCreater.createRanger());

        } else if (choice.equals("3") || choice.equals("§")) {
            System.out.println("You have chosen Mage! PSHIIIIIEAUUU");
            chosen = true;
            player.setMyClass(playerClassCreater.createMage());

        } else {
            System.out.println("Wrong Input, try again");
        }
        return chosen;
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