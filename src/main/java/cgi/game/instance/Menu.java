package cgi.game.instance;

import cgi.game.creations.player.Player;
import cgi.game.creations.player.classes.DexPlayerClass;
import cgi.game.creations.player.classes.IntPlayerClass;
import cgi.game.creations.player.classes.PlayerClassFactory;
import cgi.game.creations.player.classes.StrPlayerClass;

import java.util.Scanner;

public class Menu {

    private Player player;

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

        System.out.println("Welcome to the World of [Uniting Worlds] \n What's your name?");
        do {
            final String nameInput = sc.next();
            nameChosen = isNameChosen(player, nameInput);
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
            final String classAccepted = sc.next();
            classChosen = isClassChosen(player, classAccepted);

        } while (!classChosen);
    }

    private void cleanScreen(){
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
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
        System.out.println(
                "#################################################################################" +
                        "\n PLAYER NAME:" + player.getName() +
                        "\n PLAYER HEALTH: " + player.getHealth() +
                        "\n PLAYER MANA: " + player.getMana() +
                        "\n PLAYER INITIATIVE: " + player.getInitiative() +
                        "\n PLAYER INITIATIVE BONUS: " + player.getInitiativeBonus() +
                        "\n PLAYER CLASS: " + player.getMyClass().getPlayerClassName() +
                        "\n PLAYER CLASS ATTRIBUTE TYPE: " + player.getMyClass().getAttributeTyp() +
                        "\n PLAYER CLASS STRENGTH: " + player.getMyClass().getStr() +
                        "\n PLAYER CLASS DEXTERITY: " + player.getMyClass().getDex() +
                        "\n PLAYER CLASS INTELLIGENCE: " + player.getMyClass().getInt() +
                        "\n ################################################################################" +
                        "\n Class Specific Values: ");
        if (player.getMyClass() instanceof StrPlayerClass strPlayerClass) {
            System.out.println("STR CLASS: " + strPlayerClass);
        } else if (player.getMyClass() instanceof DexPlayerClass dexPlayerClass) {
            System.out.println("DEX CLASS: " + dexPlayerClass);
        } else if (player.getMyClass() instanceof IntPlayerClass intPlayerClass) {
            System.out.println("INT CLASS: " + intPlayerClass);
        }
    }
}