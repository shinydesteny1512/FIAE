package cgi.game.creations.player.races;

public abstract class Races {
    public String bodyHeight;
    public int age;
    public String bodyAge;

    public Races(int age) {
        this.age = age;
    }

    public String getBodyHeight() {
        return bodyHeight;
    }

    public void setBodyHeight(String bodyHeight) {
        this.bodyHeight = bodyHeight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBodyAge() {
        return bodyAge;
    }

    public void setBodyAge(String bodyAge) {
        this.bodyAge = bodyAge;
    }
}
