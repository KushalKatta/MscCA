#Print Fibonacci Series upto 100
'''
i=2
j=1
print(i)
print(j)
while(i<100):
    print(i)
    i=i+j
    j=i-j
'''
#ArmStrong No: Sum of Cube of digits is no itself eg: no=153. Sum of Cube of digits = 13++53+33 = 153,370,371,407,1-9,1634,8208,9474,54748
'''
no=int(input("Enter a Number: "))

no1 = no
digits=len(str(no))
sum = 0
while(no1!=0):
    sum += (no1%10)**int(digits)
    no1=int(no1/10)
#print("Sum of Cube of Digits: ", sum)
#print("Entered Number: ", no)

if sum==no:
    print("Armstrong No")
else:
    print("Not Armstrong No")

'''
#Harshad No: No is perfectly divisible by sum of digits A the no. eg: 21 is divisible by 2+1.
'''
no=int(input("Enter a Number: "))

no1 = no
sum = 0
while(no1!=0):
    sum += no1%10
    no1=int(no1/10)
#print("Sum of Digits: ", sum)
#print("Entered Number: ", no)

if no%sum==0:
    print("Harshad No")
else:
    print("Not Harshad No")
'''
#Print all factors of a no
'''
no1=int(input("Enter A Number: "))

if no1>0:
    #strPrint=""
    print("Factors of", no1, "are :-")
    for i in range (1, no1+1):
        if(no1 % i == 0):
            #strPrint += ", " + str(i)
            print(i)
'''
