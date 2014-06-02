Ozymandias
-------

*Ozymandias* is a dice game of pyramidal deconstruction for the [Das Spiel](http://boardgamegeek.com/boardgame/2229/spiel) game system.

*Ozymandias* has much in common with Rummy games.

Setup of Ozymandias
===================

*Ozymandias* requires a [Das Spiel](http://boardgamegeek.com/boardgame/2229/spiel) set, either the [KOSMOS](http://boardgamegeek.com/boardgameversion/28556/german-third-edition) or [ABACUSSPIELE](http://boardgamegeek.com/boardgamepublisher/29/abacusspiele) version would do.  For a very quick game you could even use a [Spiel Mini](http://boardgamegeek.com/boardgame/110073/spiel-mini) set, or only use a segment of the larger Spiel base.

To set up the dice pyramid for play simply pour dice randomly onto the Spiel base, layer upon layer using different colored dice.  Finally, you should put a uniquely colored die, known as the *wild die*, at the apex of the pyramid.

![pyramid](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/protong/graphics/dice-pyramid.png)

The game consists of alternating turns where each player will take some number of dice from the pyramid and place them exactly as taken into their vault for end of game scoring.  The description of turns, taking, and scoring rules follow next.

Turns in Ozymandias
===================

On each turn in *Ozymandias* a player may take a group of dice from the pyramid according to certain principles.  The only commonality in any of the taking principles is that each must take at least one die from an edge.  That is, you cannot take dice from the middle of a side or and exposed inner side.  A graphical overview of legal takes is shown below:

![takes](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/protong/graphics/dice-takes.png)

More details of the principles for taking are described next.

Line takes
-----------

A player can take a group of dice in a single-file line either all along an edge or starting at an edge and cutting inward.

Square takes
------------

Squares of any size can be taken as long as part of the square comprises an edge segment.  You'll rarely see squares larger than four taken, but it's legal to take a square of any size.

3D takes
--------

During the course of play inner dice and dice on other faces will be exposed.  The image below shows the same pyramid as in the setup image above, except a group of 1, 2, and 3 pip dice have been removed.  The gold die has thus fallen lower in the pyramid:

![takes](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/protong/graphics/dice-layers.png)

You can take these exposed dice if they create either a line or square when viewed straight on.  An example of a 3D take in a line is shown below:

![takes](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/protong/graphics/dice-layered-takes.png)

3D takes are a powerful technique for manipulating multiple pyramid faces at once.

Wild takes
----------

The gold die serves as a wild color die.  The number shown on the gold die must be a legal number for a take, but once taken it can be scored as any color.  Additionally, when you take the gold die you must place it back into the pyramid replacing a die of the same number and color as what the wild die is scored as.

Ending the game
---------------

The players will continue to take dice from the pyramid until one of the following conditions occur:

 1. Both players take negative points on successive turns
 2. All of the dice have been removed from the pyramid

Once either of these conditions occur then scoring commences.


Scoring in Ozymandias
=====================

 Set category                    | Point value
 :-------------------------------|:----------:
 Run                             |  2 * colors
 Three of a kind                 |  3 * colors
 Four of a kind                  |  4 * colors
 Additive set (e.g. 4=1+3)       | (5 + count) * colors
 Multiplicative set (e.g. 3=1*3) | (6 + count) * colors
                                 |
 Single die                      | -5
 Double dice                     | -10

The scoring can be layered.  That is, certain combinations fall into more than category, but the color multiplier is applied only once.  The table below shows scoring on a few interesting sets:

 Set                        | Categories                         | Score
 :--------------------------|:-----------------------------------|:----:
 ⚁  ⚂  ⚃                    | Run, all green                     | 2
 ⚁  ⚂  ⚃                    | Run, red/green                     | 6
 ⚁  ⚁  ⚁                    | Three of a kind, all green         | 3
 ⚁  ⚁  ⚁  ⚁                 | Four of a kind, r/g/b/black        | 16
 ⚀  ⚁  ⚂  ⚅                 | Multiplicative, additive, r/g/b    | 57
 ⚀  ⚀  ⚀  ⚀  ⚀  ⚀  ⚅        | Additive, all green                | 13
 ⚀  ⚀  ⚀  ⚀  ⚀  ⚀  ⚅        | Additive, r/g/b/black              | 52
 ⚀  ⚀  ⚀  ⚀  ⚀  ⚀  ⚀  ⚅  ⚅  | Multiplicative, r/g/b/black        | 60

As you can see, some combinations, especially those spanning multiple categories are worth a lot of points.

Credits
=======

 * [Reinhold Wittig](http://www.perlhuhn.de/) is the designer of Das Spiel.
 