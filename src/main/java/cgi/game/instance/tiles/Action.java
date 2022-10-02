package cgi.game.instance.tiles;

public abstract class Action {

    private int actionID;

    private String actionName;

    private String actionTyp;

    public Action(int actionID, String actionName, String actionTyp) {
        this.actionID = actionID;
        this.actionName = actionName;
        this.actionTyp = actionTyp;
    }

    public int getActionID() {
        return actionID;
    }

    public void setActionID(int actionID) {
        this.actionID = actionID;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public String getActionTyp() {
        return actionTyp;
    }

    public void setActionTyp(String actionTyp) {
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
