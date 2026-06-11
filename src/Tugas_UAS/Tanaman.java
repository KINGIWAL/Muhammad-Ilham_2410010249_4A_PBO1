package Tugas_UAS;
public class Tanaman {
    private String nama;
    private String kode;
    private double tingkatPerawatan; 

    public Tanaman(String nama, String kode, double tingkatPerawatan) {
        this.nama = nama;
        this.kode = kode;
        this.tingkatPerawatan = tingkatPerawatan;
    }

    public String getNama() {
        return nama;
    }

    public String getKode() {
        return kode;
    }

    public double getTingkatPerawatan() {
        return tingkatPerawatan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setTingkatPerawatan(double tingkatPerawatan) {
        this.tingkatPerawatan = tingkatPerawatan;
    }
    
    public boolean isMudah() {
        return this.tingkatPerawatan <= 40.0;
    }

    public String displayInfo() {
        return "Nama: " + nama + "\nKode: " + kode + "\nTingkat Perawatan: " + tingkatPerawatan;
    }

    public String displayInfo(String lokasi) {
        return displayInfo() + "\nLokasi: " + lokasi;
    }
}
