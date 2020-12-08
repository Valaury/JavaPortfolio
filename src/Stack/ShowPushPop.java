
package Stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class ShowPushPop {
    

static void showpush(Stack STACK, Object o) {
    System.out.println("Pushing: " + o.toString());
    STACK.push(o);
    System.out.println("Stack: " + STACK.toString());
 }

   static void showpop(Stack STACK) {
      System.out.println("Pop: " + STACK.peek());
      Object o = STACK.pop();
      System.out.println("Stack: " + STACK.toString());
   }
    public static void main(String[] args) {
        Stack STACK = new Stack();
        showpush(STACK, "This");
        showpush(STACK, "is");
        showpush(STACK, "an");
        showpush(STACK, "Item");
        
        try{
            while(true){
                showpop(STACK);
            }
        }catch(EmptyStackException e){
            System.out.println("Empty stack");
        }
    }
    
}
