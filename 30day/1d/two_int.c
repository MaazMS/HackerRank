#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#include <conio.h>
int solveMeFirst(int a, int b)
{
    // Hint: Type return a+b; below
      int c;
      c=a+b;
      return c;
}
int main()
{
    int num1,num2;
    clrscr();
    scanf("%d %d",&num1,&num2);
    int sum;
    sum = solveMeFirst(num1,num2);
    printf("%d",sum);
    getch();
    return 0;
}
// In this program usre inter the two integer number. the sum of two integer is give the user.
/* output
20
20
40 */
