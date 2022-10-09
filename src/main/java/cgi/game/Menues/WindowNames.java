package cgi.game.Menues;

public enum WindowNames {

    MAINMENU("Main Menu"),
    CREATEPLAYERMENU("Create Player"),
    PLAYERINFOMENU("Player Information"),
    FIGHTMENU("Fight"),
    SHOPMENU("Shop"),
    RESTMENU("Rest"),
    EVENTMENU("Event");

    private String menuName;

    WindowNames(String menuName) {
        this.menuName = menuName;
    }

    @Override
    public String toString() {
        return menuName;
    }
}
