# Given an integer, n perform the following conditional actions:
# If n is odd, print Weird
# If n is even and in the inclusive range of 2 to 5, print Not Weird
# If n is even and in the inclusive range of 6 to 20, print Weird
# If n is even and greater than 20 , print Not Weird

if __name__ == '__main__':
    no = int(input().strip())
    if no % 2 !=0:
        print("Weird")
    else:
        if no >=2 and no<=5:
            print("Not Weird")
        if no >=6 and no<=20:
            print("Weird")
        if no>20:
            print("Not Weird")
