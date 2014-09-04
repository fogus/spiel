*Logistics* is a game of pyramid transportation and capture using a  movement and capture mechanism inspired by Mancala for 2 players.

Preparation
===========

You'll need the following materials to play *Logistics*:

 * 8-10 playing cards (suit doesn't matter) or index cards.
 * 1 [IceDice set](http://www.looneylabs.com/games/icedice) per player (i.e. 4 [Treehouse sets](http://www.looneylabs.com/games/treehouse) total)
 
For a short game, the cards should be laid out in a 2x3 grid with a card to each player's right turned to the side known as the *vault*.  For the longer game the cards should be in a 2x4 grid, also with a turned card to the right serving as the vault.  The layout for the long game is as follows:

![setup](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/logistics/graphics/setup.png)

The playing area is initially empty save for the cards in the playing area.  Each player takes their 30 pyramids and keeps them close at hand; this is known as the *stock*.

*note: You may also use larger layouts for even longer games.  Indeed, you can build a grid of up to 2x10, but you need an extra Treehouse set per player to facilitate a game of this size.*

Goal
====

The player with the most valuable set of captured and transported pyramids wins the game.  See the scoring section below to learn how to calculate the final score.

Gameplay
========

On each player's first turn they may take up to four pyramids of any size and *sow* them onto their playing area, each on a separate card.  On subsequent turns, a player may play from his reserve up to four pyramids or all of the pyramids on a card in the playing area on their side.  When placing a pyramid on a card already containing pyramids then it's stacked on top of those in place.

If the last pyramid in a sowing action lands in the player's vault then they may choose to sow another set from their stock or from an occupied card, or instead pass.  The pyramids on a card may only be sown into the vault if the number of pyramids is less than or equal to the number of cards needed to reach it.  Finally, if the pyramids on a card are sown then they are done so in order from the top of the stack to the bottom.

Capture
-------

If the last pyramid in a sowing action lands on an empty card that is opposite from an occupied opponent card then all of the opponent's occupying pyramids are captured.  However, capturing can be prevented by the existence of certain pyramidal structures, described next.

Making a capture ends a player's turn, save for the special action triggered by it.  

### Capture powers

Capturing pyramids not only brings pyramids into a player's vault for final scoring, it also provide certain additional turn actions.  Depending on the color of the pyramid used to capture, certain actions will be available to the capturing player:

 * **Green or Cyan** - take any piece out of any vault and 
   place it into the respective stock
 * **Yellow or Clear** - move any top pyramid back into the
   respective stock
 * **Red or Orange** - move any top piece one card forward
 * **Blue or Purple** - swap any two pieces on your play area
 * **Black or White** - swap any two pieces on your opponent's 
   play area
 
The special actions are taken immediately after the captured pieces are placed into the capturing player's vault.

### Guarding capture

A stack of pyramids either alone or on the top of an existing stack consisting of a small on a medium on a large is known as a *tree*.  trees can be any mix of colors, as shown below:

![tree](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/logistics/graphics/trees.png)

A tree is handled differently than other pyramidal structures.  First, when a tree is on a card then it and all of the pyramids on it the same card are guarded from capture (with an exception, described next).  Also, when a player sows the pyramids on a card containing a tree then the tree is sown as a single piece.  

Trees can also capture if they land on an empty card opposing an opponent's pyramids and will allow a player to continue playing if sown into their vault.

### Unstoppable captures

While a tree will prevent capture of itself and the pyramids occupying the same card, it is not entirely immune from capture.  That is, if a large pyramid is sown onto a preexisting stack capped by a medium on top of a small then a *nest* is created.  Like trees, nests too can be any mix of colors:

![nest](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/logistics/graphics/nest.png)

If a nest is created opposite of an opponent's card containing a tree then the tree and all of its guarded pyramids are captured in one fell swoop.  Nests cannot move as a single unit like trees, instead they're considered a regular stack for the purposes of sowing.

Ending the game
---------------

The game ends when there are no more legal sows.  If one player can no longer sow then the other may continue sowing until they too have run out of legal moves.

Final scoring
=============

When the game ends the pyramids in the players' vaults are score according to the following:

* 7 points for each solid-color tree
* 5 points for each mixed-color tree
* 1 point for each of the rest of your pieces

The player with the highest score wins.

Design Notes
============

TODO

