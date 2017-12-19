package com.steerlean.fizzbuzz.rule;

public class DivisibilityRule implements IRule {
	Integer divisor;
	String processedString;

	public DivisibilityRule(Integer divisor, String processedString) {
		this.divisor = divisor;
		this.processedString = processedString;
	}

	public String parse(Integer number) {
		if (number % divisor == 0)
			return processedString;
		return "";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		DivisibilityRule that = (DivisibilityRule) o;

		if (divisor != null ? !divisor.equals(that.divisor) : that.divisor != null) return false;
		return processedString != null ? processedString.equals(that.processedString) : that.processedString == null;
	}

	@Override
	public int hashCode() {
		int result = divisor != null ? divisor.hashCode() : 0;
		result = 31 * result + (processedString != null ? processedString.hashCode() : 0);
		return result;
	}
}
