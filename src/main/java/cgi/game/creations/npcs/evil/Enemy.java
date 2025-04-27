package cgi.game.creations.npcs.evil;

import cgi.game.creations.Creature;
import cgi.game.instance.level.GameInstance;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Enemy extends Creature {
    private final GameInstance instance;
    private BodyTyp bodyTyp;

    public Enemy(final GameInstance instance) {
        this.instance = instance;

    }

    @Override
    public void initializeHealth() {
        this.setHealth(this.getBodyTyp() != null ? GameInstance.gameStage * this.getBodyTyp().getBaseHP() : 75.0);

    }

    @Override
    public void initializeMana() {
        this.setMana(this.getBodyTyp() != null ? GameInstance.gameStage * this.getBodyTyp().getBaseMana() : 25.0);

    }

    @Override
    public void initializeInitiative() {
        super.initializeInitiative();
    }
}
