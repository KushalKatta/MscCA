#include<iostream>
using namespace std;

void InsertionA(int A[], int N){
  int i, j, temp;
  for (j=1;j<N;++j){
    temp = A[j];
    i = j-1;
    while((i>=0) && (A[i]>temp)){
      A[i+1] = A[i];
      --i;
    }
    A[i+1] = temp;
  }
}
int main(){
  cout<<"Insertion Sort in C++ \n";
  int A[15] = {15,13,1,9,2,8,12,3,11,7,10,4,6,5,14};
  int j;
  cout<<"Unsorted \n";
  for (j =0; j<15;++j){
    cout<<A[j]<<" ";
  }
  cout<<"\n Sorted << \n";
  for (j =0; j< 15; ++j){
    InsertionA(A,15);
  }
  for (j =0; j<15;++j){
    cout<<A[j]<<" ";
  }
}
