Sample Input
STDIN       Function
-----       --------
AABCAAADA   s = 'AABCAAADA'
3           k = 3

Sample Output
AB
CA
AD


def merge_the_tools(string, k):
    # your code goes here
    # print(string)
    # print(len(string))
    # print(k)
    
    length = len(string)
    # int(after)
    
    # first: i got the number
    if len(string) != 0 :
        after = len(string) // k; 
        
    # print (after) 
    
    # second: i need the put them into map and set to delete duplicate
    for i in range(after):
        start_index = i * k
        end_index = start_index + k
        
        new = string[start_index:end_index]
        
        # print(new)
    
        result = ""
        
        for char in new:
            if char not in result:
                result += char
                
        print(result)
        
        
            # start_index = i * k
            # end_index = start_index + k
            # sub_string = string[start_index:end_index]
            

            # my_map = dict.fromkeys(sub_string)
            

            # result = "".join(my_map)
            # print(result)
        
    
    # # then i got this after n/k 
    # # i need to loop the index divid them into after char and print
    # for i in string:
    #     if i = k 
    #     then print them 
        
    

if __name__ == '__main__':
    string, k = input(), int(input())
    merge_the_tools(string, k)
