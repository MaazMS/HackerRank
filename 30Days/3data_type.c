// In this program use three data type int,double and string.
// use scanf() function after the declaration and initialization of variable.
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
int main(void)
{
	int i = 4;
	double d = 4.0;
	char s[] = "HackerRank ";
	int i2=12;
	double d2=4.0;
	char s2[]="is the best place to learn and practice coding ";
	scanf("%d", &i2);
	scanf("%lf", &d2);
	scanf("%*[\n] %[^\n]", s2);
	printf("%d\n", i + i2);
	printf("%.01lf\n", d + d2);
	printf("%s%s", s, s2);
	return 0 ;
}
/* output
16
8.0
HackerRank is the best place to learn and practice coding  */
