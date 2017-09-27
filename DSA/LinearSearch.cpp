#include<iostream>
#include<stdio.h>
using namespace std;
void LSearch(int A[], int value, int N, int &here)
{
	bool found (false);
	int j (0);
	while(!found && (j < N))
	{
		found = A[j] == value;
		++j;
	}
	if(found)
	{
		here = --j;
	}
	else
	{
		here = -1;
	}
}

bool LSearch1(int A[], int value, int N)
{
	int j(0);
	while(j<N)
	{
		if(A[j] == value)
		{
			return true;
		}	
		++j;
	}
	return false;
}

int main()
{
	cout << "Linear Search in C++ \n";
	int A[9] = {6,18,25,63,22,42,39,82,5};
	int j;
	cout<<"LIST \n";
	for (j=0; j<9; ++j)
	{
		cout<<A[j]<<"  ";
	}
	cout<<endl;
	cout<<"Looking for 42 (using void function) \n";
	int h (0);
	LSearch(A, 42, 9, h);
	cout<<"Index Position = "<< h <<"\n";

	cout<<endl;
	cout<<"Looking for 39 (using bool function) \n";
	
	cout<<LSearch1(A,39,9)<<endl;	
}
