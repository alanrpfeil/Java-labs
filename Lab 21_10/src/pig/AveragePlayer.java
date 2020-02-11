package pig;

public class AveragePlayer extends Player {
	
	public boolean throwAgain(Player opponent) {
		if (rollCount() == 3) {
			return false;
		} else {
			return true;
		}
	}
	
}
