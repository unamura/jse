package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class S02SpeedTest {

	@Test
	void speedPlain() {
		double actual = S02.speed(100.0, 9.58);

		// Controllo quanto vale la velocità per i dati scelti,
		// e, visto che sono floating point, uso close to.
		assertThat(actual, closeTo(10.438, 0.001));
	}

	@Test
	void speedInfinity() {
		// Controllo che succede quando un passa t=0
		double actual = S02.speed(100, 0.0);

		assertThat(actual, is(Double.POSITIVE_INFINITY));
	}

	@Test
	void speedZero() {
		// Controllo che succede quando un passa t=0
		double actual = S02.speed(0, 10);

		assertThat(actual, is(0.0));
	}

//Posso disabilitare un test mettendo
	// @Test
	// @Disabled
	@Test
	@Disabled
	void speedNegativeTime() {
		try {
			S02.speed(100, -1);
			fail("An ExUncheckedException was expected");
		} catch (ExUncheckedException eue) {
			String message = eue.getMessage();
			assertThat(message, is("No negative values expected"));
		}
	}
}
