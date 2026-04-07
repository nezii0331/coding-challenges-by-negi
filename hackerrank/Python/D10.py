# Given the names and grades for each student in a class of  students, store them in a nested list and print the name(s) of any student(s) having the second lowest grade.
# Note: If there are multiple students with the second lowest grade, order their names alphabetically and print each name on a new line.

# Sample Input 0
# 5
# Harry
# 37.21
# Berry
# 37.21
# Tina
# 37.2
# Akriti
# 41
# Harsh
# 39

# Sample Output 0
# Berry
# Harry


if __name__ == "__main__":
    howmany = int(input())
    
    # print(howmany)
        
    # initialte the math
    records = []
    scores = []
    
    ans = []
        
    for i in range(howmany):
        name = input()
        score = float(input())
        # print(name)
        # print(score)
        
        # need to let it add into those elements
        records.append([name, score])
        scores.append(score)
        
        # print("records: ", records)
        # print("scores: ", scores)
        
    # remove duplicate
    clean_scores = set(scores)
    # print(clean_scores)
    clean_scores.remove(min(clean_scores))
    # print(clean_scores.remove)
    second_lowest = min(clean_scores)
    # print(second_lowest)
    
    for name, score in records:
        if(score == second_lowest):
            ans.append(name)
            # print(ans)
            ans.sort()
            
    for name in ans:
        print(name)
    
    # y = len(ans)-1
    # while y >= 0 :
    #     print (ans[y])    
    #     y -=1
        
    
    
    # ?below are some random thoughts
    # ans = math.min(scores)   here i will find the lowest number  
    # if(ans == records):
        # records.remove(records)
    # ans = math.main(records)
        # print(ans)
        
    #     if(score < ans && score > other.score):
    #         print(name)
    
    # i wanna find the lowest number and then fun second lowest then print the name if it's second number lowest
 
