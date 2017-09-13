#include<iostream>
using namespace std;


void swap(int A[], int m, int n){
  int temp;
  temp=A[m];
  A[m]=A[n];
  A[n]=temp;
}
void splitHere(int A[], int first, int last, int &here){
  int value, left, right;
  value = A[first];
  right = first+1;
  left = last;
  while(right <=left ){
    while((right <= left) && (A[right] <= value))
    ++right;
    while((right<=left) && (A[left] > value))
    --left;
    if(right <=left){
      swap(A, left, right);
      ++right;
      --left;
    }
  }
  swap(A, first, left);
  here = left;
}
void quickA(int A[], int first, int last){
  int here;
  if(first<last){
    splitHere(A, first, last, here);
    quickA(A, first, here-1);
    quickA(A, here+1, last);
  }
}

int main(){
  cout<<"Quick Sort in C++ \n";
  int A[15] = {15,13,1,9,2,8,12,3,11,7,10,4,6,5,14};
  int j;
  cout<<"Unsorted \n";
  for (j =0; j<15;++j){
    cout<<A[j]<<" ";
  }
  cout<<"\n Sorted << \n";
  for (j =0; j< 15; ++j){
    quickA(A,0,14);
  }
  for (j = 0; j<15; ++j){
    cout<<A[j]<<" ";
  }
}
