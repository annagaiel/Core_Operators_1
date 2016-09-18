package one;

public class Operators {
/**
* Write a program to print the result of the following expressions 
* provided the integer variable a is 20 and b is 10.
 * @param args
 */
	public static void main(String[] args) {
		int a = 20;
		int b = a-- - --a;
		// a-- return 20 and subtracts one from a
		// a is now 19
		// --a return 18 and subtracts one from a
		// b = 20 - 18 
		System.out.println("b = " + b); 
		int c = a--; 
		// a-- returns 18 and subtracts one from a
		// a is now 17
		// c = 18
		System.out.println("c = " + c);
		int d = a >> 2;
		// The binary of 17 = 10001 
		// operator >> binary value must shift to the right 
		// Remove last two spots on the right = 100
		// Add two zero on two space at the front = 00100
		// The decimal value of 00100 is 4
		System.out.println("d = " + d);
		b = 10;
		int e = a & b;
		// operator & where output is one if both columns are 1s, else output is 0s 
		// a = 17; binary = 10001
		// b = 10; binary = 01010
		// & final output = 00000          
		// The decimal value of 00000 is 0
		System.out.println("e = " + e);

	}

}
