package cgi.game.instance.tiles.rest;

import cgi.game.instance.tiles.Action;
import cgi.game.instance.tiles.ActionTypes;

import java.util.UUID;

public class ActionRest extends Action {
	public ActionRest(UUID actionID, String actionName) {
		super(actionID, actionName, ActionTypes.REST.toString());
	}

}
