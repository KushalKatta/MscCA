// Circular Double Linked List
#include <iostream>
#include <stdlib.h>
using namespace std;

class CDLL
{
    private: int info;
    public: CDLL * left;
    CDLL * right;
    CDLL(){}
    ~CDLL(){}

    friend int lengthH(CDLL * H);
    friend int lengthT(CDLL * T);
    friend void printH(CDLL * H);
    friend void printT(CDLL * T);

    friend void addnode(CDLL * &H, CDLL * &T, int data);
    friend void deleted(CDLL * &H, CDLL * &T, int data);
};

int lengthH(CDLL * H)
{
    if(H==NULL)
    {
        return (0);
    }

    int numb(1);
    CDLL *T;
    T=H->left;  //  --**--Imp Step--**--
    while(H!=T)
    {
        ++numb;
        H=H->right;
    }
    return (numb);
}

int lengthT(CDLL * T)
{
    if(T==NULL)
    {
        return (0);
    }

    int numb(1);
    CDLL *H;
    H=T->right;  //  --**--Imp Step--**--
    while(T!=H)
    {
        ++numb;
        T=T->left;
    }
    return (numb);
}

void printH(CDLL * H)
{
    if(H==NULL) cout<<"NULL CDLL\n";
    else
    {
        cout<<"CDLL of "<<lengthH(H)<<" nodes\n";
        CDLL *T;
        T=H->left;
        while(H!=T)
        {
            cout<<H->info<<" ";
            H=H->right;
        }
        cout<<H->info<<" From Head To Tail\n";
    }
}

void printT(CDLL * T)
{
    if(T==NULL) cout<<"NULL CDLL\n";
    else
    {
        cout<<"CDLL of "<<lengthT(T)<<" nodes\n";
        CDLL *H;
        H=T->right;
        while(T!=H)
        {
            cout<<T->info<<" ";
            T=T->left;
        }
        cout<<T->info<<" From Tail To Head\n";
    }
}

void addnode(CDLL *& H, CDLL *& T, int data)
{
    CDLL *temp;
    temp=new CDLL;
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
    T->right=H;     //New Circular Link
    H->left=T;      //New Circular Link
}

void deleted(CDLL * &H, CDLL * &T, int data)    //Here T needs to be changed, So accept as parameter because local will not work in this case.
{
    if(H==NULL) return;
    CDLL *curr;
    curr = H;
    while((curr!=NULL) && (curr->info!=data))
    {
        curr=curr->right;
    }
    //if(curr == NULL)
    if(curr->info!=data)    //Value Not Found
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
            H->left=T;
            T->right=H;
        }
    }
    else if(curr == T)
    {
        T=curr->left;
        T->right=H;
        H->left=T;
    }
    else
    {
        (curr->right)->left=curr->left;
        (curr->left)->right=curr->right;
    }
    delete(curr);
}//End void deleted.

void CDLL_TO_LDLL(CDLL *&H, CDLL *&T)
{
    if(H!= NULL)
    {
        H->left=NULL;
        T->right=NULL;
    }
}

int main()
{
    cout<<"Circular Double Linked List\n";
    CDLL *H = NULL;
    CDLL *T = NULL;
    int a[4] = {2,4,1,3};
    for(int i=0;i<4;i++)
    {
        addnode(H,T,a[i]);
        printH(H);
        printT(T);
    }

    cout<<"\nDuring Deletion\n\n";

    for(int i=0;i<4;i++)
    {
        deleted(H,T,a[i]);
        printH(H);
        printT(T);
    }
    return 0;
}
