package mocks;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class MockitoFirstTest {

	private Car ferrari = Mockito.mock(Car.class);

	@Test
	public void testIfCarIsACar() {
		Assert.assertTrue(ferrari instanceof Car);
	}
}
