#include<stdio.h>
int main()
// Declare a variable named 'input_string' to hold our input.
// Read a full line of input from stdin and save it to our variable, input_string.
// Print a string literal saying "Hello, World." to stdout using printf.
// TODO: Write a line of code here that prints the contents of input_string to stdout.
{
    char input_string[105]; 
    scanf("%[^\n]", input_string); 
    printf("Hello, World.\n");
    printf("%s",input_string);
    return 0;
}
/* output
Hello, World.
Welcome to 30 Days of Code!             */
