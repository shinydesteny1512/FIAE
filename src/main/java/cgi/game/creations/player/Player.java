package cgi.game.creations.player;

import cgi.game.creations.classes.PlayerClass;

public class Player {
    private String playerName;
    private Double health;
    private Double mana;
    private PlayerClass myPlayerClass;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }

    public void initializeHealth() throws Exception {
        switch (this.myPlayerClass.getAttributeTyp()) {
            case "STRENGTH" -> this.setHealth((double) (getMyClass() != null ? 50 + (getMyClass().getStr() * 35) : 0));
            case "DEXTERITY" -> this.setHealth((double) (getMyClass() != null ? 50 + (getMyClass().getStr() * 25) : 0));
            case "INTELLIGENCE" ->
                    this.setHealth((double) (getMyClass() != null ? 50 + (getMyClass().getStr() * 15) : 0));
            default -> throw new Exception();
        }
    }

    public Double getMana() {
        return mana;
    }

    public void setMana(Double mana) {
        this.mana = mana;
    }

    public void initializeMana() throws Exception {
        switch (this.myPlayerClass.getAttributeTyp()) {
            case "STRENGTH" -> this.setMana((double) (getMyClass() != null ? 65 + (getMyClass().getInt() * 15) : 0));
            case "DEXTERITY" -> this.setMana((double) (getMyClass() != null ? 65 + (getMyClass().getInt() * 35) : 0));
            case "INTELLIGENCE" ->
                    this.setMana((double) (getMyClass() != null ? 65 + (getMyClass().getInt() * 50) : 0));
            default -> throw new Exception();
        }
    }

    public PlayerClass getMyClass() {
        return myPlayerClass;
    }

    public void setMyClass(PlayerClass myPlayerClass) {
        this.myPlayerClass = myPlayerClass;
    }
}
