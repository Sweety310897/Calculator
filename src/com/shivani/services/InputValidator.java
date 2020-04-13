package com.shivani.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.shivani.exceptions.NumberValidationException;

public class InputValidator {

	public void check(String input) {
		String[] tempValues = input.split(" ");
		if(tempValues.length != 3) {
			throw new NumberValidationException("Enter correct values");
            
		}
		String regex = "[+-]?[0-9][0-9]*"; 
	    String firstValue = tempValues[0];
	    String secondValue = tempValues[2];
        Pattern pattern = Pattern.compile(regex); 
        System.out.print(firstValue + " " + secondValue);
        Matcher matcher1 = pattern.matcher(firstValue);
        Matcher matcher2 = pattern.matcher(secondValue);
        
        if(matcher1.find() && matcher1.group().equals(firstValue) && matcher2.find() && matcher2.group().equals(secondValue)) {
            System.out.println(firstValue + " is a valid integer number"); 
        } 
        	else {
        
            throw new NumberValidationException("Invalid number entered");
              	
        }
	}
	
	public void checkFloat(String input1) {
		String[] tempValues = input1.split(" ");
		if(tempValues.length != 3) {
			throw new NumberValidationException("Enter correct values");
            
		}
		String regex = "[+-]?[0-9]+(\\.[0-9]+)?([Ee][+-]?[0-9]+)?"; 

		String firstValue = tempValues[0];
	    String secondValue = tempValues[2];
        Pattern pattern = Pattern.compile(regex); 
        System.out.print(firstValue + " " + secondValue);
        Matcher matcher1 = pattern.matcher(firstValue);
        Matcher matcher2 = pattern.matcher(secondValue);
        
        if(matcher1.find() && matcher1.group().equals(firstValue) && matcher2.find() && matcher2.group().equals(secondValue)) {
            System.out.println("It is a valid float number"); 
        } 
        	else {
        
            throw new NumberValidationException("Float Invalid number entered");
              	
        }
	}
	public void checkDouble(String input1) {
		String[] tempValues = input1.split(" ");
		if(tempValues.length != 3) {
			throw new NumberValidationException("Enter correct values");
            
		}
		String regex = "-?[0-9]{1,13}(\\.[0-9]+)?";

		String firstValue = tempValues[0];
	    String secondValue = tempValues[2];
        Pattern pattern = Pattern.compile(regex); 
        System.out.print(firstValue + " " + secondValue);
        Matcher matcher1 = pattern.matcher(firstValue);
        Matcher matcher2 = pattern.matcher(secondValue);
        
        if(matcher1.find() && matcher1.group().equals(firstValue) && matcher2.find() && matcher2.group().equals(secondValue)) {
            System.out.println("It is a valid double number"); 
        } 
        	else {
        
            throw new NumberValidationException("Double Invalid number entered");
              	
        }

	}
}
