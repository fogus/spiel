Ozymandias
-------

*Ozymandias* is a dice game of pyramidal deconstruction for one or two players.

> I met a traveller from an antique land
> Who said: "Two vast and trunkless legs of stone
> Stand in the desert. Near them on the sand,
> Half sunk, a shattered visage lies, whose frown
> And wrinkled lip and sneer of cold command
> Tell that its sculptor well those passions read
> Which yet survive, stamped on these lifeless things,
> The hand that mocked them and the heart that fed.
> And on the pedestal these words appear:
> 'My name is Ozymandias, King of Kings:
> Look on my works, ye mighty, and despair!'
> Nothing beside remains. Round the decay
> Of that colossal wreck, boundless and bare,
> The lone and level sands stretch far away". 

*Ozymandias* has much in common with Rummy games.

Setup of Ozymandias
===================

*Ozymandias* requires a [Das Spiel](http://boardgamegeek.com/boardgame/2229/spiel) set designed by [Reinhold Wittig](http://www.perlhuhn.de/).  Either of the [KOSMOS](http://boardgamegeek.com/boardgameversion/28556/german-third-edition) or  [ABACUSSPIELE](http://boardgamegeek.com/boardgamepublisher/29/abacusspiele) versions will suffice.  For a very quick game you could even use a [Spiel Mini](http://boardgamegeek.com/boardgame/110073/spiel-mini) set, or only use a segment of the larger Spiel base.

To set up the dice pyramid for play simply pour dice randomly onto the Spiel base, layer upon layer using different colored dice.  Finally, you should put a uniquely colored die, known as the *wild die*, at the apex of the pyramid.

![pyramid](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/ozymandias/graphics/dice-pyramid.png)

The game consists of alternating turns consisting of two *takes*, except for the starting player who performs only a single take. A "take" is the act of removing some number of dice from the pyramid and scoring them according to their original orientation in the dice pyramid.

The description of turns, taking, and scoring rules follow next.

Turns in Ozymandias
===================

A player may take a group of dice from the pyramid according to certain principles.  The only commonality in any of the taking principles is that each must take at least one die from an edge.  That is, you cannot take dice from the middle of a side or and exposed inner side.  A graphical overview of legal takes is shown below:

![takes](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/ozymandias/graphics/dice-takes.png)

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

![takes](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/ozymandias/graphics/dice-layers.png)

You can take these exposed dice if they create either a line or square when viewed straight on.  An example of a 3D take in a line is shown below:

![takes](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/ozymandias/graphics/dice-layered-takes.png)

3D takes are a powerful technique for manipulating multiple pyramid faces at once.

Wild takes
----------

The gold die serves as a wild color die.  The number shown on the gold die must be a legal number for a take, but once taken it can be scored as any color.  Additionally, when you take the gold die you must place it back anywhere in the pyramid replacing a visible die of the same number and color as what the wild die was scored as.

Ending the game
---------------

The players will continue to take dice from the pyramid until one of the following conditions occur:

 1. Both players take negative points on successive turns, or...
 2. All of the dice have been removed from the pyramid

Once either of these conditions occur then scoring commences.

Scoring in Ozymandias
=====================

 Set category                    | Point value
 :-------------------------------|:----------:
 Run of three or more            |  Number of dice taken * unique colors
 Three of a kind                 |  3 * unique colors
 Four of a kind                  |  4 * unique colors
 Additive set (e.g. 4=1+3)       | (5 + count) * unique colors
 Multiplicative set (e.g. 3=1*3) | (6 + count) * unique colors
                                 |
 Two of a kind                   | 2
 Single die                      | -10

The scoring can be layered.  That is, certain combinations fall into more than category, but the color multiplier is applied only once.  The table below shows scoring on a few interesting sets:

 Set                        | Categories                         | Score
 :--------------------------|:-----------------------------------|:----:
 ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-2-green.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-3-green.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-4-green.png)                    | Run, all green                     | 3
 ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-2-red.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-3-green.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-4-green.png)                    | Run, red/green                     | 6
 ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-2-green.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-2-green.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-2-green.png)                    | Three of a kind, all green         | 3
 ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-2-red.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-2-green.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-2-blue.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-2-black.png)                 | Four of a kind, r/g/b/black        | 16
 ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-1-red.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-2-red.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-3-green.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-6-blue.png)                 | Multiplicative, additive, r/g/b    | 57
 ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-1-green.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-1-green.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-1-green.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-1-green.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-1-green.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-1-green.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-6-green.png)                 | Additive, all green                | 12
 ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-1-red.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-1-red.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-1-green.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-1-green.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-1-blue.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-1-black.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-6-green.png)        | Additive, r/g/b/black              | 48
 ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-1-red.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-1-black.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-1-black.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-1-green.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-1-blue.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-1-blue.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-6-red.png) ![d62](https://raw.githubusercontent.com/fogus/spiel/master/wurfelspiel/graphics/d6-6-green.png)                 | Multiplicative, r/g/b/black        | 56

As you can see, some combinations, especially those spanning multiple categories are worth a lot of points.

Using a Spiel Mini set
----------------------

If you decide to use a [Spiel Mini](http://boardgamegeek.com/boardgame/110073/spiel-mini) set then colored layers and the wild die will not be scoring options unless you happen to have extra, differently colored dice to use for your pyramid.

Solitaire play
--------------

You can also play *Ozymandias* solitaire without changing any of the scoring rules.  However, rather than taking from any location at all you should take from a side, then rotate and take, repeating until the endgame conditions are triggered.  Rebuild and try to beat your high-score.

