package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Latihan5 {
    public static void main(String[] args) { // [cite: 569]
        // Parameter true berarti menambah (append), bukan menimpa [cite: 570]
        try (PrintWriter penulis = new PrintWriter(new FileWriter("mahasiswa.txt", true))) { // [cite: 571]
            penulis.println("Dewi"); // [cite: 572]
            penulis.println("Eka"); // [cite: 573]
            System.out.println("Dua nama baru ditambahkan tanpa menghapus data lama."); // [cite: 574]
        } catch (IOException e) { // [cite: 575]
            System.out.println("Gagal menambah data: " + e.getMessage()); // [cite: 576]
        } // [cite: 577]
    }
}