package cgi.game.creations.npcs.evil;

import cgi.game.creations.items.ItemFactory;
import cgi.game.creations.items.weapon.Weapon;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Getter
@Setter
public class EvilEnemyFactory {

	private List<Enemy> allEnemies = new ArrayList<>();

	private List<Troll> trolls = new ArrayList<>();

	private List<Goblin> goblins = new ArrayList<>();

	private List<Dragon> dragons = new ArrayList<>();

	private List<DemonLord> demonLords = new ArrayList<>();

	private ItemFactory itemFactory = new ItemFactory();

	public EvilEnemyFactory() {
		createSmallEnemy();
		createMediumEnemy();
		createBigEnemy();
		createBossEnemy();
	}

	public List<Enemy> getRandomEnemyFromList() {
		List<Enemy> enemies = new ArrayList<>();
		for (int i = 0; i <= 2; i++) {
			Random random = new Random();
			int index = random.nextInt(allEnemies.size());
			enemies.add(allEnemies.get(index));
		}
		return enemies;
	}

	public void createSmallEnemy() {
		for (BodyTyp bodyTyp : BodyTyp.values()) {
			if (bodyTyp.name().equals(BodyTyp.BULKY.getBodyTyp())
							|| bodyTyp.name().equals(BodyTyp.BOSS.getBodyTyp())) {
				continue;
			}
			for (EnemyClass enemyClass : EnemyClass.values()) {
				for (Weapon weapon : ItemFactory.getWeaponList()) {
					Goblin goblin = new Goblin(1);
					goblin.setBodyTyp(bodyTyp);
					goblin.setEnemyClass(enemyClass);
					goblin.getInventory().setWeapon(weapon);
					goblin.setName(bodyTyp.name() + " Goblin " + enemyClass.name());
					goblin.initializeHealth();
					goblin.initializeMana();
					goblin.initializeInitiative();
					allEnemies.add(goblin);
				}
			}
		}

	}

	public void createMediumEnemy() {
		for (BodyTyp bodyTyp : BodyTyp.values()) {
			if (bodyTyp.name().equals(BodyTyp.QUICK.getBodyTyp())
							|| bodyTyp.name().equals(BodyTyp.BOSS.getBodyTyp())) {
				continue;
			}
			for (EnemyClass enemyClass : EnemyClass.values()) {
				for (Weapon weapon : ItemFactory.getWeaponList()) {
					Troll troll = new Troll(1);
					troll.setBodyTyp(bodyTyp);
					troll.setEnemyClass(enemyClass);
					troll.getInventory().setWeapon(weapon);
					troll.setName(bodyTyp.name() + " Troll " + enemyClass.name());
					troll.initializeHealth();
					troll.initializeMana();
					troll.initializeInitiative();
					allEnemies.add(troll);
				}
			}
		}
	}

	public void createBigEnemy() {
		for (BodyTyp bodyTyp : BodyTyp.values()) {
			if (bodyTyp.name().equals(BodyTyp.QUICK.getBodyTyp())
							|| bodyTyp.name().equals(BodyTyp.NORMAL.getBodyTyp())
							|| bodyTyp.name().equals(BodyTyp.BOSS.getBodyTyp())) {
				continue;
			}
			for (EnemyClass enemyClass : EnemyClass.values()) {
				for (Weapon weapon : ItemFactory.getWeaponList()) {
					Dragon dragon = new Dragon(1);
					dragon.setBodyTyp(bodyTyp);
					dragon.setEnemyClass(enemyClass);
					dragon.getInventory().setWeapon(weapon);
					dragon.setName(bodyTyp.name() + " Dragon " + enemyClass.name());
					dragon.initializeHealth();
					dragon.initializeMana();
					dragon.initializeInitiative();
					allEnemies.add(dragon);
				}
			}
		}
	}

	public void createBossEnemy() {
		for (BodyTyp bodyTyp : BodyTyp.values()) {
			if (bodyTyp.name().equals(BodyTyp.QUICK.getBodyTyp())
							|| bodyTyp.name().equals(BodyTyp.NORMAL.getBodyTyp())
							|| bodyTyp.name().equals(BodyTyp.BULKY.getBodyTyp())) {
				continue;
			}
			for (EnemyClass enemyClass : EnemyClass.values()) {
				if (enemyClass.name().equals(EnemyClass.TANK.name())) {
					for (Weapon weapon : ItemFactory.getWeaponList()) {
						DemonLord demonLord = new DemonLord(1);
						demonLord.setBodyTyp(bodyTyp);
						demonLord.setEnemyClass(enemyClass);
						demonLord.getInventory().setWeapon(weapon);
						demonLord.setName(bodyTyp.name() + " Demon Lord " + enemyClass.name());
						demonLord.initializeHealth();
						demonLord.initializeMana();
						demonLord.initializeInitiative();
						allEnemies.add(demonLord);
					}
				}
			}
		}
	}
}
