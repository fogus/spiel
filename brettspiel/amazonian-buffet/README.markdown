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

 * Move one pawn any number of cards in possible legal direction
 * Claim a card at one of the intersections of your pawns

The details of movements and claims are as follows.

Movement
--------

A pawn in *Amazonia Buffet* moves like a queen in Chess: any number of possible spaces in all eight directions from where it starts.  The orthogonal directions are simple to visualize but the diagonal directions need further illustration:

![movement](https://raw.githubusercontent.com/fogus/spiel/master/brettspiel/amazonian-buffet/graphics/movement.png)

That is, when a pawn moves in a diagonal direction it moves along any of the cards connected at their corners in a straight line.  In the illustration above, any of the bold cards can be reached by the pawn starting at the 5 of hearts.

As you might have guessed, pawns may not pass over obstructions along a path such as claim stones or other pawns, nor proceed beyond the edges of the grid.  The only other constraint on movement is that if two pawns of the same color reside on the same row or column, then the move must take them out of alignment.

Claiming
--------

Once a pawn is moved, a player may place a stone on a legal card.  This a called *a claim*.

If a pawn moves to a different column or row than the other pawn of the same color then a card may be claimed at either of the two intersections formed:

![claims](https://raw.githubusercontent.com/fogus/spiel/master/brettspiel/amazonian-buffet/graphics/claims.png)

However, if a pawn moves into the same column or row as the other pawn of the same color then any one of the cards between the two pawns may be claimed:

![claims-line](https://raw.githubusercontent.com/fogus/spiel/master/brettspiel/amazonian-buffet/graphics/claims-line.png)

In either case, pawns and claim stones along the path of a row, column, or intersection are not considered obstructions for the purpose of claiming cards.

End
----

Play continues until both players do not claim any cards for two consecutive turns.  Once this occurs, the cards claimed are gathered up by the corresponding players.  These cards are then used to build three Poker hands of 5 cards each.

### Resolving Poker hands

Players then layout their three Poker hands.  Both players may adjust the contents of the hands in response to the other player's hands.  Hands are resolved according to the following heirarchy (top to bottom):

![claims-line](https://raw.githubusercontent.com/fogus/spiel/master/brettspiel/amazonian-buffet/graphics/hands-rank.png)

If a player is unable to build 5-card hands then they may build 3 card hands and resolve according to the 

Scoring
-------

