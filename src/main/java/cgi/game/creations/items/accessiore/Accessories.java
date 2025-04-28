package cgi.game.creations.items.accessiore;

import cgi.game.creations.Attributes;
import cgi.game.creations.items.Item;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Setter
@Getter
public abstract class Accessories extends Item {

	private Attributes attributes;

	public Accessories() {
		initializeAccessories();
	}

	private void initializeAccessories() {
		Random r = new Random();
		switch (r.nextInt(3) + 1) {
			case 1 -> this.setAttributes(Attributes.STRENGTH);
			case 2 -> this.setAttributes(Attributes.DEXTERITY);
			case 3 -> this.setAttributes(Attributes.INTELLIGENCE);
		}
	}

}
