
package inicoding;
import java.util.Scanner ;

public class IniCoding {

    public static void main(String[] args) {
        
        String nama, alamat;
        String namaLogin ;
        int passwordLogin, input, usia;
        
        Scanner scan = new Scanner(System.in) ;
        
          System.out.print("Input Username : ");
          namaLogin = scan.nextLine() ;
          System.out.print("Masukkan Password : ") ;
          passwordLogin = scan.nextInt() ;
          
         if (namaLogin.equals("ica") && passwordLogin == 12345) ;
            System.out.println(" ");
            System.out.println("--------------");
            System.out.println("Login Berhasil, Selamat datang " +namaLogin ) ;
            System.out.println("1. Cek Data Diri ") ;
            System.out.println("2. Kalkulator");
            System.out.println("3. Keluar");
            input = scan.nextInt() ;
            
            
              nama = "ICA" ;
              usia = 16 ;
              alamat = "Malang" ;
              
                 
             if ( input == 1 ) 
                 System.out.println("===DATA DIRI===") ;
                 System.out.println("Nama Lengkap : " +nama);
                 System.out.println("Usia : " +usia);
                 System.out.println("alamat : " +alamat) ;
                 
           
                 
             
         
         
        
                
        
      
    }
    
}
