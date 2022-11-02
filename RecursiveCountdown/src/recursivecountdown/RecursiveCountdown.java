/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivecountdown;

/**
 *
 * @author omben
 */
public class RecursiveCountdown {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        countdown(10);
    }
    
    public static void countdown(int n)
    {
        if(n==0)
        {
            System.out.println(n);
            return;
        }
        else
        {
            System.out.println(n-1);
            countdown(n-1);
        }
    }
    
}
