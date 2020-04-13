package com.shivani.datatype;

import com.shivani.exceptions.DivisionException;
import com.shivani.interfaces.Calculator;
import com.shivani.services.ValueAssign;

public class IntegerOperations  {
	public int addition(ValueAssign<Integer> p) {		
		return p.getFirstOperand() + p.getSecondOperand();
	}
	public int subtraction(ValueAssign<Integer> p) {
		return p.getFirstOperand() - p.getSecondOperand();
	}
	public int multiplication(ValueAssign<Integer> p) {
		return p.getFirstOperand() * p.getSecondOperand();
	}
	public int division(ValueAssign<Integer> p) {
		if(p.getSecondOperand()==0) {
			throw new DivisionException("Entered value is zero, Division is not possible");
		}
		return p.getFirstOperand() / p.getSecondOperand();
	}
	
}
