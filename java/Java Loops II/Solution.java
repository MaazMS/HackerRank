import java.util.*;
import java.io.*;

class Solution{ 

    public static void main(String []argh)
    {    
        Scanner in = new Scanner(System.in);
        int t=in.nextInt(); 
        
        for(int i=0;i<t;i++)
        {        
            int a=in.nextInt();
            int b=in.nextInt();
            int n=in.nextInt(); 
            
            for(int j=0;j<n;j++)
            { 
                 a+=b;
                if(j>0)
                System.out.print(" ");
                System.out.print(a);

                b=b*2;
            }
            System.out.println("");
        }
        in.close();
    }
}
/*INPUT
2
0 2 10
5 3 5 
OUTPUT 
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
*/
