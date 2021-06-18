package dafe.springframework.beerservice.dsAndAlgo;

public class MaxIncreaseToKeepSkyline {

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int N = grid.length;
        int[] rowMaxes = new int[N];
        int[] columnMaxes = new int[N];

        for(int r=0;r<N; ++r)
            for(int c=0; c<N;++c){
                rowMaxes[r] = Math.max(rowMaxes[r], grid[r][c]);
                columnMaxes[c]=Math.max(columnMaxes[c], grid[r][c]);
            }
        int answer = 0;
        for(int r=0; r<N;++r)
            for(int c=0;c<N; ++c)
                answer += Math.min(rowMaxes[r], columnMaxes[c]) - grid[r][c];


        return answer;
    }


    public static void main(String[] args) {
       int[][] inputGrid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        System.out.println("This is the result : " + maxIncreaseKeepingSkyline(inputGrid));

    }

}
