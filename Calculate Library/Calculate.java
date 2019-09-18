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
		public static String isDivisibleBy(int a, int b) {
			if (a % b == 0 )
				return "True";
				else
					return "False";
		}
		
		
		// absValue
		// Accepts a double and returns the absolute value as a double
        public static double absValue(double input) {
		if (input > 0 )
			return  input;
		else
			return input * -1;
        }
		
		//max
		//Returns the larger of the values past
		//Accepts a double and returns a double
		public static double max(double input1, double input2) {
			if (input1 > input2)
				return input1;
			else 
				return input2;
			}
		
		//max
		//Returns the larger of the values passed
		//Overload the max method to accept three doubles instead of two
		public static double max(double input1, double input2, double input3) {
			if (input1 > input2 && input1 > input3)
				return input1;
			if  (input2 > input3)
					return input2;
				else
					return input3;
		}
		
		//Min
		//returns the lesser of the values passed
		//Accepts two integers and returns the smaller one
		public static int min(int input1, int input2) {
			if (input1 < input2)
				return input1;
			else 
				return input2;
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
			
			double answer = 1;
			for (int i = 1; i <= power; i++) { 
				answer = answer * base;
			}
				return answer; 
		}
		//factorial
		//it returns the factorial of the value passed
		// accepts integer and returns an integer
		//public static int factorial(int input) {
			//int answer = 0; 
			//for (int i)
		//}
		
		}
	

