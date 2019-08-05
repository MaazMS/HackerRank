/*
	formet for space is %numberCharacter %15d
	%5 means 5 space before the outpot 
	%-5 measn 5 space after the ouput 
	%03 is use to print 0 zero before the ouput if the output is less then 3 for only integer(include byte, short, int, long )
	but if input is more then 3 or equal to three then zero (0) is ignore.
	%n for new line for printf and /n is not use new line its print as a string. 
 */
  
import java.util.Scanner;

public class Solution {

    public static void main(String[] args)
    {
            Scanner sc=new Scanner(System.in);
            
            System.out.println("================================");
            
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                
	           	System.out.printf("%-15s%03d %n",s1,x);            // %n for new line  
            }
            
            System.out.println("================================");
	

    }
}
/*OUTPUT 
================================
java 1
java           001 
php 20
php            020 
cpp 30000
cpp            30000 
================================

*/
