package dafe.springframework.beerservice.Grokking;

public class KaratHallway {
    /*
We have a hallway which contains a fan that blows wind in a given direction ('<'=left, '>'=right) and a number of candles 'i' that blow out when the wind hits them. Open spaces are represented by '.'.

Write a function that takes in a hallway, and returns the number of candles that will be blown out.

Examples:
..>.ii.
2 (Wind blows to the right and blows out both candles)

i>.i.i.
2 (Wind blows to the right and blows out 2 candles, however the first candle will not be blown out)

i.<....
1 (Wind blows to the left and blows out the candle)

.i<i...
1 (Wind blows to the left and blows out the candle but the candle to the right will not be blown out)

<iiii
0 (Wind blows to the left and doesn't blow out any candles)

iiii>
0 (Wind blows to the right and doesn't blow out any candles)

All Test Cases:
candles_blown_out(hallway1) => 2
candles_blown_out(hallway2) => 2
candles_blown_out(hallway3) => 1
candles_blown_out(hallway4) => 1
candles_blown_out(hallway5) => 0
candles_blown_out(hallway6) => 0

Complexity Analysis variable:
n = length of the hallway
*/

/*solution plan
- iterate thru array
-find direction of wind
- if direction is to the right, count the number of candles and return the result
-repeat same for left direction and return result


*/

        private static int getNumberOfCandles(char [] hallway){
            int numberOfCandles = 0;

            for(int i=0; i<hallway.length; i++){

                if (hallway[i] == 'i') {
                    numberOfCandles++;
                }
                if (hallway[i] == '<') {
                    return numberOfCandles;
                }

                if (hallway[i] == '>') {
                    numberOfCandles = 0;
                }
            }

            return numberOfCandles;
        } // 15
        //multistep problem
        public static void main(String[] argv) {
            char[] hallway1 = {'.','.','>','.','i','i','.'};
            char[] hallway2 = {'i','>','.','i','.','i','.'};
            char[] hallway3 = {'i','.','<','.','.','.','.'};
            char[] hallway4 = {'.','i','<','i','.','.','.'};
            char[] hallway5 = {'<','i','i','i','i'};
            char[] hallway6 = {'i','i','i','i','>'};

            System.out.println("hallway 1 " + getNumberOfCandles(hallway1));
            System.out.println("hallway 2 " + getNumberOfCandles(hallway2));
            System.out.println("hallway 3 " + getNumberOfCandles(hallway3));
            System.out.println("hallway 4 " + getNumberOfCandles(hallway4));
            System.out.println("hallway 5 " + getNumberOfCandles(hallway5));
            System.out.println("hallway 6 " + getNumberOfCandles(hallway6));

        }
    }


