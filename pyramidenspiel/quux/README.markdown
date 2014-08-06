*Quux* is a simple abstract game of perfect information involving pyramid stacking and movement determined by *controlled movement* of a special 6-sided die.

Setup
=====

To play you'll need a hand-drawn 5x5 board or [Volcano board](), an [IceDice]() color die, and a [Treehouse]() set.  In addition you should draw a 3x3 grid on a piece of paper, or just use an existing [Martian Coaster]() of any color.  

You should setup the board in the following configuration:

![todo](https://raw.githubusercontent.com/fogus/spiel/master/graphics/todo.jpg)

One player is assigned a row of three cells to be their "home row" while the other player gets the row on the opposite end. Now, place the die between the two players, in the centef square of the 3x3 grid, with the atomic symbol facing up.  Once setup, the game can begin.

Goal
====

Get all three pieces of your color in the opponent's home row

Turns
=====

TODO

## Movement

 * If you can move, you must move
 * Based on color shown
 * Any number of blank spaces, stopping at the last blank before 
   any sized piece
 * Stops at first larger or smaller, perfectly nestable piece
 * Can travel over any number of like-sized pieces to land on 
   legal spot
 * If no legal moves then you must pass
 * A pile of pyramids or a segment can move, as long as a piece
   somewhere in the moving pile matches the color on the die
   - Only the base moves however, be it from the bottom or 
     a segment. Those on top go for the ride

## Movement constraints

There are constraints about how pyramids may be moved however:

 * No pyramid can land, even in passing, on a smaller pyramid

## The controlled roll

TODO

Variations
==========

There are tweaks to the base rules that you can use to change the way that *Quux* plays.

## Chaos Quux

Instead of allowing the opposing player to choose which way to flip to movement die, the choice on each turn can be randomized.  That is, before a player moves she rolls the movement die.  The value on the die still determines which pyramid can move.


Acknowledgments
===============

*Quux* is inspired by the fun game [Kamisado]() created by [Peter Burley]() and my older design [Pungo](https://github.com/fogus/spiel/tree/master/taschenspiele/machipongo).  The controlled die rolling mechanism is inspired by both [Bushi Shogi](http://boardgamegeek.com/boardgame/15874/bushi-shogi) and  [Pew Pew, Die](http://icehousegames.org/wiki/index.php?title=PewPewDie).