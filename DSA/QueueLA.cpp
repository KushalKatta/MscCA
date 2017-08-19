#include <iostream>
#include <stdlib.h>
using namespace std;

class QUEUELA
{
    private: int size;
    int front;
    int rear;
    char * info;
    public: QUEUELA(int SIZE=1)
    {
        if(SIZE<1)
        {
            cerr<<"Improper Queue Size\n";
            exit(1);
        }
        info=new char[SIZE];
        if(info==NULL)
        {
            cerr<<"No Memory\n";
            exit(2);
        }
        size=SIZE;
        front=0;
        rear=-1;
        for(int j=0;j<size;++j)
        {
            info[j]='*';
        }
    }
    ~QUEUELA()
    {
        delete []info;
    }
    bool empty() const  //PreConditions for DeQueue
    {
        if(rear<front)
        {
            return (true);
        }
        else
        {
            return (false);
        }
    }
    bool full() const   //PreConditions for EnQueue
    {
        if(rear==size-1)
        {
            return(true);
        }
        else{
            return(false);
        }
    }
    int nodes() const{
        return (rear-front+1);
    }
    void print()
    {
        if(empty())
        {
            cout<<"Empty Queue, Can't Print\n";
        }
        else{
            //cout<<"Queue from Front to Rear\n";
            for(int j=0;j<size;++j)
            {
                cout<<info[j]<<" ";
            }
            cout<<"     Node = "<<nodes()<<"    ";
            cout<<"Front At : "<<front<<"    ";
            cout<<"Rear At : "<<rear<<"\n";
        }
    }
    void ENQ(char data)
    {
        info[++rear]=data;
    }
    void DEQ1()
    {
        info[front++]='*';
    }
    void DEQ2()
    {
        for(int j=front;j<rear;++j)
        {
            info[j]=info[j+1];
        }
        info[rear]='*';
        --rear;
    }
    void reinit()
    {
        front=0;
        rear=-1;
    }
};  //End of Class
int main()
{
    cout<<"Linear Queue as Array\n";
    char ch='A';
    QUEUELA Q(5);
    if(Q.empty())
    {
        cout<<"Empty Queue\n";
    }
    cout<<"Doing EnQueue\n";
    while(!Q.full())
    {
        Q.ENQ(ch);
        Q.print();
        ++ch;
    }
    cout<<"Doing DeQueue\n";
    while(!Q.empty())
    {
        Q.DEQ1();
        Q.print();
    }
    Q.reinit();
    cout<<"Doing EnQueue\n";
    ch='A';
    while(!Q.full())
    {
        Q.ENQ(ch);
        Q.print();
        ++ch;
    }
    cout<<"Doing DeQueue\n";
    while(!Q.empty())
    {
        Q.DEQ2();
        Q.print();
    }
    cout<<"\n";
    return 0;
}