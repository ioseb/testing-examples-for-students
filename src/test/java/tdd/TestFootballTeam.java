package tdd;

import org.junit.Assert;
import org.junit.Test;

public class TestFootballTeam {
	private static final int THREE_GAMES_WON = 3;

	@Test
	public void constructorShouldSetGamesWon() {
		FootballTeam team = new FootballTeam(THREE_GAMES_WON);
		Assert.assertEquals(THREE_GAMES_WON, team.getGamesWon());
	}
}
