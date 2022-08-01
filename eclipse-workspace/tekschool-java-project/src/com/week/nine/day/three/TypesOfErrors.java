package com.week.nine.day.three;

public class TypesOfErrors {
	
//Compile: Syntax error; no method exists.
		//no semicolon, missing brackets etc.
			//These errors will be detected by java compiler 
				//and displays the error onto the screen while compiling.
	
//Logical: Mistakes made by programmer.
	//Expectation from output is not correct; 2 + 2 + 10 etc.
		//Wrong idea or concept was used while coding.
	
//Runtime: When code is run, error is happening. 
	//Run time errors are not detected by the java compiler. 
			//It is the JVM which detects it while the program is running.
	
//EXCEPTIONS| Parent Class: Throwable | Programmer/User/Client Errors 

//Compile Time Exceptions | Runtime Exceptions
	
//Arithmetic: Wrong input
//Memory: Goes out of stack due to indefinite loops
//Hardware:Technical problems
//Bad Programming Logic
//Environmental: Program terminates in the middle; out of scope from logic

//Exceptions are objects which has the information like where it occurred.
//Can occur in class, method name, or line number
//Lists type of the error and state of the program when the error occurred.
	
//Checked Exceptions | Compile Time Exceptions

//COMPILE TIME EXCEPTIONS | CHECKED EXCEPTIONS  
//Programmer Errors
//Handled by using try, catch, or throws keyword
//CHECKED EXC. NEED TO BE HANDLED (CHECKED).

//RUNTIME EXCEPTIONS | UNCHECKED EXCEPTIONS
//Not found compiling the code but during the execution of the program
//Compiler does not force the method to handle the exception
//JVM notifies the user
//Runtime: Bug present in application code-programmer fixes

//TRY AND CATCH | Fixing the problem
//TRY BLOCK contains code which may raise and exception
//Multiple CATCH BLOCKS can also be written -
//to handle different type of exceptions in a different way.
	
//THROWS | Fixing the problems
//Helps method top literally throw the exception to the running stack
//Throws the method to the previous method -
//which called the current method which threw the exception
//If no handler function is found, it is given to JVM to handle nothing
//CHECKED EXCEPTIONS: Handled by try, catch block, or by using throws clause
//Throws keyword must be used immediately after the method constructor
//Throws to previous methods from where it was called
//Throw keyword can be used anywhere by programmer - 
//to check if exceptions can be caught
	
//'FINALLY BLOCK' \ Fixing the problems
//Finally block gets executed whenever a try block exists
//Statements in finally block are executed - 
//regardless of exception being caught.
//Necessary actions before terminating the program
//Clean up codes can be included in the finally block

	
//CLASSIFYING EXCEPTIONS BY ITS DEFINitions
	//Built-in Exceptions
	//User-defined Exceptions
	//Built-in Exceptions are those which are already available under the Exception class of java.
	//User-defined Exceptions are defined by the user/programmer.





	

}
