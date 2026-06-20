package bagian3.kontak;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList; // [cite: 636, 637, 638, 639]

public class BukuKontak {
    private ArrayList<Kontak> daftar = new ArrayList<>(); // [cite: 641]
    private String namaBerkas; // [cite: 641]

    public BukuKontak(String namaBerkas) { // [cite: 642]
        this.namaBerkas = namaBerkas; // [cite: 644]
    } // [cite: 643]

    public void tambahKontak(Kontak kontak) { // [cite: 647]
        daftar.add(kontak); // [cite: 647]
    } // [cite: 648]

    public void tampilkanSemua() { // [cite: 649]
        System.out.println("== Daftar Kontak =="); // [cite: 650]
        for (int i = 0; i < daftar.size(); i++) { // [cite: 650]
            Kontak k = daftar.get(i); // [cite: 651]
            System.out.println((i + 1) + ". " + k.info()); // [cite: 654, 655]
        } // [cite: 652]
    } // [cite: 653]

    public void simpanKeBerkas() { // [cite: 657]
        try (PrintWriter penulis = new PrintWriter(new FileWriter(namaBerkas))) { // [cite: 658]
            for (Kontak k : daftar) { // [cite: 658]
                penulis.println(k.keBaris()); // [cite: 660]
            } // [cite: 659]
            System.out.println("Kontak disimpan ke " + namaBerkas); // [cite: 661]
        } catch (IOException e) { // [cite: 662]
            System.out.println("Gagal menyimpan: " + e.getMessage()); // [cite: 663]
        } // [cite: 664]
    } // [cite: 665]

    public void muatDariBerkas() { // [cite: 667]
        daftar.clear(); // [cite: 668]
        try (BufferedReader pembaca = new BufferedReader(new FileReader(namaBerkas))) { // [cite: 669]
            String baris; // [cite: 670]
            while ((baris = pembaca.readLine()) != null) { // [cite: 671, 672]
                String[] bagian = baris.split(";"); // [cite: 673]
                // Latihan 3.4 No 2: Sesuaikan pemisahan agar memecah menjadi 3 bagian
                if (bagian.length == 3) { 
                    daftar.add(new Kontak(bagian[0], bagian[1], bagian[2])); 
                }
            }
            System.out.println("Kontak dimuat dari " + namaBerkas); // [cite: 679]
        } catch (IOException e) { // [cite: 680]
            System.out.println("Gagal memuat: " + e.getMessage()); // [cite: 681]
        } // [cite: 682]
    } // [cite: 683]

    // Latihan 3.4 No 1: Method cariKontak
    public void cariKontak(String nama) { // [cite: 832]
        for (Kontak k : daftar) { // [cite: 833]
            if (k.getNama().equalsIgnoreCase(nama)) { // [cite: 834]
                System.out.println("Ditemukan: " + k.info()); // [cite: 835]
                return; // [cite: 836]
            }
        } // [cite: 838]
        System.out.println("Kontak " + nama + " tidak ditemukan."); // [cite: 839]
    } // [cite: 840]

    // Latihan 3.4 No 3: Method hapusKontak
    public void hapusKontak(String nama) {
        boolean ditemukan = false;
        for (int i = 0; i < daftar.size(); i++) {
            if (daftar.get(i).getNama().equalsIgnoreCase(nama)) {
                daftar.remove(i);
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            System.out.println("Kontak '" + nama + "' berhasil dihapus.");
            simpanKeBerkas(); // Perubahan langsung ikut tersimpan ke dalam file
        } else {
            System.out.println("Gagal menghapus! Kontak '" + nama + "' tidak ditemukan.");
        }
    }

    public int jumlahKontak() { // [cite: 684]
        return daftar.size(); // [cite: 687]
    } // [cite: 685]
}