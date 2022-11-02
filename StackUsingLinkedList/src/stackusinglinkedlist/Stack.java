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
public class Stack { //creating the Stack class
    private Node top; //creating the top of the stack
    private int size; //this will store the size of the stack
    
    private class Node{ //creating node class
        private int data; //this will store the value or data of a node
        private Node next; //this refers to the next node
        
        public Node(int data){ //the node constructor
            this.data = data;
            this.next=null;
        }
    }
    
    public void push(int data){ //this method add data on the stack. it will take in the data as a parameter
        Node n = new Node(data); //create a new node
        n.next = top; 
        top = n;       
        size++; //increementing the size because we added a node
    } 
    
    public int pop(){ //this method will delete from the top of the stack
        if(isEmpty()){
            System.out.println("Stack is empty!");
        }
        int x = top.data;
        top = top.next;
        size--;
        return x;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty"); //Checks for underflow and says that the stack is empty
        }
        return top.data;
    }
    public void showStack(){
        Node current = top;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    
    
}
