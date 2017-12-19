package com.steerlean.fizzbuzz;

import java.util.List;

import com.steerlean.fizzbuzz.rule.IRule;

public class RuleEngine {
	List<IRule> rules;
	
	public RuleEngine(List<IRule> rules) {
		this.rules = rules;
	}

	public String run(Integer number) {
		String processedNumberString = "";
		for (IRule rule : rules) {
			processedNumberString += rule.parse(number);
		}
		if(processedNumberString.isEmpty())
			return "" + number;
		return processedNumberString;
	}
}
