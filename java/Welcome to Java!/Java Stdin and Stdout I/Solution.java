import java.util.*;

public class Solution 
{

    public static void main(String[] args)
   {
	
        Scanner scan = new Scanner(System.in);  // Scanner class is use to accept the input 
        
	int a = scan.nextInt();           //  String is concert into intger data type is use next. It is method of scanner class.
	int b = scan.nextInt();
	int c = scan.nextInt();
	
	scan.close();  // scan.close() use beacuse there is no input read
  
  
        System.out.println(a);
	System.out.println(b);
	System.out.println(c);
           

    }
}

/* INPUT
42
100
125 
OUTPUT 
42
100
125 
*/
