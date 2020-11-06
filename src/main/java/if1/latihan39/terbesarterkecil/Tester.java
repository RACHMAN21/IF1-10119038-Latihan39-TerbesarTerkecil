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
 * Deskripsi Program : program ini berisi untuk menampilkan hasil nilai terbesar
 *                     dan terkecil yang dimasukkan oleh seorang user
 */

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Petugas petugas = new Petugas();
        petugas.masukkanNama();
        petugas.masukkanNilai();
        System.out.println("Developed by : Rachman Aldiansyah");
    }
}