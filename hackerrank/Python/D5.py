# Task
# The provided code stub reads an integer, n , from STDIN. For all non-negative integers i<n, print i*i.

# Example

def printsquare(a):
    # according to a 
    # for(int i = 0 ; i< a; i++)
    for i in range(a):
        ans = i*i;
        print(ans)


if __name__ == '__main__':
    # a = input(system.in(n))
    a = int(input())
    printsquare(a);
