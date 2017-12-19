package com.steerlean.fizzbuzz.rule;

public class SumOfDigitsDivisibility implements IRule {
	Integer divisor;
	String processedString;

	public SumOfDigitsDivisibility(Integer divisor, String processedString) {
		this.divisor = divisor;
		this.processedString = processedString;
	}

	public String parse(Integer number) {
		Integer sumOfDigits = calculateSumOfDigits(number);

		if (sumOfDigits % divisor == 0)
			return processedString;
		return "";
	}

	private Integer calculateSumOfDigits(Integer number) {
		Integer sumOfDigits = 0;

		while (number != 0) {
			sumOfDigits += number % 10;
			number /= 10;
		}

		return sumOfDigits;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		SumOfDigitsDivisibility that = (SumOfDigitsDivisibility) o;

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
