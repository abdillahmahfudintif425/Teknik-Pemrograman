# Week 4 - Polymorphism

**Mata Kuliah:** Teknik Pemrograman  
**Nama:** Abdillah Mahfudin  
**NIM:** 251524094  

---

## Deskripsi

Repository ini berisi hasil praktikum Week 4 yang berfokus pada konsep **Polymorphism** dalam pemrograman berorientasi objek (OOP) menggunakan Java. Terdapat 3 soal yang dikerjakan, masing-masing mendemonstrasikan penerapan polimorfisme dari sudut pandang yang berbeda.

---

## Soal 1 — Another Type of Employee

### Konsep yang Diterapkan
- **Inheritance**: Class `Commission` meng-extend class `Hourly`, yang merupakan turunan dari `Employee` → `StaffMember`. Ini membentuk hierarki pewarisan bertingkat.
- **Method Overriding**: Method `pay()` dan `toString()` di-override untuk menyesuaikan perilaku class `Commission` tanpa mengubah class parent.
- **Polymorphism**: Objek `Commission` disimpan dalam array `StaffMember[]` dan dipanggil secara polimorfik melalui method `pay()` di class `Staff`.
- **Constructor Chaining**: Constructor `Commission` memanggil `super()` untuk meneruskan parameter ke constructor `Hourly`.

### File
- `Commission.java` — class karyawan komisi baru
- `Staff.java` — diperbarui dengan 2 karyawan Commission
- `Firm.java`, `StaffMember.java`, `Employee.java`, `Hourly.java`, `Executive.java`, `Volunteer.java`

---

## Soal 2 — Painting Shapes

### Konsep yang Diterapkan
- **Abstract Class**: Class `Shape` dibuat sebagai abstract class dengan method abstract `area()`, memaksa setiap class turunan untuk mengimplementasikan method tersebut sesuai rumus masing-masing.
- **Polymorphism**: Method `amount(Shape s)` di class `Paint` menerima objek bertipe `Shape` apapun — `Rectangle`, `Sphere`, maupun `Cylinder` — dan memanggil `area()` secara polimorfik.
- **Method Overriding**: Setiap class turunan (`Rectangle`, `Cylinder`, `Sphere`) mengimplementasikan `area()` dan `toString()` sesuai karakteristik bentuknya masing-masing.

### File
- `Shape.java` — abstract class parent
- `Sphere.java` — menghitung surface area bola (4πr²)
- `Rectangle.java` — menghitung area persegi panjang (p × l)
- `Cylinder.java` — menghitung surface area silinder (π × r² × h)
- `Paint.java` — menghitung kebutuhan cat secara polimorfik
- `PaintThings.java` — program utama

---

## Soal 3 — Polymorphic Sorting

### Konsep yang Diterapkan
- **Interface `Comparable`**: Class `Salesperson` mengimplementasikan interface `Comparable` dengan mendefinisikan method `compareTo()`, memungkinkan objek diurutkan secara polimorfik.
- **Polymorphism via Interface**: Method `selectionSort()` dan `insertionSort()` di class `Sorting` menerima `Comparable[]` — bisa berupa `Integer[]`, `String[]`, maupun `Salesperson[]`.
- **Autoboxing**: Tipe primitif `int` dikonversi menjadi `Integer` agar kompatibel dengan `Comparable[]`.
- **Custom Ordering**: Method `compareTo()` di `Salesperson` diimplementasikan untuk mengurutkan descending berdasarkan total penjualan, dengan nama belakang sebagai penentu urutan kedua apabila nilai sales sama.
- **Descending Sort**: `insertionSort` dimodifikasi dengan mengubah kondisi perbandingan dari `< 0` menjadi `> 0` untuk menghasilkan urutan dari terbesar ke terkecil.

### File
- `Sorting.java` — implementasi selection sort dan insertion sort
- `Numbers.java` — mengurutkan array Integer secara descending
- `Strings.java` — mengurutkan array String secara descending
- `Salesperson.java` — class dengan custom `compareTo()`
- `WeeklySales.java` — menampilkan ranking penjualan mingguan

---

## Prinsip OOP yang Diterapkan

| Prinsip | Penerapan |
|---|---|
| **Inheritance** | `Commission extends Hourly`, `Hourly extends Employee`, `Rectangle extends Shape` |
| **Polymorphism** | `pay()`, `area()`, `compareTo()` dipanggil pada berbagai tipe objek berbeda |
| **Abstraction** | Abstract class `Shape` dan abstract method `area()` |
| **Method Overriding** | `pay()` dan `toString()` di-override di setiap class turunan |
| **Interface** | `Salesperson implements Comparable` untuk polymorphic sorting |
