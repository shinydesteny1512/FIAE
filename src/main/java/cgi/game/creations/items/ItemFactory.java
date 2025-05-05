package cgi.game.creations.items;

import cgi.game.creations.items.accessiore.Accessories;
import cgi.game.creations.items.accessiore.Amulet;
import cgi.game.creations.items.accessiore.Belt;
import cgi.game.creations.items.accessiore.Ring;
import cgi.game.creations.items.accessiore.health.HealthAmulet;
import cgi.game.creations.items.accessiore.health.HealthBelt;
import cgi.game.creations.items.accessiore.health.HealthRing;
import cgi.game.creations.items.accessiore.initiative.InitiativeAmulet;
import cgi.game.creations.items.accessiore.initiative.InitiativeBelt;
import cgi.game.creations.items.accessiore.initiative.InitiativeRing;
import cgi.game.creations.items.accessiore.mana.ManaAmulet;
import cgi.game.creations.items.accessiore.mana.ManaBelt;
import cgi.game.creations.items.accessiore.mana.ManaRing;
import cgi.game.creations.items.armour.Armour;
import cgi.game.creations.items.armour.Chest;
import cgi.game.creations.items.armour.Helm;
import cgi.game.creations.items.weapon.Weapon;
import cgi.game.creations.items.weapon.caster.Scepter;
import cgi.game.creations.items.weapon.caster.Wand;
import cgi.game.creations.items.weapon.meele.Axe;
import cgi.game.creations.items.weapon.meele.Sword;
import cgi.game.creations.items.weapon.range.Bow;
import cgi.game.creations.items.weapon.range.Gun;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import lombok.Getter;

@Getter
public class ItemFactory {
	private static final List<Armour> armourListOfStage = new ArrayList<>();
	private static final List<Weapon> weaponsOfStage = new ArrayList<>();
	private static final List<Accessories> accessoriesListOfStage = new ArrayList<>();

	public ItemFactory() {
		createWeaponStagePack();
		createArmourStagePack();
		createAccessoriesStagePack();

	}

	public static List<Weapon> getWeaponList() {
		return weaponsOfStage;
	}

	public static List<Accessories> getAccessoriesList() {
		return accessoriesListOfStage;
	}

	public static List<Armour> getArmourList() {
		return armourListOfStage;
	}

	public void createArmourStagePack() {
		for (int i = 1; i <= 6; i++) {
			armourListOfStage.add(new Helm());
			armourListOfStage.add(new Chest());
		}

	}

	public void createWeaponStagePack() {
		for (int i = 1; i <= 2; i++) {
			weaponsOfStage.add(new Sword());
			weaponsOfStage.add(new Axe());
			weaponsOfStage.add(new Bow());
			weaponsOfStage.add(new Gun());
			weaponsOfStage.add(new Scepter());
			weaponsOfStage.add(new Wand());
		}

	}

	public void createAccessoriesStagePack() {
		for (int i = 1; i <= 2; i++) {
			accessoriesListOfStage.add(new HealthBelt(beltHpValues()));
			accessoriesListOfStage.add(new ManaBelt(beltManaValues()));
			accessoriesListOfStage.add(new InitiativeBelt(beltInitValues()));
			accessoriesListOfStage.add(new HealthAmulet(amuletHpValues()));
			accessoriesListOfStage.add(new ManaAmulet(amuletManaValues()));
			accessoriesListOfStage.add(new InitiativeAmulet(amuletInitValues()));
			accessoriesListOfStage.add(new HealthRing(ringHpValues()));
			accessoriesListOfStage.add(new ManaRing(ringManaValues()));
			accessoriesListOfStage.add(new InitiativeRing(ringInitValues()));
		}

	}

	public static Amulet getRandomAmulet() {
		Random random = new Random();
		int index = random.nextInt(accessoriesListOfStage.size());
		Accessories accessories = accessoriesListOfStage.get(index);
		if (accessories instanceof Amulet amulet) {
			return amulet;
		} else {
			return getRandomAmulet();
		}
	}

	public static Belt getRandomBelt() {
		Random random = new Random();
		int index = random.nextInt(accessoriesListOfStage.size());
		Accessories accessories = accessoriesListOfStage.get(index);
		if (accessories instanceof Belt belt) {
			return belt;
		} else {
			return getRandomBelt();
		}
	}

	public static Ring getRandomRing() {
		Random random = new Random();
		int index = random.nextInt(accessoriesListOfStage.size());
		Accessories accessories = accessoriesListOfStage.get(index);
		if (accessories instanceof Ring ring) {
			return ring;
		} else {
			return getRandomRing();
		}
	}

	private double amuletHpValues() {
		Random random = new Random();
		return random.nextInt(80) + 20;
	}

	private double ringHpValues() {
		Random random = new Random();
		return random.nextInt(25) + 10;
	}

	private double beltHpValues() {
		Random random = new Random();
		return random.nextInt(60) + 15;
	}

	private double amuletManaValues() {
		Random random = new Random();
		return random.nextInt(50) + 20;
	}

	private double ringManaValues() {
		Random random = new Random();
		return random.nextInt(30) + 20;
	}

	private double beltManaValues() {
		Random random = new Random();
		return random.nextInt(70) + 35;
	}

	private double amuletInitValues() {
		Random random = new Random();
		return random.nextInt(20) + 5;
	}

	private double ringInitValues() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}

	private double beltInitValues() {
		Random random = new Random();
		return random.nextInt(30) + 10;
	}

}
