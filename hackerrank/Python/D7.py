
# print function
# The included code stub will read an integer, n , from STDIN.

# Without using any string methods, try to print the following:
# Sample Input 0
# 3

# Sample Output 0
# 123

if __name__ == "__main__":
    n = int(input()) #i should based on the n then loop the number n
    output = str(n)
    
    # if n <= 0 : 
        # break
    
    for i in range(1, n+1) :
        output = str(i)
        # print(output) #this to debug
        
        print(i, end = "")
        
    