package tdd;

public class FootballTeam implements Comparable<FootballTeam> {
	private int gamesWon;

	public FootballTeam(int gamesWon) {
		this.gamesWon = gamesWon;
	}

	public int getGamesWon() {
		return gamesWon;
	}

	@Override
	public int compareTo(FootballTeam other) {
		if (gamesWon > other.getGamesWon()) {
			return 1;
		}
		if (gamesWon < other.getGamesWon()) {
			return -1;
		}
		return 0;

		// Or just simplify everything
		// return gamesWon - other.getGamesWon();
	}
}
