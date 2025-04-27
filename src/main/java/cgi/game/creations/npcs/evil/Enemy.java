package cgi.game.creations.npcs.evil;

import cgi.game.creations.Creature;
import cgi.game.instance.level.Game;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Enemy extends Creature {
    private final int GameStage;
    private BodyTyp bodyTyp;

    public Enemy(final int GameStage) {
        this.GameStage = GameStage;

    }

    @Override
    public void initializeHealth() {
        this.setHealth(this.getBodyTyp() != null ? Game.gameStage * this.getBodyTyp().getBaseHP() : 75.0);

    }

    @Override
    public void initializeMana() {
        this.setMana(this.getBodyTyp() != null ? Game.gameStage * this.getBodyTyp().getBaseMana() : 25.0);

    }

    @Override
    public void initializeInitiative() {
        super.initializeInitiative();
    }
}
