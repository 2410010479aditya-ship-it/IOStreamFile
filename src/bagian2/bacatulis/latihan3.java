package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class latihan3 {
    public static void main(String[] args) { // [cite: 521]
        // try-with-resources: stream otomatis ditutup setelah blok selesai [cite: 522]
        try (PrintWriter penulis = new PrintWriter(new FileWriter("mahasiswa.txt"))) { // [cite: 523]
            penulis.println("Andi"); // [cite: 524]
            penulis.println("Budi"); // [cite: 525]
            penulis.println("Citra"); // [cite: 526]
            System.out.println("Data berhasil ditulis ke mahasiswa.txt"); // [cite: 527]
        } catch (IOException e) { // [cite: 528]
            System.out.println("Gagal menulis: " + e.getMessage()); // [cite: 529]
        } // [cite: 530]
    }
}