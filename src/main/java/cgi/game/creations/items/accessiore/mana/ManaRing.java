package cgi.game.creations.items.accessiore.mana;

import cgi.game.creations.items.accessiore.Ring;
import lombok.Getter;

@Getter
public class ManaRing extends Ring {

  private final double mana;

  public ManaRing(double mana) {
    super();
    this.mana = mana;
  }

}
