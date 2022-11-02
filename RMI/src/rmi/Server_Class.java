/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author omben
 */
public class Server_Class extends Impl_Class{
    public Server_Class(){}
    public static void main (String args[]){
        try{
            //Instantiating the implementation class
            Impl_Class obj = new Impl_Class();
            
            //Exporting the object of implementation class
            //(here we are exporting the remote object to the stub)
            Hello_Interface hh = (Hello_Interface) UnicastRemoteObject.exportObject(obj, 0);
            
            //Binding the remote object (Stub) in the registry
            Registry registry = LocateRegistry.getRegistry();
            
            registry.bind("hh_bindname", hh);
            System.err.println("Server is running");
        }
        catch (Exception e){
            System.err.println("server exception: " + e.toString());
            e.printStackTrace();
        }
    }
    
}
