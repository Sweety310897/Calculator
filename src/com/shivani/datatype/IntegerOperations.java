package com.shivani.datatype;

import com.shivani.exceptions.DivisionException;
import com.shivani.interfaces.Calculator;
import com.shivani.services.ValueAssign;

public class IntegerOperations implements Calculator<Integer>{
	public Integer addition(ValueAssign<Integer> value) {		
		return value.getFirstOperand() + value.getSecondOperand();
	}
	public Integer subtraction(ValueAssign<Integer> value) {
		return value.getFirstOperand() - value.getSecondOperand();
	}
	public Integer multiplication(ValueAssign<Integer> value) {
		return value.getFirstOperand() * value.getSecondOperand();
	}
	public Integer division(ValueAssign<Integer> value) {
		if(value.getSecondOperand()==0) {
			throw new DivisionException("Entered value is zero, Division is not possible");
		}
		return value.getFirstOperand() / value.getSecondOperand();
	}
	
}
