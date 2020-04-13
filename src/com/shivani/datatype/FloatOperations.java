package com.shivani.datatype;

import com.shivani.exceptions.DivisionException;
import com.shivani.services.ValueAssign;

public class FloatOperations {

	public float addition(ValueAssign<Float> p) {
		return p.getFirstOperand() +p.getSecondOperand();
	}
	public float subtraction(ValueAssign<Float> p) {
		return p.getFirstOperand() - p.getSecondOperand();
	}
	public float multiplication(ValueAssign<Float> p) {
		return p.getFirstOperand() * p.getSecondOperand();
	}
	public float division(ValueAssign<Float> p) {
		if(p.getSecondOperand()==0.0) {
			throw new DivisionException("Entered value is zero, Division is not possible");
		}
		return p.getFirstOperand() / p.getSecondOperand();
	}
}
