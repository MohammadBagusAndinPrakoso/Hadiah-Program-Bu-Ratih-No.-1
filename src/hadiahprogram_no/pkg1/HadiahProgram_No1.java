/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadiahprogram_no.pkg1;

/**
 *
 * @author MOKLET1
 */
import java.util.Scanner;
public class HadiahProgram_No1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Data Pembuatan KTP");
        System.out.println("Masukkan Data:");
        
        String nama, tempatTanggalLahir, kelamin, agama, status, pekerjaan, kewarganegaraan;
        
        System.out.print("Nama                 : ");
        nama = input.nextLine();
        
        System.out.print("Tempat/Tanggal Lahir : ");
        tempatTanggalLahir = input.nextLine();
        
        System.out.print("Jenis Kelamin        : ");
        kelamin = input.nextLine();
        
        System.out.print("Agama                : ");
        agama = input.nextLine();
        
        System.out.print("Status Perkawinan    : ");
        status = input.nextLine();
        
        System.out.print("Pekerjaan            : ");
        pekerjaan = input.nextLine();
        
        System.out.print("Kewarganegaraan      : ");
        kewarganegaraan = input.nextLine();
        
    }
    
}
