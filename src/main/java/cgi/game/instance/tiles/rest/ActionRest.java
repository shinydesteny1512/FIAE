package cgi.game.instance.tiles.rest;

import cgi.game.instance.tiles.Action;
import cgi.game.instance.tiles.ActionTypes;

public class ActionRest extends Action {
    public ActionRest(int actionID, String actionName) {
        super(actionID, actionName, ActionTypes.REST.toString());
    }

}
