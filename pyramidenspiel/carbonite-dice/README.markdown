CarboniteDice
-------------

CarboniteDice is a push-your-luck dice game which is a variant of [IceDice](http://www.looneylabs.com/games/icedice) meant for Solo play.  CarboniteDice adopts the scoring of [Volcano](http://www.wunderland.com/WTS/Kristin/Games/Volcano.html) (both by [Looney Labs](http://www.looneylabs.com)), with the base mechanics of IceDice. 

Setup of CarboniteDice
======================

The setup of CarboniteDice is similar to setup of IceDice, with the removal of all but one Vault and the addition of a Turn Marker and a Carbonite Chamber.

![Setup](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/carbonite-dice/graphics/cd-setup.jpg)

The rules of play are as follows.

Turns in CarboniteDice
======================

You have 10 turns in CarboniteDice to get the highest score possible.  Each turn consists of the following steps:

1. Marking the current turn
2. Rolling for pyramids results in one of the following:
    * Matching pyramids from the Bank
	* Matching pyramids from your Vault
	* Bombing out of a turn
3. Stashing pyramids into your Vault (if possible)

### Marking the current turn number

Take the next largest pyramid from the Bank for use in representing the current turn and return a smaller pyramid from the Turn Markers.  You can choose any colors that you want to use as the Turn Markers, but you *must* increase the sizes as the turn number grows larger. Any pyramids in use for the Turn Markers are *not* available for capturing during the turn that they're in use.

If at any time you need a certain size for a Turn Marker and there is not one of that size in the Bank then the game ends immediately.

The pyramids needed for each round are shown below:

1.  1-small
2.  1-medium
3.  1-large
4.  1-large and 1-small
5.  1-large and 1-medium
6.  2-large
7.  2-large and 1-small
8.  2-large and 1-medium
9.  3-large
10. 3-large and 1-small

### Matching pyramids

On each turn you roll the IceDice dice at least once in an attempt to match colored pyramids from the Bank for the purpose of capturing them and scoring them at the end.  The matching rules for CarboniteDice are the same as IceDice and is summarized below:

![IceDice](http://www.looneylabs.com/sites/default/files/IceDice2.jpg)

The differences in the rules between CarboniteDice and IceDice mostly revolve around what happens when you're unable to match a colored pyramid or if you bomb out.

### Bombing out

If you roll the same color as what you already have in the Counter then you *must* remove the sized pyramids shown on the IceDice dice and place them in the Carbonite Chamber.  Pyramids in the Carbonite Chamber cannot be accessed again for the remainder of the game.  

> For example, if you have a red pyramid in the Counter and 
> the roll of your IceDice dice shows a red spot with a small 
> and a medium pyramid face then you *must* remove a small red 
> *and* a medium red from the bank for the remainder of the game.

If at any point you bomb out and cannot remove a colored pyramid from the Bank or the Counter as retribution then the game immediately ends.

### Unable to match pyramids

If you're unable to take a colored pyramid of the specified size from the Bank then you *must* take it from your Vault and add it to the Counter.  If this happens then you (may not want to but you) *must* roll the dice at least one more time.  If you bust out on any subsequent rolls then all of the pyramids, include those taken from your Vault are either returned to the Bank or removed from the game.

If at any point you cannot match a colored pyramid from the Bank *and* from your Vault then the game immediately ends.

### Ending the game

After ten turns, or the game ends prematurely, calculate your score.

Scoring in CarboniteDice
========================

When the game ends look at the pyramids in your Vault and score according to the following:

* 7 points for each solid-color tree
* 5 points for each mixed-color tree
* 1 point for each of the rest of your pieces

To start scoring, just add up all of the scores of the pyramids according to the groupings listed above.

> For example, a Vault with 2 red trees would initially score 
> (7 + 7) = 14 points

For every duplicate solid-color tree, double the score of your Vault.

> For example, a Vault with 2 red trees would further score 
> (7 + 7) * 2 = 28 points

Finally, take the score of your Vault and multiply it by the last successful turn number (i.e. the value of the pips on the Turn Markers minus 1) to get your final score.

> For example, a Vault with 2 red trees, ending on turn 7 would score
> ((7 + 7) * 2) * 6 = 168 total points

Once done, play again to try and beat your high score!

Credits
=======

* Volcano is designed by Kristin Looney.
* IceDice is designed by Andy Looney.
* Original pictures by Looney Labs with minor additions to outline setup differences.

