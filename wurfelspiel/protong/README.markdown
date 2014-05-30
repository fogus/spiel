Protong
-------

*Protong* is a dice game of pyramidal deconstruction for the [Das Spiel](http://boardgamegeek.com/boardgame/2229/spiel) game system.

*Protong* has much in common with Rummy games.

Setup of Protong
===================

*Protong* requires a [Das Spiel](http://boardgamegeek.com/boardgame/2229/spiel) set, either the [KOSMOS](http://boardgamegeek.com/boardgameversion/28556/german-third-edition) or [ABACUSSPIELE](http://boardgamegeek.com/boardgamepublisher/29/abacusspiele) version would do.  For a very quick game you could even use a [Spiel Mini](http://boardgamegeek.com/boardgame/110073/spiel-mini) set, or only use a segment of the larger Spiel base.

To set up the dice pyramid for play simply pour dice randomly onto the Spiel base, layer upon layer using different colored dice.  Finally, you should put a uniquely colored die, known as the *wild die*, at the apex of the pyramid.

![pyramid](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/protong/graphics/dice-pyramid.png)

The game consists of alternating turns where each player will take some number of dice from the pyramid.  The description of turns, taking, and scoring rules follow.

Turns in Protong
===================

On each turn in *Protong* a player may take a group of dice from the pyramid according to certain priciples.  The only commonality amongst any of the taking principles is that each must take at least one die from an edge.  That is, you cannot take dice from the middle of a side or and exposed inner side.  A graphical overview of legal takes is shown below:

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

During the course of play inner dice and dice on other faces will be exposed.  You can take these exposed dice if they create either a line or square when viewed straight on.  An exmaple of a 3D take is shown below:

 * Through the middle takes
 * Wild die, take, then put back -- can't move unless you take



![takes](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/protong/graphics/dice-layers.png)

![takes](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/protong/graphics/dice-layered-takes.png)


Scoring in Protong
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
 