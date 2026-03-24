# D9 
# Given the participants' score sheet for your University Sports Day, you are required to find the runner-up score. You are given  scores. Store them in a list and find the score of the runner-up.

# if __name__ == "__main__":
#     n = int(input())
#     A = [int(x) for x in input().split()]
#     #python don't have int[]
# # print (n)
# # print (A)

# # method 1

#     maxone = A[0]
#     for i in A:
#         if i > maxone:
#             maxone = i
#     # print (maxone)
            
#     ans = -100
#     for x in A:
#         if x < maxone and x > ans:
#             ans = x
#     print(ans)

# method 2
if __name__ == "__main__":
    n = int(input())
    A = [int(x) for x in input().split()]
    
    clean_a = set(A)           
    clean_a.remove(max(clean_a)) 
    print(max(clean_a))          


