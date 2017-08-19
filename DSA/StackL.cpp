#include <iostream>
#include <stdlib.h>
using namespace std;

class STACKL //Stack Linked List
{
    private:    char info;
                STACKL *next;
    public:     STACKL(){}//NULL Constuctor
                friend void push(STACKL *&Top, char data);
                friend char pop(STACKL *&Top);
};

void push(STACKL *&Top/*STACKL *stk*/, char data)
{
    STACKL *temp;
    temp = new STACKL;
    if(temp==NULL)
    {
        cerr<<"No Memory\n";
        exit(1);
    }
    temp->info=data;
    temp->next=Top;
    Top=temp;
}
char pop(STACKL *&Top /*STACKL *stk */)
{
    char data;
    STACKL *temp;
    temp=Top;
    data=temp->info;
    Top=temp->next;
    delete(temp);
    return (data);
}

int main()
{
    cout<<"Stack Linked List\n";
    char ch='A'; //char ch('A'); //C++ Syntax
    STACKL *stk = NULL;

    cout<<"Data Pushed: ";
    while(ch<'F')
    {
        cout<<ch;
        push(stk,ch);
        ++ch;
    }
    cout<<"\nData Poped: ";
    while(stk != NULL)
    {
        cout<<pop(stk/*Top*/);
    }

    cout<<"\n";
    return 0;
}
