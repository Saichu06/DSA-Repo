# Reverse a number / Palindrome checking
a = int(input("Enter a number : "))
b = 0
while(a!=0):
    b = b * 10 + a % 10;
    a = a//10;


if(a==b): print("Palindrome")
else: print("Palindrome")






# 121 
# 1. 
# a = 121
# b = 0

# b = 0 * 10 + 1
# b = 1

# a = 12

# 2. 

# a = 12 
# b = 1

# b = 1 * 10 + 12 % 10
# b = 10 + 2 = 12 

# a = 1

# 3. 

# a = 1
# b = 12

# b = 12 * 10 + 1 % 10
# b = 120 + 1 = 121

# a = 0 






# // 121 - 1 extract 

# b = 121 reverse order la store pannanum

# 1st step : 

# a last digit must become b's first digit 
# 121 - 1 must be come b's first digit 

# 121%10 - 1

# initial value of b = 0 ;
 
# + - we wont use

# b = b * 10 + a % 10;
# 0 = 0 * 10 + 121 % 10;
# b = 0 + 1 = 1 

# a = 121 
# to reduce a's value so that we can choose the next number 
# 65//10 = 6 
# 456//10 = 45
# 1034//10 = 103

# a = a // 10;


