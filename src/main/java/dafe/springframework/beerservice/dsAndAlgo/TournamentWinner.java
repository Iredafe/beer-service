package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TournamentWinner {

    public static int HOME_TEAM_WON = 1;
   public static String tournamentWinner(ArrayList<ArrayList<String>> competitions,ArrayList<Integer> results){
       String currentBestTeam ="";
    Map<String, Integer> scores = new HashMap<>();
    for(int index=0; index<= results.size(); index++){
        ArrayList<String> competition = competitions.get(index);
        scores.put(currentBestTeam, 0);
        int result = results.get(index);
        String homeTeam = competition.get(0);
        String awayTeam = competition.get(1);

        String winningTeam = (result==HOME_TEAM_WON) ? homeTeam:awayTeam;

        updateScores(winningTeam, 3, scores);
        if(scores.get(winningTeam) > scores.get(currentBestTeam))
            currentBestTeam = winningTeam;
    }
       return currentBestTeam;
   }

    private static void updateScores(String team, int points, Map<String, Integer> scores) {

       if(!scores.containsKey(team)){
           scores.put(team, 0);
       }
        scores.put(team, scores.get(team) +points);

   }
    public static void main(String[] args) {
    }
}
