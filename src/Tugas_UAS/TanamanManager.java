package Tugas_UAS;
import java.util.ArrayList;

public class TanamanManager {
    private ArrayList<TanamanDetail> daftar = new ArrayList<>();

    public void tambahTanaman(String nama, String kode, double tingkatPerawatan, String jenis) {
        TanamanDetail t = new TanamanDetail(nama, kode, tingkatPerawatan, jenis);
        daftar.add(t);
    }

    public double hitungRataRata() {
        if (daftar.isEmpty()) return 0.0;
        double total = 0.0;
        for (TanamanDetail t : daftar) {
            total += t.getTingkatPerawatan();
        }
        return total / daftar.size();
    }

    public int jumlahMudah() {
        int count = 0;
        for (TanamanDetail t : daftar) {
            if (t.isMudah()) count++;
        }
        return count;
    }

    public int jumlahTanaman() {
        return daftar.size();
    }

    public void tampilkanSemua() {
        System.out.println("Daftar Tanaman:");
        int i = 1;
        for (TanamanDetail t : daftar) {
            System.out.println("---- Tanaman ke-" + i + " ----");
            System.out.println(t.displayInfo());
            i++;
        }
    }
}
