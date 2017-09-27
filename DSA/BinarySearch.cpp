#include<iostream>
using namespace std;

void SearchA(int A[], int N, int value, int &here)
{
        int low(0), high(N-1), mid;
        while(low <= high)
        {
                mid = (low + high) / 2;
                if(value == A[mid])
                {
                        here = mid;
                        return;
                }
                else if(value < A[mid])
                {
                        high = mid - 1;
                }
                else
                {
                        low = mid + 1;
                }
        }
        here = -1;
}

int main()
{
        cout << "Binary Search in C++ \n";
        int A[9] = {6,18,25,37,42,56,63,78,89};
        int j;
        cout<<"LIST \n";
        for (j=0; j<9; ++j)
        {
                cout<<A[j]<<"  ";
        }
        cout<<endl;
        cout<<"Looking for 63 \n";
        int h (0);
        SearchA(A, 9, 63, h);
        cout<<"Index Position = "<< h <<"\n";
}
