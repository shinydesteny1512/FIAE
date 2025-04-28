package cgi.game.menues.ingame;

import cgi.game.instance.tiles.rest.ActionRest;
import cgi.game.menues.Window;

public class RestMenu extends Window {

	public RestMenu(String windowName) {
		super(windowName);
	}

	public void createActionRestView(ActionRest actionRest) {
		System.out.println(actionRest.getActionID());
	}

}
