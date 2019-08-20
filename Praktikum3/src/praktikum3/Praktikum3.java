/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

import java.util.Scanner;


public class Praktikum3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Deklarasi
        double luas;
        int alas, tinggi;
        
        //Membuat scanner baru
        Scanner baca = new Scanner(System.in);
        
        //Input
       System.out.println ("== Program hitung luas segitiga==");
       System.out.println("Input alas :");
       alas = baca.nextInt();
       System.out.println("Input tinggi :");
       tinggi = baca.nextInt();
       
       //Proses
       luas = (double) ((alas * tinggi)/ 2);
       
       //Output
       System.out.println ("Luas =" + luas);
      

    }
    
}