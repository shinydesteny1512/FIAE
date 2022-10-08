package cgi.game.creations.npcs.evil;

public enum EnemyClass {

    BRUISER("BRUISER"),
    FIGHTER("FIGHTER"),
    RANGE("RANGE"),
    CASTER("CASTER");

    private final String enemyClass;

    EnemyClass(String enemyClass) {
        this.enemyClass = enemyClass;
    }

    @Override
    public String toString() {
        return enemyClass;
    }
}
