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

Details of these steps are found below. 

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

The player with the high ranking suit wins the trick and can move their pyramids according to the ranks showing on the two cards.  However, certain suit and rank matches allow the trick winner to draw extra cards according to the following guidelines.

Bearing off
-----------

Based on the cards won in the trick, players may spend the value on their ranks according to the following guidelines.

### Cards of differing suits (spend 2)

When the trick consists of two cards of differing suits then the winning player may move two pyramids, each according to the ranks of the cards.  The winning player may choose the order of the ranks spent and to which pyramids they may be applied.

### Cards of the same suit, with an extra draw of a different suit (spend 3)

When a trick consists of cards of the same suit, then the player who played the face-up card wins the trick.  After spending their ranks, the winning player draws an extra card from the draw deck.  If the card is a different suit of those played previously then the player spends the extra card's rank just once.

### Cards of the same suit, with an extra draw of the same suit *or* rank (spend 6)

Again, when a trick is won with a card of the same suit then an extra card is drawn after the trick cards are spent.  If the drawn card matches either the suit or the rank of the card that won the trick then its rank can be spent four times.

### Cards of the same suit, with an extra draw of the same exact card (spend 8)

If the extra drawn card is exactly the same as the card that won the trick then its rank can be spent six times.

### Cards of the same rank (spend 5 - 10)

When a trick consists of two cards of the same rank then the suit decides the winner, who then spends the rank played four times.  In addition, the winner draws an extra card and spends it either 1, 4, or 6 times depending on the suit and ranks matches as described above.

### Exact same cards (10 plays)

When a trick consists of the same exact cards then the player who played the face-up card wins the trick.  The winner may then spend the rank six times.  After this, the player draws an extra card and plays it four times regardless of the suit or rank match.

Penalties
---------

Based on certain circumstances in the game, players may receive black pyramids in their vaults.  The two circumstances are as follows.

### Inability to bear off

If a player wins a trick and cannot bear off any of their pyramids then they will receive a black pyramid as a penalty instead.  However, they will still lead the next trick.

### Failure to win tricks when behind

If one player is able to fill the three slots in their vault then the player is under pressure to do the same.  Indeed, once a player fills their vault then the other player must win the remaining tricks.  If they're unable to do so then they will receive a black pyramid each time that that fail to win a trick.

Round scoring
=============

TODO

Design notes
============

Montauk is an adaptation of the wonderful game Marrakesh by Prince Joli Quentin Kansil to the Icehouse game system.


*Montauk* is &copy;2015, Michael Fogus

