# The included code stub will read an integer, n , from STDIN.
# Without using any string methods, try to print the following:
# 12345....
# Note that "....." represents the consecutive values in between.
#
# Example
# n = 5
# Print the string 12345.

## Explain * operator is called unpacking. You can do it in any iterable, not just range
if __name__ == '__main__':
    print( * range( 1, int(  input()) + 1), sep= "" )