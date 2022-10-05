package cgi.game.instance.tiles.fight;

import cgi.game.instance.tiles.Action;
import cgi.game.instance.tiles.ActionTypes;

public class ActionFight extends Action {

    public ActionFight(int actionID, String actionName) {
        super(actionID, actionName, ActionTypes.FIGHT.toString());
    }
}
