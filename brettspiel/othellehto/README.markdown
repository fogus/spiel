Othel Lehto is a strategy game of perfect information for two players.

# Needed

 * A square game board with an odd number of squares per side (at least 7x7 recommended)
 * Enough Reversi pieces to fill the chosen board
 
# Goal

The player with the most pieces with their color turned up wins the game.

# Game play

The first player plays a black piece onto any square.  The second player may choose to either place a white piece onto any other square or switch colors with the first player.  Play then proceeds as follows:

 * Players place one piece per turn onto any unoccupied square.
 * If the placement forms a palindrome with any connected pieces side-to-side, up-and-down, or diagonal, bounded by empty squares or the edges then all of the pieces in the palindrome are flipped to the color played.
 * If a flip causes the formation of another palindrome then the new palindrome is also flipped, if that too forms a palindrome then it too is flipped, and so forth.

## Forming palindromes

Palindromes, must be bounded by the board edge or empty spaces.  Therefore, white can play at any of the positions below to form a palindrome:

![palindromes](https://raw.githubusercontent.com/fogus/spiel/master/brettspiel/othellehto/graphics/palindromes.png)

However, none of the placements below form a palindrome:

![not-palindromes](https://raw.githubusercontent.com/fogus/spiel/master/brettspiel/othellehto/graphics/not-palindromes.png)

Forming a palindrome, may trigger the formation of other palindromes.  Below white places a piece to form a palindrome:

![place](https://raw.githubusercontent.com/fogus/spiel/master/brettspiel/othellehto/graphics/place.png)

The palindromic flip then forms another palindrome:

![first-flip](https://raw.githubusercontent.com/fogus/spiel/master/brettspiel/othellehto/graphics/first-flip.png)

Which is also flipped to white:

![second-flip](https://raw.githubusercontent.com/fogus/spiel/master/brettspiel/othellehto/graphics/second-flip.png)

Since no more palindromes can be formed white's turn ends.

# End

When the board is filled or the players mutually agree then the game ends.
