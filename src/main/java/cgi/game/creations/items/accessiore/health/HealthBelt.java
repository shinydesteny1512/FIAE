package cgi.game.creations.items.accessiore.health;

import cgi.game.creations.items.accessiore.Belt;
import lombok.Getter;

@Getter
public class HealthBelt extends Belt {

  private final double health;

    public HealthBelt(double health) {
        super();
        this.health = health;
    }

}
