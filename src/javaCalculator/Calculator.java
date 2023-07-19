package javaCalculator;
import java.util.Scanner;
import java.lang.Math;

public class Calculator {
		public static void main(String[] args) {
						arithOperations start = new arithOperations();
							start.arithCalc();	
					}	
			}

class arithOperations {
		 @SuppressWarnings("resource")
	public void arithCalc () {
		  			
		 try {	
			 char operator;
				int  result, input1, input2;
				Scanner scanner = new Scanner(System.in);
				
				 //User to enter operators
			System.out.println("Choose an operator: +, *, - or /, s (sin), c (cos), t (tan), p, e, r ");
			 		operator = scanner.next().charAt(0);
			 		
			 //Ask the user to enter the first number
			 		System.out.println("Enter first number");
			 			input1 = scanner.nextInt();
			 
			 	 if (operator != 's' && operator != 'c' && operator != 't' && operator != 'r') {
			                 // Ask the user to enter the second number
			                 System.out.println("Enter second number");
			                 input2 = scanner.nextInt();
			             } else {
			                 input2 = 0; // Set input2 to 0 for trigonometric functions and square root
			           }
			 	 		
		 switch(operator) {
		 case '+': // for addition
			 result = input1 + input2;
			 	System.out.println( input1 + " + " + input2 + " = " +  result);
			 	break;
			 	
		 case '*': //multiplication
			 result = input1 * input2 ;
			 	System.out.println( input1 + " * "+ input2 + " = " + result);
			 	break;
			 	
		 case '-': //subtraction
			 result = input1 - input2 ;
			 	System.out.println( input1 + " - " + input2 + " = " + result);
			 	break;
			 	
		 case '/': //division 
			 if (input2 == 0) {
				 	throw new ArithmeticException ("Can't divide by zero");
			 } else {
				result = input1 / input2 ;
			 	System.out.println( input1 + " / " + input2 + " = " + result);
			 }	 
			 break;
			 
			 case 's': // for sin
			        double radians = Math.toRadians(input1); // convert to radians
			        double sinResult = Math.sin(radians);
			        System.out.println("sin(" + input1 + ") = " + sinResult);
			        break;

		    case 'c': // for cosine 
		        radians = Math.toRadians(input1); // convert to radians
		        double cosResult = Math.cos(radians);
		        System.out.println("cos(" + input1 + ") = " + cosResult);
		        break;

		    case 't': // for tan
		        radians = Math.toRadians(input1); // convert to radians
		        double tanResult = Math.tan(radians);
		        System.out.println("tan(" + input1 + ") = " + tanResult);
		        break;
		        
		    case 'p': // for percentage
		    	 float Percentage;
		    	 Percentage = (float)((input1 * 100)/ (input2));
		    	 System.out.println("Percentage" + " = " +  Percentage );
		    	 break; 
		    	 
		
		    case 'e': //exponentiation 
		    	 double  outcome = Math.pow(input1 , input2);
		    	 System.out.println(input1 + " raised to the power of " + input2 + " is " + outcome );
		    	 break;
		    	 
		    case 'r': // calculation of square root
		         double num = 0;
		    	 num =  input1;
		    	 double root = Math.sqrt(num);
		    	 System.out.println(" The square root " + num + " is equal to " + root);
		    	 break;
		    	 
		 default : 
			 System.out.println("Invalid operator");
		 }
		 
		 scanner.close();
		 } catch (ArithmeticException e) {
			 System.out.println("Error:" +  e.getMessage());
			 
		 }catch (Exception e) {
	            System.out.println("An error occurred: " + e.getMessage());
			 } 
		 }
}

