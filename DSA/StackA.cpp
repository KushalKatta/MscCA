#include <iostream>
#include <stdlib.h>
using namespace std;

class STACKA //Stack Array
{
    private :   int size;
                int top;
                char *info;
    public :    STACKA (int SIZE = 1)
                {
                    if (SIZE < 1)
                    {
                        cerr<<"Improper Size\n";
                        exit(1);
                    }
                    info = new char [SIZE];
                    if (info == NULL)
                    {
                        cerr<<"No Memory";
                        exit(2);
                    }
                    size = SIZE;
                    top =-1;
                    cout<<"Created Stack of Size: "<<size<<"\n";
                }

                ~STACKA()
                {
                    cout<<"Deleting Stack of Size "<<size<<"\n";
                    delete []info;
                }

                bool empty() const //Precondition for POP
                {
                    if(top ==-1) return(true);
                    else return(false);
                }
                bool full() const //Precondition for PUSH
                {
                    if(top==size-1) return(true);
                    else return(false);
                }

                void push(char data)
                {
                    ++top; //Increase by 1 the data represented by top
                    info [top] = data;
                    //info[++top]=data;
                }
                char pop()
                {
                    char data;
                    data = info[top];
                    --top;
                    return data;
                }
};//End of Class

int main()
{
    cout<<"Stack as Array in C++\n";
    char ch='A'; //char ch('A');
    STACKA stk(5);
    if(stk.empty()) cout<<"Empty Stack\n";

    cout<<"Data Pushed: ";
    while(!stk.full())
    {
        cout<<ch;
        stk.push(ch);
        ++ch;
    }

    cout<<"\nData Poped: ";
    while(!stk.empty())
    {
        cout<<stk.pop();
    }
    if(stk.empty()) cout<<"\nEmpty Stack";
    cout<<"\nEnd of Job\n";
    return 0;
}
