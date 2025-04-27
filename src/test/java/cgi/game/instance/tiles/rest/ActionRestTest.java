package cgi.game.instance.tiles.rest;

import cgi.game.util.debug.ObjectDebugger;
import org.junit.jupiter.api.Test;

import java.util.UUID;

class ActionRestTest {

    @Test
    void createPositiveActionRestTile() {
        ActionRest actionRest = new ActionRest(new UUID(1L, 1L), "resting");
        ObjectDebugger.debugTile(actionRest);
    }

}