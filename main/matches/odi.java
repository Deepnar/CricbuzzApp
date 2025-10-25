package main.matches;

import main.teams;

public class odi extends Matches {

    public odi(teams team1, teams team2, String venue, int overs) {
        super(team1, team2, venue, overs);
    }

    @Override
    public void calcResult() {
        System.out.println("\nMatch Result:");
        System.out.println(team1.teamName + " " + score1 + "/" + wickets1);
        System.out.println(team2.teamName + " " + score2 + "/" + wickets2);

        if (score1 > score2) {
            team1.wins++;
            System.out.println("Winner: " + team1.teamName);
        } else if (score2 > score1) {
            team2.wins++;
            System.out.println("Winner: " + team2.teamName);
        } else {
            System.out.println("Match Drawn!");
        }
    }
}
