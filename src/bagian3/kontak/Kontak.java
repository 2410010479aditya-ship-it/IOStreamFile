package bagian3.kontak;

public class Kontak {
    private String nama; // [cite: 607]
    private String nomor; // [cite: 608]
    // Latihan 3.4 No 2: Tambah atribut email
    private String email; 

    // Constructor yang disesuaikan untuk menerima parameter email
    public Kontak(String nama, String nomor, String email) { // [cite: 610]
        this.nama = nama; // [cite: 612]
        this.nomor = nomor; // [cite: 613]
        this.email = email;
    } // [cite: 611]

    public String getNama() { // [cite: 616]
        return nama; // [cite: 618]
    } // [cite: 617]

    public String getNomor() { // [cite: 619]
        return nomor; // [cite: 621]
    } // [cite: 620]
    
    public String getEmail() {
        return email;
    }

    // Menyesuaikan penyimpanan data ke baris teks menjadi 3 bagian
    public String keBaris() { // [cite: 622]
        return nama + ";" + nomor + ";" + email; // [cite: 624]
    } // [cite: 623]

    // Menyesuaikan tampilan informasi kontak
    public String info() { // [cite: 625]
        return nama + " | " + nomor + " | " + email; 
    }
}