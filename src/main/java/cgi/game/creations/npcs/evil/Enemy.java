package cgi.game.creations.npcs.evil;

import cgi.game.creations.Creature;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Enemy extends Creature {
	private final int GameStage;
	private BodyTyp bodyTyp;
	private EnemyClass enemyClass;

	public Enemy(final int GameStage) {
		this.GameStage = GameStage;

	}

	@Override
	public void initializeHealth() {
		this.setHealth(this.getBodyTyp() != null ?
						(GameStage * this.getBodyTyp().getBaseHP()) * this.getEnemyClass().getHpMultiplier()
						: 75.0);

	}

	@Override
	public void initializeMana() {
		this.setMana(this.getBodyTyp() != null ?
						(GameStage * this.getBodyTyp().getBaseMana()) * this.getEnemyClass().getManaMultiplier()
						: 25.0);

	}

	@Override
	public void initializeInitiative() {
		this.setInitiative(this.getBodyTyp() != null ?
						this.getBodyTyp().getInitiative() * this.getEnemyClass().getInitiativeMultiplier()
						: 15);
	}
}
