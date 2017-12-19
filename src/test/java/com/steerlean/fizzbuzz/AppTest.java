package com.steerlean.fizzbuzz;

import mockit.Mocked;
import mockit.Verifications;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class AppTest {

    @Mocked
    private NumberProcessor mockerNumberProcessor;

    @Test
    public void testStart() throws Exception {
        App app = new App(mockerNumberProcessor);
        List<String> range = app.start();
        Assert.assertNotNull(range);
        new Verifications() {{
           mockerNumberProcessor.processRange(1, 100,
                   new ArrayList<String>());
           times = 1;
        }};
    }

}