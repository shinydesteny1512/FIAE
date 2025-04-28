package cgi.game.instance.tiles.fight;

import cgi.game.util.debug.ObjectDebugger;
import org.junit.jupiter.api.Test;

import java.util.UUID;

class ActionFightTest {
	@Test
	void createPositiveActionFightTile() {
		ActionFight actionFight = new ActionFight(UUID.randomUUID(), "Desert");
		ObjectDebugger.debugTile(actionFight);

	}
}