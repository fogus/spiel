*Toripoka* is a set-collecting, bluffing card game based loosely on Three Card Poker, for 2 players.  The game takes place over a series of rounds, each played to determine the winner of one or both of the pyramids available for capture.  Pyramids are captured by players building the best possible three-card Poker hands given three lain cards and two exposed public cards.  The player who captures the most points when the pyramids run out wins the game.

Setup
=====

*Toripoka* is played with a truncated card deck of playing cards. In addition, a [Treehouse set](http://www.looneylabs.com/rules/treehouse) is hidden in some sort of opaque bag.

The *Toripoka* deck
-------------------

As mentioned, the *Toripoka* deck contains only 17 cards consisting of 13 standard playing cards (of the hearts suit) and 4 wild cards (4, 7, 10, and King of spades).

![the-deck](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/toripoka/graphics/the-deck.png)

The suit of the wild cards is unimportant and as a result the cards should be considered a single suit. 

The Ace
-------

The Aces in *Toripoka* can be used in a hand as either a low-card (a 1) or a high-card, but not both at the same time.  The Ace as a high card can never be substituted for using a wild card.  However, with the use of a wild card and an Ace a hand could be considered having both a low and a high Ace.  

Wild cards
----------

The rank of the wild cards describe how they're constrained in standing in for any given card in a hand.  That is, in *Toripoka* the ranks determine the range of cards that a wild card can stand in for.  That is, the rank of a wild card says that it can stand in for any other card of that rank or lower.  For example, the 4-wild can only stand in for the 4, 3, 2, and low-Ace, but the King-wild can stand in for every card except the high-Ace.

Game-play
========

To start, the deck is shuffled and three cards placed aside face down.  Next, each player is dealt three cards and each player pulls one pyramid each, of their preferred size from the bag.  These pyramids are placed on the table between the two players.  Finally, two cards are drawn and placed face up between the pyramids, first left then right.  These cards will be available to both players for use in building the best possible three-card hands at the adjacent pyramid.

Play alternates between the players.  On each player's first turn they choose one of their cards and place it face up in front of either of the displayed pyramids and then draw the top card from the stock. On each subsequent turn each player plays one of their cards adjacent to a pyramid but may choose to play their cards face-down.  Additionally any played cards can be placed with a pyramid on top of them to manipulate the rank of the card played (more will be said about this below).  At any time before either player's final card is placed, either player can fold one of their hands, taking all of the placed pyramids on either of the played hands at the adjacent pyramid.

Play continues in this manner until the stock is exhausted, leaving each player with three remaining cards in their hand.  Play continues until all cards have been placed.  Once complete, the hands are revealed and ranks adjusted and the players collect their winnings based on the following rankings of possible hands:

Name | Example 
 :---: | :---
 Mini Royal | ![mini-royal](http://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/toripoka/graphics/mini-royal-no-wilds.png)
 Straight (no wilds) | ![straight-nw](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/toripoka/graphics/straight-no-wilds.png)
 Mini Royal (with wilds) | ![mini-royal-ww](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/toripoka/graphics/mini-royal-with-wilds.png)
 Three of a kind | ![3oak](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/toripoka/graphics/three-of-a-kind.png)
 Straight (with wilds) | ![straight-ww](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/toripoka/graphics/straight-with-wilds.png)
 Two of a kind | ![2oak](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/toripoka/graphics/two-of-a-kind.png)
 Multiplication | ![mult](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/toripoka/graphics/multiplication.png)
 Sum | ![sum](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/toripoka/graphics/addition.png)
 High card | ![mini-royal-ww](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/toripoka/graphics/high-card.png)

Play continues until there are no more pyramids available to fill both bidding slots.

Hand fitting
------------

Occasionally, a situation will occur where a hand is effectively the same:

![fits](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/toripoka/graphics/fits.png)

That is, the three hands above all represent a straight from 2-3.  However, one hand is an *exact fit*, one is a *tight fit*, and the other is a *loose fit*.  When determining which hand wins a pyramid *fitness* will determine the winner.  A hand that is closer to an exact fit will always beat a looser hand.


Placing pyramids
----------------

After the first card, players can use any previously captured pyramids to adjust the ranks of non-wild cards up to the number of pips.  These pyramids are placed on cards as they are played and cannot be removed thereafter.  Additionally, pyramids cannot be used to adjust the rank of any wild cards, although they can be placed on them all the same.  For example, a 2-pip pyramid placed on an 8 can be used to adjust it to a 6, 7, 9, or 10.  Any pyramids placed are then removed from the game and not available for bidding.

Final scoring
=============

When the game ends group and score your won pyramids according to the following:

 * 7 points for each solid-color tree without black pieces
 * 5 points for each mixed-color tree without black pieces
 * 1 point for each of the rest of your pieces
 * negative points of value for any black pieces or trees

The player with the most points wins.  In the result of a tie, the player with the fewest pyramids wins.  Again, if there's still a tie then the player with the fewest distinct colors wins.  If there is still a tie then both players win.

Design Notes
============

TODO

