/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet3;

import java.util.Scanner;

/**
 *
 * @author Noran N. Ahmed
 */
public class Sheet3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the efficiency ");
        Scanner effi = new Scanner(System.in);
        double x = effi.nextDouble();
        System.out.println("Please enter the miles");
         Scanner mile= new Scanner(System.in);
        double y = mile.nextDouble();
        
        Odometer A = new Odometer();
        A.setEfficiency(x);
        A.totalMiles(y);
        System.out.println("Fuel track ="+A.getFuel()+"gallons");
    }
    
}
