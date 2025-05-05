package cgi.game.creations.items.accessiore.health;

import cgi.game.creations.items.accessiore.Amulet;
import lombok.Getter;

@Getter
public class HealthAmulet extends Amulet {

  private final double health;

  public HealthAmulet(double health) {
    super();
    this.health = health;
  }

}
