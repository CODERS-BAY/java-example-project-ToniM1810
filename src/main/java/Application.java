public class Application {
    private final int x;
    private final int y;

    public Application(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int add() {
        return x + y;
    }

    public int mod() {
        return x % y;
    }
}
