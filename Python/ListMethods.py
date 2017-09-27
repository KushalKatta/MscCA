#write your own python code for insert, reverse and remove

myList=[1,2,3,4,5,6,7]

#insert
print("INSERT METHOD")

num=(int(input("Enter a number to insert : ")))
pos=(int(input("Enter the position to insert at : ")))

myList.append(0)
for i in range(len(myList), pos, -1):
	myList[i-1]=myList[i-2]
myList[pos]=num

print(myList)

#remove
print("REMOVE METHOD")

num=(int(input("Enter a number to remove : ")))

flag=0

for i in range(0,len(myList)):
	if(num==myList[i]):
		#remove the element and shift to the left then break
		flag=1
		for j in range(i, len(myList)-1):
			myList[j]=myList[j+1]
		myList.pop()	
		break
if(flag==0):
	print("%d not found." %num)
else:
	print(myList)

#reverse
print("REVERSE METHOD")

i=0
j=len(myList)-1

while((i-j) not in [0,1]):
	temp=myList[i]
	myList[i]=myList[j]
	myList[j]=temp
	i=i+1
	j=j-1
print(myList)