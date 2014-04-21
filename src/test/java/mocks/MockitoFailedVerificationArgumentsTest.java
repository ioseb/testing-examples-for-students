package mocks;

import org.junit.Test;
import org.mockito.Mockito;

public class MockitoFailedVerificationArgumentsTest {
	private Car ferrari = Mockito.mock(Car.class);

	@Test
	public void testVerificationFailureArguments() {
		ferrari.driveTo("Sweet Home Alabama");
		// Uncomment the following line to make sure test fails
		// Mockito.verify(ferrari).driveTo("Sweet Home Tbilisi");
	}
}
