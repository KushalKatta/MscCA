#include<iostream>
#include<stdlib.h>
using namespace std;

//forward declaration of class
//BST - Binary Search Tree
class BST;

//StackBST class that implements nodes of a tree as stack using linked list
//simulating inorder traversal of a tree without recursion
class StackBST{
private:
    BST *address;
    StackBST *next;
public:
    StackBST(){}    //null constructor
    ~StackBST(){}   //destructor

    //to push a BST node into the stack
    friend void push(StackBST *&TOP, BST *data){
        StackBST *temp;
        temp=new StackBST;
        if(temp==NULL)
            exit(1);
        temp->address=data;
        temp->next=TOP;
        TOP=temp;
    }

    //to pop a BST node from the stack
    friend void pop(StackBST *&TOP){
        StackBST *temp(TOP);
        TOP=temp->next;
        delete(temp);
    }

    //declaration of friend function
    //defined in BST class
    friend void inorderNonRecursive(BST *&REAR);
};

//QueueBST class that implements nodes of a tree as queue using linked list
//for traversing a tree level-by-level
class QueueBST{
private:
    BST *address;
    QueueBST *next;
public:
    QueueBST(){}    //null constructor
    ~QueueBST(){}   //destructor

    //to enqueue a BST node into the queue
    friend void enq(QueueBST *&FRONT, QueueBST *&REAR, BST *data){
        QueueBST *temp;
        temp=new QueueBST;
        if(temp==NULL)
            exit(1);
        temp->address=data;
        temp->next=NULL;
        if(FRONT==NULL)
            FRONT=temp;
        else
            REAR->next=temp;
        REAR=temp;
    }

    //to dequeue a BST node from the queue
    friend void deq(QueueBST *&FRONT, QueueBST *&REAR){
        QueueBST *temp;
        temp=FRONT;
        if(FRONT==REAR)
            FRONT=REAR=NULL;
        else
            FRONT=temp->next;
        delete(temp);
    }

    //declaration of friend function
    //defined in BST class
    friend void level_order(BST *&REAR);
};

//Binary Search Tree
class BST{
private:
    int info;
    BST *left;
    BST *right;
public:
    BST(){}     //null constructor
    ~BST(){}    //destructor

    //to return the info stored in a node
    friend int returninfo(BST *&temp){
        return temp->info;
    }//int

    //makes a node of a Tree
    //declared seperately because addnode() is recursive and thus shouldn't contain 'new'
    friend void makenode(BST *&node, int data){
        BST *temp;
        temp=new BST;
        if(temp==NULL){
            exit(1);
        }
        temp->info=data;
        temp->left=NULL;
        temp->right=NULL;
        cout<<"Node with "<<data<<" added in BST\n";
        node=temp;
    }//void

    //recursive function that adds a node into the binary search tree
    friend void addnode(BST *&ROOT, int data){
        BST *temp;
        temp=ROOT;
        if(temp==NULL)
            makenode(ROOT, data);
        //if data is less than node, add to the left of the tree
        else if (data<temp->info)
            addnode(temp->left, data);
        //if data is more than node, add to the right of the tree
        else if (data>temp->info)
            addnode(temp->right, data);
        //if data is duplicate, don't add to the tree
        else
            cout<<"Duplicate node with value "<<data<<" not added\n";
    }//void

    //counts the number of nodes into the tree and returns it
    friend int nodes(BST *&ROOT){
        if(ROOT==NULL)
            return 0;
        else
            return (1+nodes(ROOT->left)+nodes(ROOT->right));
    }//int

    //counts the number of leaf nodes in the tree
    friend void leaves(BST *&ROOT, int &leaf){
        if(ROOT!=NULL){
            if((ROOT->left==NULL) && (ROOT->right==NULL))
                ++leaf;
            else{
                leaves(ROOT->left, leaf);
                leaves(ROOT->right, leaf);
            }
        }
    }//void

    //counts the number of non-leaf nodes in the tree
    friend void nonleaves(BST *&ROOT, int &nleaf){
        if(ROOT!=NULL){
            if((ROOT->left!=NULL) || (ROOT->right!=NULL))
                ++nleaf;
            nonleaves(ROOT->left, nleaf);
            nonleaves(ROOT->right, nleaf);
        }
    }//void

    //finds the node of the tree with the smallest value
    friend BST * smallest(BST *&ROOT){
        BST *temp(ROOT);
        //keep on traversing to the left, because the smallest node is on the left of the tree
        while(temp->left!=NULL)
            temp=temp->left;
        return temp;
    }//BST *

    //finds the node of the tree with the largest value
    friend BST * largest(BST *&ROOT){
        BST *temp(ROOT);
        //keep on traversing to the right, because the largest node is on the right of the tree
        while(temp->right!=NULL)
            temp=temp->right;
        return temp;
    }//BST *

    //traverses the tree in preorder manner and prints it
    friend void preorder(BST *&ROOT){
        //info
        //left subtree
        //right subtree
        if(ROOT!=NULL){
            cout<<ROOT->info<<"  ";
            preorder(ROOT->left);
            preorder(ROOT->right);
        }
    }//void

    //traverses the tree in postorder manner and prints it
    friend void postorder(BST *&ROOT){
        //left subtree
        //right subtree
        //info
        if(ROOT!=NULL){
            postorder(ROOT->left);
            postorder(ROOT->right);
            cout<<ROOT->info<<"  ";
        }
    }//void

    //traverses the tree in inorder manner and prints it
    //prints data sorted in ascending order
    friend void inorder(BST *&ROOT){
        //left subtree
        //info
        //right subtree
        if(ROOT!=NULL){
            inorder(ROOT->left);
            cout<<ROOT->info<<"  ";
            inorder(ROOT->right);
        }
    }//void

    //prints the tree in descending order based on info
    friend void descend(BST *&ROOT){
        //right subtree
        //info
        //left subtree
        if(ROOT!=NULL){
            descend(ROOT->right);
            cout<<ROOT->info<<"  ";
            descend(ROOT->left);
        }
    }//void

    //printing the tree in preorder, postorder, inorder and descending
    friend void printBST(BST *&ROOT){
        cout<<"For BST rooted at "<<ROOT<<"\n";
        cout<<"Preorder\n";
        preorder(ROOT);
        cout<<"\nPostorder\n";
        postorder(ROOT);
        cout<<"\nInorder\n";
        inorder(ROOT);
        cout<<"\nDescending\n";
        descend(ROOT);
        cout<<"\n";
    }//void

    //copies one BST into another and returns the new tree
    friend BST * copyBST(BST *&ROOT){
        BST *temp, *LEFT, *RIGHT;
        LEFT=NULL;
        RIGHT=NULL;
        if(ROOT->left!=NULL)
            LEFT=copyBST(ROOT->left);
        if(ROOT->right!=NULL)
            RIGHT=copyBST(ROOT->right);
        temp=new BST;
        if(temp==NULL)
            exit(1);
        temp->info=ROOT->info;
        temp->left=LEFT;
        temp->right=RIGHT;
        return (temp);
    }//BST *

    //mirrors a BST and returns the mirrored tree
    //nodes closer to the 'mirror' stay closer to 'mirror' after getting mirrored
    friend BST * mirrorBST(BST *&ROOT){
        BST *temp, *LEFT, *RIGHT;
        LEFT=NULL;
        RIGHT=NULL;
        if(ROOT->left!=NULL)
            LEFT=mirrorBST(ROOT->left);
        if(ROOT->right!=NULL)
            RIGHT=mirrorBST(ROOT->right);
        temp=new BST;
        if(temp==NULL)
            exit(1);
        temp->info=ROOT->info;
        temp->left=RIGHT;
        temp->right=LEFT;
        return (temp);
    }//BST *

    //checks if two trees are copies of each other or not
    friend void testCopy(BST *&A, BST *&B, bool &KOPY){
        if(KOPY){
            if((A==NULL) && (B!=NULL))
                KOPY=false;
            else if((A!=NULL) && (B==NULL))
                KOPY=false;
            else if((A!=NULL) && (B!=NULL)){
                if(A->info != B->info)
                    KOPY=false;
                else{
                    testCopy(A->left, B->left, KOPY);
                    testCopy(A->right, B->right, KOPY);
                }
            }
        }
    }//void

    //checks if two trees are mirros of each other or not
    friend void testMirror(BST *&A, BST *&B, bool &mirror){
        if(mirror){
            if((A==NULL) && (B!=NULL))
                mirror=false;
            else if((A!=NULL) && (B==NULL))
                mirror=false;
            else if((A!=NULL) && (B!=NULL)){
                if(A->info != B->info)
                    mirror=false;
                else{
                    testMirror(A->left, B->right, mirror);
                    testMirror(A->right, B->left, mirror);
                }
            }
        }
    }//void

    //calculates the height of the BST
    friend void height(BST *&REAR, int &depth, int nodes){
        if(REAR!=NULL){
            ++nodes;
            if((REAR->left==NULL) && (REAR->right==NULL)){
                --nodes;
                depth=depth>nodes?depth:nodes;
            }
            else{
                height(REAR->left, depth, nodes);
                height(REAR->right, depth, nodes);
            }
        }
    }//void

    //simulating inorder traversal using stack implemented using linked list
    friend void inorderNonRecursive(BST *&REAR){
        StackBST *top;
        BST *ref, *temp;
        top=NULL;
        ref=REAR;
        cout<<"Non Recusrive inorder\n";
        do{
            for(;ref!=NULL;){
                push(top, ref);
                ref=ref->left;
            }
            if(top!=NULL){
                temp=top->address;
                cout<<temp->info<<"  ";
                ref=temp->right;
                pop(top);
            }
        }while((ref!=NULL) || (top!=NULL));
        cout<<"\n";
    }//void

    //simulating level_order traversal using queue inmplemented using linked list
    friend void level_order(BST *&REAR){
        BST *temp;
        QueueBST *FRONTront, *REARear;
        FRONTront=REARear=NULL;
        enq(FRONTront, REARear, REAR);
        cout<<"Non Recursive level-by-level\n";
        while(FRONTront!=NULL){
            temp=FRONTront->address;
            cout<<temp->info<<"  ";
            if(temp->left!=NULL)
                enq(FRONTront, REARear, temp->left);
            if(temp->right!=NULL)
                enq(FRONTront, REARear, temp->right);
            deq(FRONTront, REARear);
        }
        cout<<"\n";
    }//void

    //deleting a node from the BST by value
    friend void deleted(BST *&R, int data){
        if(R==NULL)
            return;
        BST *temp=R, *ref=NULL;
        while((temp!=NULL) && (data!=temp->info)){
            ref=temp;
            if(data<temp->info)
                temp=ref->left;
            else
                temp=ref->right;
        }
        if(temp==NULL){
            cout<<data<<" not found\n";
            return;
        }
        if(temp==R){
            if(temp->left==NULL){
                R=temp->right;
                delete (temp);
            }
            else if(temp->right==NULL){
                R=temp->left;
                delete (temp);
            }
            else{
                erase(temp);
            }
        }
        else if(temp==ref->left){
            if(temp->left==NULL){
                ref->left=temp->right;
                delete (temp);
            }
            else if(temp->right==NULL){
                ref->left=temp->right;
                delete (temp);
            }
            else{
                erase(temp);
            }
        }
        else if(temp->left==NULL){
            ref->right=temp->right;
            delete (temp);
        }
        else if(temp->right==NULL){
            ref->right=temp->left;
            delete (temp);
        }
        else
            erase(temp);
    }//void

    //to erase a node of the tree
    friend void erase(BST *node){
        BST *ref, *temp;
        ref=node;
        temp=ref->left;
        while(temp->left!=NULL){
            ref=temp;
            temp=ref->right;
        }
        node->info=temp->info;
        if(temp==ref->left)
            ref->left=temp->left;
        else
            ref->right=temp->left;
        delete (temp);
    }//void

    //left rotating a tree
    friend void LR(BST *node){
        BST *p, *q, *hold;
        p=node;
        q=p->right;
        hold=q->left;
        q->left=p;
        p->right=hold;
        node=q;
    }//void

    //right rotating a tree
    friend void RR(BST *node){
        BST *p, *q, *hold;
        p=node;
        q=p->left;
        hold=q->right;
        q->right=p;
        p->left=hold;
        node=q;
    }
};//end BST

//main method
int main(){
    //declarations
    BST *root=NULL;
    BST *temp=NULL;
    int j, n, ln, nln;
    int a[13]={6,2,8,1,4,2,7,10,3,5,9,10,11};

    cout<<"\nBINARY SEARCH TREE\n\n";

    //creating the BST
    for(j=0;j<13;j++)
        addnode(root, a[j]);
    cout<<"BST rooted at "<<root<<"\n";

    //number of nodes in the tree
    n=nodes(root);
    cout<<"Number of nodes in Tree : "<<n<<"\n";

    //number of leaf nodes and non-leaf nodes in the tree
    ln=0;
    leaves(root, ln);
    nln=0;
    nonleaves(root, nln);
    cout<<"Number of leaf nodes : "<<ln<<" and number of non leaf nodes : "<<nln<<"\n";

    //node with the smallest value in the tree
    temp=smallest(root);
    cout<<"Smallest node in the tree : "<<returninfo(temp)<<"\n";

    //node with the largest value in the tree
    temp=largest(root);
    cout<<"Largest node in the tree : "<<returninfo(temp)<<"\n";

    //printing the tree in preorder, postorder, inorder and descending
    printBST(root);

    //copying the original BST into a new one
    BST *rootC=NULL;
    rootC=copyBST(root);
    printBST(rootC);

    //mirroring the original BST
    BST *rootM=NULL;
    rootM=mirrorBST(root);
    printBST(rootM);

    //checking if BSTs rooted at root and rootC are copies of each other or not
    bool result=true;
    testCopy(root, rootC, result);
    cout<<"BSTs rooted at "<<root<<" and "<<rootC;
    if(result)
        cout<<" are copies\n";
    else
        cout<<" are not copies\n";
    //checking if BSTs rooted at root and rootM are copies of each other or not
    result=true;
    testCopy(root, rootM, result);
    cout<<"BSTs rooted at "<<root<<" and "<<rootM;
    if(result)
        cout<<" are copies\n";
    else
        cout<<" are not copies\n";

    //checking if BSTs rooted at root and rootC are mirrors of each other or not
    result=true;
    testMirror(root, rootC, result);
    cout<<"BSTs rooted at "<<root<<" and "<<rootC;
    if(result)
        cout<<" are mirrors\n";
    else
        cout<<" are not mirrors\n";
    //checking if BSTs rooted at root and rootM are mirrors of each other or not
    result=true;
    testMirror(root, rootM, result);
    cout<<"BSTs rooted at "<<root<<" and "<<rootM;
    if(result)
        cout<<" are mirrors\n";
    else
        cout<<" are not mirrors\n";

    //height of the tree
    int tall=-1;
    height(root, tall, 0);
    cout<<"Height of tree rooted at "<<root<<" is "<<tall<<"\n";

    //inorder traversal without using recursion
    inorderNonRecursive(root);

    //level_order traversal without using recursion
    level_order(root);

    //deleting a node from the tree and then displaying it
    // int delete_array[11]={6,8,7,5,2,1,9,10,3,11,4}; //segmentation fault
    int delete_array[11]={6,2,8,1,4,7,10,3,5,9,11}; //no segmentation fault
    for(int i=0;i<=10;i++){
        cout<<"Deleting "<<delete_array[i]<<" from the tree\n";
        deleted(root, delete_array[i]);
        inorder(root);
        cout<<"\n";
    }

    return 0;
}//end main
