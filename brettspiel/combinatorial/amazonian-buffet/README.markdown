*Amazonian Buffet* is a tactical game of blocking and set collection for 2-players.

Preparation
===========

 * A deck of standard playing cards with the Jokers removed
 * A set of Go stones
 * Four pawns, two each of white and black

Shuffle the cards and lay 48 of them face up in a 6x8 grid.  The remaining 4 cards are dealt to the players and each gets all of the stones of a single color.  Finally, the pawns are placed on the four corner cards of the board, with different colors residing on opposite corners.

Goal
====

Two win two out of three Poker hands.

Game-play
========

Play alternates between players with the player using the black pieces starting the game.  On each turn, players perform the following actions:

 * Move one pawn any number of cards in any possible direction
 * Claim a card at one of the intersections of or between your pawns

The details of movements and claims are as follows.

Movement
--------

A pawn in *Amazonian Buffet* moves like a queen in Chess: any number of possible spaces in all eight directions from where it starts:

![movement](https://raw.githubusercontent.com/fogus/spiel/master/brettspiel/amazonian-buffet/graphics/movement.png)

When a pawn moves in a diagonal direction it moves along any of the cards connected at their corners in a straight line.  In the illustration above, any of the bold cards can be reached by the pawn starting at the 5 of hearts.

### Movement constraints

Pawns may not pass over obstructions along a path such as claim stones or other pawns, nor come to rest on an occupied card.  The only other constraint on movement is that if two pawns of the same color reside on the same row or column, then the move must take them out of alignment.

Claiming
--------

Once a pawn is moved, a player may *claim* a card by placing a stone of their color on it.

### Intersection claims

If a pawn moves to a different column or row than the other pawn of the same color then a card may be claimed at either of the two intersections formed:

![claims](https://raw.githubusercontent.com/fogus/spiel/master/brettspiel/amazonian-buffet/graphics/claims.png)

### Straight-line claims

However, if a pawn moves into the same column or row as the other pawn of the same color then any one of the cards between the two pawns may be claimed:

![claims-line](https://raw.githubusercontent.com/fogus/spiel/master/brettspiel/amazonian-buffet/graphics/claims-line.png)

In either case, pawns and claim stones along the path of a row, column, or intersection are not considered obstructions for the purpose of claiming cards.

End
----

Play continues until both players do not claim any cards for two consecutive turns.  Once this occurs, the cards claimed are gathered up by the corresponding players.  These cards are then used to build three Poker hands of 5 cards each.

### Resolving Poker hands

Players lay out their three Poker hands but may adjust the contents of the hands in response to the other player's opposing hands.  Hands are resolved according to the following hierarchy (top to bottom):

![claims-line](https://raw.githubusercontent.com/fogus/spiel/master/brettspiel/amazonian-buffet/graphics/hands-rank.png)

If a player is unable to build 5-card hands then the hands that they build will still resolve according to the hierarchy above.  In the case where two hands are functionally equivalent (the same level in the hierarchy) then the cards in the hands are compared from the highest rank to the lowest and resolved according to the following suit ranks (top to bottom):

 1. Spades
 2. Hearts
 3. Diamonds
 4. Clubs

The player who wins two out of the three built hands wins the game.

*Amazonian Buffet* is &copy;2015, Michael Fogus

