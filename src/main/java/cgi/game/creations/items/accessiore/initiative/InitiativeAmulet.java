package cgi.game.creations.items.accessiore.initiative;

import cgi.game.creations.items.accessiore.Amulet;
import lombok.Getter;

@Getter
public class InitiativeAmulet extends Amulet {

  private final double initiative;

  public InitiativeAmulet(double initiative) {
    super();
    this.initiative = initiative;
  }

}
