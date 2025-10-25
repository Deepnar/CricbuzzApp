package main.players;

public class ar extends Player {

    public ar(String name, int jerseyNo, String country, int matchesPlayed, int totalRun, int totalWicket) {
        super(name, jerseyNo, country, matchesPlayed, totalRun, totalWicket);
    }

    @Override
    String getPlayerRole() {
        return "All Rounder";
    }

    @Override
    double clacRating() {
        if (matchesPlayed == 0) {
            return 0;
        }
        return ((totalRun / (double) matchesPlayed) * 0.5) + (totalWicket * 5);
    }
}
