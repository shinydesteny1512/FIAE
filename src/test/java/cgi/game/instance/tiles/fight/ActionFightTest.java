package cgi.game.instance.tiles.fight;

import org.junit.jupiter.api.Test;

class ActionFightTest {
    @Test
    void createPositiveActionFightTile() {
        ActionFight actionFight = new ActionFight(0, "Desert");
        actionFight.debugTile();

    }
}