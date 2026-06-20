package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class LatihanMandiri2 {
    public static void main(String[] args) {
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"}; // [cite: 801]
        
        // No 1. Tulis 5 nama hari ke hari.txt lalu baca kembali
        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt"))) { // [cite: 802]
            for (String h : hari) { // [cite: 803]
                penulis.println(h); // [cite: 805]
            } // [cite: 804]
            System.out.println("Berhasil menulis 5 hari awal.");
        } catch (IOException e) { // [cite: 806]
            System.out.println("Gagal menulis: " + e.getMessage()); // [cite: 808]
        } // [cite: 807]
        
        System.out.println("--- Isi hari.txt Saat Ini ---");
        cetakDanHitungHari();
        
        System.out.println("-----------------------------------");

        // No 2. Append 2 nama hari lagi (Sabtu & Minggu)
        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt", true))) {
            penulis.println("Sabtu");
            penulis.println("Minggu");
            System.out.println("Berhasil menambahkan 2 hari baru.");
        } catch (IOException e) {
            System.out.println("Gagal menambah data: " + e.getMessage());
        }
        
        System.out.println("--- Isi hari.txt Setelah Append ---");
        // Membaca kembali sekaligus menjawab No 3 (Menghitung baris)
        cetakDanHitungHari();
    }

    // Fungsi pembantu untuk mencetak dan menghitung baris (Jawaban No 1, 2, dan 3)
    private static void cetakDanHitungHari() {
        int jumlah = 0; // [cite: 819]
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) { // [cite: 809, 820]
            String baris; // [cite: 810]
            while ((baris = pembaca.readLine()) != null) { // [cite: 811, 813, 821]
                System.out.println(baris); // [cite: 814]
                jumlah++; // [cite: 823]
            } // [cite: 812, 822]
            System.out.println(">> Total Jumlah Baris: " + jumlah); // [cite: 827]
        } catch (IOException e) { // [cite: 815, 824]
            System.out.println("Gagal membaca: " + e.getMessage()); // [cite: 816, 826]
        } // [cite: 817, 825]
    }
}