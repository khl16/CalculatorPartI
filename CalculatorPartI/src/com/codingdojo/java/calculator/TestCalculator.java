package com.codingdojo.java.calculator;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Calculator calculator1 = new Calculator(10.5,"+",5.2);
		calculator1.performOperation();
		calculator1.getResult();
		
		System.out.println(calculator1.getResult());
	}

}
