package cgi.game.creations.player;

import cgi.game.creations.Creature;
import cgi.game.creations.items.accessiore.health.HealthAmulet;
import cgi.game.creations.items.accessiore.health.HealthBelt;
import cgi.game.creations.items.accessiore.health.HealthRing;
import cgi.game.creations.player.classes.DexPlayerClass;
import cgi.game.creations.player.classes.PlayerClass;
import cgi.game.creations.player.races.Race;
import java.util.Arrays;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player extends Creature {
	private final double dexInitiativeMultiplier = 1.1;
	private PlayerClass myPlayerClass;
	private Race race;

	@Override
	public void initializeHealth() {
		final double strBaseHealth = 80.0;
		final double strHealthMultiplier = 30.0;
		final double dexBaseHealth = 60.0;
		final double dexHealthMultiplier = 20.0;
		final double intBaseHealth = 50.0;
		final double intHealthMultiplier = 15.0;

		try {
			switch (this.myPlayerClass.getAttributeTyp()) {
				case STRENGTH -> this.setHealth(this.getMyPlayerClass() != null ?
						calculateHpValue(strBaseHealth, myPlayerClass.getStr(), strHealthMultiplier) : strBaseHealth);
				case DEXTERITY -> this.setHealth(this.getMyPlayerClass() != null ?
						calculateHpValue(dexBaseHealth, myPlayerClass.getDex(), dexHealthMultiplier) : dexBaseHealth);
				case INTELLIGENCE -> this.setHealth(this.getMyPlayerClass() != null ?
						calculateHpValue(intBaseHealth, myPlayerClass.getInt(), intHealthMultiplier) : intBaseHealth);
				default -> this.setHealth(strBaseHealth + dexBaseHealth + intBaseHealth);
			}
		} catch (Exception e) {
			System.out.println(Arrays.toString(e.getStackTrace()));
		}

	}

	@Override
	public void initializeMana() {
		final double strBaseMana = 30.0;
		final double strManaMultiplier = 15.0;
		final double dexBaseMana = 45.0;
		final double dexManaMultiplier = 20.0;
		final double intBaseMana = 60.0;
		final double intManaMultiplier = 30.0;

		try {
			switch (this.myPlayerClass.getAttributeTyp()) {
				case STRENGTH ->
								this.setMana(this.getMyPlayerClass() != null ? strBaseMana + (this.getMyPlayerClass().getInt() * strManaMultiplier) : 0);
				case DEXTERITY ->
								this.setMana(this.getMyPlayerClass() != null ? dexBaseMana + (this.getMyPlayerClass().getInt() * dexManaMultiplier) : 0);
				case INTELLIGENCE ->
								this.setMana(this.getMyPlayerClass() != null ? intBaseMana + (this.getMyPlayerClass().getInt() * intManaMultiplier) : 0);
				default -> throw new Exception();
			}
		} catch (Exception e) {
			System.out.println(Arrays.toString(e.getStackTrace()));
		}

	}

	@Override
	public void initializeInitiative() {
		if (this.getMyPlayerClass() != null) {
			if (this.getMyPlayerClass() instanceof DexPlayerClass) {
				this.setInitiative(((this.getMyPlayerClass().getDex() * 2.5) + (this.getMyPlayerClass().getDex() * dexInitiativeMultiplier)));
			} else {
				double nonDexInitiativeMultiplier = 1.0;
				this.setInitiative(((this.getMyPlayerClass().getDex() * 2.5) + (this.getMyPlayerClass().getDex() * nonDexInitiativeMultiplier)));
			}

		}

	}

	private double calculateHpValue(double baseValue, Integer attributeValue, double multiplier) {
		double hpValue = (baseValue + (attributeValue * multiplier));

		if (getInventory().getAmulet() != null && getInventory().isAmuletEquipped()) {
			if (getInventory().getAmulet() instanceof HealthAmulet healthAmulet) {
				hpValue += healthAmulet.getHealth();
			}
		}
		if (getInventory().getRing() != null && getInventory().isRingEquipped()) {
			if (getInventory().getRing() instanceof HealthRing healthRing) {
				hpValue += healthRing.getHealth();
			}
		}

		if (getInventory().getBelt() != null && getInventory().isBeltEquipped()) {
			if (getInventory().getBelt() instanceof HealthBelt healthBelt) {
				hpValue += healthBelt.getHealth();
			}
		}

		return hpValue;
	}

	public double getInitiativeBonus() {

		if (this.getInitiative() != 0) {
			return Math.round(this.getInitiative() - (this.getInitiative() / dexInitiativeMultiplier));
		} else {
			return 0;
		}
	}

}
