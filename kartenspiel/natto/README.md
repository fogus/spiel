*Natto* is a climbing game played with Mah Jong style tiles for two players.

Preparation
===========

To play *Natto* the way that it's meant to be played (with lots of clacking), you'll need a set of the following Rum-Jong tiles:

![tiles](https://raw.githubusercontent.com/fogus/spiel/master/kartenspiel/natto/graphics/all-tiles.png)

You can also use a Mhing deck, Mah Jong tiles, or a standard deck (1-9 of three suits, 10s of missing suit for flowers, 2 sets of face cards for wilds).

The deal
========

Before shuffling, remove all of the wild cards and give each player a left, center, and right facing dragon.  The remaining tiles are placed face down on a surface and shuffled around.  Each player is dealt 13 tiles, with the remaining 5 left out and not shown to either player.

Ranks
=====

In *Natto* both the cards themselves and their suits are ranked.

## Tile ranks

The tile ranks are as follows:

![ranks](https://raw.githubusercontent.com/fogus/spiel/master/kartenspiel/natto/graphics/ranks.png)

That is, the tiles rank from lowest to highest as: flower, 1-9, flower, left facing dragon, center facing dragon, right facing dragon. That's right, the flower cards can be used as either a zero or a ten.

## Hierarchical suits

*Natto* suits are hierarchical:

![suits](https://raw.githubusercontent.com/fogus/spiel/master/kartenspiel/natto/graphics/ranked-suits.png)

That is, the square suit along with the right-facing dragon are the highest, the triangles along with the center-facing dragon are next, and finally the circles with the left-facing dragon are the lowest.  The flower cards do not have a suit per se, but instead take on the suit required to fulfill a sequence.

## Wild dragons

The dragon cards serve dual purposes, but the most immediate is that they are wild cards.  They can serve as any rank, including non-existent ranks above or below the flower cards.  Dragons may only serve as wild cards for their associated suits or as bombs, described next.

## Bombs

There are six bombs in *Natto, shown below:

![bombs](https://raw.githubusercontent.com/fogus/spiel/master/kartenspiel/natto/graphics/bombs.png)

When played, bombs beat any regular combination and any lower-ranked bomb.

Goal
====

The first player to exhaust their hand first in 3 rounds is the winner of the game.  You may also play to the best of 5, 7, 9, or even 777 rounds if you so desire.  It's your life.

Game-play
=========

Players attempt to win a number of tricks consisting of alternating turns playing special card combinations called sets, seqs, sums, tubes, or plates, each higher than the next.  When a combination starts a trick only combinations of the same type or bombs can be played in response.  Whenever a player cannot best a played combination the player who played the last combination wins the trick.  The player who won the last trick starts the next trick and so on until one player exhausts all of the cards in their hand.

## Sets

Sets are a group of 1-6 cards of the same rank including wild dragons.  A set can be bested by a set of the same size with a higher rank:

![sets](https://raw.githubusercontent.com/fogus/spiel/master/kartenspiel/natto/graphics/sets.png)

And as you see, a set can be beat by the same rank of a higher suit.

## Seqs

Seqs are groups of 2-6 cards of the same suit with increasing ranks.  A seq can be bested by another seq of the same size, with a higher starting rank (and of course, different suit):

![sets](https://raw.githubusercontent.com/fogus/spiel/master/kartenspiel/natto/graphics/seq1.png)

### Imaginary seqs

There is a special type of seq called an *imaginary seq* that starts with a flower card followed by some number of dragons.  An imaginary seq technically has no suit, so any and all of the dragons may participate in it.  However, an imaginary seq may be followed by one of the same logical seq.  In the case where dragons are used to represent the same logical seq, the one with the higher ranking dragons is best:

![sets](https://raw.githubusercontent.com/fogus/spiel/master/kartenspiel/natto/graphics/seq2.png)

## Sums

Sums are groups of 3-6 ranked tiles (no dragons) where all but one of the ranks are added together arithmetically to equal the final tile's rank:

![sums](https://raw.githubusercontent.com/fogus/spiel/master/kartenspiel/natto/graphics/sums.png)

As shown, sums are only bested by sums of the same size containing a higher ranked total, or the same total of a higher suit.

## Tubes

Tubes are groups of three consecutive pairs (with or without dragons) in natural order:

![tubes](https://raw.githubusercontent.com/fogus/spiel/master/kartenspiel/natto/graphics/tubes.png)

Only tubes with a higher starting pair beats another tube.

## Plates

Plates are similar to tubes except that they are groups of two consecutive triples (with or without dragons) in natural order.  Only plates with a higher starting triple beats another plate.

# Ending

Play continues like this until a player wins three (or the designated number) rounds.

# Variants

There are a few changes to the base game that are still a work in progress.

## Fewer bombs

Instead of six possible bombs, you can reduce the number to five by removing the double-flower bomb combination.

## Shared dragons

I've been toying around with a variant that uses shared dragon tiles.  That is, the available dragons available as wilds and bombs is shared by both players, but available only on a sliding scale.

First, place the dragons in a pile, each kind on top of the same kind:

![]()

*Natto* is is © 2014, Michael Fogus
