package com.softgroup.test;


import org.junit.Assert;
import org.junit.Test;


public class PolynomialCounterTest{

    @Test
    public void testGetPascalTriangleElement() throws Exception {
        int n = 5;
        int k = 3;
        int expectedResult = 10;
        Assert.assertEquals(expectedResult, PolynomialCounter.getPascalTriangleElement(5, 3));
    }

    @Test
    public void testPrintFormula() throws Exception{
        int n = 4;
        String expectedResult = "a^4+4*a^3*b+6*a^2*b^2+4*a*b^3+b^4=";
        Assert.assertEquals(expectedResult, PolynomialCounter.printFormula(n));
    }
}
