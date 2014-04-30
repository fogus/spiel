*Initiative* is an abstract fencing game of perfect information where one player attempts to place a pyramid that his or her opponent cannot parry.

Gameplay
--------

*Initiative* is played on any flat surface where each player places their pyramids in a row, across from the other player's pieces, until one player is unable to play or both players run out of pyramids. The precise rules of play are described below.

### Quick setup

Before beginning, take 5 pyramids, one of each color all the same size, from the set of available pyramids and pile them one on top of each other in any order and set aside. This structure is called the **initiative stack**.  The initiative stack describes the precedence of the colors.  That is, the color higher on the stack trumps a color lower on the stack, this precedence will determine which player gets to lead on a turn; that is, who has the initiative.

![stack](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/initiative/graphics/initiative-stack.png)

To get started with *Initiative* just randomly mix the remaining 25 pyramids into a container (an [IceDice](http://www.looneylabs.com/games/icedice) bag works well). Once mixed, one player can roll the pyramid die 10 times, each time blindly taking a pyramid from the bag corresponding to their choice of size (as indicated by the die face). Once 10 pyramids are taken the other player takes 10 of those remaining. The image below shows the typical layout of the playing area for two “fictional” players, Alison and Kristin.

![setup](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/initiative/graphics/initiative-inventory-setup.png)

The player who has experience in fencing goes first, otherwise a quick game of *Rock, Paper, Scissors* or [Pew Pew, Die][pew-pew] can determine who goes first.

*This is a good way to get started quickly to explore the mechanics of placing, parrying and initiative, but a drafting system is described later that provides more control over each player's pyramids.*

### Attacking and parrying

A round of *Initiative* consists of a number of turns (10 maximum) each consisting of an *attack* by the lead player and a *defense* by the following player. For each attack, the defending player must play a piece in response, according to the following rules:

-   If you have a piece of the same size, then it must be played. You
    are not forced to play the same color if you have more than one
    piece of the attacking size.
-   If you do not have a piece of the same size, then you must play a
    piece of the same color

If you're able to place a piece for defense then the rules for who goes first (attacks) on the next turn are next.

#### Results of each piece attack

Depending on the results of the defense as defined above, one of three things could occur:

-   The defending player gains the initiative for the attack on the next
    turn
-   The defending player successfully defends, but does not gain the
    initiative for attack
-   The defending player does not have a defending piece, and losses the
    round

#### Gaining initiative

Gaining initiative happens in one of two ways:

-   The defender plays a piece of the same size, but with a color higher
    on the initiative stack
-   The defending player plays a piece of the same color, but of a
    larger size

### An example round using the basic rules

The following image shows the result of a game played using the inventories shown earlier for Kristin and Alison.  This is just one possible scenario for illustration and not meant to show optimal play by either player.  The black and white stones shown are not needed for your own game and are shown only to mark the starting pyramid (white) and the changes in initiative (black).

![basic](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/initiative/graphics/basic-play-final.png)

 1. Alison begins the round by placing a small blue. Kristin does not 
    have a small, so she must follow with a different blue pyramid. 
	She therefore responds by placing a medium blue, gaining initiative
 2. Kristen then lays a large green and Alison responds in turn with a 
    large blue, gaining initiative
 3. Alison then places a medium yellow and Kristin responds with a 
    medium green, gaining initiative
 4. Kristin then places a large yellow and Alison responds with a 
    large red
 5. Kristen, having kept initiative places a large green. Alison responds
    with her last large pyramid, a red.
 6. Kristen places a large black and Alison responds with a medium black
 7. Kristin then places a large yellow and Alison responds with a 
    medium yellow
 8. Finally, Kristin places a large black and because Alison has no
    more large pyramids nor smaller black pieces, she has lost.

The sample round thus concludes with Kristin scoring 24 points, but how was it calculated?  The basic scoring for *Initiative* are as follows.

### Simple Scoring

Scoring a round in *Initiative* is fairly simple. The formula is as follows:

    Number of pyramids in the winner's row
                     X
     The pip count of the winning pyramid
    ---------------------------------------
          Total score for the round

Therefore, Kristin won the round with 24 points because she had 8 pyramids in her play area and won the round with a large pyramid, worth 3 points.

Examples:

-   Kristin wins on her 7th pyramid, which is a medium, meaning her score
    for the round is 14 points
-   Alison wins on her 1st pyramid with a large, meaning her score for
    the round is 3 points

There are additional scoring possibilities in the advanced rules section
below.


#### Then swap pyramids

The rules above are for the basic attack and defense rules. As an additional test of skill, the players can swap their set of pyramids and lead with the same set as the previous round to see who gets the higher score.  The player with the highest overall score is the winner of the 2-round match.


Advanced play
-------------

While *Initiative* using the basic rules is fairly interesting, the depth of play is somewhat shallow.  Therefore, you should consider playing with the following additional rules to add depth an variability to the game once you feel comfortable with the basic game-play rules.

### Sacrificing and manipulating the initiative stack

As you saw in the play-through above, it was clear that Alison was going to lose before the end, yet she was forced to play out the remaining few pyramids. If the initiative stack had been organized slightly differently then Alison might have had a chance to win, or at least to maintain or gain initiative more often.

Through a technique called "sacrificing" a player can indeed manipulate the initiative stack and move colors up and down the stack from 1 to 3 slots at a time.  To sacrifice a piece, a player only needs to place it under the pyramid that they wish to play on their turn.  That is, the player plays two pyramids on a turn, the one on the top being the placed piece and the one on the bottom being the sacrificed piece.  The size of the sacrificed piece then gives them 1 to 3 points (small = 1, medium = 2, large = 3) for use in making piece swaps on the initiative stack.  

A piece swap on the initiative stack means that the color of the played piece can be moved up or down the initiative stack the number of slots indicated by the size of the sacrificed piece.  This allows the player to redefine the color precedence and (potentially) make their placed color higher on the stack for the purpose of retaining initiative.  But beware, either the leader or the responder can sacrifice on any play, so the initiative stack might change a few times during a round.

Observe the following play-through using sacrificing:

![sacrificing](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/initiative/graphics/sacrifice-play-final.png)

 1. Alison leads the round by playing a medium blue, and Kristin
    follows with a medium green
 2. Alison then places a large blue, and Kristin follows with a 
    large green
 3. Alison then places a medium yellow while sacrificing a medium
    black. The yellow color on the initiative stack is moved up
	two slots on top of green and under blue. Kristin then places
	a medium blue, gaining initiative
 4. Kristin then places a medium black, and Alison follows with a 
    medium red while sacrificing a large red.  The red color on the 
	initiative stack is moved upwards 3 slots on top of the yellow
	and under the blue.  The new initiative stack precedence rules
	that red is now higher than black, therefore Alison has gained 
	the initiative for the next turn
 5. Alison then plays a medium yellow while sacrificing a medium
    red.  The yellow color on the initiative stack is move up two 
	slots to the top of the stack. Kristin then follows with a 
	medium green
 6. Finally, Alison places a small blue and since Kristin has neither
    a small piece nor a blue piece, she has lost the round.  Alison's
    score for the round is 9 points.

A detailed view of how the placed pieces and sacrifices in the game above manipulated the stack, observe the diagram below:

![stack-ops](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/initiative/graphics/stack-operations.png)

By sacrificing pieces a player can gain or retain initiative from one play to another.  Also, sacrificing allows players to get more pyramids into the play area for the purposes of increasing their round score.  It's a powerful technique, that adds much more depth to the play of any given round.  Failing to sacrifice at a crucial moment could spell disaster for a player.

### Pummeling

You'll notice that if one player sacrifices more than the other then a circumstance could arise where a player could exhaust their supply before the other.  In that circumstance the pummeling rule kicks in.  The pummeling rule simply states that if a player runs out of inventory then the last placed pyramid will act as the pyramid played for the final turns.  Graphically, the pummeling rule can be show in the following figure:

![pummeling](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/initiative/graphics/pummel-example.png)

In the figure above, the player ran out of pieces before the round was over so the last piece, a large blue, is used as the played pyramid for the remaining turns.  Pummeling in *Iniative* is a risky maneuver as an opponent can continue to manipulate the initiative stack and weaken your pummeling piece, but the rewards of a successful attempt are vast.  That is, every virtual play by a pummeled piece doubles your final score in the end.  In the figure above, the pummeling player could double, then redouble, then again double, and double again, and then redouble their score for a final score of (3*10) * 2 * 2 * 2 * 2 * 2 = 960 points!  This particular circumstance would indeed be a rare occurrence, but wins with 1 or 2 pummeling turns happen from time to time.

### Calling a color

During a turn a player may lead with a small pyramid and force the play of its color.  This action is signified by laying the pyramid flat on its side facing your opponent with its sacrificed piece (if any) also laying, but inside the small.  The defending player **must** play a pyramid of that color on their defensive attack and cannot sacrifice that color only on that turn, but they can still sacrifice any other color that they wish.

![calling](https://raw.githubusercontent.com/fogus/spiel/master/pyramidenspiel/initiative/graphics/call-color-play-final.png)

In the figure above, Alison started with a small blue and chose to call its color, forcing Kristin to follow with her only blue.  The rest of the round played out using both sacrifices and piece attacks.

Every called color made in a round (by both players) causes the total score to be doubled.  For example, if both players sacrifice once each then the final score for the winning player is doubled and then doubled again.

### Drafting

To spice up the process of building an inventory you can use the following scheme to "draft" pyramids for use in a match:

 1. Place three markers onto a table. The markers can be anything, but 
    should be in a row between the players
 2. Roll the pyramid die as above and draw a given size blindly from 
    some sort of sack or other opaque container
 3. You must then place the drawn pyramid next to one of the three markers.
    Once a marker row contains two pyramids no more pyramids can be placed.
	Once all rows have been filled then each player must take one of the
	three filled rows available on their turn
 4. The next player can either take all of the pyramids next to a 
    marker, or draw blindly from the bag as specified the the roll of 
	the pyramid die
 5. If a player takes the pyramids from a marker row that row is closed, 
    but the other player can continue to roll, draw and place pyramids
	next to the other two markers at their leisure until they are filled 
	(if they so choose)
 6. Once a player gets 10 pyramids he or she must stop. The other player
    can continue alone until they too have 10 pyramids.

Once both players have 10 pyramids each the match can begin.

## Acknowledgments 

*Initiative* is inspired by [Mate](http://boardgamegeek.com/boardgame/19253/mate) changed for play using Icehouse pyramids.  The drafting mechanism is (obviously) inspired by [Coloretto](http://boardgamegeek.com/boardgame/5782/coloretto).

[pew-pew]: http://icehousegames.org/wiki/index.php?title=PewPewDie
