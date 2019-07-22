/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gaji;


/**
 *
 * @author Firdausa
 */

//import java.io.*;
import java.io.*;
import static java.lang.Integer.parseInt;

public class Gaji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        BufferedReader inputan = new BufferedReader(new InputStreamReader(System.in));
        //instance obyek jabatan
        System.out.println("======= CEK GAJI =======\n");
        System.out.println("1. UMK");
        System.out.println("2. Supervisor");
        System.out.println("3. Manager\n");
        
        System.out.println("Masukan menu:");
        int menu = parseInt(inputan.readLine());
        
        jabatan posisi = new jabatan(); //instance object jabatan
       
        if(menu == 1)
        {
            
            System.out.println("======== JUMLAH GAJI UMK ========");
            //set gaji
            posisi.setGaji("umk");
            //show gaji UMK (default)
            System.out.println("Besar gaji UMK adalah :"+ posisi.getGaji() + "\n\n");
        }
        else if(menu == 2)
        {
            System.out.println("======== JUMLAH GAJI SUPERVISOR ========");
            //set gaji
            posisi.setGaji("sv");
            //show gaji UMK (default)
            System.out.println("Besar gaji Supervisor adalah :"+ posisi.getGaji() + "\n\n");
            
        }
        else if(menu == 3)
        {
            System.out.println("======== JUMLAH GAJI MANAGER ========");
            //set gaji
            posisi.setGaji("mng");
            //show gaji UMK (default)
            System.out.println("Besar gaji Manager adalah :"+ posisi.getGaji() + "\n\n");
        }
        else {
            System.out.println("Menu Tidak Sesuai!");
        }

    }
    
}
