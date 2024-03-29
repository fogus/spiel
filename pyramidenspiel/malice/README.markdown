*Malice* is an abstract strategy game of piece movement, capture and teleportation for two or four players.  

Goal
====

To be the player or team with the highest captured point total when the game ends.

Materials and setup
===================

Malice requires two special 4x8 gameboards to play, although a Checkers board can be used in a pinch.  In addition, Malice requires 24 pieces ([Icehouse pieces](http://www.looneylabs.com/looney-pyramids) work very nicely too) of differing sizes: 6 small, 6 medium, and 6 large.  You can use 24 stones or pieces of paper or even coins: 8 dimes, 8 pennies, and 8 nickels.  The color of the game pieces does not matter, in fact all 24 can be the same color.

In any case, the starting setup for Malice is as follows:

![setup](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/malice/graphics/inital-setp.png)

All of the instructions in this guide assume that you're using the special gameboards.

The gameboard
=============

The gameboards, there being two, are transpositions of each other.  For any square on one board, when setup as in the diagram above, there is a *dual* square on the other board on the opposite side.  Dual squares are specially colored to more easily identify across the two boards.  This coloring is important for devising plans involving teleportation, which is described later.

[You can download and print a copy of the Malice gameboard if you'd like to play.](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/malice/graphics/board.png)

Gameplay
========

Since the colors of the pieces on the two boards are not important, then you might wonder which pieces are under your control.  The answer is that the pieces that you control are any that reside in the two quadrants nearest to you.  Your opponent's pieces are therefore those that are on the two quadrants farthest from you.

Piece movement
--------------

The three piece sizes in Malice move in different ways, as described below.  However, one important point of note is that pieces **cannot** move directly from one board to another.  To get from one board to another requires teleportation -- described later.

### Small pieces

Small pieces can move in any direction exactly one square, as shown below:

![move-small](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/malice/graphics/small-movement.png)

In other words, smalls move like Chess kings.

### Medium pieces

Medium pieces can move three squares away, in an L-shaped fashion, even over other pieces, as shown below:

![move-med](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/malice/graphics/medium-movement.png)

In other words, mediums move like Chess knights.

### Large pieces

Large pieces can move in any direction, any number of squares, as shown below:

![move-lg](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/malice/graphics/large-movement.png)

In other words, larges move like Chess queens.

Piece capture
-------------

Capturing in Malice happens much like in Chess.  That is, to capture a piece you need only to move into a square occupied by another piece, but **only** within one of the two opposite quadrants.  A summary of capturing is shown below:

![caps](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/malice/graphics/captures.png)

Each captured piece is removed from the board and kept for final scoring, described next.

### Capturing points

Each piece captured is worth points equal to its size:

 * A small is worth 1-point
 * A medium is worth 2-points
 * A large is worth 3-points

Teleportation
-------------

The trick in moving in Malice is that almost every movement causes your piece to *teleport* to the dual square on the second board.  When you move a piece that you control to a square on your side then it teleports to a square on the other board in your opponent's side. Conversely, when you move a piece that you control onto a square on the opposite side of the board then it's teleported to the opposite board on the same colored square on your side.  An overview of teleportation is shown below:

![teleport](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/malice/graphics/teleportation.png)

As you see, teleportation is the only way that you can get from one board to the other.  However, because teleportation happens on almost every move and capture, you have to be careful where you move your pieces.

### Blocked teleportation

The only time that teleportation does not happen on a move or a capture is when a piece resides on the dual square of the other board.  This condition is shown below:

![blocked-teleport](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/malice/graphics/blocked-teleportation.png)

In the diagram above, both the capture and the move are teleportation-free because there are pieces (smalls in this case) residing in the dual squares on the other board.  Blocked teleportation, like allowed teleportation, can be a bane and a blessing.  You must keep your whits about you to avoid nasty captures or unexpected game endings.

Ending the game
---------------

The game ends when any one of the four quadrants is devoid of pieces.  The player with the most points when the game ends wins.


Acknowledgements
================

*Malice* is inspired by a variant of Chess called [Alice](http://www.chessvariants.org/other.dir/alice.html), where it adopts the idea of teleportation. Also, Malice adopts the board sizes and piece control mechanisms from [Martian Chess](http://icehousegames.org/wiki/index.php?title=Martian_Chess) by [Looney Labs](http://www.looneylabs.com).
