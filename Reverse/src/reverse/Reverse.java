/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse;

/**
 *
 * @author omben
 */
public class Reverse {
    public static void main(String[] args){
        reversenumber(124);
        
        
    }
    
    public static void reversenumber(int number){
        if (number <10)
        {
            System.out.println(number);
            return;
        }
        else
        {
            System.out.println(number%10);
            reversenumber(number/10);
        
        }
    
    }
    
}
