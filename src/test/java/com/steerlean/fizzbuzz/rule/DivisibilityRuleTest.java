package com.steerlean.fizzbuzz.rule;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisibilityRuleTest {

    @Test
    public void testNumberIsDivisible() {
        //ARRANGE
        IRule divisibilityRule = new DivisibilityRule(2, "hello");

        //ACT
        String parseString = divisibilityRule.parse(10);

        //ASSERT
        Assert.assertEquals(parseString, "hello");
    }

    @Test
    public void testNumberIsNotDivisible() {
        //ARRANGE
        IRule divisibilityRule = new DivisibilityRule(3, "hello");

        //ACT
        String parseString = divisibilityRule.parse(10);

        //ASSERT
        Assert.assertEquals(parseString, "");
}

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivisorIsZero() {
        //ARRANGE
        IRule divisibilityRule = new DivisibilityRule(0, "hello");

        //ACT
        String parseString = divisibilityRule.parse(10);
    }
}
