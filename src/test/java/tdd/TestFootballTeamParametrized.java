package tdd;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestFootballTeamParametrized {
	private int gamesWon;

	public TestFootballTeamParametrized(int gamesWon) {
		this.gamesWon = gamesWon;
	}

	@Parameters
	public static Collection getParams() {
		return Arrays.asList(new Integer[][]{{1}, {2}, {3}, {4}});
	}

	@Test
	public void constructorShouldSetGamesWonFromParameters() {
		FootballTeam team = new FootballTeam(gamesWon);
		Assert.assertEquals(gamesWon, team.getGamesWon());
	}
}
