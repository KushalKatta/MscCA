'''
Write a Program
'''
# def pr():   #defining a function
#     print("In Function")
# def pr(n):   #defining a function
#     print("In Function : %d" %(n))

# pr()    #Calling the function

# n=int(input("Enter a Number: "))
# pr(n)

# def factorial(n):
#     f=1
#     for i in range(1,n+1):
#         f=f*i
#     return f

# fact = factorial(n)
# print("Factorial of Number %d = %d" %(n,fact))

# def primeNo(no):
#     prime='Y'
#     if (no<=1):
#         prime='N'
#     else:
#         for i in range(2,int(no/2)+1): #no square root is also OK like no / 2
#             if(no%i==0):
#                 prime='N'
#                 break
#     if prime=='Y':
#         # print("%d is a Prime Number" %(no))
#         return True
#     else:
#         # print("%d is not a Prime Number" %(no))
#         return False

# primeNum = primeNo(n)

# if (primeNum==True):
#     print("%d is a Prime Number" %(n))
# else:
#     print("%d is not a Prime Number" %(n))

# for i in range(1,100):
#     primeNum = primeNo(i)
#     if (primeNum==True):
#         print("%d is a Prime Number" %(i))

# def f1(a,b,c):
#     print(a)
#     print(b)
#     print(c)

# f1(10,20,30)
# f1(b=10, a=20, c=30)
# f1(10, b=20, c=30)

def f1(arg,*argv):
    print(arg)
    for i in argv:
	    print(i)

f1(30,40,50,60)