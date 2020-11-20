package m1.s28;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.Test;

class SimpleTest {
    @Test
    public void checkTrue() {
        boolean condition = true;//per farl0 fallire basta inserire false
        assertTrue(condition);
    }

    @Test
    public void checkNull() {
        String reference = null;
        assertNull(reference);//ha successo, poichè null
    }

    @Test
    public void checkEquals() {//NON fallisce se sono uguali
        int expected = 42;
        int actual = 42;
        assertEquals(expected, actual);
    }

//    @Test
//    public void checkEqualsDoubleNegative() {
//        double expected = .87;//se lavoro con floating point, dobbiamo gestire noi l'epsilon
//        double actual = .29 * 3;// si avranno discrepanze
//        assertEquals(expected, actual);//se dico che deve essere preciso, fallirà
//    }
    
    @Test
    public void checkEqualsDouble() {
        double expected = .87;
        double actual = .29 * 3;
        assertEquals(expected, actual, .0001);
    }

    @Test
    public void hamTrue() {
        boolean condition = true;
        assertThat(condition, is(true));
    }

    @Test
    public void hamTrue2() {
        boolean condition = true;
        assertThat(condition, is(equalTo(true)));
    }

    @Test
    public void hamTrue3() {
        boolean condition = true;
        assertThat(condition, equalTo(true));
    }

    @Test
    public void hamNull() {//voglio asserore che reference sia null
        String reference = null;
        assertThat(reference, is((String) null));//devo mettere reference a stringa, devo fare cast
        //vuole che riferisca nulla ad una stringa, si pref nullValue
    }

    @Test
    public void hamNull2() {
        String reference = null;
        assertThat(reference, is(nullValue()));
    }

    @Test
    public void hamNull3() {
        String reference = null;
        assertThat(reference, nullValue());
    }

    @Test
    public void hamEquals() {
        int expected = 42;
        int actual = 42;
        assertThat(actual, equalTo(expected));
    }

    @Test
    public void hamEquals2() {
        int expected = 42;
        int actual = 42;
        assertThat(actual, is(expected));
    }

    @Test
    public void hamEqualsDouble() {
        double expected = .87;
        double actual = .29 * 3;
        assertThat(actual, closeTo(expected, .0001));//leggibile, usando closeTo
        // asserisco che valore trovato sia vicino all'atteso con questo epsilon
    }

    @Test
    public void hamStart() {
        String prefix = "Tom";
        String actual = "Tom Jones";
        assertThat(actual, startsWith(prefix));
    }

    @Test
    public void hamNot() {
        String prefix = "Bob";
        String actual = "Tom Jones";
        assertThat(actual, not(startsWith(prefix)));
    }
}
