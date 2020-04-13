package com.shivani.services;

public class ValueAssign<E> {
    private E firstOperand;
    private E secondOperand;
    ValueAssign(E firstOperand, E secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }
    public E getFirstOperand() {
    	return this.firstOperand;
    }
    public E getSecondOperand() {
    	return this.secondOperand;
    }
    public String toString() {
		return firstOperand +  " " + secondOperand;
	}
}
