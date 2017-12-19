package com.steerlean.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

import com.steerlean.fizzbuzz.rule.IRule;
import com.steerlean.fizzbuzz.rule.RuleFactory;

public class RulesConfigurator {
	RuleFactory factory;
	
	public RulesConfigurator(RuleFactory factory) {
		this.factory = factory;
	}

	public List<IRule> configure() {
		List<IRule> rules = new ArrayList<IRule>();

		rules.add(factory.createDivisibilityRule(3, "Fizz"));

		rules.add(factory.createDivisibilityRule(5, "Buzz"));

		rules.add(factory.createSumOfDigitsDivisibility(6, "FiJazz"));

		rules.add(factory.createSumOfDigitsDivisibility(5, "BuJazz"));

		return rules;
	}
}
