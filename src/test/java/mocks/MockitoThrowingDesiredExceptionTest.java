package mocks;

import org.junit.Test;
import org.mockito.Mockito;

public class MockitoThrowingDesiredExceptionTest {
	private Car ferrari = Mockito.mock(Car.class);

	@Test(expected = RuntimeException.class)
	public void throwException() {

		Mockito.when(ferrari.needsFuel()).thenThrow(new RuntimeException());

		ferrari.needsFuel();
	}
}
