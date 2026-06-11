package Tugas_UAS;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        TanamanManager pm = new TanamanManager();

        String[] jenisTanaman = {"Daun", "Bunga", "Kaktus"}; 
        System.out.println("Jenis tanaman yang tersedia:");
        for (int i = 0; i < jenisTanaman.length; i++) {
            System.out.println((i+1) + ". " + jenisTanaman[i]);
        }
        System.out.println();
Scanner scanner = new Scanner(System.in);
try {
    System.out.print("Berapa jumlah tanaman yang ingin diinputkan? ");
    int jumlah = Integer.parseInt(scanner.nextLine());

    for (int i = 0; i < jumlah; i++) {
        System.out.println("\nInput tanaman ke-" + (i+1));
        System.out.print("Masukkan nama tanaman: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan kode tanaman: ");
        String kode = scanner.nextLine();
        System.out.print("Masukkan tingkat perawatan (0-100): ");
        double tingkat = Double.parseDouble(scanner.nextLine());
        System.out.print("Masukkan jenis tanaman (contoh: Daun/Bunga/Kaktus): ");
        String jenis = scanner.nextLine();

        pm.tambahTanaman(nama, kode, tingkat, jenis);
    }

    // tampilkan hasil inputan terbaru
     System.out.println(" ");
    pm.tampilkanSemua();
   double rata = pm.hitungRataRata();
   int jumlahMudah = pm.jumlahMudah();
    System.out.println("------------------------------------------ ");
    System.out.println("Jumlah tanaman mudah dirawat: " + jumlahMudah);
    System.out.println("Rata-rata tingkat perawatan: " + rata);
    System.out.println("Jumlah data terbaru: " + pm.jumlahTanaman());
} catch (Exception e) {
    System.out.println("Terjadi error saat input: " + e.getMessage());
} finally {
    scanner.close();
}

    }
}
