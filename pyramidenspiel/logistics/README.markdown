*Logistics* is a game of pyramid transportation and capture using a  Mancala-like movement and capture mechanism for 2 players.

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

In *Logistics* players always play on the cards laid out in front of them and will only ever play on their opponent's play area if a capture power dictates that they can.  Additionally, play occurs from left to right, again unless a capture power dictates otherwise.

On each player's first turn they may take up to four pyramids of any size and *sow* them onto their playing area, each on a separate card starting from the left-most and proceeding to the right.  On subsequent turns, a player may play from his reserve up to four pyramids or all of the pyramids on a card in the playing area on their side.  When placing a pyramid on a card already containing pyramids then it's stacked on top of those in place.  Likewise, if the pyramids on a card are sown then they are done so from the top of the stack to the bottom.

Sowing into the vault
---------------------

The last pyramid in a sowing action starting on the playing area that lands in the player's vault is out of play.  When this occurs then the player may choose to sow another set from their stock or from an occupied card.  The pyramids on a card may only be sown into the vault if the number of pyramids is less than or equal to the number of cards needed to reach it.

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

A stack of pyramids either alone or on the top of an existing stack consisting of a small on a medium on a large is known as a *tree*.  Trees can be any mix of colors, as shown below:

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
* 1 point for each of the rest of the pieces

The player with the highest score wins.

Example
=======

The fragment of a game below is meant to give a better idea of how pyramids are moved around the playing area from the stock and into the vault.  The sequence of plays are not meant to be optimal but are merely illustrative.

Player A chooses a small red, medium blue, and a small blue from the stock and sows them.

![s1](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/logistics/graphics/step1.png)

Player B chooses a small black, small red, and a small yellow from the stock and sows them, capturing Player A's medium red.  Player B then uses the yellow capture power to move Player A's small blue back into the stock. 

![s1](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/logistics/graphics/step2.png)

Player A then chooses a small blue, small green, small yellow, and another small yellow from the stock and sows them, capturing Player B's small black.  Player A then uses the yellow capture power to move her own small blue one card forward on top of the small red.

![s1](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/logistics/graphics/step3.png)

Player B chooses a small black, small green, small blue, and a small yellow from the stock and sows them, capturing Player A's small red.  Player B then uses the yellow capture power to move his own small black one card forward on top of the small green and small red.

![s1](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/logistics/graphics/step4.png)

Player A then chooses a small black, medium yellow, and a medium green from the stock and sows them.

![s1](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/logistics/graphics/step5.png)

Player B then takes the small yellow from the last card and sows it forward into the vault.  This gives Player B another turn.

![s1](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/logistics/graphics/step6.png)

Player B then takes the stack from the 3rd card and sows the small blue onto the last card and the small yellow into the vault.  This gives player B another turn.

![s1](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/logistics/graphics/step7.png)

Player B then takes the small blue from the last card and sows it forward into the vault.  This gives Player B another turn.

![s1](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/logistics/graphics/step8.png)

Player B then takes the stack from the 2nd card and sows the small black to the 3rd card, the small green to the last card, and the small red into the vault.  This gives Player B another turn.

![s1](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/logistics/graphics/step9.png)

At this point you should have a good idea how pyramids are sown from the stock into the play area and from the play area into the vault.  Additionally, you should see how setting up certain configurations can result in useful captures and extra turns.  At this point Player B has only one more extra play.  Do you see what it is?

Design Notes
============

*Logistics* is inspired by the great Manacala game [Cups](http://boardgamegeek.com/boardgame/19916/cups) designed by Wald and Arthur Amberstone.  Additionally, the scoring scheme is taken from the pyramid game [Volcano](http://www.wunderland.com/WTS/Kristin/Games/Volcano.html) designed by the amazing [Kristin Looney](http://wunderland.com/WTS/Kristin/Kristin.html).

