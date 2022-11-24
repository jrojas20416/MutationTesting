package org.example;

import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculadoraTest {

    Calculadora cs = new Calculadora();

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
        //AssertJUnit.assertEquals(cs.mul(8, 2), 16);
        AssertJUnit.assertEquals(cs.mul(5, 1),5 );
    }

    @Test
    public void testComp() {
        AssertJUnit.assertEquals("Positivo", cs.comp(2));
        //AssertJUnit.assertEquals("Positivo", cs.comp(0));
        //AssertJUnit.assertEquals("Negativo", cs.comp(-2));
    }

    @Test
    public void testTrian() {
        AssertJUnit.assertEquals("Equilatero", cs.trian(2,2,2));
        AssertJUnit.assertEquals("Isosceles", cs.trian(2,2,3));
        AssertJUnit.assertEquals("Escaleno", cs.trian(4,5,3));
    }

    @Test
    public void divTestNull(){
        Double a = null;
        Double b= null;
        assertThrows(NullPointerException.class,() -> cs.div(a,b)  );
    }
}