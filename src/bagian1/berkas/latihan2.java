package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class latihan2 {
    public static void main(String[] args) { // [cite: 490]
        File berkas = new File("data.txt"); // [cite: 490]
        try { // [cite: 490]
            if (berkas.createNewFile()) { // [cite: 491]
                System.out.println("Berkas baru dibuat."); // [cite: 492]
            } else { // [cite: 493]
                System.out.println("Berkas sudah ada sebelumnya."); // [cite: 495]
            } // [cite: 494]
        } catch (IOException e) { // [cite: 496]
            System.out.println("Terjadi kesalahan: " + e.getMessage()); // [cite: 497]
        } // [cite: 498]
    }
}