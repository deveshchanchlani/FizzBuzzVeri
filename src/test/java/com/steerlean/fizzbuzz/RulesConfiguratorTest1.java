package com.steerlean.fizzbuzz;

import com.steerlean.fizzbuzz.rule.DivisibilityRule;
import com.steerlean.fizzbuzz.rule.IRule;
import com.steerlean.fizzbuzz.rule.RuleFactory;
import mockit.Expectations;
import mockit.Mocked;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class RulesConfiguratorTest1 {

    @Mocked
    private RuleFactory mockedRuleFactory;

    @Test
    public void testConfigure(@Mocked final IRule dummyDivisibilityRule1,
                              @Mocked final IRule dummyDivisibilityRule2) throws Exception {
        //ARRANGE
        new Expectations() {{
            mockedRuleFactory.createDivisibilityRule(3, "Fizz");
            returns(dummyDivisibilityRule1);
            mockedRuleFactory.createDivisibilityRule(5, "Buzz");
            returns(dummyDivisibilityRule2);
        }};

        //ACT
        RulesConfigurator rulesConfigurator = new RulesConfigurator(mockedRuleFactory);
        List<IRule> actualRuleList = rulesConfigurator.configure();

        //ASSERT
        Assert.assertEquals(4, actualRuleList.size());
//        Assert.assertEquals(---, actualRuleList.get(0));
//        Assert.assertEquals(---, actualRuleList.get(1));
//        Assert.assertEquals(---, actualRuleList.get(2));
//        Assert.assertEquals(---, actualRuleList.get(3));
    }

}










