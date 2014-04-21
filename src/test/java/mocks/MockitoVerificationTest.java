package mocks;

import org.junit.Test;
import org.mockito.Mockito;

public class MockitoVerificationTest {
	private Car ferrari = Mockito.mock(Car.class);

	@Test
	public void testVerification() {
		ferrari.driveTo("Sweet Home Alabama");
		ferrari.needsFuel();

		Mockito.verify(ferrari).driveTo("Sweet Home Alabama");
		Mockito.verify(ferrari).needsFuel();
	}
}
