*Quux* is a simple orthogonal connection game of perfect information for two players.

Components
==========

 * A 4x4 square game board (drawing a picture is good)
 * Two mono-stashes of differing colors

Setup
=====

Each player gets a full stash of their chosen color.  The players choose which two opposite sides of the game board belongs to them before the play starts.

Goal
====

The first player to connect a line of pyramids of their color from their chosen side to the opposite side wins.  A line of pyramids can only be created via orthogonal connections of a player's colored pyramids resting at the top-most level of a cell. 

Game-play
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
 
 * The pyramid may be placed on top of another pyramid of the
   opposite color that is of a larger size.
 
If both players run out of pyramids before a connection across the board has been completed then the movement phase begins.

Movement phase
--------------

During the movement phase, players take turns moving pyramids of their color.  The constraints for the movement destination are as follows:

 * Pyramids may only move in one direction, any number of cells,
   orthogonally.
 
 * Pyramids may be chosen from any level in the pyramid piles, not 
   just the tops.  Any partial piles moved will move as a whole to
   the target location.

 * The pyramid(s) may be moved to any unoccupied cell.
 
 * The pyramid moved also come to rest on a pyramid of a larger size.

Play continues until one player makes a connection.

Variant: larger grids
=====================

*Quux* can be played on larger boards but bear in mind that you'll need N+1 pyramid trios for any board of size NxN.

*Quux* is &copy; 2014, Michael Fogus

