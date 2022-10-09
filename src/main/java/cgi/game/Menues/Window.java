package cgi.game.Menues;

public abstract class Window {

    private final WindowNames name;

    public Window(final WindowNames name) {
        this.name = name;
    }

    public WindowNames getName() {
        return name;
    }

    void cleanScreen() {
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

    void closeScreen() {
        try {
            System.exit(0);
        } catch (final Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
