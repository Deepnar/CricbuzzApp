package main.matches;

import main.teams;

public abstract class Matches {

    teams team1;
    teams team2;
    String venue;
    int overs;
    int score1 = 0;
    int score2 = 0;
    int wickets1 = 0;
    int wickets2 = 0;
    private boolean matchStarted = false;

    public Matches(teams team1, teams team2, String venue, int overs) {
        this.team1 = team1;
        this.team2 = team2;
        this.venue = venue;
        this.overs = overs;
    }

    public void startMatch() {
        matchStarted = true;
        System.out.println("Match started at " + venue);
        System.out.println(team1.teamName + " vs " + team2.teamName);
        System.out.println("Overs: " + overs);
    }

    public void addScore1(int runs) {
        if (matchStarted) {
            score1 = runs;
        } else {
            System.out.println("Cannot add score. Match has not started yet!");
        }
    }

    public void addScore2(int runs) {
        if (matchStarted) {
            score2 = runs;
        } else {
            System.out.println("Cannot add score. Match has not started yet!");
        }
    }

    public void addWicket1(int wkts) {
        if (matchStarted) {
            wickets1 = wkts;
        } else {
            System.out.println("Cannot add wickets. Match has not started yet!");
        }
    }

    public void addWicket2(int wkts) {
        if (matchStarted) {
            wickets2 = wkts;
        } else {
            System.out.println("Cannot add wickets. Match has not started yet!");
        }
    }

    public void checkMatchStarted() {
        if (!matchStarted) {
            throw new IllegalStateException("Match has not started yet!");
        }
    }

    public abstract void calcResult();
}
