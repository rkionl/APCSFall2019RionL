/* Rion Leung 
  *August 29 2019
  *Period 4
  *Call math methods from the calculate library
  *Client Code or runner code
  */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(12));
		System.out.println(Calculate.cube(2));
		System.out.println(Calculate.average(4,8));
		System.out.println(Calculate.average(2, 4, 6));
		System.out.println(Calculate.toDegrees(3.4));
		System.out.println(Calculate.toRadians(60));
		System.out.println(Calculate.discriminant(2, 3, 4));
		System.out.println(Calculate.toImproperFrac(3, 1, 2)); 
		System.out.println(Calculate.toMixedNum(7,2));
		System.out.println(Calculate.foil(2,  3,  6,  -7, "n"));
		
		//Part 2
	
		System.out.println(Calculate.isDivisibleBy(4, 2)); 
		System.out.println(Calculate.absValue(-5));
		System.out.println(Calculate.max(2, 7));
		System.out.println(Calculate.max(5, 7, 9));
		System.out.println(Calculate.min(2, 7));
		System.out.println(Calculate.round2(100.723));
		
		
		//Part 3
		
		System.out.println(Calculate.exponent(2.0, 2));
		
	}

}