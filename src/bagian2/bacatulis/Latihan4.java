package bagian2.bacatulis;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Latihan4 {
    public static void main(String[] args) { // [cite: 544]
        try (BufferedReader pembaca = new BufferedReader(new FileReader("mahasiswa.txt"))) { // [cite: 545]
            String baris; // [cite: 546]
            int nomor = 1; // [cite: 547]
            while ((baris = pembaca.readLine()) != null) { // [cite: 548]
                System.out.println(nomor + ". " + baris); // [cite: 549]
                nomor++; // [cite: 550]
            } // [cite: 551]
        } catch (IOException e) { // [cite: 552]
            System.out.println("Gagal membaca: " + e.getMessage()); // [cite: 553]
        } // [cite: 554]
    }
}