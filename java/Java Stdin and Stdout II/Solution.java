/*
When you type characters using the keyboard, they are stored temporarily in a location in 
memory called the keyboard buffer or the type-ahead buffer.
 All keystrokes (One character) are stored in the keyboard buffer, including the Enter key.
1) The Scanner methods next(), nextInt(), and nextDouble() retrieve the next token in 
    the buffer up to the next whitespace, which might be a space, tab, or Enter key.
2) The nextLine() method reads all data up to the Enter key character.

If user enter the integer number and press enter it's call to nextInt() read interger number and input integer still queued in the 
input buffer then nextLine() will be reading the remainder of the integer line (which is empty). 
*/


import java.util.Scanner;

public class Solution 
{

    public static void main(String[] args) 
{
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();

	scan.nextLine();	// reading empty line 			
	
	String s = scan.nextLine();
	
        

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
/*
1
3.12
Maaz shaikh
String: Maaz shaikh
Double: 3.12
Int: 1

*/
