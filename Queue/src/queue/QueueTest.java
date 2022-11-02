/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author omben
 */
public class QueueTest {
    public static void main(String[] args){
            Queue myQueue = new Queue(10);
            
            myQueue.insert(1);
            myQueue.insert(2);
            myQueue.insert(3);
            myQueue.insert(4);
            myQueue.insert(5);
            myQueue.insert(6);
            myQueue.insert(7);
            myQueue.insert(8);
            myQueue.insert(9);
            myQueue.insert(10);
            
            for(int i=0, i<10, i++){
                   System.out.println(myQueue[i]);
            }
                    
             
            
    
    
    }
    
}
