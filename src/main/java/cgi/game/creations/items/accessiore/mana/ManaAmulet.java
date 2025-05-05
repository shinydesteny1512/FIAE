package cgi.game.creations.items.accessiore.mana;

import cgi.game.creations.items.accessiore.Amulet;
import lombok.Getter;

@Getter
public class ManaAmulet extends Amulet {

  private final double mana;

  public ManaAmulet(double mana) {
    super();
    this.mana = mana;
  }
}
