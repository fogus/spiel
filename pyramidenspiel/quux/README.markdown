*Quux* is a simple orthoginal connection game of perfect information for two players.

Preparation
===========

 * A 4x4 square game board (drawing a picture is good)
 * Two mono-stashes of differing colors

Each player gets a full stash of their chosen color.  The players choose which two opposite sides of the game board belongs to them before the play starts.

Goal
====

The first player to connect a line of pyramids of their color from their chosen side to the oppposite side wins.  A line of pyramids can only be created via orthogonal connections of a player's colored pyramids resting at the top-most level of a cell. 

Gameplay
========

A game of *Quux* consists of (potentially) two phases: a placement phase and a movement phase.

Placement phase
---------------

On each player's turn they may place a pyramid of their color on any legal cell on the board.  The constraints for placement are as follows:

 * You may place a pyramid of any valid size.

 * A pyramid of a given sized may only be placed if there was at least
   one corresponding pyramid one size larger placed earlier.  For
   example, a small may only be placed if at least one medium was
   previously placed.  Likewise, a medium may only be placed if at
   least one large was previously placed.
 
 * The pyramid may be placed on any unoccupied cell.
 
 * The pyramid may also be placed on top of another pyramid of the
   opposite color that is of a larger size.
 
If both players run out of pyramids before a connection across the board has been completed then the movement phase begins.

Movement phase
--------------

During the movement phase, players take turns moving pyramids of their color 
   