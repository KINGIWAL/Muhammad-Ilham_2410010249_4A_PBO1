# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `MainApp`, `TanamanManager`,`TanamanDetail`, dan `Tanaman` adalah contoh dari class.

```bash
public class MainApp {
    ...
}

public class Tananaman Detail extends Tanaman {
    ...
}

public class Tanaman {
    ...
}

public class TanamanManager {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `TanamanDetail t = new TanamanDetail(nama, kode, tingkatPerawatan, jenis);` adalah contoh pembuatan object.

```bash
TanamanDetail t = new TanamanDetail(nama, kode, tingkatPerawatan, jenis);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`,`kode`, dan `tingkatPerawatan` adalah contoh atribut.

```bash
String nama;
String kode;
double tingkatPerawatan; 
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Tanaman` dan `TanamanDetail`.

```bash
 public Tanaman(String nama, String kode, double tingkatPerawatan) {
        this.nama = nama;
        this.kode = kode;
        this.tingkatPerawatan = tingkatPerawatan;
}


 public TanamanDetail(String nama, String kode, double tingkatPerawatan, String jenis) {
        super(nama, kode, tingkatPerawatan);
        this.jenis = jenis;
        this.kebutuhanCahaya = patokanCahaya();
        this.kebutuhanAir = patokanAir();
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`,`setNama`, dan `setTingkatPerawatan` adalah contoh method mutator.

```bash
public void setNama(String nama) {
   this.nama = nama;
}

public void setKode(String kode) {
    this.kode = kode;
}

public void setTingkatPerawatan(double tingkatPerawatan) {
    this.tingkatPerawatan = tingkatPerawatan;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getKode`, `getTingkatPerawatan`, `getJenis`, `getKebutuhanCahaya`, dan `getKebutuhanAir` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getKode() {
return kode;
}

public double getTingkatPerawatan() {
return tingkatPerawatan;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `jenis`,`kebutuhanCahaya`, dan `kebutuhanAir` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String jenis; 
private String kebutuhanCahaya; 
private String kebutuhanAir; 
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `TanamanDetail` mewarisi `Tanaman` dengan sintaks `extends`.

```bash
public class TanamanDetail extends Tanaman {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Tanaman` merupakan overloading method `displayInfo` dan `displayInfo` di `TanamanDetail` merupakan override dari method `displayInfo` di `TanamanManager`.

```bash
public String displayInfo(String lokasi) {
    return displayInfo() + "\nLokasi: " + lokasi;
}


@Override
public String displayInfo() {
...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if` dalam method `patokanAir`dan`hitungRataRata` .

```bash
public double hitungRataRata() {
    if (daftar.isEmpty()) return 0.0;
    double total = 0.0;
    for (TanamanDetail t : daftar) {
        total += t.getTingkatPerawatan();
    }
    return total / daftar.size();
}
private String patokanAir() {
    double t = getTingkatPerawatan();
    if (t <= 30) return "Jarang";
    if (t <= 70) return "Sedang";
    return "Sering";
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
int jumlah = Integer.parseInt(scanner.nextLine());
for (int i = 0; i < jumlah; i++) {
...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
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
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `String[] jenisTanaman = {"Daun", "Bunga", "Kaktus"}; ` adalah contoh penggunaan array.

```bash
String[] jenisTanaman = {"Daun", "Bunga", "Kaktus"}; 
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
...
} catch (Exception e) {
    System.out.println("Terjadi error saat input: " + e.getMessage());
} finally {
    scanner.close();
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Ilham  
NPM: 2410010249
