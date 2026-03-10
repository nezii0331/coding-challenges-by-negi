# Write a function
# An extra day is added to the calendar almost every four years as February 29, and the day is called a leap day. It corrects the calendar for the fact that our planet takes approximately 365.25 days to orbit the sun. A leap year contains a leap day.

# In the Gregorian calendar, three conditions are used to identify leap years:

# The year can be evenly divided by 4, is a leap year, unless:
# The year can be evenly divided by 100, it is NOT a leap year, unless:
# The year is also evenly divisible by 400. Then it is a leap year.


def is_leap(year):
    leap = False  
    
    #we should know check whether this can be divid by 4 if not return if yes continute 
    # We return False immediately.
    if year % 4 != 0:
        return leap
    else:  #here are those might be leap
        
        # if can be multiply by 4 and then can't be divid by 100 then continute
        # Condition A: If it is divisible by 4 but NOT divisible by 100 (e.g., 1992, 2024).
        # It is a standard leap year.
        if year % 100 != 0:
            leap = True
            
        # if then can't be divide by 100 then can be divid by 400  then definite leap
        # 2. It is divisible by 400.
        # Condition B: If it IS divisible by 100, it must ALSO be divisible by 400 
        # to be considered a century leap year (e.g., 2000 is True, 1900 is False).
        elif year % 400 == 0:
            leap = True
            
    return leap


year = int(input())
print(is_leap(year))