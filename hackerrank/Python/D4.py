# # 
# Task division
# The provided code stub reads two integers,  and , from STDIN.

# Add logic to print two lines. The first line should contain the result of integer division,  // . The second line should contain the result of float division,  / .

# No rounding or formatting is necessary.
# # 


def printer(a, b):
    print(int(a//b))
    print(float(a/b)) 
        
if __name__ == '__main__':
    
    a = int(input())
    b = int(input())
        
    printer(a, b)
    