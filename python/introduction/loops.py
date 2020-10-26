# The provided code stub reads and integer,n , from STDIN. For all non-negative integers i < n , print i square
if __name__ == '__main__':
    no = int(input())
    if no >= 1 and no <=20:
        for i in range(no):
            print(i * i)
