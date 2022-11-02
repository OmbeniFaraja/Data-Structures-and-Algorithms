/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackx;

/**
 *
 * @author omben
 */
public class StackTest {
    
   public static void main (String[] args){
       StackX myStack = new StackX(10);
       myStack.push(20);
       myStack.push(25);
       myStack.push(30);
       myStack.push(35);
       myStack.push(40);
       
       myStack.push(20);
       myStack.push(25);
       myStack.push(30);
       myStack.push(35);
       myStack.push(40);
       
       for(int i=0; i<10; i++){
           System.out.println( myStack.stackArray[i]);
       }
       System.out.println("The top of the stack is: " + myStack.peek());
       myStack.push(100);
      
       
       
   
   }
    
}
