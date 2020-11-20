package mx;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

class S05MaxTest {
    @Test
    void maxPlain() {
        int actual = S05.max(new int[] { 2, 3, 1 });

        assertThat(actual, is(3));
    }
    
    @Test
    void maxnMore() {
        int actual = S05.max(new int[] { -5, 3, -1, 6, 4});

        assertThat(actual, is(6));
    }
    
    @Test
    void maxNegative() {
        int actual = S05.max(new int[] { -5, -3, -1, -6});

        assertThat(actual, is(-1));
    }
    
    @Test
    void maxLast() {
        int actual = S05.max(new int[] { 5, 3, 1, 6, 9});

        assertThat(actual, is(9));
    }
    
    @Test
    void maxFirst() {
        int actual = S05.max(new int[] { 15, 3, 1, 6, 9});

        assertThat(actual, is(15));
    }
    
    @Test
    void maxVoid() {
        int actual = S05.max(new int[] {});

        assertThat(actual, is(Integer.MIN_VALUE));
    }
    
    @Test
    void maxNull() {
    	int[] input = null;
        int actual = S05.max(input);

        assertThat(actual, is(Integer.MIN_VALUE));
    }
}
