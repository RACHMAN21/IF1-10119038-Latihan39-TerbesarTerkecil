/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.latihan39.terbesarterkecil;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : program ini berisi class Petugas
 */

import java.util.Scanner;

public class Petugas {
    Scanner sc = new Scanner(System.in);
    private String namaPetugas;
    private int[] arrNilai;
    
    public void masukkanNama() {
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = sc.next();
    }
    
    public void masukkanNilai() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        int jumlah = sc.nextInt();
        arrNilai = new int[jumlah];
        for(int i=0;i<jumlah;i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-"+(i+1)+" = ");
            arrNilai[i] = sc.nextInt();
        }
        menentukanNilai(arrNilai);
    }
    
    private void menentukanNilai(int[] nilaiMhs) {
        Nilai nilai = new Nilai();
        nilai.penentuanNilai(nilaiMhs, namaPetugas);
    }
}