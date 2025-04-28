package cgi.game.creations.npcs.evil;

import lombok.Getter;

@Getter
public enum BodyTyp {

	BOSS("BOSS", 450.0, 200.0, 50),
	BULKY("BULKY", 150.0, 50.0, 10),
	NORMAL("NORMAL", 100.0, 75.0, 15),
	QUICK("QUICK", 75.0, 125.0, 25);

	private final double baseHP;

	private final double baseMana;

	private final String bodyTyp;

	private final int initiative;

	BodyTyp(String bodyTyp, double baseHP, double baseMana, int initiative) {
		this.bodyTyp = bodyTyp;
		this.baseHP = baseHP;
		this.baseMana = baseMana;
		this.initiative = initiative;
	}

	@Override
	public String toString() {
		return bodyTyp;
	}

}
