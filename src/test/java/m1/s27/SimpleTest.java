package m1.s27;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SimpleTest {
    private Simple simple;

    @BeforeEach
    public void init() {//prima dei test chiama sempre questo metodo, before each
        simple = new Simple();//creo oggetto simple, che uso dopo riga21
    }

    @Test
    public void negatePositive() {
        int value = 42;

        int result = simple.negate(value);

        assertThat(result, equalTo(-42));
    }
    
    @Test
    public void negateNegative() {//faccio un test anche su negativo
        int value = -42;

        int result = simple.negate(value);

        assertThat(result, equalTo(42));
    }
}
