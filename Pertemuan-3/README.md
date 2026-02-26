# 📘 Pertemuan 3 — Constructor & Inheritance

> *Object-Oriented Programming | Jurusan Teknik Komputer dan Informatika — POLBAN*

---

## 🧩 Topik yang Dipelajari

Pertemuan kali ini mengerjakan dan menerapkan kasus mengenai konsep **Inheritance**, **Overloading**, **Overriding**, dan bahkan **Multiple Inheritance**. Bahkan kita memperkuat prinsip **Enkapsulasi**, **Object**, dan **ADT** di sini!!

---

## 📂 Struktur File

```
├── Circle.java         # Superclass — model lingkaran dengan radius & color
├── Cylinder.java       # Subclass — mewarisi Circle, tambah atribut height
└── TestCylinder.java   # Main class — uji coba semua constructor & method
```

---

## 🔑 Konsep yang Diterapkan

### 1. Constructor & Multiple Constructor
Constructor dipanggil otomatis saat objek dibuat. Nama constructor **harus sama** dengan nama class-nya.

```java
public Circle()                        // no-arg constructor
public Circle(double r)                // 1 parameter
public Circle(double x, String color)  // 2 parameter → multiple constructor
```

---

### 2. Inheritance (Pewarisan)
`Cylinder` mewarisi semua method dan atribut dari `Circle` menggunakan keyword `extends`.

```java
public class Cylinder extends Circle {
    // otomatis punya radius, color, getRadius(), getArea() dari Circle
    // ditambah atribut sendiri: height
}
```

> **Rantai pewarisan:** `Circle` → `Cylinder`

---

### 3. `super` Keyword
Digunakan subclass untuk memanggil constructor atau method milik superclass.

```java
public Cylinder(double radius, double height) {
    super(radius);       // panggil Circle(radius)
    this.height = height;
}
```

---

### 4. Function Overriding
`Cylinder` meng-override method `getArea()` dari `Circle` untuk menghitung **luas permukaan** silinder.

```java
@Override
public double getArea() {
    return (super.getArea() * 2) + (super.getRadius() * 2 * Math.PI * height);
    //      ↑ 2 lingkaran alas        ↑ selimut silinder
}
```

---

### 5. Enkapsulasi & ADT
Semua atribut bersifat `private` — hanya bisa diakses lewat method getter/setter.

```java
private double radius;   // tidak bisa diakses langsung dari luar
private String color;

public double getRadius() { return radius; }  // akses via getter
public void setColor(String color) { ... }    // ubah via setter
```

---

## ▶️ Contoh Output Program

```
Cylinder: radius=1.0 height=1.0 base area=...
Cylinder: radius=1.0 height=10.0 base area=...
Cylinder: radius=2.0 height=10.0 base area=... luas permukaan=...
Cylinder: radius=2.0 height=10.0 base area=... color=ijo
```

---

## 💡 Poin Penting

| Konsep | Keyword | Keterangan |
|---|---|---|
| Pewarisan | `extends` | Subclass mewarisi superclass |
| Panggil parent | `super` | Akses constructor/method superclass |
| Override method | `@Override` | Timpa implementasi dari superclass |
| Enkapsulasi | `private` + getter/setter | Sembunyikan data dari luar |
| Blokir pewarisan | `final` | Class tidak bisa di-extend lagi |

---

## 📚 Referensi

- Object Oriented Programming and Java, 2nd Edition — Chapter 6
- Materi Pertemuan 3 — Dosen: Zulkifli Arsyad, Joe Lian Min, Muhammad Riza Alifi
