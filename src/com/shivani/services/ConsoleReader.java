package com.shivani.services;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.shivani.datatype.DoubleOperations;
import com.shivani.datatype.FloatOperations;
import com.shivani.datatype.IntegerOperations;
import com.shivani.exceptions.DivisionException;
import com.shivani.exceptions.NumberValidationException;
import com.shivani.interfaces.InputReader;
public class ConsoleReader implements InputReader {
	Scanner scan = new Scanner(System.in);
	private final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private ArrayList<String> historyStorage = new ArrayList<>();

	InputValidator validator = new InputValidator();
	public void integerOperations() {
		try {
		logger.log(Level.INFO, "Please enter input");
		String input = scan.nextLine();
		String[] values = input.split(" ");
		validator.check(input);
		IntegerOperations integer = new IntegerOperations();
		ValueAssign<Integer> value = new ValueAssign<>(Integer.parseInt(values[0]), Integer.parseInt(values[2]));
		logger.log(Level.INFO, "Please enter choice\n 1.Addition\n 2.Subtraction\n 3.multiplication\n 4.division");
		int integerResult;
        int option = Integer.parseInt(scan.nextLine());
        
        switch(option) {
        case 1:
        	integerResult = integer.addition(value);
            logger.log(Level.INFO, "Addition " + integerResult);
        	historyStorage.add(value.getFirstOperand() +  " + " + value.getSecondOperand() +  " = " + integerResult);
        	break;
        case 2: 
        	integerResult = integer.subtraction(value);
    		logger.log(Level.INFO, "Subtraction " + integerResult);
        	historyStorage.add(value.getFirstOperand() +  " - " + value.getSecondOperand() +  " = " + integerResult);

        	break;
        case 3: 
        	integerResult = integer.multiplication(value);
        	logger.log(Level.INFO, "Multiplication " + integerResult);
        	historyStorage.add(value.getFirstOperand() +  " * " + value.getSecondOperand() +  " = " + integerResult);

        	break;
        case 4:
        	integerResult = integer.division(value);
    		logger.log(Level.INFO, "Division "  + integerResult);
        	historyStorage.add(value.getFirstOperand() +  " / " + value.getSecondOperand() +  " = " + integerResult);
    		break;
    	default : logger.log(Level.INFO, " Please select values between 1 and 4 ");
    	 
    		break;
        }
		} catch(DivisionException | NumberValidationException message) {
			logger.log(Level.INFO, message.getMessage());
        	
		}
		

	}
	
	public void floatOperations() {
		try {
		logger.log(Level.INFO, "Please enter value");
		String input1 = scan.nextLine();
		String[] tempvalue = input1.split(" ");
		validator.checkFloat(input1);
		FloatOperations floatobj = new FloatOperations();
		ValueAssign<Float> value = new ValueAssign<>(Float.parseFloat(tempvalue[0]),Float.parseFloat(tempvalue[2]));
		logger.log(Level.INFO, "Please enter choice\n 1.Addition\n 2.Subtraction\n 3.multiplication\n 4.division");
		
		int option = Integer.parseInt(scan.nextLine());
        float floatResult;
		switch(option) {
        case 1:
        	floatResult = floatobj.addition(value);
        	logger.log(Level.INFO, "Addition " + floatResult);
        	historyStorage.add(value.getFirstOperand() +  " + " + value.getSecondOperand() +  " = " + floatResult);
    		
        	break;
        case 2: 

        	floatResult = floatobj.subtraction(value);
        	logger.log(Level.INFO, "Subtraction " + floatResult);
        	historyStorage.add(value.getFirstOperand() +  " - " + value.getSecondOperand() +  " = " + floatResult);
    		
        	break;
        case 3: 

        	floatResult = floatobj.multiplication(value);
    		logger.log(Level.INFO, "Multiplication " + floatResult);
    		historyStorage.add(value.getFirstOperand() +  " * " + value.getSecondOperand() +  " = " + floatResult);
    		
        	break;
        case 4:

        	floatResult = floatobj.division(value);
    		logger.log(Level.INFO, "Division " + floatResult);					
    		historyStorage.add(value.getFirstOperand() +  " / " + value.getSecondOperand() +  " = " + floatResult);
    		
    		break;
        } 
		} catch(DivisionException | NumberValidationException message) {
			logger.log(Level.INFO, message.getMessage());
        	
		}

		
	}
	
	public void doubleOperations() {
		try {
		logger.log(Level.INFO, "Please enter value");
		String inputvalue = scan.nextLine();
		String[] values = inputvalue.split(" ");
		validator.checkDouble(inputvalue);
		DoubleOperations doubleobj = new DoubleOperations();
		ValueAssign<Double> value = new ValueAssign<Double>(Double.parseDouble(values[0]), Double.parseDouble(values[2]));
		logger.log(Level.INFO, "Please enter choice\n 1.Addition\n 2.Subtraction\n 3.multiplication\n 4.division");

		int option = Integer.parseInt(scan.nextLine());
        double doubleRes;
		switch(option) {
        case 1:
        	doubleRes = doubleobj.addition(value);
        	logger.log(Level.INFO, "Addition " + doubleRes );
        	historyStorage.add(value.getFirstOperand() +  " + " + value.getSecondOperand() +  " = " + doubleRes);
    		
        	break;
        case 2: 
        	doubleRes = doubleobj.subtraction(value);
        	
        	logger.log(Level.INFO, "Subtraction " + doubleRes);
        	
        	historyStorage.add(value.getFirstOperand() + " - "+  value.getSecondOperand()  + " = " + doubleRes);
        	
        	break;
        case 3: 
        	doubleRes = doubleobj.multiplication(value);
        	
        	logger.log(Level.INFO, "Multiplication " + doubleRes);
        	historyStorage.add(value.getFirstOperand() + " * " + value.getSecondOperand() + " = " + doubleRes);
    		
        	
    		
        	break;
        case 4:
        	doubleRes = doubleobj.division(value);
        	
        	logger.log(Level.INFO, "Division " + doubleRes);					
        	historyStorage.add(value.getFirstOperand() + " / " + value.getSecondOperand()  + " = " + doubleRes);
    		
    		
    		break;
        }
		}catch(DivisionException | NumberValidationException message) {
			logger.log(Level.INFO, message.getMessage());
        	
		}
		
		
	}
	
	public void historyStorage() {
			for(String each : historyStorage) {
				logger.log(Level.INFO, each);
			}
	}
	public void readInput() {
		int choice;
		do {
			logger.log(Level.INFO, "MainMenu\n 1.Integer\n 2.Float\n 3.Double\n 4.history\n 5.end app");
	
			logger.log(Level.INFO, "please enter the choice");
	
			choice = Integer.parseInt(scan.nextLine());
			switch(choice) {
				case 1 :    integerOperations();
							break;
				case 2:
							floatOperations();
							break;	
			
				case 3:
							doubleOperations();
							break;
				case 4:
							historyStorage();
							break;
				case 5: 
							logger.log(Level.INFO, "Application has ended");
							break;
			
			
				default:
							logger.log(Level.INFO, "wrong choice entered");
							break;
			}
	
		} while(choice !=5);
	
	}
}
