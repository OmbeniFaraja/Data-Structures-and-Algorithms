/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuewithlinkedlist;

/**
 *
 * @author omben
 */
public class Queue { 
    private Node rear; //creating the rear node
    private Node front; //creating the front node
    private int size; //total number of elements in the queue
    
    public boolean isEmpty(){ // C: this method will check for underflow and will print that the queue is already empty
        boolean answer = false; // D: No it is not necessary to test overflow because the linked list does not fill. it can shrink or expand during running time
        if(size == 0){
            answer = true;
            System.out.println("The queue is empty");
        }
        return answer;
    }
    
    public void enqueue(int data){
        Node n = new Node(data);
        if(front == null){
            rear = n;
            front = n;
            size++;
        }
        else{
            rear.setNext(n);
            rear = n;
            size++;
        }
    }
    
    public Node dequeue(){
        Node n = null;
        if(front != null){
            if(front.getNext() != null){
                n = new Node(front.getData());
                front = front.getNext();
                size--;
            }
            else{
                n = new Node(front.getData());
                front = null;
                rear = null;
                size--;
            }
        } return n;
    }
    
    public Queue(){
        front = null;
        rear = null;
        size = 0;
    }
    
    public Node peek(){
        Node n = null;
        if(!isEmpty()){
            n = new Node(front.getData());
        }
        return n;
    }
    public int getSize(){
        return size;
    }
    
    
}
