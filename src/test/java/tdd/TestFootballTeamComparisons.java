package tdd;

import org.junit.Assert;
import org.junit.Test;

public class TestFootballTeamComparisons {
	private static final int ANY_NUMBER = 123;

	@Test
	public void shouldBePossibleToCompareTeams() {
		FootballTeam team = new FootballTeam(ANY_NUMBER);

		Assert.assertTrue(team instanceof Comparable);
	}

	@Test
	public void teamsWithMoreMatchesWonShouldBeGreater() {
		FootballTeam team2 = new FootballTeam(2);
		FootballTeam team3 = new FootballTeam(3);

		Assert.assertTrue(team3.compareTo(team2) > 0);
	}

	@Test
	public void teamsWithLessMatchesWonShouldBeLesser() {
		FootballTeam team2 = new FootballTeam(2);
		FootballTeam team3 = new FootballTeam(3);

		Assert.assertTrue(team2.compareTo(team3) < 0);
	}

	@Test
	public void teamsWithSameNumberOfGamesWonShouldBeEqual() {
		FootballTeam teamA = new FootballTeam(5);
		FootballTeam teamB = new FootballTeam(5);

		Assert.assertTrue(teamA.compareTo(teamB) == 0);
	}
}
