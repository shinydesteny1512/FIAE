package cgi.game.instance.level;

public class GameInstance {

    private int gameStage;
    private String stageTyp;

    public GameInstance(String stageTyp) {
        this.gameStage = 0;
        this.stageTyp = stageTyp;
    }

    public void setGameStageToStandard() {
        this.gameStage = 0;
    }

    public int getGameStage() {
        return gameStage;
    }

    public void setGameStage(int gameStage) {
        this.gameStage = gameStage;
    }

    public String getStageTyp() {
        return stageTyp;
    }

    public void setStageTyp(String stageTyp) {
        this.stageTyp = stageTyp;
    }
}
