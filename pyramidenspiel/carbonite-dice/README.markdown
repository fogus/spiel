CarboniteDice
-------------

CarboniteDice is a variant of [IceDice](http://www.looneylabs.com/games/icedice) with the scoring of [Volcano](http://www.wunderland.com/WTS/Kristin/Games/Volcano.html) (both by [Looney Labs](http://www.looneylabs.com)) for solitaire play.  It's a push-your-luck style dice game for one.

TODO

![IceDice](http://www.looneylabs.com/sites/default/files/IceDice2.jpg)

Setup of CarboniteDice
======================

![Setup](http://www.looneylabs.com/sites/default/files/IceDice4.jpg)

Plus "carbonite chamber"

Turns in CarboniteDice
======================

You have 10 turns.

### Marking the current turn number

Take the next largest pyramid from the Bank for use in representing the current turn and return a smaller pyramid from the turn markers.  You can choose any colors that you want to use as the turn markers, but you *must* increase the sizes as the turn number grows larger. Any pyramids in use for the turn markers are *not* available for capturing during the turn that they're in use.

The pyramids needed for each round are shown below:

1. 1-small
2. 1-medium
3. 1-large
4. 1-large and 1-small
5. 1-large and 1-medium
6. 2-large
7. 2-large and 1-small
8. 2-large and 1-medium
9. 3-large
10. 3-large and 1-small

### Capturing pyramids

1. Roll the IceDice dice
2. Collect pyramids
3. Continue until you're satisfied with the results

### Freezing pyramids in the bank

If you roll the same color as what you already have in the counter then you *must* remove the sized pyramids shown on the IceDice dice and place them in the "carbonite chamber."  They cannot be accessed again for the remainder of the game.  

> For example, if you have a red pyramid in the Counter and 
> the roll of your IceDice dice shows a red spot with a small 
> and a medium pyraid face then you *must* remove a small red 
> *and* a medium red from the bank for the remainder of the game.

### Unable to match pyramids

TODO

If you're unable to take a colored pyramid of the specified size from the Bank then you *must* take it from your Vault and add it to the Counter.  If this happens then you (may not want to but you) *must* roll the dice at least one more time.  If you bust out on any subsequent rolls then all of the pyramids, include those taken from your Vault are either returned to the Bank or removed from the game.

### Ending the game

After ten turns calculate your score.

Scoring in CarboniteDice
========================

* 7 points for each solid-color tree
* 5 points for each mixed-color tree
* 1 point for each of the rest of your pieces

TODO

Credits
=======

* Volcano is designed by Kristin Looney.
* IceDice is designed by Andy Looney.
* Pictures by Andrew Looney.

