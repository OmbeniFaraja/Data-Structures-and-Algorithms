/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omben
 */
public class Linky {
    Node head;
    int size;
    
   public class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
    
    
}

   
   public void insert(int data){
        Node newNode = new Node(data);
        Node current = head;
        
        if(head==null){
            head=newNode;
        }else{
            while(current.next!=null){
                current=current.next;
            }
            current.next = newNode;
            size++;
        }
        
    }
   
   public void traverse(){
       Node current = head;
       while(current.next!=null){
           System.out.println(current.data);
           current = current.next;
       }
       System.out.println(current.data);
   }
   
   public int getSize(){
       return size;
   }
   
      public void delete(){
       Node current = head;
       Node temp = null;
       
       if(size==0){
           head = head.next;
       }
       else{
           for(int i=0; i<size-1; i++){
               current = current.next;
           }
           temp = current.next;
           current.next = temp.next;
           size--;
       }
   }
   
   
   
    
}
