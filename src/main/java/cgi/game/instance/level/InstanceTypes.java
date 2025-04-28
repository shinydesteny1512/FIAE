package cgi.game.instance.level;

public enum InstanceTypes {

	DESERT("DESERT"),
	FLATLAND("FLATLAND"),
	TUNDRA("TUNDRA"),
	FOREST("FOREST"),
	CAVE("CAVE");

	private final String instanceTyp;

	InstanceTypes(String instanceTyp) {
		this.instanceTyp = instanceTyp;
	}

	@Override
	public String toString() {
		return instanceTyp;
	}
}
