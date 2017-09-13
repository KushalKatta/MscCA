#include<iostream>
#include<stdlib.h>
using namespace std;

//begin class
//Binary Search Tree Right Threaded
class BSTRT{
private:
    int info;
    int thread; //1 for threaded node and 0 for non-threaded node
    BSTRT *left;
    BSTRT *right;
public:
    BSTRT(){}   //null constructor
    ~BSTRT(){}  //destructor

    //makes a node of a Tree
    //declared seperately because addnode() is recursive and thus shouldn't contain 'new'
    friend void makenode(BSTRT *&R, int data){
        BSTRT *temp;
        temp=new BSTRT;
        if(temp==NULL)
            exit(1);
        temp->info=data;
        temp->thread=1;
        temp->left=NULL;
        temp->right=NULL;
        cout<<"Node with "<<data<<" added in BST\n";
        R=temp;
    }//void

    //recursive function that adds a node into the binary search tree
    friend void addnode(BSTRT *&R, int data){
        BSTRT *curr, *temp;
        curr=R;
        //incoming node is the root node
        if (curr==NULL){
            makenode(R, data);
            R->right=R;
        }
        //incoming node is not the root node
        else{
            while(true){
                //incoming node is existing in the tree
                if (curr->info==data){
                    cout<<"Duplicate node with value "<<data<<" not added\n";
                    break;
                }
                //incoming node is less than current node
                else if(data<curr->info){
                    if(curr->left!=NULL)
                        curr=curr->left;
                    else{
                        makenode(temp, data);
                        curr->left=temp;
                        temp->right=curr;
                        break;
                    }
                }
                else if(curr->thread==0)
                    curr=curr->right;
                else{
                    makenode(temp, data);
                    temp->right=curr->right;
                    curr->right=temp;
                    curr->thread=0;
                    break;
                }
            }
        }
    }//void

    //traverses the tree in inorder manner and prints it
    //prints data sorted in ascending order
    friend void inorder(BSTRT *&R){
        BSTRT *curr;
        int limit, sw, start;
        start=0;
        sw=0;
        cout<<"Inorder Traversal\n";
        if(R!=NULL)
            limit=2;
        else
            limit=1;
        curr=R;
        while(true){
            if(curr==R)
                ++start;
            if(start>limit)
                break;
            if(sw==1)
                sw=0;
            else
                while(curr->left!=NULL)
                    curr=curr->left;
            cout<<curr->info<<"  ";
            if(curr->thread==1)
                sw=1;
            curr=curr->right;
        }
        cout<<"\n";
    }//void

};//end class

//main method
int main(){
    //declarations
    BSTRT *root=NULL;
    int a[13]={6,2,8,1,4,2,7,10,3,5,9,10,11};

    cout<<"\nBINARY SEARCH TREE with RIGHT THREADED NODES\n\n";

    //creating the BSTRT
    for(int j=0;j<13;j++)
        addnode(root, a[j]);
    cout<<"BSTRT rooted at "<<root<<"\n";
    inorder(root);

    return 0;
}//end main
