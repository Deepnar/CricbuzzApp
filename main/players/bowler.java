package main.players;

public class bowler extends Player {

    public bowler(String name, int jerseyNo, String country, int matchesPlayed, int totalRun, int totalWicket) {
        super(name, jerseyNo, country, matchesPlayed, totalRun, totalWicket);
    }

    @Override
    String getPlayerRole() {
        return "Bowler";
    }

    @Override
    double clacRating() {
        if (matchesPlayed == 0) {
            return 0;
        }
        return (totalWicket * 10) + (totalRun / (double) matchesPlayed) * 0.2;
    }
}
