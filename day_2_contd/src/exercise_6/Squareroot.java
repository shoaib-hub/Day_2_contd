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
      Double squareroot = Math.pow(num, 0.5);
      System.out.println("The Square Root of the Given Number  " + num + "  =  " + squareroot);

 }
 catch(Exception e){
     System.out.println(e);
 }
  }
}  
 // output :
//Enter a number: 
//64
//The Square Root of the Given Number  64  =  8.0

//EXCEPTION CASE :
	