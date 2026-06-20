package bagian3.kontak;

public class MainKontak {
    public static void main(String[] args) { // [cite: 696]
        // Membuat objek pengelola dan mengisinya lengkap dengan parameter email
        BukuKontak buku = new BukuKontak("kontak.txt"); // [cite: 697]
        buku.tambahKontak(new Kontak("Andi", "0811111", "andi@mail.com")); // [cite: 697]
        buku.tambahKontak(new Kontak("Budi", "0822222", "budi@mail.com")); // [cite: 697]
        buku.tambahKontak(new Kontak("Citra", "0833333", "citra@mail.com")); // [cite: 698]
        
        System.out.println("--- Koleksi Awal ---");
        buku.tampilkanSemua(); // [cite: 701]
        buku.simpanKeBerkas(); // [cite: 702]
        System.out.println(); // [cite: 703]
        
        // Pengujian Latihan 3.4 No 1: Cari Kontak
        System.out.println("--- Pengujian Cari Kontak ---");
        buku.cariKontak("Budi"); // [cite: 843]
        buku.cariKontak("Zaki");
        System.out.println();

        // Pengujian Latihan 3.4 No 3: Hapus Kontak
        System.out.println("--- Pengujian Hapus Kontak ---");
        buku.hapusKontak("Andi");
        System.out.println();

        // Membuat objek baru yang kosong untuk memverifikasi proses muat dari berkas
        System.out.println("--- Memuat Dari Berkas Ke Objek Baru ---");
        BukuKontak bukuLain = new BukuKontak("kontak.txt"); // [cite: 705]
        bukuLain.muatDariBerkas(); // [cite: 706]
        bukuLain.tampilkanSemua(); // [cite: 707]
        System.out.println("Jumlah kontak: " + bukuLain.jumlahKontak()); // [cite: 708]
    }
}