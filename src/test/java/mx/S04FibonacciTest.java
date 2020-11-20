package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

//import org.hamcrest.core.Is;
//import static org.hamcrest.Matchers.is;
//import static org.junit.jupiter.api.Assertions.fail;

class S04FibonacciTest {
    @Test
	void fibonacciPrima() {
		long actual = S04.fibonacci(4);

        assertThat(actual, is(3));
	}

}