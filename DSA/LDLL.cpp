// Linear Double Linked List
#include <iostream>
#include <stdlib.h>
using namespace std;

class LDLL
{
    private: int info;
    public: LDLL * left;
    LDLL * right;
    LDLL(){}
    ~LDLL(){}

    friend int lengthH(LDLL * H);
    friend int lengthT(LDLL * T);
    friend void printH(LDLL * H);
    friend void printT(LDLL * T);
    
    friend void addnode(LDLL * &H, LDLL * &T, int data);
    friend void deleted(LDLL * &H, LDLL * &T, int data);

    friend bool PALINDRONE(const LDLL * H, const LDLL * T);
};

int lengthH(LDLL * H)
{
    int numb(0);
    while(H!=NULL)
    {
        ++numb;
        H=H->right;
    }
    return (numb);
}

int lengthT(LDLL * T)
{
    int numb(0);
    while(T!=NULL)
    {
        ++numb;
        T=T->left;
    }
    return (numb);
}

void printH(LDLL * H)
{
    if(H==NULL) cout<<"NULL LDLL\n";
    else
    {
        cout<<"LDLL of "<<lengthH(H)<<" nodes\n";
        while(H!=NULL)
        {
            cout<<H->info<<" ";
            H=H->right;
        }
        cout<<"From Head To Tail\n";
    }
}

void printT(LDLL * T)
{
    if(T==NULL) cout<<"NULL LDLL\n";
    else
    {
        cout<<"LDLL of "<<lengthT(T)<<" nodes\n";
        while(T!=NULL)
        {
            cout<<T->info<<" ";
            T=T->left;
        }
        cout<<"From Tail To Head\n";
    }
}

void addnode(LDLL *& H, LDLL *& T, int data)
{
    LDLL *temp;
    temp=new LDLL;
    if(temp==NULL)  exit(1);
    temp->info=data;
    temp->left=NULL;
    temp->right=NULL;
    if(H==NULL) H=temp;
    else
    {
        T->right=temp;
        temp->left=T;
    }
    T=temp;
}

void deleted(LDLL * &H, LDLL * &T, int data)
{
    if(H==NULL) return;
    LDLL *curr;
    curr = H;
    while((curr!=NULL) && (curr->info!=data))
    {
        curr=curr->right;
    }
    if(curr == NULL)
    {
        return;
    }
    if(curr == H)
    {
        if(H==T)
        {
            H=T=NULL;
        }
        else
        {
            H=curr->right;
            H->left=NULL;
        }
    }
    else if(curr == T)
    {
        T=curr->left;
        T->right=NULL;
    }
    else
    {
        (curr->right)->left=curr->left;
        (curr->left)->right=curr->right;
    }
    delete(curr);
}//End void deleted.

bool PALINDRONE(const LDLL * H, const LDLL * T)
{
    if(H==NULL)
    {
        return (false);
    }
    while((H!=T) && (H->left!=T))
    {
        if(H->info!=T->info)
        {
            return (false);
        }
        H=H->right;
        T=T->left;
    }
    return (true);
}   //End bool PALINDROME

void LDLL_TO_CDLL(LDLL *&H, LDLL *&T)
{
    if(H!= NULL)
    {
        H->left=T;
        T->right=H;
    }
}

int main()
{
    cout<<"Linear Double Linked List\n";
    LDLL *H = NULL;
    LDLL *T = NULL;
    int a[5] = {1,2,3,4,5};
    for(int i=0;i<5;i++)
    {
        addnode(H,T,a[i]);
        printH(H);
        printT(T);
    }

    cout<<"\nPalindrome: "<<PALINDRONE(H,T)<<"\n";
    
    cout<<"\nDuring Deletion\n\n";

    for(int i=0;i<5;i++)
    {
        deleted(H,T,a[i]);
        printH(H);
        printT(T);
    }
    return 0;
}