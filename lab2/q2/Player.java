public class Player {

    protected String name;
    protected int jerseyNumber;
    protected int minutesPlayed;

    public Player(String name, int jerseyNumber) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.minutesPlayed = 0;
    }

    public void print() {
        System.out.println(name + ": " + jerseyNumber);
    }

    // Subclasses override this to add the correct number of minutes
    // for a single game in their sport.
    public void playGame() {
    }

    public int getMinutesPlayed() {
        return minutesPlayed;
    }
}
