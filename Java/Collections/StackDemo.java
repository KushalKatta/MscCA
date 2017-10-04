/* Stack */
import java.util.*;

class StackDemo
{
    public static void main(String[] args) {
        Stack <Integer> myStack = new Stack <Integer> ();
        myStack.add(10);
        myStack.add(20);
        myStack.add(60);
        myStack.add(70);

        System.out.println("Stack is : " + myStack);
        
        System.out.println("Removed Item is : " + myStack.pop());
        System.out.println("Added Item is : " + myStack.push(15));
        
        System.out.println("Stack is : " + myStack);
    }
}