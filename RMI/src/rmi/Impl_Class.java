/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

/**
 *
 * @author omben
 */
public class Impl_Class implements Hello_Interface {
    public double convert_temp(double cel_temp){
        double far_temp = (cel_temp * 9/5)+32;
        return far_temp;
    }
}
