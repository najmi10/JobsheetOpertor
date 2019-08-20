/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum4;

import java.util.Scanner;
/**
 *
 * @author ica
 */
public class Praktikum4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double fahrenheit;
        int celcius;
        
        // Membuat scaner baru
        Scanner baca = new Scanner (System.in);
        
        //Input
        System.out.println("Konversi Suhu");
        System.out.print("Celcius: ");
        celcius = baca.nextInt();
        
        //Proses
        fahrenheit = (double) (9/5 * celcius) + 32;
        
        //Output
        System.out.println("F: " + fahrenheit);
                
                
              

        
      
        
                
    }
    
}
