// Linear Queue as Linked List
//============================================================================
// Name        : QueueLL.cpp
// Author      : Mihir Vohra
//============================================================================

#include <iostream>
using namespace std;

class QueueLL{
	private:
		char info;
		QueueLL  *next;
	public:
		//null constructor
		QueueLL(){}
		//destructor
		~QueueLL(){}
		friend int nodes(QueueLL *&F){
			QueueLL *temp;
			temp=F;

			int count=0;

			while(temp!=NULL){
				++count;
				temp=temp->next;
			}

			return count;
		}
		friend void print_nodes(QueueLL *&F){
			QueueLL *temp;
			temp=F;

			if(temp==NULL){
				cout<<"Queue Empty\n";
			}
			else{
				cout<<"Queue of "<<nodes(F)<<" nodes.\n";
				while(temp!=NULL){
					cout<<temp->info;
					temp=temp->next;
					cout<<"\n";
				}
			}
		}
		friend void enque(QueueLL *&F, QueueLL *&R, char data){
			QueueLL * temp;
			temp=new QueueLL();
			if(temp==NULL){
				exit(1);
			}
			temp->info=data;
			temp->next=NULL;
			if(F==NULL){
				F=temp;
			}
			else{
				R->next=temp;
			}
			R=temp;
		}
		friend void deque(QueueLL *&F, QueueLL *&R){
			QueueLL * temp;
			temp=F;

			if(F==R){
				F=NULL;
			}
			else{
				F=temp->next;
			}
			cout<<"Deleted node ----->   "<<temp->info<<endl;
			delete(temp);
		}
};

int main()
{
	cout<<"Linear Queue using Linked List\n";
	char ch='A';

	QueueLL *FRONT=NULL;
	QueueLL *REAR=NULL;

	cout<<"During Enqueue\n";
	while(ch<='E'){
		enque(FRONT, REAR, ch);
		print_nodes(FRONT);
		cout<<endl;
		++ch;
	}

	cout<<"\nDuring Dequeue\n\n";
	while(FRONT!=NULL){
		print_nodes(FRONT);
		deque(FRONT, REAR);
		print_nodes(FRONT);
		cout<<endl;
	}
	return 0;
}
