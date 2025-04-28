package cgi.game.menues;

public enum WindowNames {

	MAIN_MENU("Main Menu"),
	GAME_WINDOW("Game Window"),
	CREATE_PLAYER_MENU("Create Player"),
	PLAYER_INFO_MENU("Player Information"),
	FIGHT_MENU("Fight"),
	SHOP_MENU("Shop"),
	REST_MENU("Rest"),
	EVENT_MENU("Event");

	private final String menuName;

	WindowNames(String menuName) {
		this.menuName = menuName;
	}

	@Override
	public String toString() {
		return menuName;
	}
}
