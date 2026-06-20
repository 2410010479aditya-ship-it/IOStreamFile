package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri1 {
    public static void main(String[] args) {
        // No 1. Cek keberadaan dan ukuran laporan.txt
        File laporan = new File("laporan.txt"); // [cite: 785]
        if (laporan.exists()) { // [cite: 786]
            System.out.println("Berkas ada, ukuran: " + laporan.length() + " byte"); // [cite: 787]
        } else { // [cite: 788]
            System.out.println("Berkas laporan.txt tidak ditemukan."); // [cite: 790]
        } // [cite: 789]
        
        System.out.println("-----------------------------------");

        // No 2. Membuat folder baru bernama 'arsip'
        File folder = new File("arsip");
        if (folder.mkdir()) {
            System.out.println("Folder 'arsip' berhasil dibuat.");
        } else {
            System.out.println("Folder 'arsip' gagal dibuat atau sudah ada.");
        }

        System.out.println("-----------------------------------");

        // No 3. Buat berkas sementara.txt lalu hapus kembali
        File sementara = new File("sementara.txt"); // [cite: 792]
        try { // [cite: 793]
            if (sementara.createNewFile()) {
                System.out.println("Sebelum dihapus, ada? " + sementara.exists()); // [cite: 795]
                if (sementara.delete()) {
                    System.out.println("Sesudah dihapus, ada? " + sementara.exists()); // [cite: 796]
                }
            }
        } catch (IOException e) { // [cite: 797]
            System.out.println("Kesalahan: " + e.getMessage()); // [cite: 799]
        } // [cite: 798]
    }
}