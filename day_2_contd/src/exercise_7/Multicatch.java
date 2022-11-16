package exercise_7;

public class Multicatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// creating a new array 
			int a[]=new int[6]; 
			a[6]=8;
			int i=7;
			int j=0;
			int k=i/j;
			System.out.println("output is" + k);
		}
		// Arithmetic expression is comes into the picture when j value is "zero".
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by Zero ");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Limit Exceeded ");
		}
		// If something exception occurs this Exception comes into the picture
		catch(Exception e) {
			System.out.println("something went wrong");
		}

	}

}

