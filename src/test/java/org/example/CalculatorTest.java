package org.example;

import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator cs = new Calculator();

    @Test
    public void testSum() {
        AssertJUnit.assertEquals(cs.sum(4, 8), 12);
    }

    @Test
    public void testRest() {
        AssertJUnit.assertEquals(cs.rest(4, 2), 2);
    }

    @Test
    public void testDiv() {
        AssertJUnit.assertEquals(cs.div(8D, 2D), 4D);
    }

    @Test
    public void testMul() {
        AssertJUnit.assertEquals(cs.mul(8, 2), 16);
    }
}