#include<iostream>
using namespace std;

void swap(int A[], int m, int n){
  int temp;
  temp=A[m];
  A[m]=A[n];
  A[n]=temp;
}
void makeHeapA(int A[],int N){
  bool done;
  int fn, lsn, rsn;
  done = false;
  while(!done){
    fn = 0;
    lsn = fn + fn+1;
    rsn = lsn + 1;
    while(rsn < N){
      if((A[fn]<A[lsn]) || (A[fn] < A[rsn])){
        if(A[lsn] > A[rsn])
          swap(A,fn,lsn);
        else
          swap(A,fn,rsn);
      }
      ++fn;
      lsn = fn+fn+1;  //2*fn +1 is expensive.. who will pay ?
      rsn = lsn +1;
    }
    if((lsn==(N-1)) && (A[fn]<A[lsn]))
      swap(A,fn,lsn);
    done = true;
    fn = 0;
    lsn = fn+fn+1;
    rsn = lsn+1;
    while(done && (rsn <N)){
      done = (A[fn]>=A[lsn]) && (A[fn]>=A[rsn]);
      ++fn;
      lsn = fn + fn+ 1;
      rsn = lsn + 1;
    }
    if(lsn==(N-1))
      done = done && (A[fn] >= A[lsn]);
  }
}
void HeapSortA(int A[], int N){
  while(N>1){
    makeHeapA(A,N);
    swap(A,0,N-1);
    --N;
  }
}

int main(){
  cout<<"Heap Sort in C++ \n";
  int A[15] = {15,13,1,9,2,8,12,3,14,7,10,4,6,5,11};
  int j;
  cout<<"Unsorted \n";
  for (j =0; j<15;++j){
    cout<<A[j]<<" ";
  }
  cout<<"\n Sorted << \n";
  for (j =0; j< 15; ++j){
    HeapSortA(A,15);
  }
  //swap(A,14,13);
  for (j = 0; j<15; ++j){
    cout<<A[j]<<" ";
  }
  cout<<endl;
}
