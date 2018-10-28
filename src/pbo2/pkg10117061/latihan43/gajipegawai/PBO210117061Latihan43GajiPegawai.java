/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117061.latihan43.gajipegawai;

import java.util.Scanner;

/**
 * Nama : Fachrian Harits P
 * NIM : 10117061
 * Kelas : IF-2
 * Deklarisi : Program ini untuk mengitung gaji pegawai
 */
public class PBO210117061Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GajiPegawai gjp = new GajiPegawai();
  
        gjp.tampilData(gjp.getNama(), gjp.getAlamat(), gjp.getUangTunjangan(), gjp.getGajiPokok(),gjp.getTotalGaji());
    
    }
    
}
