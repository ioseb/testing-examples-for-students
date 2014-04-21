package mocks;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class MockitoDefaultValueTest {

	private Car ferrari = Mockito.mock(Car.class);

	@Test
	public void testDefaultBehaviourOfTestDouble() {
		Assert.assertFalse(ferrari.needsFuel());
		Assert.assertEquals(ferrari.getEngineTemperature(), 0.0, 1);
	}
}
