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
public class GajiPegawai {

    private String nama;
    private String alamat;
    private int uangTransport;
    private int uangTunjangan;
    private int gajiPokok;
    private int totalGaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTransport() {
        return uangTransport;
    }

    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }

    public int getUangTunjangan() {
        return uangTunjangan;
    }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }

    public int GajiPegawai(int uangTunjangan, int uangTransport, int gajiPokok) {
        this.gajiPokok=gajiPokok;
        this.uangTransport=uangTransport;
        this.uangTunjangan=uangTunjangan;
        
        return uangTransport + uangTunjangan + gajiPokok;
    }

    public void tampilData(String nama, String alamat, int uangTunjangan, int gajiPokok, int totalGaji) {
          Scanner scn = new Scanner(System.in);

        System.out.println("Data gaji karyawan Pt.KAKATU");
        System.out.println("------------");
        System.out.print("nama karyawan : ");
        nama = scn.nextLine();
        System.out.print("Alamat : ");
        alamat = scn.nextLine();
        System.out.print("uang Transport : ");
        uangTransport = scn.nextInt();
        System.out.print("uang Tunjangan : ");
        uangTunjangan = scn.nextInt();
        System.out.print("Gaji pokok : ");
        gajiPokok = scn.nextInt();
        System.out.print("Total Gaji : " + GajiPegawai(uangTunjangan, uangTransport, gajiPokok));

    }
}
