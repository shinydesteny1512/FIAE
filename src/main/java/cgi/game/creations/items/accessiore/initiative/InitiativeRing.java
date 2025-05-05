package cgi.game.creations.items.accessiore.initiative;

import cgi.game.creations.items.accessiore.Ring;
import lombok.Getter;

@Getter
public class InitiativeRing extends Ring {

  private final double initiative;

  public InitiativeRing(double initiative) {
    super();
    this.initiative = initiative;
  }

}
