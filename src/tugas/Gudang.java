package tugas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Gudang {
    private ArrayList<Barang> listBarang = new ArrayList<>(); 


    public void tambahBarang(Barang b) { 
        listBarang.add(b);
    }


    public void tampilkanSemua() { 
        if (listBarang.isEmpty()) {
            System.out.println("Gudang kosong.");
            return;
        }
        for (int i = 0; i < listBarang.size(); i++) {
            System.out.println((i + 1) + ". " + listBarang.get(i).info());
        }
    }


    public void simpanKeBerkas(String namaBerkas) {
        try (PrintWriter penulis = new PrintWriter(new FileWriter(namaBerkas))) {
            for (Barang b : listBarang) {
                penulis.println(b.keBaris());
            }
            System.out.println("Seluruh data barang berhasil disimpan ke " + namaBerkas); 
        } catch (IOException e) {
            System.out.println("Gagal menyimpan data barang: " + e.getMessage());
        }
    }

    public void muatDariBerkas(String namaBerkas) { 
        listBarang.clear();
        try (BufferedReader pembaca = new BufferedReader(new FileReader(namaBerkas))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                String[] bagian = baris.split(";");
                if (bagian.length == 3) {
                    String nama = bagian[0];
                    double harga = Double.parseDouble(bagian[1]);
                    int stok = Integer.parseInt(bagian[2]);
                    listBarang.add(new Barang(nama, harga, stok));
                }
            }
            System.out.println("Data barang berhasil dimuat dari " + namaBerkas);
        } catch (IOException e) {
            System.out.println("Gagal memuat data barang: " + e.getMessage());
        }
    }


    public double totalNilai() { 
        double total = 0;
        for (Barang b : listBarang) {
            total += (b.getHarga() * b.getStok());
        }
        return total;
    }

    public int hitungJumlahData() {
        return listBarang.size();
    }
}