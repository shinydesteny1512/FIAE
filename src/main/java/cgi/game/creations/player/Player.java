package cgi.game.creations.player;

import cgi.game.creations.Creature;
import cgi.game.creations.player.classes.DexPlayerClass;
import cgi.game.creations.player.classes.PlayerClass;

import java.util.Arrays;

public class Player extends Creature {
    private PlayerClass myPlayerClass;
    private final double dexInitiativeMultiplier = 1.1;
    private final double nonDexInitiativeMultiplier = 1.0;

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
                case STRENGTH ->
                        this.setHealth(getMyClass() != null ? strBaseHealth + (getMyClass().getStr() * strHealthMultiplier) : 0);
                case DEXTERITY ->
                        this.setHealth(getMyClass() != null ? dexBaseHealth + (getMyClass().getStr() * dexHealthMultiplier) : 0);
                case INTELLIGENCE ->
                        this.setHealth(getMyClass() != null ? intBaseHealth + (getMyClass().getStr() * intHealthMultiplier) : 0);
                default -> throw new Exception();
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
                case STRENGTH -> this.setMana(getMyClass() != null ? strBaseMana +
                        (this.getMyClass().getInt() * strManaMultiplier) : 0);
                case DEXTERITY -> this.setMana(getMyClass() != null ? dexBaseMana +
                        (this.getMyClass().getInt() * dexManaMultiplier) : 0);
                case INTELLIGENCE -> this.setMana(getMyClass() != null ? intBaseMana +
                        (this.getMyClass().getInt() * intManaMultiplier) : 0);
                default -> throw new Exception();
            }
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    @Override
    public void initializeInitiative() {
        if (this.getMyClass() != null) {
            if (this.getMyClass() instanceof DexPlayerClass) {
                this.setInitiative(((this.getMyClass().getDex() * 2.5) +
                        (this.getMyClass().getDex() * dexInitiativeMultiplier)));
            } else {
                this.setInitiative(((this.getMyClass().getDex() * 2.5) +
                        (this.getMyClass().getDex() * nonDexInitiativeMultiplier)));
            }
        }

    }

    public double getInitiativeBonus() {

        if (this.getInitiative() != null) {
            return Math.round(this.getInitiative() - (this.getInitiative() / dexInitiativeMultiplier));
        } else {
            return 0;
        }
    }

    public PlayerClass getMyClass() {
        return myPlayerClass;
    }

    public void setMyClass(PlayerClass myPlayerClass) {
        this.myPlayerClass = myPlayerClass;
    }
}
