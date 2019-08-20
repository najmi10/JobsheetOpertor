/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

/**
 *
 * @author ica
 */
public class Pratikum1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat variabel
        String nama, alamat;
        int usia;
        double tinggi;
        char darah;
        
        // mengisi variabel
        nama = "Naisya Najmi";
        alamat = "Tulungagung";
        usia = 16;
        tinggi = 163;
        String hobby = "menyanyi";
        darah a = null;
        
        //mencetak ke layar isi variabel
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + usia + "tahun");
        System.out.println("Tinggi: " + tinggi + "cm");
        System.out.println("Hobby: " + hobby);
        System.out.println("Darah: " + "A");
        
        
    }

    private static class darah {

        public darah() {
        }
    }
    
}
