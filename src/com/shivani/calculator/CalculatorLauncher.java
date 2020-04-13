package com.shivani.calculator;

import com.shivani.interfaces.InputReader;
import com.shivani.services.ConsoleReader;

public class CalculatorLauncher {
	public static void main(String[] args) {
		InputReader inputReader = new ConsoleReader();
		inputReader.readInput();
	}
}
