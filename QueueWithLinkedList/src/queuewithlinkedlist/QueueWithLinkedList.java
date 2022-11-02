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
public class QueueWithLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(12); //queue the first element
        queue.enqueue(34); //queue the second element
        queue.enqueue(5); //queue the third element
        queue.enqueue(54); //queue the fourth element
        queue.enqueue(9); //queue the fifth element
        
        System.out.println(queue.peek().getData() + " element at the front of the queue"); //printing the element at the front of the queue
        System.out.println("The size of the queue is "+queue.getSize()); //printing the size of the queue
        
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        
        System.out.println(queue.peek().getData() + " element at the front of the queue"); //printing the element at the front of the queue
        System.out.println("The size of the queue is "+queue.getSize()); //printing the size of the queue
        System.out.println(queue.dequeue().getData());//dequeue the first element
           System.out.println("The size of the queue is "+queue.getSize());
        
        /* Sample output
            12 element at the front of the queue
            The size of the queue is 5
            9 element at the front of the queue
            The size of the queue is 1
        
        */
    }
    
}
