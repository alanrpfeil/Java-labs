package pig;

public class HighRewardPlayer extends Player {

	public boolean throwAgain(Player opponent) {
		if (turnTotal() < 15) {
			return true;
		} else {
			return false;
		}
	}
	
}
