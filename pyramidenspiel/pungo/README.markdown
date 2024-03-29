*Pungo* is a simple abstract game of perfect information involving pyramid movement determined by a 6-sided die, but not in the way you might think.

Setup
=====

To play you'll need two 3x4 boards (you can simply draw them on paper), a normal 6-sided, and 9 [Looney Pyramids](http://www.looneylabs.com/looney-pyramids) of any color, 3 each of small medium and large sizes.  

One 3x4 board should be placed between the players —  this is the *game arena*.  The other 3x4 board should be placed to the side of the game arena with the die showing the 1-pip placed in one of the center squares —  this is the *controlled roll* surface:

![Setup](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/pungo/graphics/cr-grid-setup.png)

You should setup the game arena in the following configuration:

![Setup](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/pungo/graphics/pungo-setup.png)

The details of the setup are according to the center cells, from left to right:

 1. A large pyramid on top of a medium on top of a small
 2. A large pyramid on top of a medium
 3. A small pyramid on top of a large
 4. A medium pyramid on top of a small

One player is assigned a row of three cells to be their *home row* while the other player gets the row on the opposite end.  Once setup, the game can begin.

Goal
====

There are two ways to win:

 1. You get a symmetric arrangement of pyramids, according to size, in
    your home row, where each cell has at least one pyramid 
	occupying it
 2. Your opponent's row contains all of the pyramids, in any
    legal arrangement and in any or all cells

In either case, the arrangement of pieces must arise as the result of using all of your allocated movement points, described next.

Turns
=====

On each turn a player takes two actions:

 1. Make a controlled roll of the die
 2. Move some number of pieces some number of squares orthogonally
    connected squares in the game arena

On each turn the player to move is allocated a certain number of movement points as shown on the top of the die. The first player of the game will always get 1-point of movement.

## The controlled roll

A *controlled roll* is a way to utilize a die in such a way as to eliminate random results.  To do this a player tumbles a die along the 3x4 grid from one face to another, as shown below:

![Setup](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/pungo/graphics/cr-grid-flips.png)

The only constraints on movement is that a die cannot exit the bounds of the grid nor be be flipped into a square where it came from previously.

## Pyramid movement

Pyramids cost the following to move 1-square orthogonal from where they sit:

 1. Small pyramid
 2. Medium pyramid
 3. Large pyramid

Movement points can be spent to move a single pyramid multiple times or multiple pyramids in turn.  The points available are indicated by the face showing on the top of the die.

### Passing and remaining movement points

Players cannot pass and must move as indicated by the value of the die and all points must be spent on each turn.

### Movement constraints

There are rules regarding how pyramids may be moved:

 * No pyramid can land, even in passing, on a smaller pyramid
 * Landing on an empty square during movement freezes a pyramid 
   from moving anymore during that turn
 * A pyramid resting on an empty square can be move to any orthogonal
   square or pyramid, but it is frozen for the rest of that turn
 * An unfrozen pyramid can move across the top of any number of
   pyramids according to the available movement points
 * A pile of pyramids can move, as long as the movement points
   can accommodate the total points in the pile

Once movement points are spent, no more pyramids can be moved during that player's turn.  When a player can no longer move she may then make a *controlled roll* of the die before the start of the next player's turn.

Variations
==========

There are tweaks to the base rules that you can use to change the way that *Pungo* plays.

## Averaging Pungo

If you have an averaging die then the points are allocated as shown.  However, if you only have a regular die then allocate the points as follows:

 Face | Points 
 :---: | :---:
  1 | 3
  2 | 2
  3 | 3
  4 | 4
  5 | 5
  6 | 4

This will help to keep point allocations more stable.

## Decision Pungo

Decision Pungo reverses the order of the actions on a player's turn, all other rules and constraints being the same.  That is, the new order is:

 1. Move some number of pieces some number of squares orthogonally
    in the game arena
 2. Make a controlled roll of the die

This means that on your turn you always determine the movement points for your opponent's turn.  This can lead to some difficult decisions.

## Chaos Pungo

Instead of allowing the opposing player to choose which way to flip to movement die, the choice on each turn can be randomized.  That is, before a player moves she rolls the movement die.  The value on the die still determines which pyramid can move.

## Pyramid die Pungo

Instead of using a d6 to allocate movement points, you can use a pyramid die as packaged in the games [IceDice](http://www.looneylabs.com/games/icedice) or [Pink Hijinks](http://www.looneylabs.com/games/pink-hijinks).

![pyramid-die](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/graphics/png/pyramid-die-faces.png)

Instead of allocating raw points used for movement, the pyramid die used will indicate a choice of the kinds of pyramids that may be moved.  The controlled rolling mechanism is used just as in the regular rules, but on each turn there will be, on average, less options for moving using the pyramid die.

## Three-color Pungo

Instead of using 9 pyramids of the same color you can use 9 pyramids of three different colors where each color has one small, one medium, and one large pyramid.  All of the rules of the basic game still hold except that symmetrical conditions must take into account color in addition to sizes.

Design notes
============

*Pungo* is inspired by the fun game [Pink Hijinks](http://www.looneylabs.com/games/pink-hijinks) created by [Looney Labs](http://www.looneylabs.com) and my variant [Coin Hijinks](https://github.com/fogus/spiel/tree/master/taschenspiele/coin-hijinks). While I like Pink Hijinks very much, I've been confronted by my opponents with accusations that it's too luck driven.  I do not necessarily agree with this position, but it did get me thinking about how to take the luck out of Pink Hijinks while preserving its simplicity and quick game-play.

In the process of playing around with [Coin Hijinks](https://github.com/fogus/spiel/tree/master/taschenspiele/coin-hijinks) I happened upon an "opponent's choice" method of manually flipping a coin.  This approach completely eliminated the luck factor inherent in Coin Hijinks, but still managed to maintain the feel of the original.  That is, it was the same game, but now it had another tactical layer that did not previously exist —  flip management.  My idea for the *controlled flip* were used to create a game very similar to Coin Hijinks called [Machipungo](https://github.com/fogus/spiel/tree/master/taschenspiele/coin-hijinks), named after a town in Virginia Beach, Machipongo.

The design of Machipungo naturally got me thinking about Looney Pyramids again and my quest to eliminate the luck from Pink Hijinks.  Therefore, I took the lessons from Machipungo and applied them to a pyramids design called simply, Pungo.  The *controlled roll* mechanic is inspired by both [Bushi Shogi](http://boardgamegeek.com/boardgame/15874/bushi-shogi) and my design inspired by it called [Pew Pew, Die](http://icehousegames.org/wiki/index.php?title=PewPewDie). 
I have some other ideas for utilizing the *controlled roll*, but Pungo is the first.  While Pungo is inspired by Pink Hijinks and Bushi Shogi, I'm certain that you'll find a very different game indeed.

Enjoy.

