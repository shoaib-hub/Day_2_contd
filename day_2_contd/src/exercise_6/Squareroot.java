package day_2_contd;

import java.util.Scanner;
//Java Program to Calculate the square root of a number  
public class Squareroot   
{  
  public static void main(String[] args)    
  {
      try{
      //Take input from the user
      //Create an instance of the Scanner class
      Scanner sc = new Scanner(System.in); 
    System.out.println("Enter a number: ");  
      int num = sc.nextInt(); 
       Double no = sc.nextDouble();
      if(num<0){
    	    num = -num;
    	    Double ans = Math.pow(num, 0.5);
    	    System.out.println("The result is: " + ans + "i");
    	}
      else {
      Double squareroot = Math.sqrt(num);
      System.out.println("The Square Root of the Given Number  " + num + "  =  " + squareroot);
      }
      Double square = Math.sqrt(no); 
      System.out.println("The Square Root of the Given Number  " + no + "  =  " + square);
 }
 catch(Exception e){
     System.out.println(e);
 }
  }
}  
 // output :
// 1 :
// Enter a number: 
// -44  Here the input is negative integer
// 3.232
// The result is: 6.6332495807108i
// The Square Root of the Given Number  3.232  =  1.7977764043395386

// // 	2 :
// Enter a number: 
// 36  The input is positive integer
// 4.223 The input is decimal number
// The Square Root of the Given Number  36  =  6.0
// The Square Root of the Given Number  4.223  =  2.0549939172659366

