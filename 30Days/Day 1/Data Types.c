
#include<stdio.h>


int main()
	
{
	
	int i=4;
	double d=4.00000;
	char s[100]="HackerRank";      	// It is already declare i,d,s.
	

	int inumber;
	double dnumber;
	char string[100];		// It is declare by user inumber,dnumber,string.

	scanf("%d",&inumber);

	scanf("%f",&dnumber);		 //Input of double use format specifier %f.

	scanf("%*[\n] %[^\n]",string);   /*      %*[\n] ignore new line input from the user accept one line input using %[^\n].
						string accept string without using %s */


	printf("%d\n",i+inumber);	  // Addition of two integer number.

	printf("%0.1lf\n",d+dnumber);	  /* Addition of two double number and result one decimal by using 0.1 and format specifier
					  is lf . */

	printf("%s%s",s,string);	  // Concatenate of two string using %s%s format specifier.

	return 0 ;
}
/*
INPUT
12
4.0
is the best place to learn and practice coding!
OUTPUT
16
4.0
HackerRankis the best place to learn and practice coding!
*/
