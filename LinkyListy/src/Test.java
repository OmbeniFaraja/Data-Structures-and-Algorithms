/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omben
 */
public class Test {
    
    public static void main (String[] args){
        Linky list = new Linky();
        
        list.insert(23);
        list.insert(10);
        list.insert(12);
        list.insert(34);
        list.delete();
      
       
        
        System.out.println("The size is: "+list.getSize());
        list.traverse();
    
    }
    
}
