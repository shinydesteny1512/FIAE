package cgi.game.menues.general;

import cgi.game.creations.player.Player;
import cgi.game.creations.player.classes.PlayerClassFactory;
import cgi.game.creations.player.races.Dwarf;
import cgi.game.creations.player.races.Elf;
import cgi.game.creations.player.races.Human;
import cgi.game.menues.Window;
import cgi.game.menues.GameFactory;
import cgi.game.util.debug.ObjectDebugger;

import java.util.Scanner;

public class CreatePlayerWindow extends Window {
//	private final Player player;
	final Scanner sc = new Scanner(System.in);


	public CreatePlayerWindow(String windowName) {
		super(windowName);
//		this.player = new Player();
	}

	public void startGame() {
		createPlayer(GameFactory.player);
		ObjectDebugger.debugPlayer(GameFactory.player); // will be deleted after player info menu is build in
	}

	private void createPlayer(Player player) {
		boolean finishedCreation;
		boolean nameChosen;
		boolean classChosen;
		boolean raceChosen;


		do {
			System.out.println("Welcome to the World of [Uniting Worlds] \nWhat's your name?");
			do {
				final String nameInput = sc.next();
				nameChosen = isNameChosen(player, nameInput);

			} while (!nameChosen);

			System.out.println("So, {" + player.getName() + "}, which race do you want to play?");
			do {
				System.out.println("""
								Press the Number in [] to choose your race:
								[1] Human
								[2] Elf
								[3] Dwarf
								""");

				System.out.println("Are you happy with your choice?");
				final String raceAccepted = sc.next();
				raceChosen = isRaceChosen(player, raceAccepted);

			} while (!raceChosen);


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

		GameFactory.gameWindow.gameMenu(sc);
	}

	private boolean isRaceChosen(Player player, String raceAccepted) {
		switch (raceAccepted) {
			case "1", "!" -> {
				player.setRace(new Human());
				return true;
			}
			case "2", "\"" -> {
				player.setRace(new Elf());
				return true;
			}
			case "3", "§" -> {
				player.setRace(new Dwarf());
				return true;
			}
			default -> {
				return false;
			}
		}
	}

	private boolean isCreationFinished(String finished) {
		GameFactory.player.initializeHealth();
		GameFactory.player.initializeMana();
		GameFactory.player.initializeInitiative();

		if (finished.equalsIgnoreCase("yes")) {
			return true;
		} else return finished.equalsIgnoreCase("y");

	}

	private boolean isClassChosen(Player player, String classAccepted) {
		setPLAYERClass(player, classAccepted);
		System.out.println("Are you sure about your choice?");
		String playerClassAccepted = sc.next();
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
		String playerNameAccepted = sc.next();
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
				playerClassFactory.createWarrior(player);
			}
			case "2", "\"" -> {
				System.out.println("You have chosen Ranger! PEW PEW PEW");
				playerClassFactory.createRanger(player);
			}
			case "3", "§" -> {
				System.out.println("You have chosen Mage! PSHIIIIIEAUUU");
				playerClassFactory.createMage(player);
			}
			case "4", "$" -> {
				System.out.println("You have chosen Barb! RAWWWWRRR");
				playerClassFactory.createBarbarian(player);
			}
			case "5", "%" -> {
				System.out.println("You have chosen Priest! Wushhh");
				playerClassFactory.createPriest(player);
			}
			case "6", "&" -> {
				System.out.println("You have chosen Rogue! Kling Kling");
				playerClassFactory.createRogue(player);
			}
			default -> System.out.println("Wrong Input, try again");
		}

	}

}