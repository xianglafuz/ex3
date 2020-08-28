/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customermailapplication;

import java.util.Scanner;

/**
 *
 * @author sarun
 */
public class CustomerMailApplication {

    /**
     * @param args the command line arguments
     */
    private Customer customer;
   
    
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        if (type == 1){
            Customer acc = CustomerFactory.createCustomer("Regular");}
        else if (type == 2){
            Customer acc = CustomerFactory.createCustomer("Mountain");}
        else if (type == 3){     
            Customer acc = CustomerFactory.createCustomer("Delinquent");
        }      
    }
}
