package cgi.game.creations.items.accessiore.health;

import cgi.game.creations.items.accessiore.Ring;
import lombok.Getter;

@Getter
public class HealthRing extends Ring {

  private final double health;

  public HealthRing(double health) {
    super();
    this.health = health;
  }

}
