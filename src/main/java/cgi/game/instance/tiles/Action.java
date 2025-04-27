package cgi.game.instance.tiles;

import lombok.Getter;

import java.util.UUID;

@Getter
public abstract class Action {

    private final UUID actionID;
    private final String actionName;
    private final String actionTyp;

    public Action(UUID actionID, String actionName, String actionTyp) {
        this.actionID = actionID;
        this.actionName = actionName;
        this.actionTyp = actionTyp;

    }

}
