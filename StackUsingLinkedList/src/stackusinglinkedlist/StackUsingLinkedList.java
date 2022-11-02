/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackusinglinkedlist;

/**
 *
 * @author omben
 */
public class StackUsingLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack mystack = new Stack();
        
        mystack.push(10); //pushing the first element
        mystack.push(15); //pushing the second element
        mystack.push(64); //pushing the third element
        mystack.push(27); //pushing the fourth element
        mystack.push(5); //pushing the fifth element
         
        System.out.println(mystack.pop()); //popping the first element
        System.out.println(mystack.pop()); //popping the second element
        System.out.println(mystack.pop()); //popping the third element
        System.out.println(mystack.pop()); //popping the fourth element
    } 
    
}
