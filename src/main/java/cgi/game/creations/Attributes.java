package cgi.game.creations;

import lombok.Getter;

@Getter
public enum Attributes {

	STRENGTH("STRENGTH", 10.0),
	DEXTERITY("DEXTERITY", 10.0),
	INTELLIGENCE("INTELLIGENCE", 10.0);

	private final String attribute;

	private final double Initiative;

	Attributes(String attribute, double initiative) {
		this.attribute = attribute;
		this.Initiative = initiative;

	}

	@Override
	public String toString() {
		return attribute;
	}

}
