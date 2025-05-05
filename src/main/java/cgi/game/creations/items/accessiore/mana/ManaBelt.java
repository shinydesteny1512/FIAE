package cgi.game.creations.items.accessiore.mana;

import cgi.game.creations.items.accessiore.Belt;
import lombok.Getter;

@Getter
public class ManaBelt extends Belt {

  private final double mana;

  public ManaBelt(double mana) {
    super();
    this.mana = mana;
  }

}
