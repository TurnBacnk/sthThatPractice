package HeroChoseMethod;

public class Player {
    String name;
    String line;

    public Player(String name, String line) {
        this.name = name;
        this.line = line;
    }

    public void choose(Location can) {
        can.can();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }
}