*Quux* is a simple abstract game of perfect information involving pyramid stacking and movement determined by *controlled movement* of a special 6-sided die.

Setup
=====

To play you'll need a hand-drawn 5x5 board or [Volcano board](), an [IceDice]() color die, and a [Treehouse]() set.  In addition you should draw a 3x3 grid on a piece of paper, or just use an existing [Martian Coaster]() of any color.  

You should setup the board in the following configuration:

![todo](https://raw.githubusercontent.com/fogus/spiel/master/graphics/todo.jpg)

One player is assigned a row of three cells to be their "home row" while the other player gets the row on the opposite end. Now, place the die between the two players, in the centef square of the 3x3 grid, with the atomic symbol facing up.  Once setup, the game can begin.

Goal
====

There are three ways to win:

 1. You get a symmetrically sized arrangement of pyramids in your home 
    row, where each cell has at least one pyramid occupying it
 2. You get a symmetrically colored arrangement of pyramids in your
    home row, where each cell has at least one pyramid occupying it
 2. Your opponent's home row contains at least one pyramid of each
    color or size, in any legal arrangement and in any or all cells

TODO

Turns
=====

TODO

## Movement

 * Based on color shown
 * Moves number of spaces ortho equal to its pips
 * If no legal moves remain then you can use the remaining moves 
   on another pyramid
 * If you can move, you must move, except in home row where you
   must move sideways but can choose to reserve moves if you can
   only move forward
 * A pile of pyramids or a segment can move, as long as the color 
   at the base of the moving pile matches the color on the die

## Movement constraints

There are constraints about how pyramids may be moved however:

 * While you can move pyramids into your opponent's home row, 
   you may never move pyramids out of there
 * You can however move pyramids within an opponent's home row
 * No pyramid can land, even in passing, on a smaller pyramid

## The controlled roll

When a player can no longer move she may twist the die either to the left, right, or in one other direction.  It doesn't matter which axis the 3rd kind of twist occurs, but it must happen the same way for both players for the entire game.

Variations
==========

There are tweaks to the base rules that you can use to change the way that *Quux* plays.

## Chaos Quux

Instead of allowing the opposing player to choose which way to flip to movement die, the choice on each turn can be randomized.  That is, before a player moves she rolls the movement die.  The value on the die still determines which pyramid can move.

## Opponent chooses your color

TODO

Acknowledgments
===============

*Quux* is inspired by the fun game [Pink Hijinks](http://www.looneylabs.com/games/pink-hijinks) created by [Looney Labs](http://www.looneylabs.com) and my older design [Machipungo](https://github.com/fogus/spiel/tree/master/taschenspiele/machipongo).  The controlled die rolling mechanism is inspired by both [Bushi Shogi](http://boardgamegeek.com/boardgame/15874/bushi-shogi) and [Pew Pew, Die](http://icehousegames.org/wiki/index.php?title=PewPewDie).