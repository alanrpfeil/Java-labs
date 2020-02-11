package pig;

import java.util.Random;

public class PigSimulator {
	
	// used to roll dice and pick the starting player
	private static Random r = new Random ( );

	public static void main (String [ ] args) {
		PigSimulator game = new PigSimulator ( );
		Player [ ] players = new Player [2];
		players[0] = new HighRewardPlayer ( );
		players[1] = new AveragePlayer ( );
		int [ ] totalWins = {0, 0};
		for (int k=0; k<9; k++) {
			System.out.println("\n -- Game " + k);
			totalWins[game.play1game (players)]++;
			System.out.println ("Player 0 scored " + players[0].total ( ) 
					+ ", player 1 scored " + players[1].total ( ));
		}
		System.out.println ("Player 0 won " + totalWins[0] + ", player 1 won " + totalWins[1]);
	}
	
	
	
	
	// Returns 0 if player 0 wins, 1 if player 1 wins.
	public int play1game (Player [ ] players) {
		players[0].initGame ( );
		players[1].initGame ( );
		int currentPlayer = r.nextInt (2);
		boolean wonGame = false;
		while (!wonGame) {
			currentPlayer = 1 - currentPlayer;
			System.out.println ("player " + currentPlayer + ": score = " + players[currentPlayer].total ( ));
			play1turn (players[currentPlayer], players[1 - currentPlayer]);
			wonGame = players[currentPlayer].won ( );
		}
		return currentPlayer;
	}
	
	public void play1turn (Player p, Player opponent) {
		boolean okRoll;
		p.initTurn ( );
		do {
			int roll = r.nextInt (6) + 1;
			System.out.print (" Roll " + roll + "   ");
			okRoll = p.tallyRoll (roll);
		} while (okRoll && !p.won ( ) && p.throwAgain ( opponent ));
		System.out.println ( );
		if (okRoll) {
			p.updateTotal ( );
		}
	}
}
