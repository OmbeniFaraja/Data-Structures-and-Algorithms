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
public class Node {
    private int data;
    private Node next;
    
    public Node(int data){
        this.data = data;
        next = null;
    }
    public int getData(){
        return data;
    }
    public void setData(int data){
        this.data=data;
    }
    public Node getNext(){
        return next;
    }
    public void setNext(Node data){
        this.next = data;
    }
    
}
