package com.steerlean.fizzbuzz;

import java.util.List;

public class NumberProcessor {
	private RuleEngine ruleEngine;

	public NumberProcessor(RuleEngine ruleEngine) {
		this.ruleEngine = ruleEngine;
	}

	public void processRange(Integer lowerLimit, Integer upperLimit, List<String> processedNumbers) {
		for (int number = lowerLimit; number <= upperLimit; number++) {
			String processedNumberString = ruleEngine.run(number);
			processedNumbers.add(processedNumberString);
		}
	}
}
