// Circular Single Linked List
//============================================================================
// Name        : CSLL.cpp
// Author      : Mihir Vohra
//============================================================================

#include<iostream>
using namespace std;

class CSLL
{
private:
	int data;
	CSLL *next;
public:
	CSLL(){}
	~CSLL(){}

	friend int length(CSLL *&H, CSLL *&T){
		int length=1;
		CSLL *temp;
		if(H==NULL)
			return 0;
		else{
			temp=H;
			while(temp!=T){
				++length;
				temp=temp->next;
			}
		}
		return (length);
	}

	friend void print(CSLL *&H, CSLL *&T){
		CSLL *temp;
		if(H==NULL)
			cout<<"\n\nEmpty list\n";
		else{
			cout<<"\nCSLL of "<<length(H, T)<<" nodes\n";
			temp=H;
			while(temp!=T){
				cout<<temp->data<<"   ";
				temp=temp->next;
			}
			cout<<temp->data<<endl;
		}
	}

	friend void addNode(CSLL *&H, CSLL *&T, int data){
		CSLL *temp;
		temp=new CSLL;
		if (temp==NULL){
			exit(0);
		}
		temp->data=data;
		if(H==NULL)
			H=temp;
		else
			T->next=temp;
		T=temp;
		T->next=H;
	}

	friend void deleteNode(CSLL *&H, CSLL *&T, int data){
		CSLL *curr, *ref;
		if(H==NULL){
			cout<<"List Empty";
			return;
		}
		curr=H;
		ref=NULL;
		while((curr!=T)&& (curr->data!=data)){
			ref=curr;
			curr=ref->next;
		}
		if(curr->data!=data)
			return;
		if(curr==H){
			if(H==T)
				H=T=NULL;
			else{
				H=curr->next;
				T->next=H;
			}
		}
		else if(curr==T){
			T=ref;
			T->next=H;
		}
		else
			ref->next=curr->next;
		cout<<"Deleted Node ----> "<<curr->data;
		delete(curr);
	}

	friend void CSLLtoLSSL(CSLL *&H, CSLL *&T){
		if(H!=NULL)
			T->next=NULL;
	}

	friend void printLSLL(CSLL *& H){
        CSLL * temp(H);
        if(temp==NULL){
            cout<<"NULL LSLL\n";
        }
        else{
			cout<<endl;
            while(temp!=NULL){
                cout<<temp->data<<"    ";
                temp=temp->next;
            }
        }
    }
};

int main() {
	cout<<"Circular Singly Linked List\n\n";
	CSLL *H = NULL;
	CSLL *T = NULL;

	int a[5] = {1,2,3,2,4};
	cout<<"During Insertion";
	for(int i=0;i<5;i++){
		addNode(H,T,a[i]);
		print(H, T);
	}

	cout<<"\nDuring Deletion\n";
	for(int i=0;i<5;i++){
		print(H, T);
		deleteNode(H,T,a[i]);
		print(H, T);
	}

	for(int i=0;i<5;i++){
		addNode(H,T,a[i]);
	}
	cout<<"\nConverting CSLL to LSLL";
	CSLLtoLSSL(H,T);
	printLSLL(H);

	return 0;
}
