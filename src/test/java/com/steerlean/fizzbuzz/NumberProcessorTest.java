package com.steerlean.fizzbuzz;

import mockit.Expectations;
import mockit.Mocked;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class NumberProcessorTest {

    @Mocked
    private RuleEngine mockerRuleEngine;

    @Test
    public void testProcessRange() throws Exception {
        NumberProcessor numberProcessor = new NumberProcessor(mockerRuleEngine);
        List<String> processedNumbers = new ArrayList<String>();

        new Expectations() {{
            mockerRuleEngine.run(1);
            returns("first");
            mockerRuleEngine.run(2);
            returns("second");
            mockerRuleEngine.run(3);
            returns("third");
        }};

        numberProcessor.processRange(1, 3, processedNumbers);
        Assert.assertEquals(processedNumbers.size(), 3);
        Assert.assertEquals(processedNumbers.get(0), "first");
        Assert.assertEquals(processedNumbers.get(1), "second");
        Assert.assertEquals(processedNumbers.get(2), "third");
    }

}