package cgi.game.instance.tiles;

import lombok.Getter;

@Getter
public abstract class Action {

    private final int actionID;
    private final String actionName;
    private final String actionTyp;

    public Action(int actionID, String actionName, String actionTyp) {
        this.actionID = actionID;
        this.actionName = actionName;
        this.actionTyp = actionTyp;

    }

    public void debugTile() {
        System.out.println("################################");
        System.out.println("ActionID: " + getActionID());
        System.out.println("ActionName: " + getActionName());
        System.out.println("ActionTyp: " + getActionTyp());
        System.out.println("################################");

    }
}
