package cgi.game.instance.tiles.rest;

import org.junit.jupiter.api.Test;

class ActionRestTest {

    @Test
    void createPositiveActionRestTile() {
        ActionRest actionRest = new ActionRest(1, "resting");
        actionRest.debugTile();
    }

}