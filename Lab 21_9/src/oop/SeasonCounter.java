package oop;

public class SeasonCounter extends ModNCounter {

	private static String[] names =  {"spring", "summer", "fall", "winter"};
	int season = 0;
	
	public void SeasonCounter() {
		season = 0;
		cycleLength = 4;
	}

	@Override
	public String toString() {
		String seasonname = "";
        if (season % 4 == 0) {
        	seasonname = names[0];
        }
        if (season % 4 == 1) {
        	seasonname = names[1];
        }
        if (season % 4 == 2) {
        	seasonname = names[2];
        }
        if (season % 4 == 3) {
        	seasonname = names[3];
        }
    return seasonname;
	}
	
  	
}
