package exercise_7;

//Importing all input output classes
import java.io.*;

public class Trywithresource {

		public static void main(String[] args)
		{
			// Try block to check for exceptions
			try (

				// Creating an object of FileOutputStream
				// to write stream or raw data

				// Adding resource
				FileOutputStream fos
				= new FileOutputStream("gfgtextfile.txt")) {

				// Custom string input
				String text
					= "Hello World. This is my java program";

				// Converting string to bytes
				byte arr[] = text.getBytes();

				// Text written in the file
				fos.write(arr);
			}

			// Catch block to handle exceptions
			catch (Exception e) {
				
				System.out.println(e);
			}

			
			System.out.println(
				"Resource are closed and message has been written into the gfgtextfile.txt");
		}
	}

// output :
//Resource are closed and message has been written into the gfgtextfile.txt

