package com.smkn40jakarta;
import com.smkn40jakarta.kendaraan.motor;
import com.smkn40jakarta.kendaraan.mobil;

import javax.print.DocFlavor.CHAR_ARRAY;

import com.smkn40jakarta.kendaraan.kapal;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String namaDepan="Muhammad";
        char huruf1='M';
        String namaTengah="Farhan";
        String namaBelakang="Fadillah";
        
        byte absen=24;
        String sekolah="Smkn 40 JakartaTimur";
        byte umur=18;
        short berat= 105;
        float tinggi=178.9f;

        System.out.println( "Nama  :"+namaDepan+" "+namaTengah+" "+namaBelakang);
        System.out.println("Absen :"+absen);
        System.out.println("Sekolah :"+" "+sekolah);
        System.out.println("Umur :"+umur);
        
        System.out.println("\n\nmotor");
        motor.motor();
        System.out.println("\n\nmobil");
        mobil.mobil();
        System.out.println("\n\nkapal");
        kapal.kapal();

    }
    
 
}
