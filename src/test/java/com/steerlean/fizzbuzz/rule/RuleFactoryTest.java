package com.steerlean.fizzbuzz.rule;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RuleFactoryTest {
    @Test
    public void testCreateDivisibilityRule() throws Exception {
        RuleFactory ruleFactory = new RuleFactory();
        IRule actualDivisibilityRule = ruleFactory.createDivisibilityRule(2, "hello");
        IRule expectedDivisibilityRule = new DivisibilityRule(2, "hello");
        Assert.assertEquals(actualDivisibilityRule, expectedDivisibilityRule);
    }

    @Test
    public void testCreateSumOfDigitsDivisibility() throws Exception {
        RuleFactory ruleFactory = new RuleFactory();
        IRule actualSumOfDigitsDivisibilityRule = ruleFactory.createSumOfDigitsDivisibility(2, "hello");
        IRule expectedSumOfDigitsDivisibilityRule = new SumOfDigitsDivisibility(2, "hello");
        Assert.assertEquals(actualSumOfDigitsDivisibilityRule, expectedSumOfDigitsDivisibilityRule);
    }

}