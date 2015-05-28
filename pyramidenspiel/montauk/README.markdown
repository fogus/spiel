*Montauk* is a pyramidal racing game for 2 players.

Preparation
===========

Materials needed:

 * 1 Treehouse set
 * A deck of playing cards
 * 4 Martian Coasters

Setup
-----

Using the Martian Coasters, arrange the board in the standard fashion:

![board](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/montauk/graphics/board.png)

From a treehouse set, give each player all of the pyramids of two colors (i.e. two trios each), corresponding to the colors on opposite corners.  In other words, one player gets the red and green pyramids and the other gets the yellow and blue.  Once the board is set up, build four mixed-color trees (no duplicate colors) and place them in the center squares of the colored regions that *do not* have the color as any of the pyramids in the tree.  In other words, the tree on the blue region cannot contain any blue pyramids, nor the red have red, and so on.

Next, shuffle all of the cards thouroughly and turn over the top card.  If the suit is red then the player with the red pyramids starts, else the other player does.  The over turned card is used to start a discard pile and the game is ready to begin.

Game-play
=========

Montauk is played with a standard 52-card deck where Ace to 6 and 7 to Queen are worth 1 to 6 points respectively.  The kings on the other hand are worth 0 points.

The point values of the cards are used to move the pyramids along the cells on the board.  The cost to move a pyramid is represented by its pips.  For example, a large pyramid costs 3-points to move it one cell and a 6 or a Queen may be used to move it up to 2 squares (each worth 6 points). 

### Movement constraints

Movement in Montauk occurs from one cell to another only if an arrow points from the starting cell to the destination cell.  Further, pyramids may only ever move in the direction that the arrows point.  Pyramids may move through or stop in a cell occupied by another pyramid only if the pyramid moving is the same size or smaller than the pyramid on which it will land.

The Deal
--------

The game is played over the course of 12 rounds.  At the start of each round six cards are dealt to each player.  The player with the fewest points overall goes first in each round, in the result of a tie, the player who went in the previous round starts.  Each round consists of six tricks.  The steps that occur for each trick are as follows:

 1. Foreplacing
 2. Response and reveal
 3. Trick resolution and conditional over-drawing
 4. Movement point calulation
 5. Piece movement
 6. Points award

Steps 1-6 are repeated six times, after which the round will be scored.  Details of the steps in each round are found below. 

Foreplacing 
-----------

The leading player chooses a card from their hand and places it *face down* in front of them.  Once a card is laid it may not be taken back.

Response and reveal
--------------------

Once a card is forplaced, the other player chooses a card from their hand and places it *face up* in front of them.  The leading player then turns their card over and the result of the trick is determined.

Tricks
------

When the cards are turned over, the suits are used to determine the player who won the trick.  The suits are ranked according to the typical Bridge rankings except that clubs always beat spades, as shown below:

![suit ranks](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/montauk/graphics/suit-ranks.png)

The player with the high ranking suit wins the trick and can move their pyramids according to the ranks showing on the two cards.  If the trick consists of two cards that are identical then the player who followed the lead wins the trick.

Certain suit and rank matches allow the trick winner to draw extra cards according to the following guidelines.

Conditional overdrawing
-----------------------

If neither the suit nor the rank of the cards played to the trick match then the winning player may not draw extra cards.  However, certain conditions enable the winner to draw extra cards, as outlined in the table below:

 Original Trick Cards     |  Draw        |
 :----------------------: | :----------: |
  Suit & rank don't match |     None     |
  Suits match             | Draw 1 extra |
  Suits match             | Draw 1 extra |
  Suits match             | Draw 1 extra | 
  Ranks match             | Draw 1 extra |
  Same exact cards        | Draw 1 extra |

After the trick, the wining player should have 2 or 3 cards to use for movement.  The precise ways to spend the cards are described next.

Movement point calulation
-------------------------

The ranks on the trick cards and overdraws provide the base points used for moving the pyramids.  However, depending on the makeup of the cards won and drawn these cards may be spent on movement multiple times over.  The following table describes how many times these cards may be spent:

 Trick winner and loser   |  Extra card                   | Rank points                              |
 :----------------------: | :---------------------------: | :--------------------------------------: |
  Suit & rank don't match |  -                            | Trick winner, Trick loser                |
  Suits match             |  No match                     | Trick winner, Trick loser, extra         |
  Suits match             |  Suit or rank of trick winner | Extra four times                         |
  Suits match             |  Same as trick winner         | Extra six times                          |
  Ranks match             |  Matches as above             | Trick winner four times, extra as above  |
  Same exact cards        |  Anything                     | Trick winner six times, extra four times |


The trick winner may choose the order of the ranks spent and to which pyramids they may be applied.  Movement is described next.

TODO: example(s)

Piece movement
--------------

Points from any given card must be spent to move a single pyramid.  That is, the rank points for a card cannot be divided amongst multiple pyramids nor can "change" be saved.  That said, if redraws allow a single card to be spent multiple times then it can be used as if there were multiple cards.  The only limitations on movement are as follows:

 - Pyramids may only move from one cell to another if there is an arrow pointing into the destination cell
 - If a pyramid has other pyramids on top if it then it must *dig* its way to the top before moving
 - The cost of a complete dig is the total number of pips on top of the pyramid, partial digs are allowed

Points award
------------

At the end of your turn you may score points in the following ways, but only once per round:

 - Score 11 points for any of your single-color trees in the center square of the same colored region
 - Score 7 points for any of your single-color trees anywhere in the same colored region
 - Score 7 points for any of your multi-color trees in the center square of your region of the majority color
 - Score 5 points for any of your multi-color trees in the center square of any of your regions
 - Score 3 points for any of your multi-color trees anywhere in your region of the majority color

 Additionally, you may score 1-point for each pyramid anywhere in the same colored region, for as many turns as you're able to acheive it.

Round scoring
=============

TODO

Penalties
---------

Based on certain circumstances in the game, players may receive black pyramids in their vaults.  The two circumstances are as follows.

### Inability to bear off

If a player wins a trick and cannot bear off any of their pyramids then they will receive a black pyramid as a penalty instead.  However, they will still lead the next trick.

### Failure to win tricks when behind

If one player is able to fill the three slots in their vault then the player is under pressure to do the same.  Indeed, once a player fills their vault then the other player must win the remaining tricks.  If they're unable to do so then they will receive a black pyramid each time that that fail to win a trick.


Design notes
============

Montauk is an adaptation of the wonderful game Marrakesh by Prince Joli Quentin Kansil to the Icehouse game system.


*Montauk* is &copy;2015, Michael Fogus

