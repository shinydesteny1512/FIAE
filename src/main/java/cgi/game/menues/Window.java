package cgi.game.menues;

public abstract class Window {

    private final String windowName;

    public Window(final String windowName) {
        this.windowName = windowName;
    }

    public String getWindowName() {
        return windowName;
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
