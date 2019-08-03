import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
If n is odd, print Weird
If n is even and in the inclusive range of  2 to 5 , print Not Weird
If n is even and in the inclusive range of 6  to 20 , print Weird
If n is even and greater than 20 , print Not Weird
*/ 

public class Solution 
{



    private static final Scanner scanner = new Scanner(System.in);  
    
	  /*
		By definition  a final variable can only be assigned once.
		By definition static fields of a class are initialized when the class is loaded.
		A Java field is a variable inside a class.
		static final variable  which can’t be reinitialize.
	  */
  
    public static void main(String[] args) 
	{
  
        int N = scanner.nextInt();
        
	if (N%2==1)
	{
  
		System.out.println("Weird ");
    
	}
  
	else 
	{
  
		if (N>=1 && N<=5)
		{
    
			System.out.println("Not Weird  ");	
      
		}
    
		else if(N>=6 && N<=20)
		{
    
			System.out.println("Weird ");
      
		}
    
		else
		{
    
			System.out.println("Not Weird ");	
      
		} 
    
	}
	
   scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
   
	  /*
		[] Matches single character present in. 
		? matches exactly zero or one of the previous character.
		| Alternative 
		This all are Unicode Character. 
		Name : LINE SEPARATORT ,this ignores newlines. U+2028 	
		Name : PARAGRAPH SEPARATOR ,u2029 use ?
		Name : <control> . use ?	
	  */
  
     scanner.close();
    }
}

