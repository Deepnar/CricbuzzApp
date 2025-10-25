package main;

import main.players.Player;

import java.util.ArrayList;

public class teams {

    public String teamName;
    public int wins;
    ArrayList<Player> players = new ArrayList<>();
    String captainName;
    String viceCaptainName;

    teams(String teamName, String captainName, String viceCaptainName) {
        this.teamName = teamName;
        this.captainName = captainName;
        this.viceCaptainName = viceCaptainName;
    }

    public void addPlayer(Player player) {
        players.add(player);
        System.out.println(player + " has been added to team " + teamName);
    }

    public void displayPlayers() {
        System.out.println("Players in team " + teamName + ":");
        for (Player player : players) {
            System.out.println("- " + player);
        }
    }

    public void displayWins() {
        System.out.println("Team " + teamName + " has " + wins + " wins.");
    }

    public String getWins() {
        return wins + " wins";
    }
}
