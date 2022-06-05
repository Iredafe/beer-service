package dafe.springframework.beerservice.Grokking;

public class RankTeamByVotes {

    private static String rankTeam(String [] votes){

        return "";
    }

    public static void main(String[] args) {

        String [] votes = {"ABC","ACB","ABC","ACB","ACB"};

        System.out.println("The result of the vote is : " + rankTeam(votes));
    }
}
