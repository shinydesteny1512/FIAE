package cgi.game.creations.npcs.evil;

import lombok.Getter;

@Getter
public enum EnemyClass {

	TANK("TANK", 2.0, 0.5, 0.5),
	FIGHTER("FIGHTER", 1.5, 1.0, 0.8),
	RANGE("RANGE", 0.8, 0.8, 1.25),
	CASTER("CASTER", 0.6, 2.5, 1.1);

	private final String enemyClass;

	private final double hpMultiplier;

	private final double manaMultiplier;

	private final double initiativeMultiplier;

	EnemyClass(String enemyClass, double hpMultiplier, double manaMultiplier, double initiativeMultiplier) {
		this.enemyClass = enemyClass;
		this.hpMultiplier = hpMultiplier;
		this.manaMultiplier = manaMultiplier;
		this.initiativeMultiplier = initiativeMultiplier;
	}

	@Override
	public String toString() {
		return enemyClass;
	}
}
