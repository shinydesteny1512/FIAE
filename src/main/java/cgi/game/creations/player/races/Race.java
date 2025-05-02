package cgi.game.creations.player.races;

import cgi.game.creations.Attributes;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Race {
	private String bodyHeight;
	private Integer age;
	private String bodyAge;
	private Attributes attributes;
	private String name;

	public Race(Attributes attributes) {
		this.attributes = attributes;
	}

}