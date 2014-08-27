*Podstavec* is a game of blind bidding and resource management for 2-3 players.

Preparation
===========

You'll need the following materials to play *Podstavec*:

 * 48 balls split into three differently colored groups of 16 (a [Shibumi set](http://boardgamegeek.com/boardgame/135270/shibumi) works nicely)
 * 25 rings wide enough to hold the balls, called *pedestals*
 * 1 cloth bag per player
 
For a 2-player game each player starts with 8 balls of each color, that are stored in each player's bag.  For a 3-player game each player gets 5 balls of each color.  In both circumstances each player gets 3 pedestals to start which are placed in plain view in front of the players; this is called *the display*.

Goal
====

The player with the most valuable display of pedestalized balls wins the game.

Gameplay
========

The games consists of some number of rounds where all players make a simultaneous bid on a pedestal and some available balls. The game starts with bidding on a single pedestal.

For each round in the game, the following steps are taken:

 * Players may manipulate their pedestals by placing pedestalized
   balls into their display, swapping balls already in the display, 
   or removing balls and pedestals from their display into their bags.
 * Players calculate the relative color values
 * A new pedestal is added to the current auction spoils
 * Players hide bids in their hands and simultaneously reveal
 * Player wins pedestal and any additional balls
 * Highest bid goes into the next auction
 * Lowest bids go back to players
 
The steps above are repeated until all pedestals are won, or one player holds 13 in a 2-player game or 9 in a 3-player game.  Once the game ends, the current displays are tallied and the player with the most valuable set wins the game.

Bidding
-------

Bids are all revealed at the same time and are resolved according to their count and relative color values.  In any bid there will be a maximum of only one winner, but there may be none.  That is, if all players show the same bid in a round then none of them win and all of the bids go into the spoils for the next auction.  In a 3-player game, if two players bid the same high bid then the player with the lowest bid wins that round.  

Pedestalization
---------------

Before a round begins, players can put any of their balls onto the pedestals in their inventory.  This is of primary importance because, only pedestalized balls will count toward the final score.  Additionally, pedestalized balls can influence the relative value of the balls used for bidding in a given round, described next.

Ball color values
-----------------

When players place pedestalized balls into their display they can potentially influence the relative values of the colors for a given round.  For example, if the number of total pedestalized black balls is 5, red 4, and white 2 then the relative color values are likewise black, red, then white.

However, if there are no pedestalized balls in any displays or the same amounts of each color then by default the relative values are as follows:

 * A red ball beats
 * A white ball beats
 * A black ball
 
The default relative values above are also used to determine the most valuable display at game's end.

### Using pedestals in a bid

Pedestals used for bidding always beats a ball of any color.  However, tied pedestal bids are determined by any additional balls based on the current relative values.

Example bids
------------

Some examples of bids are below.  The default relative values are assumed:

 Bidder                  | Bid                    
 :-----------------------|:--------------------------
 **Player 1**            | ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/red-ball.png)
 Player 2                | ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/black-ball.png)
 Player 3                | ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/white-ball.png) 


 Bidder                  | Bid                    
 :-----------------------|:--------------------------
 Player 1                | ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/red-ball.png) ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/black-ball.png)
 **Player 2**            | ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/red-ball.png) ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/white-ball.png)
 Player 3                | ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/red-ball.png) 

 Bidder                  | Bid                    
 :-----------------------|:--------------------------
 Player 1                | ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/red-ball.png) ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/black-ball.png)
 Player 2                | ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/red-ball.png) ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/white-ball.png)
 **Player 3**            | ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/pedestal.png) 

 Bidder                  | Bid                    
 :-----------------------|:--------------------------
 Player 1                | ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/red-ball.png) ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/red-ball.png)
 Player 2                | ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/red-ball.png) ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/red-ball.png)
 **Player 3**            | ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/black-ball.png) 

And so on.

Final scoring
=============

As mentioned, the value of the players' display is determined by the default relative color values:

 * A red ball beats
 * A white ball beats
 * A black ball

Only the actively pedestalized balls in the players' display at game's end count toward the score.

An example scoring for a truncated game is as follows:

 Bidder                  | Bid                    
 :-----------------------|:--------------------------
 Player 1                | ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/red-ball-p.png) ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/red-ball-p.png) ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/red-ball-p.png) ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/white-ball-p.png) ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/white-ball-p.png) ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/black-ball-p.png)
 **Player 2**            | ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/red-ball-p.png) ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/red-ball-p.png) ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/red-ball-p.png) ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/white-ball-p.png) ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/white-ball-p.png) ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/white-ball-p.png)
 Player 3                | ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/red-ball-p.png) ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/red-ball-p.png) ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/red-ball-p.png) ![](https://raw.githubusercontent.com/fogus/spiel/blob/master/echtzeitspiel/podstavec/graphics/white-ball-p.png) 

If all three displays are the same value at game's end then the player who won the first round wins the game.

