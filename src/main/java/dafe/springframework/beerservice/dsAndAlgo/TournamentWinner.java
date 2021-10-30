package dafe.springframework.beerservice.dsAndAlgo;

import java.util.*;

public class TournamentWinner {

    public static int HOME_TEAM_WON = 1;
   public static String tournamentWinner(ArrayList<ArrayList<String>> competitions,ArrayList<Integer> results){
       String currentBestTeam ="";
    Map<String, Integer> scores = new HashMap<>();
       scores.put(currentBestTeam, 0);
       System.out.println(scores);

       for(int index=0; index< competitions.size(); index++){
        ArrayList<String> competition = competitions.get(index);
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
    //this line of code needs more clarity... what if team does not exist in scores but just won 3 points? would we go ahead and put 0 as ?
        //this line now makes sense if the score map is not initialized inside the for loop
       if(!scores.containsKey(team)){
           scores.put(team, 0);
           System.out.println(scores);
       }
        scores.put(team, scores.get(team) +points);

   }


    public static void main(String[] args) {
        ArrayList<ArrayList<String>>  list = new ArrayList<>(List.of(
        new ArrayList<>(List.of("HTML", "C#")),
        new ArrayList<>(List.of("C#", "Python")),
        new ArrayList<>(List.of("Python", "HTML"))
        ));

        ArrayList<Integer> results = new ArrayList<>();
        results.add(0);
        results.add(0);
        results.add(1);

        System.out.println("The winner of this tournament is : " +tournamentWinner(list, results));
   }
}
