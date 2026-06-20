package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class latihan1 {
    public static void main(String[] args) throws IOException { // [cite: 460]
        // Objek File hanyalah penunjuk, belum tentu ada di disk [cite: 460]
        File berkas = new File("catatan.txt"); // [cite: 460]
        
        // Membuat berkas baru bila belum ada [cite: 461]
        if (berkas.createNewFile()) { // [cite: 461]
            System.out.println("Berkas dibuat: " + berkas.getName()); // [cite: 462, 467]
        } else { // [cite: 463]
            System.out.println("Berkas sudah ada: " + berkas.getName()); // [cite: 465, 469]
        } // [cite: 464]
        
        // Memeriksa informasi berkas [cite: 466]
        System.out.println("Apakah ada?  : " + berkas.exists()); // [cite: 470]
        System.out.println("Path absolut : " + berkas.getAbsolutePath()); // [cite: 471, 473]
        System.out.println("Ukuran (byte): " + berkas.length()); // [cite: 472, 474]
        System.out.println("Dapat dibaca : " + berkas.canRead()); // [cite: 475, 476]
    }
}