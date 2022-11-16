package exercise_7;

public class Multicatch_pipe {

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
//		ArrayIndexOutofBoundsException comes into the picture in this program when compiler goes through this a[6]=8  
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Error " +e);
		}

	}

}
// output :
//In the case of Arithmetic expression :
//Error java.lang.ArithmeticException: / by zero

// In the case of ArrayIndexOutofBoundsException :
//Error java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6


