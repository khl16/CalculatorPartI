package com.codingdojo.java.calculator;

public class Calculator {

	
	private double nmber1=0.0;
	private double nmber2=0.0;
	private String operation="";
	private double result=0.0;
	public Calculator() {}
	
	public Calculator(double nmber1,String operation,double nmber2){
		
		this.nmber1 = nmber1;
		this.nmber2 = nmber2;
		this.operation = operation;
		
	}
	
	
	
	public double getNmber1() {
		return nmber1;
	}
	public void setNmber1(double nmber1) {
		this.nmber1 = nmber1;
	}
	
	

	public double getNmber2() {
		return nmber2;
	}
	public void setNmber2(double nmber2) {
		this.nmber2 = nmber2;
	}


	
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}



	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}



	public void performOperation(){
		if (getOperation().equals("+")) {
			double finalResult = getNmber1() + getNmber2();
			setResult(finalResult);
		}
		else if(getOperation().equals("-")) {
			double finalResult = getNmber1() - getNmber2();
			setResult(finalResult);
		}
	
	}
	
	public void getResults(){
		System.out.println(getResult());
	}
}
