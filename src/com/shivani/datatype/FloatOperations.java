package com.shivani.datatype;

import com.shivani.exceptions.DivisionException;
import com.shivani.interfaces.Calculator;
import com.shivani.services.ValueAssign;

public class FloatOperations implements Calculator<Float> {

	public Float addition(ValueAssign<Float> value) {
		return value.getFirstOperand() + value.getSecondOperand();
	}
	public Float subtraction(ValueAssign<Float> value) {
		return value.getFirstOperand() - value.getSecondOperand();
	}
	public Float multiplication(ValueAssign<Float> value) {
		return value.getFirstOperand() * value.getSecondOperand();
	}
	public Float division(ValueAssign<Float> value) {
		if(value.getSecondOperand()==0.0) {
			throw new DivisionException("Entered value is zero, Division is not possible");
		}
		return value.getFirstOperand() / value.getSecondOperand();
	}
}
