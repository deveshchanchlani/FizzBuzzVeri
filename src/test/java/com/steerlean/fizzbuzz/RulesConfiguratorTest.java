package com.steerlean.fizzbuzz;

import com.steerlean.fizzbuzz.rule.IRule;
import com.steerlean.fizzbuzz.rule.RuleFactory;
import mockit.Expectations;
import mockit.Mocked;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class RulesConfiguratorTest {

    @Mocked
    private RuleFactory mockedRulesFactory;

    @Test
    public void testConfigure(@Mocked final IRule dummyDivisibilityRule1, @Mocked final IRule dummyDivisibilityRule2,
                              @Mocked final IRule dummySumOfDigitsDivisibilityRule1, @Mocked final IRule dummySumOfDigitsDivisibilityRule2
                              ) throws Exception {
        //ARRANGE
        final RulesConfigurator rulesConfigurator = new RulesConfigurator(mockedRulesFactory);

        new Expectations() {
            {
                mockedRulesFactory.createDivisibilityRule(3, "Fizz");
                returns(dummyDivisibilityRule1);
                mockedRulesFactory.createDivisibilityRule(5, "Buzz");
                returns(dummyDivisibilityRule2);
                mockedRulesFactory.createSumOfDigitsDivisibility(6, "FiJazz");
                returns(dummySumOfDigitsDivisibilityRule1);
                mockedRulesFactory.createSumOfDigitsDivisibility(5, "BuJazz");
                returns(dummySumOfDigitsDivisibilityRule2);
            }
        };

        //ACT
        List<IRule> rules = rulesConfigurator.configure();

        Assert.assertEquals(4, rules.size());
        Assert.assertEquals(dummyDivisibilityRule1, rules.get(0));
        Assert.assertEquals(dummyDivisibilityRule2, rules.get(1));
        Assert.assertEquals(dummySumOfDigitsDivisibilityRule1, rules.get(2));
        Assert.assertEquals(dummySumOfDigitsDivisibilityRule2, rules.get(3));
    }

}
