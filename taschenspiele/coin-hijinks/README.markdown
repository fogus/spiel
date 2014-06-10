*Coin Hijinks* is a simple abstract game of chance meant to be played with pocket change.

Setup
=====

The game requires 12 coins of differing sizes: 4 small, 4 medium, and 4 large. I've found that quarters (USD), nickels, and pennies work well.  The game is played on any flat surface in a virtual or hand-drawn 3x3 grid.  The back of a napkin works well for this.  The virtual grid is situated between the players and the row nearest to each player is their "home row."

Goal
====

The goal of *Coin Hijinks* is to achieve one of the following wining conditions:

 1. You get all three of one sized coin in your home 
    row, where each cell has at least one coin occupying it
 2. Your opponent's row contains all of the coins, in any
    legal arrangement and in any or all cells

Once either of these conditions occur, the game ends.

Turns
=====

To start each turn the player picks up the three coins, mixes them in hand, and slams the coins down onto the table. The majority faces showing still determine which coins can move. The player to move is allowed to move one or more coins into another cell of the grid, only orthogonal.

## Moving coins

The coins that are allowed to be moved are only those whose faces are the majority. In other words, if the large coin shows heads, medium tails, and small large then only the large and small coins can be moved.

## Movement constraints

There are constraints about how coins may be moved however:

 * While you can move coins into your opponent's home row, 
   you may never move coins out of there
 * You can however move coins within an opponent's home row
 * A pile of coins can move if a movable coin has other coins
   resting on top of it

The other player then takes their turn.

Acknowledgments
===============

*Coin Hijinks* is inspired by the fun game [Pink Hijinks](http://www.looneylabs.com/games/pink-hijinks) created by [Looney Labs](http://www.looneylabs.com) and my variant on that game called [Coin Hijinks](https://github.com/fogus/spiel/tree/master/taschenspiele/coin-hijinks).  The shake and slam chaos method is inspired by [Coin Age](http://boardgamegeek.com/boardgame/146130/coin-age).