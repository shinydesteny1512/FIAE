package cgi.game.instance.tiles;

public enum ActionTypes {

    FIGHT('f'),
    REST('r'),
    SHOP('s');

    private final char actionTyp;

    ActionTypes(char actionTyp) {
        this.actionTyp = actionTyp;
    }

    @Override
    public String toString() {
        return String.valueOf(actionTyp);
    }
}
