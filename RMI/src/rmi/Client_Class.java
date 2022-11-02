/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author omben
 */
public class Client_Class {
    private Client_Class() {}
    public static void main(String args[]){
        try {
            //getting the registry
            Registry registry = LocateRegistry.getRegistry(null);

            //looking up the registry for the remote object
            Hello_Interface obj = (Hello_Interface) registry.lookup("hh_bindname");

            //calling the remote method using the obtained object
            double far_value = obj.convert_temp(57.8);
            //Scanner input = new Scanner(System.in);
            //input.nextDouble();
            //double far_temp = obj.convert_temp(70.5);

            System.out.println("Remote method invoked");
            System.out.println("Converted Celcius is: "+far_value);
        }
        catch (Exception e){
            System.err.println("Client exception: "+e.toString());
            e.printStackTrace();
        }
    }
    
    
}
