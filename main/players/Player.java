package main.players;

public abstract class Player {

    String name;
    int jerseyNo;
    String country;
    int matchesPlayed;
    int totalRun;
    int totalWicket;

    Player(String name, int jerseyNo, String country, int matchesPlayed, int totalRun, int totalWicket) {
        this.name = name;
        this.jerseyNo = jerseyNo;
        this.country = country;
        this.matchesPlayed = matchesPlayed;
        this.totalRun = totalRun;
        this.totalWicket = totalWicket;
    }

    abstract String getPlayerRole();

    abstract double clacRating();

    void displayStats() {
        System.out.println("Name: " + name);
        System.out.println("Jersey No: " + jerseyNo);
        System.out.println("Country: " + country);
        System.out.println("Matches Played: " + matchesPlayed);
        System.out.println("Total Runs: " + totalRun);
        System.out.println("Total Wickets: " + totalWicket);
        System.out.println("Player Rating: " + clacRating());

    }

    @Override
    public String toString() {
        return name + " (" + getPlayerRole() + ") - Runs: " + totalRun + ", Wickets: " + totalWicket
                + ", Matches: " + matchesPlayed + ", Rating: " + String.format("%.2f", clacRating());
    }

}
