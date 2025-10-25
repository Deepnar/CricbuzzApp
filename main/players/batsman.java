package main.players;

public class batsman extends Player {

    private double batsmanAverage;

    public batsman(String name, int jerseyNo, String country, int matchesPlayed, int totalRun, int totalWicket) {
        super(name, jerseyNo, country, matchesPlayed, totalRun, totalWicket);
    }

    @Override
    String getPlayerRole() {
        return "Batsman";
    }

    @Override
    double clacRating() {
        if (matchesPlayed == 0) {
            return 0;
        }
        return (totalRun / (double) matchesPlayed) * 0.7 + (totalWicket * 0.3);
    }
}
