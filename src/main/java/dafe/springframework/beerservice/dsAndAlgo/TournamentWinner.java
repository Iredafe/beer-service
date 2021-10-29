package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TournamentWinner {

    public static int HOME_TEAM_WON = 1;
   public static String tournamentWinner(ArrayList<ArrayList<String>> competitions,ArrayList<Integer> results){
       String winner ="";
    Map<String, Integer> scores = new HashMap<>();
    for(int i=0; i<= results.size(); i++){
        ArrayList<String> competition = competitions.get(i);
        int result = results.get(i);
        String homeTeam = competition.get(0);
        String awayTeam = competition.get(1);

        String winningTeam = (result==HOME_TEAM_WON) ? homeTeam:awayTeam;

        updateScores(winningTeam, 3, scores);
        if(scores.get(winner) > scores.get(winningTeam))
            winner = winningTeam;
    }
       return winner;
   }

    private static void updateScores(String winningTeam, int points, Map<String, Integer> scores) {

       if(!scores.containsKey(winningTeam)){
           scores.put(winningTeam, 0);
       }
        scores.put(winningTeam, scores.get(winningTeam) +points);

   }
    public static void main(String[] args) {
    }
}
