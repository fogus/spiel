*Niwa* is a tile-laying, area-control game using [Hanafuda](http://www.pagat.com/class/flower.html) cards for 2-players.

Preparation
===========

 * A Hanafuda deck
 * A set of Go stones

Shuffle the Hanafuda cards and deal three cards to each player.  Each player gets all of the stones of a single color.

Game-play
========

Play alternates between players with the player using the black stones starting the game.  On each turn, players perform the following actions:

 * Place a card with a stone on top
 * Replace any converted stones
 * Draw a card

Placement rules
----------------

Cards can be placed either orthogonal or diagonal to existing cards. Players may place any desired card from their hand, but if it can be placed orthogonal then it must.  Cards are placed according to the following constraints:

* Cards that match by month can be placed orthogonal
* Cards with ribbons can be placed orthogonal to ribbon cards
* Cards with creatures can be placed orthogonal to creature cards
* Otherwise place cards corner-wise to any one or more existing cards

### Two-edge placements

In the case of two cards that form an L-shaped edge, it's not necessary to match all features in order to place there:

<img src="https://raw.githubusercontent.com/fogus/spiel/master/brettspiel/niwa/graphics/corner-placement.png" width="20%" height="20%">

In the case above, any of an animal, October, or November card may be placed in either corner.

### Majority-edge placements

A circumstance may arise where cards placed may create gaps with more matching features than others.  In these circumstances, cards can be placed according to the majority feature:

<img src="https://raw.githubusercontent.com/fogus/spiel/master/brettspiel/niwa/graphics/majority-possible-placement.png" width="33%" height="33%">

In the case above, the animal feature has the majority and therefore only an animal card can be placed in the gap.

Converting
----------

Conversions occur when a player places a card that results in stones occupying both sides of a line of their opponent's stones.  For example:

<img src="https://raw.githubusercontent.com/fogus/spiel/master/brettspiel/niwa/graphics/majority-placement.png" width="33%" height="33%">

An animal card placed in the gap causes the conversion of the black stone below.

End
----

Play continues until each player has only two cards.  These final cards can only be placed if by doing so they result in conversions.

Scoring
-------

The player with the most stones residing in continuous groups of at least 2 wins the game.  In the case of a tie, the player with stones on the fewest groups wins.  In the case of yet another tie, both players may celebrate.

No luck variant (WiP)
=====================

One player gets the Spring and Summer (March - August) months, while the other gets the Autumn and Winter (September - Febrauary) months.  All cards are placed face up on front of the respective players to start.  The game is played exactly as described above, but without drawing cards on each turn.
