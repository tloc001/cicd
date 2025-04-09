package com.example.cicd.demo;

import org.testng.Assert;
import org.testng.annotations.Test;
public class CalculatorTest {

    @Test
    public void testAdd() {
        Assert.assertEquals(new Calculator().add(1, 2), 3);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(new Calculator().subtract(1, 2), -1);
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(new Calculator().multiply(1, 2), 2);
    }


    @Test
    public void testDivide() {
        Assert.assertEquals(new Calculator().divide(1, 2), 0.0);
    }
}