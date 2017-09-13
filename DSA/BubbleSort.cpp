#include<iostream>
using namespace std;

//method to swap values
void swap(int A[], int m, int n){
	int temp;
	temp=A[m];
	A[m]=A[n];
	A[n]=temp;
}//void

//using bubble sort to sort array in Ascending order
void BubbleA(int A[], int N){
	int j;
	while(N>1){
		for(j=0; j<N-1; ++j)
			if(A[j] > A[j+1])
				swap(A, j, j+1);
		--N;
	}
}//void

//using bubble sort to sort array in Descending order
void BubbleD(int A[], int N){
	int j;
	while(N>1){
		for(j=0; j<N-1; ++j)
			if(A[j] < A[j+1])
				swap(A, j, j+1);
		--N;
	}
}//void

//main method
int main(){
    //declarations
    int A[5]={5, 3, 4, 1, 2};
    int j;

    cout<<"Bubble Sort\n\n";

    //displaying the Unsorted array
    cout<<"Unsorted Array\n";
    for(j=0; j<5; ++j)
        cout<<A[j]<<"  ";
    cout<<"\n";

    //bubble sort in ascending order
    BubbleA(A, 5);
    cout<<"Ascending Array\n";
    for(j=0; j<5; ++j)
        cout<<A[j]<<"  ";
    cout<<"\n";

    //bubble sort in descending order
    BubbleD(A, 5);
    cout<<"Descending Array\n";
    for(j=0; j<5; ++j)
        cout<<A[j]<<"  ";
    cout<<"\n";

    return 0;
}//end main
