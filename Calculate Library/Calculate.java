/*Rion Leung
*August 29 2019
*Period 4
*Group of methods that perform math calculations ( a library)
*/

public class Calculate {
	//A call to square returns the square of the value passed.
	//It accepts and returns an integer.
	public static int square (int number) {
		int answer = 0;
		answer = number * number;
		return answer;
		
	}
	//A call to cube returns the cube of the value passed.
		//It accepts and returns an integer.
	public static int cube(int number) {
		int answer = 0;
		answer = number * number * number;
		return answer;
			
	}
		//A call to average returns the average of the value passed.
		//It accepts and returns an integer.
		public static double average(double number1, double number2) {
			double answer = 0;
			answer = (number1 + number2)/2;
			return answer;
		}	
		//average Accepts three doubles and returns a double
		public static double average(double number1, double number2, double number3) {
			double answer = 0;
			answer = ((number1 + number2 + number3)/3);
			return answer;
		}
		//Converts an angle measure given in radians into degrees
		// accepts a double and returns a double 
		public static double toDegrees(double radians) {
			double answer = 0;
			answer = (radians * 180 * 3.1459);
			return answer;
		}
			
		//Converts a measure given in degrees to radians
		//accepts a double and returns a double
		public static double toRadians(double degrees) {
			double answer = 0;
			answer = (degrees * 3.1459 / 180);
			return answer; 
		}
		
		
		//It provides the coefficients of a quadratic equation in standard form 
		// Accepts 3 doubles and returns a double
		public static double discriminant( double a, double b, double c) {
			double answer = 0;
			answer = (b * b - 4*a*c);
			return answer;
		}
		
		
		//Converts a sequence of numbers that form a mixed number into an improper fraction
		// Accepts three integers and returns a string
		public static String toImproperFrac(int wholeNum, int numerator, int denominator) {
			int answer = 0;
			String end = "";
			answer = wholeNum * denominator + numerator;
			end = answer + "/" + denominator;
			return end;
		
		}
		//Use this as example
			
		
		//Converts a mixed number into an improper fraction 
		// Accepts two integers  and returns a string
		public static String toMixedNum(int numerator, int denominator) {
			String answer = "";
			int whole = numerator / denominator;
			int fraction = numerator % denominator; 
			answer = whole + " " + fraction + "/" + denominator; 
			return answer;
		}
		
		
		//Does the foil function
		// Accepts a sequence of 4 numbers followed by the variable 
		// Returns the foiled equation as a string
		public static String foil(int a, int b, int c, int d, String variable)  {
			int part1 = a * c;
			int part2 = a * d + b * c;
			int part3 = b * d;
			String answer = "";
			answer = part1 + variable + "^2 + " + part2 + variable + " + " + part3;
			return answer;
		}
		
		//isDivisibleBy
		// Finds out if an integer is divisible by another
		// Accepts two integers and returns a true or false
		public static Boolean isDivisibleBy(int a, int b) {
			if (b==0) {
				throw new IllegalArgumentException("invalid input");		
			}
			if (a % b == 0 ) {
				return true;
			}
				else {
					return false;
			}
		}
		
		
		// absValue
		// Accepts a double and returns the absolute value as a double
        public static double absValue(double input) {
		if (input > 0 ) {
			return  input;
		    }
		else {
			return input * -1;
            }
        }
		//max
		//Returns the larger of the values past
		//Accepts a double and returns a double
		public static double max(double input1, double input2) {
			if (input1 > input2) {
				return input1;
			}
			else {
				return input2;
			}
		}
		//max
		//Returns the larger of the values passed
		//Overload the max method to accept three doubles instead of two
		public static double max(double input1, double input2, double input3) {
			if (input1 > input2 && input1 > input3) {
				return input1;
		    }
			if  (input2 > input3) {
					return input2;
			}
			else {
					return input3;
			}
		}
		
		//Min
		//returns the lesser of the values passed
		//Accepts two integers and returns the smaller one
		public static double min(double input1, double input2) {
			if (input1 < input2) {
				return input1;
			}
			else { 
				return input2;
			}
		}
		
		//round2
		//Rounds a double correctly to two decimal places
		//Accepts a double and returns a double
		public static double round2(double input) { 
			double middle = (input * 100 +0.5);
			double answer =  ((int)middle) / 100.0;
			return answer;
			
		}
		
		//exponent
		//Uses loops to call methods 
		//accepts a double and returns a double
		public static double exponent(double base, int power) {
			if (power < 0) {
				throw new IllegalArgumentException("invalid input");
				
			}
			double answer = 1;
			for (int i = 1; i <= power; i++) { 
				answer = answer * base;
			}
				return answer; 
		}
		//factorial
		//it returns the factorial of the value passed
		// accepts integer and returns an integer
		public static int factorial(int input) {
			int answer = 1; 
			for (int i = 1; i<= input; i++) {
				answer = answer * i;
			}
				return answer;
		}
		
		//isPrime
		//Checks to see if integer is Prime or not
		public static boolean isPrime(int input) {
			
			for (int i = 2; i < input; i++) {
				if(isDivisibleBy(input, i)) {
					return false;
				}
			}
			return true;
			
			
		}
		//gcf
		//finds the greatest common factor between two integers
		//accepts two positive integers and returns an integer.
		public static int gcf(int int1, int int2) {
			int factor = 1;
			for (int i = 1; i <= absValue((min(int1, int2))); i++) {
				if(isDivisibleBy(int1, i) ==true && isDivisibleBy(int2, i) ==true) {
					factor = i;}
				}
			return factor; 
		}
		//sqrt
		//Finds the Square root of a value to 2 decimal places
		//Accepts an double and returns a double
		public static double sqrt(double input) {
			if ( input < 0 ) {
				throw new IllegalArgumentException("invalid input");
			}
			double check = 1;
			while(absValue(input - check * check)> 0.005) {
				check = 0.5*(input/check+check);
			}
			return round2(check);
		}
		//quadform
		//uses the coeffients of a quadratic equation in standard form and uses
		//the quadratic formula to approximate the real roots if any.
		//Accepts three integers and returns a string
		public static String quadForm(int a, int b, int c) {
			//Throw exception if the a value is 0 in this code segment
			double root1 = 0; 
			double root2 = 0;
			if(a == 0) { 
				throw new IllegalArgumentException("invalid input");
			}
			if (discriminant(a, b, c) < 0) {
				return "no real roots";
			}
			else if (discriminant(a, b, c) == 0 ) { 
				root1 = (-b/(2 *a));
				return root1 + "";	
			}	
			else  {
		    root1 = round2(-b + (sqrt(discriminant(a, b, c))) / (2.0 * a));
			root2 = round2(-b - (sqrt(discriminant(a, b, c))) / (2.0 * a));
 				return min(root1, root2) + " and " +  max(root1, root2);
			}		
		}
	}


		

