package com.shivani.datatype;
import com.shivani.exceptions.DivisionException;
import com.shivani.interfaces.Calculator;
import com.shivani.services.ValueAssign;
public class DoubleOperations implements Calculator<Double> {
	public Double addition(ValueAssign<Double> value) {
		return value.getFirstOperand() +value.getSecondOperand();
	}
	public Double subtraction(ValueAssign<Double> value) {
		return value.getFirstOperand() - value.getSecondOperand();
	}
	public Double multiplication(ValueAssign<Double> value) {
		return value.getFirstOperand() * value.getSecondOperand();
	}
	public Double division(ValueAssign<Double> value) {
		if(value.getSecondOperand()== 0.0) {
			throw new DivisionException("Entered value is 0.0, Division is not possible");
		}
		 return value.getFirstOperand() / value.getSecondOperand();
	}
}
