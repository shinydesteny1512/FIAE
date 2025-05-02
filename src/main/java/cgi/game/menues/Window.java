package cgi.game.menues;

import lombok.Data;

@Data
public abstract class Window {

	private final String windowName;

	public Window(final String windowName) {
		this.windowName = windowName;
	}

	protected void setTerminalName() {
		try {
			String os = System.getProperty("os.name").toLowerCase();
			if (os.contains("win")) {
				// Windows
				Runtime.getRuntime().exec(new String[]{"cmd", "/c", "title " + this.windowName});
			} else {
				// Linux/macOS
				System.out.print("\033]0;" + this.windowName + "\007");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	protected void cleanScreen() {
		try {
			if (System.getProperty("os.name").contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				Runtime.getRuntime().exec("clear");
			}
		} catch (final Exception e) {
			System.out.println(e.getMessage());
		}
	}

	protected void closeScreen() {
		try {
			System.exit(0);
		} catch (final Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
