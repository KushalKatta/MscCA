#include <iostream>
#include <stdlib.h>
using namespace std;

class CQueueLL
{
	private:
		char info;
		CQueueLL *next;
	public:
	//NULL constructor
	CQueueLL(){}
	//destructor
	~CQueueLL(){}

	friend int nodes(CQueueLL *&F, CQueueLL *&R){
		int count=1; //if we initialise it to 0, we will have to increase it outside the while loop. Who will pay for its execution time?
		if (F==NULL)
		{
			return 0;
		}
		else{
			CQueueLL *temp;
			temp = F;
			while(temp!=R){
				++count;
				temp=temp->next;
			}
		}
		return count;
	}
	friend void print(CQueueLL *& F,CQueueLL *& R){
		if (F==NULL){
			cout<<"Empty Queue";
		}
		else{
			cout<<"Queue of "<<nodes(F,R)<<" nodes. \n";

			CQueueLL * temp=F;
			while(temp!=R){
				cout<<temp->info<<"     ";
				temp=temp->next;
			}
			cout<<temp->info<<endl;
		}
	}
	friend void enqueue(CQueueLL *& F, CQueueLL *& R, char data){
		CQueueLL * temp;
		temp=new CQueueLL;
		if(temp==NULL){
			cerr<<"NO MEM \n";
			exit(1);
		}
	        temp->next=NULL;
		temp->info = data;
		if(F==NULL){
			F=temp;
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
};
int main()
{
	cout<<"Circular Queue using Linked List \n";
	char ch='A';
	CQueueLL * front=NULL;
	CQueueLL * rear=NULL;
	cout<<"During enqueue \n";
	while(ch<='E')
    {
		enqueue(front, rear, ch);
		print(front, rear);
		++ch;
	}
	cout<<"During dequeue \n";
	while(front!=NULL)
    {
		dequeue(front, rear);
		print(front, rear);
	}
	cout<<"\n";
	return 0;
}//end main
