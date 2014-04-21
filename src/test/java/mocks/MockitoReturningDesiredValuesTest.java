package mocks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class MockitoReturningDesiredValuesTest {
	private Car ferrari;

	@Before
	public void setUp() {
		ferrari = Mockito.mock(Car.class);
	}

	@Test
	public void testStubbing() {
		Assert.assertFalse(
				"new test double should return false as boolean",
				ferrari.needsFuel());

		Mockito.when(ferrari.needsFuel())
				.thenReturn(true);

		Assert.assertTrue(
				"after instructed test double should return what we want",
				ferrari.needsFuel());
	}
}
