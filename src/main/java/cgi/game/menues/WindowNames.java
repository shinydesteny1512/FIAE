package cgi.game.menues;

public enum WindowNames {

    MAINMENU("Main Menu"),

    GAMEWINDOW("Game Window"),
    CREATEPLAYERMENU("Create Player"),
    PLAYERINFOMENU("Player Information"),
    FIGHTMENU("Fight"),
    SHOPMENU("Shop"),
    RESTMENU("Rest"),
    EVENTMENU("Event");

    private final String menuName;

    WindowNames(String menuName) {
        this.menuName = menuName;
    }

    @Override
    public String toString() {
        return menuName;
    }
}
