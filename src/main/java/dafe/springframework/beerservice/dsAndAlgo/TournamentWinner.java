package dafe.springframework.beerservice.dsAndAlgo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TournamentWinner {

    public int HOME_TEAM_WON = 1;
   public String tournamentWinner(ArrayList<ArrayList<String>> competitions,ArrayList<Integer> results){
       String winner ="";
    Map<String, Integer> scores = new HashMap<>();
    for(int i=0; i<= results.size(); i++){
        ArrayList<String> competition = competitions.get(i);
        int result = results.get(i);
        String homeTeam = competition.get(0);
        String awayTeam = competition.get(1);

        String winningTeam = (result==HOME_TEAM_WON) ? homeTeam:awayTeam;

    }
       return winner;
   }

}
