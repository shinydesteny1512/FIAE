package cgi.game.creations.items.accessiore.initiative;

import cgi.game.creations.items.accessiore.Belt;
import lombok.Getter;

@Getter
public class InitiativeBelt extends Belt {

  private final double initiative;

  public InitiativeBelt(double initiative) {
    super();
    this.initiative = initiative;
  }

}
