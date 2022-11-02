/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author omben
 */
public class LinkedListTest {
    public static void main(String[] args){
        
        LinkedList List = new LinkedList();
        
        List.addToHead("ICS 2B APRIL");
        List.add("Kashoso");
        List.add("Sponsor");
        List.add("Spiderman");
        List.add("12");
        List.add("56");
        List.add("76");
        
        System.out.println("Transversing the list");
        List.traverse();
                  
    }
}
