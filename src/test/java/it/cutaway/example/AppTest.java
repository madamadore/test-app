package it.cutaway.example;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    private App app;

    @Before
    public void setup() {
        app = new App();
    }

    @Test
    public void testTrimLastChar() {
        //App app = new App();
        assertEquals("Jav", app.trimLastChar("Java"));
        assertEquals("Oral test non va", "Oracl", app.trimLastChar("Oracle"));
    }

    @Test
    public void testMultiply() {
        //App app = new App();
        assertEquals(10, app.multiply(5, 2));
        assertEquals(0.5, app.multiply(1.0, 0.5), 0.0);
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
