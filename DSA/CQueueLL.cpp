// Circular Queue as Linked List
#include <iostream>
#include <stdlib.h>
using namespace std;

class CQueueLL
{
private:
	char info;
	CQueueLL * next;
public:
	
	//NULL constructor
	CQueueLL(){}
	//destructor
	~CQueueLL(){}

	friend int nodes(const CQueueLL *& F, const CQueueLL *& R){
		int count=1; //if we initialise it to 0, we will have to increase it outside the while loop. Who will pay for its execution time?
		if (F==NULL){
			return 0;
		}
		else{
			CQueueLL * temp=F;
			while(temp!=R){
				++count;
				temp=temp->next;
			}
		}
		return count;
	}
	friend void print(const CQueueLL *& F, const CQueueLL *& R){
		if (F==NULL){
			cout<<"Empty Queue";
		}
		else{
			cout<<"Queue of "<<nodes(F,R)<<" nodes.";

			CQueueLL * temp=F;
			while(temp!=R){
				cout<<temp->info<<"     ";
				temp=temp->next;
			}
			cout<<temp->info;
		}
	}
	friend void enqueue(CQueueLL *& F, CQueueLL *& R, char data){
		CQueueLL * temp;
		temp=new CQueueLL;
		if(temp==NULL){
			exit(1);
		}
		if(F==NULL){
			F==temp;
		}
		else{
			R->next=temp;
		}
		R=temp;
		R->next=F;//circular link
	}
	friend void dequeue(CQueueLL *& F, CQueueLL *& R){
		CQueueLL * temp=F;
		if(F==R){
			F=R=NULL;
		}
		else{
			F=temp->next;
			R->next=F;
		}
		delete (temp);
	}

	int main()
	{
		cout<<"Circular Queue using Linked List";

		char ch='A';

		CQueueLL * front=NULL;
		CQueueLL * rear=NULL;

		cout<<"During enqueue";
		while(ch<='D'){
			enqueue(front, rear, ch);
			print(front, rear);
			++ch;
		}

		cout<<"During dequeue";
		while(front!=NULL){
			dequeue(front, rear);
			print(front, rear);
		}
		cout<<"\n";
		return 0;
	}//end main
};//end class