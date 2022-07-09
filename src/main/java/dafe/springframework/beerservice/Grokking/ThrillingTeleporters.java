package dafe.springframework.beerservice.Grokking;

public class ThrillingTeleporters {
}



/*
We are developing a new board game, Thrilling Teleporters.

The board consists of consecutive squares from 0 to last_square, some of the spaces also contain Teleporters, which are given as comma delimited strings "from,to".

The game is played as follows:
  1. Each turn, the player rolls a die numbered from 1 to die_sides.
  2. The player moves forward the rolled number of squares.
  3. The player stops at last_square if they reach it.
  4. If the player finishes on a square with a teleporter, they are moved to where the teleporter points.

Note: Only one teleporter is followed per turn.

A sample board with last_square 20 the following teleporters might look like this conceptually.
teleporters1 = ["3,1", "4,2", "5,10"]

   +-----+
   v     |
0  1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  16  17  18  19  20
      ^     |  |               ^
      +-----+  +---------------+

Write a function that returns a collection of the possible squares a player can move to in a single turn, given the following inputs:
- A collection of teleporter strings
- The number of sides on the die
- The square the player starts on
- The last square on the board

Example:
With a 6 sided die, starting at square 0 with a board ending at square 20 (as pictured above)

Rolling a 1, 2 or 6 have no teleporters so they end at that square.
Rolling a 3 goes to 1, rolling a 4 goes to 2, rolling a 5 goes to 10.
The possible outcomes are, in order of die roll, are [1, 2, 1, 2, 10, 6].
If we remove the duplicates, the answer is [1, 2, 6, 10]
destinations(teleporters1, 6, 0, 20) => [1, 2, 6, 10]

Additional Inputs:
teleporters2 = ["5,10", "6,22", "39,40", "40,49", "47,29"]
teleporters3 = ["6,18", "36,26", "41,21", "49,55", "54,52",
                "71,58", "74,77", "78,76", "80,73", "92,85"]
teleporters4 = ["97,93", "99,81", "36,33", "92,59", "17,3",
                "82,75", "4,1", "84,79", "54,4", "88,53",
                "91,37", "60,57", "61,7", "62,51", "31,19"]

Complexity Variable:
B = size of the board
Note: The number of teleporters and size of the die are bounded by B.

All Test Cases:
                          die, start, end
destinations(teleporters1,  6,   0,    20)  => [1, 2, 6, 10]
destinations(teleporters2,  6,  46,   100)  => [48, 49, 50, 51, 52, 29]
destinations(teleporters2, 10,   0,    50)  => [1, 2, 3, 4, 7, 8, 9, 10, 22]
destinations(teleporters3, 10,  95,   100)  => [96, 97, 98, 99, 100]
destinations(teleporters3, 10,  70,   100)  => [72, 73, 75, 76, 77, 79, 58]
destinations(teleporters4,  6,   0,   100)  => [1, 2, 3, 5, 6]

95 96 97 98 99 100
   ^

1->2


destinations(teleporters1,  6,   0,    20)



   +-----+
   v     |
0  1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  16  17  18  19  20
^     ^     |  |               ^
      +-----+  +---------------+

1

4 inputs -> teleporter, die, start and end
start - end represents positions
the die represents numbers
start from first number on die -
increment it by 1.
if the new die number exists in the teleporter string's first index
get the position in the teleporter that corresponds to the die number and add to output
if the new die number does not exist in the teleporter, increment die by 1 and add it to the position

return an array of possible positions


*/