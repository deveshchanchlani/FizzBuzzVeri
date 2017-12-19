package com.steerlean.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class App {

	private NumberProcessor processor;

	public App(NumberProcessor processor) {
		this.processor = processor;
	}

	public List<String> start() {
		List<String> processedRange = new ArrayList<String>();
		processor.processRange(1, 100, processedRange);
		return processedRange;
	}
}
