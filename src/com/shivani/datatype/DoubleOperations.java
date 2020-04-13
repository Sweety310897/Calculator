package com.shivani.datatype;
import com.shivani.exceptions.DivisionException;
import com.shivani.services.ValueAssign;
public class DoubleOperations {
	public double addition(ValueAssign<Double> p) {
		return p.getFirstOperand() +p.getSecondOperand();
	}
	public double subtraction(ValueAssign<Double> p) {
		return p.getFirstOperand() - p.getSecondOperand();
	}
	public double multiplication(ValueAssign<Double> p) {
		return p.getFirstOperand() * p.getSecondOperand();
	}
	public double division(ValueAssign<Double> p) {
		if(p.getSecondOperand()==0.0) {
			throw new DivisionException("Entered value is 0.0, Division is not possible");
		}
		 return p.getFirstOperand() / p.getSecondOperand();
	}
}
