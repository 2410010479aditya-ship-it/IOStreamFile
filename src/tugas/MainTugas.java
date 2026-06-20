//nama: aditya effendi | npm: 2410010479
package tugas;

public class MainTugas {
    public static void main(String[] args) { // [cite: 733]
        String fileData = "barang.txt"; // [cite: 736]

        // 1. Menyimpan daftar nama kategori dalam array String ukuran tetap & menampilkannya
        String[] kategori = {"Elektronik", "Pakaian", "Makanan"}; // [cite: 735]
        System.out.println("== Daftar Kategori Toko ==");
        for (String kat : kategori) {
            System.out.println("- " + kat);
        }
        System.out.println();

        // 2. Membuat objek Gudang pertama dan menambahkan minimal 5 objek Barang
        Gudang gudangAwal = new Gudang(); // [cite: 733]
        gudangAwal.tambahBarang(new Barang("Laptop", 8500000, 10)); // [cite: 733]
        gudangAwal.tambahBarang(new Barang("Smartphone", 3500000, 15));
        gudangAwal.tambahBarang(new Barang("Kemeja Flanel", 150000, 40));
        gudangAwal.tambahBarang(new Barang("Snack Cokelat", 12000, 100));
        gudangAwal.tambahBarang(new Barang("Headphones Wireless", 450000, 20));

        System.out.println("== Menampilkan Gudang Awal ==");
        gudangAwal.tampilkanSemua();
        System.out.println();

        // 3. Menyimpan seluruh data barang ke file teks
        gudangAwal.simpanKeBerkas(fileData); // [cite: 736]
        System.out.println();

        // 4. Membuat objek Gudang baru, memuat kembali dari berkas, dan menampilkannya
        System.out.println("== Pembuktian Data Tersimpan di Objek Gudang Baru ==");
        Gudang gudangBaru = new Gudang(); // [cite: 737]
        gudangBaru.muatDariBerkas(fileData); // [cite: 737]
        
        System.out.println("\n--- Hasil Tampilan Data Gudang Baru ---");
        gudangBaru.tampilkanSemua(); // [cite: 737]
        
        // 5. Menampilkan total nilai persediaan (harga * stok)
        System.out.println("Total Nilai Persediaan: Rp" + gudangBaru.totalNilai()); // [cite: 737]
        System.out.println("Jumlah Data Saat Ini  : " + gudangBaru.hitungJumlahData() + " item");
        System.out.println();

        // 6. Menambahkan satu objek Barang baru ke dalam koleksi terbaru
        System.out.println("--- Menambahkan 1 Item Baru Ke Koleksi Terbaru ---");
        gudangBaru.tambahBarang(new Barang("Mouse Gaming", 250000, 25));
        
        // Menampilkan kembali jumlah data terbaru setelah penambahan item baru
        System.out.println("Jumlah Data Terbaru   : " + gudangBaru.hitungJumlahData() + " item");
        System.out.println("Detail Gudang Setelah Penambahan:");
        gudangBaru.tampilkanSemua();
    }
}