package com.steerlean.fizzbuzz;

import java.util.List;

import com.steerlean.fizzbuzz.rule.IRule;
import com.steerlean.fizzbuzz.rule.RuleFactory;

public class AppController {

	public static void main(String[] args) {
		RuleFactory factory = new RuleFactory();
		RulesConfigurator configurator = new RulesConfigurator(factory);

		List<IRule> rules = configurator.configure();
		
		RuleEngine engine = new RuleEngine(rules);

		NumberProcessor processor = new NumberProcessor(engine);
		
		App app = new App(processor);
		List<String> processedRange = app.start();

		for (String string : processedRange) {
			System.out.println(string);
		}
	}
}
