package com.shivani.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.shivani.exceptions.NumberValidationException;
import com.shivani.exceptions.OperatorException;

public class InputValidator {
	private final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public void check(String input) {
		String[] tempValues = input.split(" ");
		if(tempValues.length != 3) {
			throw new NumberValidationException("Enter correct values");
            
		}
		parseOperator(tempValues[1]);
		String regex = "[+-]?[0-9][0-9]*"; 
	    String firstValue = tempValues[0];
	    String secondValue = tempValues[2];
        Pattern pattern = Pattern.compile(regex); 
        System.out.print(firstValue + " " + secondValue);
        Matcher matcher1 = pattern.matcher(firstValue);
        Matcher matcher2 = pattern.matcher(secondValue);
        
        if(matcher1.find() && matcher1.group().equals(firstValue) && matcher2.find() && matcher2.group().equals(secondValue)) {
        	logger.log(Level.INFO, "It is a valid integer number"); 
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
		parseOperator(tempValues[1]);

		String regex = "[+-]?[0-9]+(\\.[0-9]+)?([Ee][+-]?[0-9]+)?"; 

		String firstValue = tempValues[0];
	    String secondValue = tempValues[2];
        Pattern pattern = Pattern.compile(regex); 
        System.out.print(firstValue + " " + secondValue);
        Matcher matcher1 = pattern.matcher(firstValue);
        Matcher matcher2 = pattern.matcher(secondValue);
        
        if(matcher1.find() && matcher1.group().equals(firstValue) && matcher2.find() && matcher2.group().equals(secondValue)) {
        	logger.log(Level.INFO, "It is a valid float number"); 
            
        } 
        	else {
        
            throw new NumberValidationException("Float Invalid number entered");
              	
        }
	}
	public void parseOperator(String operator) {
		if(!operator.equals("+")||!operator.equals("-")||!operator.equals("*")||!operator.equals("/"))
		{
			throw new OperatorException("Wrong operator used");
		}
	}
	public void checkDouble(String input1) {
		String[] tempValues = input1.split(" ");
		if(tempValues.length != 3) {
			throw new NumberValidationException("Enter correct values");
            
		}
		parseOperator(tempValues[1]);

		String regex = "-?[0-9]{1,13}(\\.[0-9]+)?";

		String firstValue = tempValues[0];
	    String secondValue = tempValues[2];
        Pattern pattern = Pattern.compile(regex); 
        System.out.print(firstValue + " " + secondValue);
        Matcher matcher1 = pattern.matcher(firstValue);
        Matcher matcher2 = pattern.matcher(secondValue);
        
        if(matcher1.find() && matcher1.group().equals(firstValue) && matcher2.find() && matcher2.group().equals(secondValue)) {
        	logger.log(Level.INFO, "It is a valid double number"); 
            
        } 
        	else {
        
            throw new NumberValidationException("Double Invalid number entered");
              	
        }

	}
}
