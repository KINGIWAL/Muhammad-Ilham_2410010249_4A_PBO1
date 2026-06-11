package Tugas_UAS;
public class TanamanDetail extends Tanaman {
    private String jenis; 
    private String kebutuhanCahaya; 
    private String kebutuhanAir; 

    public TanamanDetail(String nama, String kode, double tingkatPerawatan, String jenis) {
        super(nama, kode, tingkatPerawatan);
        this.jenis = jenis;
        this.kebutuhanCahaya = patokanCahaya();
        this.kebutuhanAir = patokanAir();
    }

    private String patokanCahaya() {
        double t = getTingkatPerawatan();
        if (t <= 30) return "Rendah";
        if (t <= 70) return "Sedang";
        return "Terang";
    }

    private String patokanAir() {
        double t = getTingkatPerawatan();
        if (t <= 30) return "Jarang";
        if (t <= 70) return "Sedang";
        return "Sering";
    }

    public String getJenis() {
        return jenis;
    }

    public String getKebutuhanCahaya() {
        return kebutuhanCahaya;
    }

    public String getKebutuhanAir() {
        return kebutuhanAir;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo()
                + "\nJenis: " + jenis
                + "\nKebutuhan Cahaya: " + kebutuhanCahaya
                + "\nKebutuhan Air: " + kebutuhanAir
                + "\nStatus Perawatan: " + (isMudah() ? "Mudah" : "Sulit");
    }
}
