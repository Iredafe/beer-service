package dafe.springframework.beerservice.OnsitePrep;

public class RankTeamsByVotes {


    public static void main(String[] args) {
        String [] votes = {"ABC","ACB","ABC","ACB","ACB"};
        System.out.println("This is the teams vote rank : " + rankTeamByVote(votes));
    }
}
