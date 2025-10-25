package main;

import main.matches.Matches;
import main.matches.t20;
import main.matches.odi;
import main.matches.oneDay;
import main.players.*;

public class Cricbuzz {

    Matches currentMatch;
    teams team1;
    teams team2;

    public void createTeams() {
        team1 = new teams("Mumbai Indians", "Rohit Sharma", "Hardik Pandya");
        team2 = new teams("Chennai Super Kings", "MS Dhoni", "Ravindra Jadeja");

        team1.addPlayer(new batsman("Ishan Kishan", 9, "India", 4, 80, 7));
        team1.addPlayer(new bowler("Jasprit Bumrah", 8, "India", 5, 70, 6));
        team1.addPlayer(new ar("Kieron Pollard", 10, "India", 3, 56, 5));

        team2.addPlayer(new batsman("Ruturaj Gaikwad", 5, "India", 3, 65, 1));
        team2.addPlayer(new bowler("Deepak Chahar", 1, "India", 1, 45, 2));
        team2.addPlayer(new ar("Moeen Ali", 3, "India", 1, 34, 1));

        System.out.println("Teams created successfully!");
    }

    public void createMatch(String type, String venue, int overs) {
        if (team1 == null || team2 == null) {
            System.out.println("Please create teams before scheduling a match!");
            return;
        }

        switch (type.toLowerCase()) {
            case "t20":
                currentMatch = new t20(team1, team2, venue, overs);
                break;
            case "odi":
                currentMatch = new odi(team1, team2, venue, overs);
                break;
            case "oneday":
                currentMatch = new oneDay(team1, team2, venue, overs);
                break;
            default:
                System.out.println("Invalid match type!");
                return;
        }

        System.out.println("Match scheduled: " + team1.teamName + " vs " + team2.teamName + " (" + type.toUpperCase() + ")");
    }

    public void startMatch() {
        if (currentMatch == null) {
            System.out.println("No match has been scheduled!");
            return;
        }
        currentMatch.startMatch();
    }

    public void enterMatchDetails(int score1, int wickets1, int score2, int wickets2) {
        if (currentMatch == null) {
            System.out.println("No match in progress!");
            return;
        }
        currentMatch.addScore1(score1);
        currentMatch.addWicket1(wickets1);
        currentMatch.addScore2(score2);
        currentMatch.addWicket2(wickets2);
    }

    public void showResult() {
        if (currentMatch == null) {
            System.out.println("No match to calculate result!");
            return;
        }
        currentMatch.calcResult();
    }

    public static void main(String[] args) {
        Cricbuzz app = new Cricbuzz();

        app.createTeams();

        app.createMatch("t20", "Wankhede Stadium", 20);

        app.startMatch();

        app.enterMatchDetails(180, 7, 175, 8);

        app.showResult();

        System.out.println(app.team1.teamName + " Wins: " + app.team1.getWins());
        System.out.println(app.team2.teamName + " Wins: " + app.team2.getWins());

    }
}
