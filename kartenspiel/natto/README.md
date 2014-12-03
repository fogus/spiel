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

Bombs can be played *in response to* any legal tile combination, as long as it ranks higher than what's led. There are six bombs in *Natto*, shown below:

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

![seqs](https://raw.githubusercontent.com/fogus/spiel/master/kartenspiel/natto/graphics/seq1.png)

### Imaginary seqs

There is a special type of seq called an *imaginary seq* that starts with a flower card followed by some number of dragons.  An imaginary seq technically has no suit, so any and all of the dragons may participate in it.  However, an imaginary seq may be followed by one of the same logical seq.  In the case where dragons are used to represent the same logical seq, the one with the higher ranking dragons is best:

![iseqs](https://raw.githubusercontent.com/fogus/spiel/master/kartenspiel/natto/graphics/seq2.png)

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

## Widened sums

Instead of requiring that sums match their lengths, you could also play such that only the total need be the same.  This would mean that responding to a sum like 2+3=5 would not be restricted to three cards, but instead could expand to something like flower+1+1+3=5 (the flower being zero of course).  This would make playing sums (especially with high totals) a bit more precarious because it would open up the possibility of an opponent shedding more cards in response.  This variant has played fairly well, though it needs more play time.

## Shared dragons

I've been toying around with a variant that uses shared dragon tiles.  That is, the available dragons available as wilds and bombs is shared by both players, but available only on a sliding scale.  The sliding scale is stated simply as: a player may only play a dragon combination that is maximally one tile larger than their opponent's largest dragon combination played so far.  I'll explain this in more detail presently using an example situation between two players Andy and Kristin.  

First, place the dragons in a pile, each kind on top of the same kind:

![pile](https://raw.githubusercontent.com/fogus/spiel/master/kartenspiel/natto/graphics/shared-dragon-pile.png)

At the beginning of a round any one of the three dragons showing are available for use as wilds by either player.  When a round starts neither player had used any dragons, therefore, either player is able to use one at their leisure:

![pile1](https://raw.githubusercontent.com/fogus/spiel/master/kartenspiel/natto/graphics/shared-dragon-pile1.png)

Andy has chosen to take the center-facing dragon and use it as a wild.  Therefore, Kristin is able, if she so desires, to play a dragon combination of up to two tiles:

![pile2](https://raw.githubusercontent.com/fogus/spiel/master/kartenspiel/natto/graphics/shared-dragon-pile2.png)

Indeed, Kristin chose to play the left and right-facing dragons.  However, this move opened up an opportunity for Andy to play a dragon combination of up to three tiles.  Keep in mind that Andy may still play combinations of up to two tiles from the remaining three, but no larger.

Managing the shared dragons is a skill in itself and can lead to painful decisions at times.

## Stricter shared dragons

The sliding scale can also be stated more strictly as: a player may only play one more dragon combination then their opponent and the playable combinations are limited to those that are maximally one tile larger than their opponent's largest dragon combination played so far.  

In the example above between Andy and Kristin, this stricter wording would prohibit Andy from being able to play any more combinations unless Kristin decided to do so later.

# Design notes

The genesis of this game is wholly inspired by Haggis.  That is, I found myself in Japan for a vacation without a Haggis deck (shame on me) and had an incredible urge to play.  However, I did have a Jass deck on hand and tried to play with those with moderate success. I eventually got home and back to my Haggis deck and didn't think about it anymore.  However, one day thanks to a random question about small deck climbing games I was pointed, by Sean Ross nonetheless, to [Teech for Two]().  T42 is a 2-player climbing games by the inimitable Larry Levy using a truncated deck missing a suit and with two wild cards.  I liked it very much.

The second part of this story is more mundane and is inspired by the game Lectio, which I've never played.  Despite my having never played the game itself, I have long drooled over the look and feel of the Lectio tiles.  Sadly for the world, Lectio is out of print and the cost of a set is quite high.  However, I did come across a different tile-card game called Rum Jong that was much easier and cheaper to come by.  While Rum Jong is a fairly interesting distillation of Mah Jong (a long-ago favorite), the tiles themselves are much more interesting.  Therefore, armed with a love for Haggis and the rules for Teech for Two I truncated the Rum Jong set into a svelte, lovely, portable, and indestructible Natto set.

Of course, the available Rum Jong tiles are a bit different than the Haggis deck, so a straight-forward port of that gem was not satisfying.  Instead, the available mix of interesting tiles informed some rule changes away from both Haggis and Teech for Two to create something that I think is quite different.  Certainly, the use of the dragons is indicative of Haggis, and the three-suited cards are found in Teech for Two - that goes without saying.  However, since both of these games exist and I can play them any time, I've further moved Natto's rules away from both of them, mixing in interesting bits from other card games.  For example:

 * The combination limit of six is from Dou Dizhu
 * Plates and tubes are from [Guan Dan](http://www.pagat.com/climbing/guan_dan.html)
 * The three personal wilds are from Haggis, though the shared dragon variant is an adaptation of Battle Line's rules around tactics cards
 * The use of three suits and the simple scoring is from Teech for Two
 * The hierarchical suits are from Big Two and Tien Len
 * The low or high flowers are adapted from Guan Dan
 * The insane desire for clacking is from Lectio and Mah Jong

There are a couple of features in Natto that, as far as I know, are unique: sums and restricted wilds.  That is, I originally intended to allow cast-offs in certain combinations and in bombs to allow for the shedding of worthless cards.  However, I didn't like that if you were dealt a poor hand without the needed combos you were still stuck with poor cards.  Instead, I wanted a way that would allow shedding but be less luck driven and more a matter of weighing trade-offs.  So far sums have worked pretty well for that, though I need to play a bunch more games to be sure.  I do like the widened sums variant as it tends to be more vicious, but again this needs more play time.  The suit-restricted wild cards came about on a whim in an attempt to try and lengthen the duration, though not by too much, of each round.  So far it's played well, but only time and many more games will tell.

I hope you enjoy *Natto*.

*Natto* is is © 2014, Michael Fogus
