// Linear Single Linked List
#include <iostream>
#include <stdlib.h>
using namespace std;

class LSLL
{
    private: int info;
    LSLL *next;
    public: LSLL(){}    //Null Constructor
    ~LSLL(){}

    friend int length(const LSLL * H);
    friend void print(const LSLL * H);
    friend void addnode(LSLL *& H, LSLL *& T, int data);
    friend void deleted(LSLL *& H, LSLL *& T, int data);
    friend void reverse(LSLL *& H, LSLL *& T);  //Friend Function for Class LSLL for Simulating Reverse Traversal
    friend void sortLA(LSLL *& H, LSLL *& T);   //Method TO Sort Linked List in Assending Order
};

int length(const LSLL * H)
{
    int numb(0);
    const LSLL * temp;
    temp=H;
    while(temp!=NULL)
    {
        ++numb;
        temp=temp->next;
    }
    return (numb);
}

void print(const LSLL * H)
{
    const LSLL * temp(H);
    if(temp==NULL)
    {
        cout<<"NULL LSLL\n";
    }
    else
    {
        cout<<"LSLL of "<<length(H)<<" nodes\n";
        while(temp!=NULL)
        {
            cout<<temp->info<<"\n";
            temp=temp->next;
        }
        cout<<"\n";
    }
}

void addnode(LSLL *& H, LSLL *&T, int data)
{
    LSLL * temp;
    temp=new LSLL;
    if(temp==NULL)
    {
        exit(1);    //Exit Doesn't Delete Local Variable but Return Does. (Shayad)
    }
    temp->info=data;
    temp->next=NULL;
    if(H==NULL)
    {
        H=temp;
    }
    else
    {
        T->next=temp;
    }
    T=temp;
}

void deleted(LSLL *& H, LSLL *& T, int data)
{
    LSLL *curr, *ref;   //curr = Data to Delete     //ref=prev node
    if(H==NULL)
    {
        return;
    }
    curr=H;
    ref=NULL;
    while((curr!=NULL)&&(curr->info!=data))
    {
        ref=curr;
        curr=ref->next;
    }
    if(curr==NULL)
    {
        return;
    }
    if(curr==H)
    {
        if(H==T)
        {
            H=T=NULL;
        }
        else
        {
            H=curr->next;
        }
    }
    else if(curr==T)
    {
        T=ref;
        T->next=NULL;
    }
    else
    {
        ref->next=curr->next;
    }
    delete(curr);
}

void reverse(LSLL *& H, LSLL *& T)
{
    LSLL * curr, * left, * right;
    left=NULL;
    curr=H;
    while(curr!=NULL)
    {
        right=curr->next;
        curr->next=left;
        left=curr;
        curr=right;
    }
    T=H;
    H=left;
}

void sortLA(LSLL *& H, LSLL *& T)
{
    LSLL *curr, *temp, *min;
    int dummy;
    curr=H;
    if(curr==NULL)
    {
        return;
    }
    while(curr->next!=NULL)
    {
        min=curr;
        temp=curr->next;
        while(temp!=NULL)
        {
            if(temp->info < min->info)
            {
                min=temp;
            }
            temp=temp->next;
        }
        if(curr!=min)
        {
            dummy=curr->info;
            curr->info=min->info;
            min->info=dummy;
        }
        curr=curr->next;
    }//End of While Loop
}//End of void sortLA


int main()
{
    cout<<"Linear Single Linked List\n";
    LSLL *H = NULL;
    LSLL *T = NULL;
    int a[5] = {2,3,1,5,4};
    for(int i=0;i<5;i++)
    {
        addnode(H,T,a[i]);
        print(H);
    }

    // cout<<"\nDuring Deletion\n\n";

    // for(int i=0;i<5;i++)
    // {
    //     deleted(H,T,a[i]);
    //     print(H);
    // }

    sortLA(H,T);
    print(H);
    return 0;
}