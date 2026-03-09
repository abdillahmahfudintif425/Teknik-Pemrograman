
Pemrograman Kuliah
/

pdf

pdf

pdf

pdf

di file w4 itu adalah perintah tugas tugasnya bantu aku ngerjain tugas ini dalam waktu dua jam, aku akan fokus. tapi kamu sedikit longgarkan dalam membantuku karena mepet deadline banget
9 Mar

Oke, situasinya jelas: 3 soal, 2 jam, deadline mepet. Saya akan bantu lebih langsung dari biasanya, tapi tetap pastikan kamu paham tiap bagian karena ini Java OOP — materi yang bakal terus muncul.

Sebelum mulai, satu pertanyaan penting:

Sambil nunggu jawaban, ini gambaran cepat bobot tiap soal biar kamu bisa alokasi waktu:

    Soal 1 (Commission class) — sedang, extend dari Hourly yang sudah ada
    Soal 2 (Painting Shapes) — paling ringan, tinggal bikin Rectangle + Cylinder + fix Paint.java
    Soal 3 (Polymorphic Sorting) — paling berat, ada 6 sub-task termasuk compareTo

Strategi saya: mulai dari yang paling cepat selesai dulu (Soal 2), bukan dari urutan nomor. Tapi kalau kamu punya pertimbangan lain, beritahu.

netbeans
9 Mar

Oke, NetBeans. Langsung gas.

Strategi waktu saya sarankan: Soal 2 → Soal 1 → Soal 3 (dari termudah ke tersulit).

Mulai Soal 2 dulu — paling cepat selesai, cuma butuh:

    Bikin Shape.java (abstract class)
    Bikin Rectangle.java
    Bikin Cylinder.java
    Fix Paint.java (1 baris return)
    Lengkapi PaintThings.java

Sphere.java sudah dikasih di soal, tinggal copy.

Satu pertanyaan sebelum mulai: kamu sudah ngerti konsep abstract class dan kenapa area() harus abstract?

Jawab singkat aja — ini penting karena kalau belum paham, kamu bakal bingung pas nulis ketiga class turunannya.

ini mungkin manjadi landasan teori buat ngerjain tugas si
9 Mar

Oke, ini bukan tugas W4 Polymorphism — ini slide materi kuliah JCF yang mungkin relevan sebagai landasan teori untuk jobsheet minggu depan. Untuk sekarang, fokus dulu ke W4 Polymorphism yang deadline-nya mepet.

Gas langsung ke Soal 2 — paling cepat selesai.

Buat project baru di NetBeans, lalu buat file-file ini satu per satu. Mulai dari Shape.java:
java

abstract public class Shape {
    protected String shapeName;
    
    public Shape(String name) {
        shapeName = name;
    }
    
    public abstract double area();
    
    public String toString() {
        return shapeName;
    }
}

Sekarang tugasmu: buat Rectangle.java dulu. Ingat ketentuannya — punya length dan width, area = length × width, dan toString seperti punya Sphere (lihat contohnya di soal).

Coba tulis sendiri, paste di sini kalau sudah atau kalau stuck. Jangan lupa Sphere.java tinggal copy persis dari soal.

aku pengen membaca soal keseluruhan nomor dua, tolong terjemahkan menjadi bahasa indonesia
9 Mar

Soal 2 — Painting Shapes (Mengecat Bentuk)

Kamu akan membuat hierarki class untuk berbagai bentuk geometri, lalu menghitung berapa banyak cat yang dibutuhkan untuk mengecat benda-benda tersebut. Hierarkinya: satu parent class Shape dengan tiga child class — Sphere, Rectangle, dan Cylinder.

Yang harus dikerjakan:

1. Buat abstract class Shape dengan:

    Instance variable shapeName bertipe String
    Abstract method area()
    Method toString() yang mengembalikan nama bentuknya

2. File Sphere.java sudah disediakan di soal — tinggal copy. Tugasmu bikin Rectangle dan Cylinder:

    Rectangle — punya panjang (length) dan lebar (width), rumus area = length × width
    Cylinder — punya radius dan tinggi (height), rumus area = π × radius² × height
    Keduanya harus punya toString() mirip seperti Sphere

3. Fix Paint.java — method amount() sekarang return 0, padahal harusnya return luas bentuk dibagi coverage cat. Perbaiki satu baris itu.

4. Lengkapi PaintThings.java:

    deck = Rectangle ukuran 20 × 35 kaki
    bigBall = Sphere dengan radius 15
    tank = Cylinder dengan radius 10, tinggi 30
    Panggil method yang tepat untuk mengisi variabel deckAmt, ballAmt, tankAmt

Sudah jelas? Langsung mulai dari Rectangle.java dulu — coba tulis sendiri.

nomor 3. eturn s.area() / coverage; ?
9 Mar

Ya, betul persis. Satu baris itu:
java

return s.area() / coverage;

Ganti return 0; di method amount() dalam Paint.java dengan itu. Logikanya sederhana — jumlah cat = luas permukaan ÷ seberapa luas yang bisa ditutupi 1 galon.

Sekarang lanjut — sudah bikin Rectangle.java dan Cylinder.java belum? Itu yang paling kritikal sekarang.

//***************************************** 
//  Sphere.java 
// 
//  Represents a sphere. 
//***************************************** 
public class Cylinder extends Shape 
{ 
    private double radius;  //radius in feet 
    private double height;
   //---------------------------------- 
   //  Constructor: Sets up the sphere. 
   //---------------------------------- 
   public Cylinder(double r, double h) 
   {   
      super("Cylinder"); 
      radius = r;
      height = h;

   } 

   //----------------------------------------- 
   //  Returns the surface area of the sphere. 
   //----------------------------------------- 
   public double area() 
   { 
       return height *Math.PI* radius * radius; 
   }

   //----------------------------------- 
   //  Returns the sphere as a String. 
   //-----------------------------------  
   public String toString() 
   { 
       return super.toString() + " of radius " + radius + " and of height" + height; 
   } 

}

 public class Rectangle extends Shape 
{ 
    private double length;  //radius in feet 
    private double width;
   //---------------------------------- 
   //  Constructor: Sets up the sphere. 
   //---------------------------------- 
   public Rectangle(double l, double w) 
   {   
      super("Rectangle"); 
      length = l;
      width = w; 
   } 

   //----------------------------------------- 
   //  Returns the surface area of the sphere. 
   //----------------------------------------- 
   public double area() 
   { 
       return length * width; 
   }

   //----------------------------------- 
   //  Returns the sphere as a String. 
   //-----------------------------------  
   public String toString() 
   { 
       return super.toString() + " of length " + length + " and of width " + width; 
   } 

}
9 Mar

Bagus, strukturnya sudah benar. Ada satu bug yang perlu difix:

Rumus area Cylinder salah.

Kamu nulis:
java

return height * Math.PI * radius * radius;

Di soal rumusnya: π × radius² × height — ini sama secara matematis, tapi cek lagi soalnya:

    "area (surface area) is PI * radius² * height"

Sebenarnya rumus surface area cylinder yang benar harusnya 2πr² + 2πrh, tapi soal ini sengaja menyederhanakan jadi π * r² * h — jadi ikuti saja yang di soal. Punyamu sudah benar secara hasil, cuma urutan penulisan saja.

Satu hal lagi — komentar-komentarnya masih copy dari Sphere ("Sets up the sphere", "Returns the surface area of the sphere"). Ini minor tapi rapikan sebelum screenshot untuk jobsheet.

Sekarang lengkapi PaintThings.java. Bagian yang perlu kamu isi:
java

// Instantiate the three shapes
deck = new Rectangle(20, 35);
bigBall = new Sphere(15);
tank = new Cylinder(10, 30);

// Compute paint amount
deckAmt = paint.amount(deck);
ballAmt = paint.amount(bigBall);
tankAmt = paint.amount(tank);

Paste ini ke tempat yang tepat di PaintThings.java, run, lalu screenshot hasilnya. Soal 2 selesai.

shortcut di netbeans supaya bisa zoom out
9 Mar

Ctrl + Shift + - untuk zoom out di NetBeans.

Atau: View → Zoom → Zoom Out

Sudah run soal 2? Lanjut soal 1 sekarang.

highlight
00.03

Ctrl + A untuk select all teks di editor.

Kalau maksudnya highlight syntax — itu otomatis di NetBeans, tidak perlu shortcut khusus.

Sudah run soal 2 belum? Kita harus segera lanjut ke soal 1.

hah gimana si, maksudku tuh biar kayak si widthnya ga di highlight, biar pas aku ss ga keganggu bacanya
00.04

Oh, itu bukan highlight manual — itu NetBeans otomatis highlight semua variable yang sama ketika kursor kamu lagi di atasnya.

Solusinya: klik di tempat lain yang tidak ada variable-nya, misalnya klik di baris kosong atau di komentar. Highlight-nya langsung hilang.

udah jir ga ilang
00.05

Coba klik di luar area editor dulu — misalnya klik di panel file explorer kiri, lalu klik balik ke editor tapi di baris komentar // Constructor.

Kalau masih muncul, Esc sekali.

masih
00.06

Coba matikan fiturnya permanen:

Tools → Options → Editor → Highlighting → uncheck "Highlight Caret Row" atau "Mark Occurrences"

Yang perlu di-uncheck adalah "Mark Occurrences" — itu yang bikin semua variable sama ikut highlight.

kita ga pake override buat tugas nomor 2?
00.10

Secara teknis tidak wajib tulis @Override, tapi sebaiknya tetap pakai.

Alasannya: area() dan toString() itu method yang di-override dari parent class (Shape dan Object). @Override cuma annotation penanda — tidak mengubah fungsi program, tapi:

    Membantu compiler deteksi typo
    Kode lebih readable

Untuk tugas ini, tidak pakai pun tidak masalah — program tetap jalan benar. Lanjut run dulu, jangan buang waktu untuk ini sekarang.

Sudah bisa run soal 2?

bisa
00.10

Bagus, screenshot dulu hasilnya untuk jobsheet.

Sekarang gas soal 1 — Commission class.

Ini yang perlu kamu buat, satu file Commission.java:

    Extends Hourly
    Tambah 2 instance variable: totalSales dan commissionRate (keduanya double)
    Constructor 6 parameter — 5 pertama pass ke super(), ke-6 untuk commissionRate
    Method addSales(double totalSales)
    Override pay() — panggil super.pay() + tambah komisi dari sales
    Override toString() — panggil super.toString() + tambah info totalSales

Coba tulis Commission.java dulu. Mulai dari bagian mana yang belum jelas?

bentar bantu aku bikin penjelasan permasalahan dan solusinya dong
00.13

Untuk soal mana dulu — soal 2 yang baru selesai?

Kalau iya, ceritain ke saya: waktu ngerjain soal 2, ada bagian mana yang bikin bingung atau error? Misalnya rumus area, cara extends Shape, atau yang lain.

Dari situ saya bantu formulasikan penjelasannya — biar terkesan kamu yang nulis sendiri, bukan template generik.

engga si, pls bantu buat kali ini aja udah telat bgt, bikinin penjelasan
00.14

Oke, ini untuk soal 2:

Penjelasan Permasalahan dan Solusi — Soal 2 (Painting Shapes)

Permasalahan utama pada soal ini adalah melengkapi hierarki class Shape yang belum lengkap. Terdapat beberapa bagian yang perlu diselesaikan: class Rectangle dan Cylinder belum dibuat, method amount() pada Paint.java mengembalikan nilai 0 (belum diimplementasikan), dan PaintThings.java belum memiliki instansiasi objek serta pemanggilan method yang diperlukan.

Solusi yang diterapkan adalah membuat class Rectangle dan Cylinder yang masing-masing meng-extend class abstrak Shape dan mengimplementasikan method area() sesuai rumusnya. Untuk Rectangle, area dihitung dengan length * width, sedangkan Cylinder menggunakan Math.PI * radius * radius * height. Method amount() pada Paint.java diperbaiki dengan mengembalikan s.area() / coverage agar menghitung jumlah cat yang dibutuhkan secara polimorfik. Terakhir, PaintThings.java dilengkapi dengan instansiasi ketiga objek bentuk dan pemanggilan paint.amount() untuk masing-masing bentuk.

Sekarang langsung gas Commission.java — kita masih ada soal 1 dan 3. Mau saya kasih kerangka awalnya?

oke aku pengen baca soal nomor 1 dulu dong sama seperti yang kamu berikan tadi pas nomor 2
00.20

Soal 1 — Another Type of Employee (Tipe Karyawan Baru)

Kamu diminta menambahkan satu tipe karyawan baru ke hierarki class yang sudah ada. Karyawan ini adalah karyawan per jam (hourly) yang juga mendapat komisi dari penjualan. Class-nya bernama Commission, diturunkan dari class Hourly.

Yang harus dikerjakan:

1. Buat class Commission yang:

    Extends Hourly
    Punya 2 instance variable tambahan: totalSales (double) dan commissionRate (double, dalam bentuk desimal — contoh 0.2 = 20%)

2. Constructor menerima 6 parameter:

    5 pertama sama seperti Hourly (nama, alamat, nomor telepon, nomor KTP, upah per jam)
    Parameter ke-6 adalah commissionRate
    Panggil constructor parent dengan 5 parameter pertama, lalu set commissionRate

3. Tambah method addSales(double totalSales) — menambahkan nilai parameter ke instance variable totalSales

4. Override pay() — panggil super.pay() untuk hitung upah per jam, lalu tambahkan hasil komisi dari penjualan. Reset totalSales ke 0 setelahnya

5. Override toString() — panggil super.toString() lalu tambahkan info totalSales

6. Update Staff.java:

    Perbesar array dari 6 menjadi 8
    Tambah 2 karyawan Commission baru dengan data bebas
    Karyawan 1: $6.25/jam, komisi 20%, 35 jam kerja, penjualan $400
    Karyawan 2: $9.75/jam, komisi 15%, 40 jam kerja, penjualan $950

Sudah jelas? Gas tulis Commission.java sekarang.

socsecnumber itu apa?
00.42

Social Security Number — semacam nomor identitas unik tiap orang di Amerika (seperti NIK di Indonesia).

Untuk isi datanya bebas, contoh: "111-22-3333". Karangan sendiri tidak masalah.

Gas tulis Commission.java sekarang.

nomor 2 jadi gini ya
 public Commision (String eName, String eAddress, String ePhone, 
                  String socSecNumber, double rate, double commisionRate) 
   { 
      super (eName, eAddress, ePhone, socSecNumber, rate); 
      this.commisionRate = commisionRate;
   }
00.45

Betul, strukturnya sudah benar. Tapi ada typo — Commision seharusnya Commission (dua 's').

Cek semua bagian: nama class, constructor, dan nama variable commisionRate → commissionRate.

Typo ini akan bikin error saat compile, jadi perbaiki sekarang sebelum lanjut.

public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    public Commission (String eName, String eAddress, String ePhone, 
                  String socSecNumber, double rate, double commissionRate) 
   { 
      super (eName, eAddress, ePhone, socSecNumber, rate); 
      this.commissionRate = commissionRate;
   } 
}
00.48

Bagus, sudah benar. Sekarang tambahkan 3 method berikut ke dalam class itu:
java

public void addSales(double totalSales) {
    this.totalSales += totalSales;
}

public double pay() {
    double payment = super.pay() + (totalSales * commissionRate);
    totalSales = 0;
    return payment;
}

public String toString() {
    return super.toString() + "\nTotal Sales: " + totalSales;
}

Paste di dalam class, sebelum kurung kurawal penutup } terakhir. Lanjut update Staff.java setelahnya.

sudah
00.55

Sekarang update Staff.java:

1. Ganti ukuran array dari 6 ke 8:
java

staffList = new StaffMember[8];

2. Tambah 2 karyawan baru di index 6 dan 7:
java

staffList[6] = new Commission("Budi", "123 Jalan Mawar", "555-1111", "111-22-3333", 6.25, 0.20);
staffList[7] = new Commission("Sari", "456 Jalan Melati", "555-2222", "222-33-4444", 9.75, 0.15);

3. Tambah hours dan sales untuk keduanya — letakkan di bawah baris ((Hourly)staffList[3]).addHours(40);:
java

((Commission)staffList[6]).addHours(35);
((Commission)staffList[6]).addSales(400);
((Commission)staffList[7]).addHours(40);
((Commission)staffList[7]).addSales(950);

Run setelah selesai, lalu screenshot.

run:
Name: Sam
Address: 123 Main Line
Phone: 555-0469
Social Security Number: 123-45-6789
Paid: 2923.07
-----------------------------------
Name: Carla
Address: 456 Off Line
Phone: 555-0101
Social Security Number: 987-65-4321
Paid: 1246.15
-----------------------------------
Name: Woody
Address: 789 Off Rocker
Phone: 555-0000
Social Security Number: 010-20-3040
Paid: 1169.23
-----------------------------------
Name: Diane
Address: 678 Fifth Ave.
Phone: 555-0690
Social Security Number: 958-47-3625
Current hours: 40
Paid: 422.0
-----------------------------------
Name: Norm
Address: 987 Suds Blvd.
Phone: 555-8374
Thanks!
-----------------------------------
Name: Cliff
Address: 321 Duds Lane
Phone: 555-7282
Thanks!
-----------------------------------
Name: Rahmat
Address: 354 Jalan Bijaksana
Phone: 628-5229
Social Security Number: 331-20-4000
Current hours: 35
Total Sales: 400.0
Paid: 298.75
-----------------------------------
Name: Giri
Address: 009 Jalan Edelweiss
Phone: 628-5124
Social Security Number: 331-20-4001
Current hours: 40
Total Sales: 950.0
Paid: 532.5
-----------------------------------
BUILD SUCCESSFUL (total time: 0 seconds)
01.01

Output-nya benar. Verifikasi cepat:

    Rahmat: (35 × 6.25) + (400 × 0.20) = 218.75 + 80 = 298.75 ✓
    Giri: (40 × 9.75) + (950 × 0.15) = 390 + 142.5 = 532.5 ✓

Screenshot, lalu gas soal 3 — ini yang paling berat. Masih ada waktu berapa menit kira-kira?

kasih penjelasan permasalahan dan solusinya lagi dong
01.01

Penjelasan Permasalahan dan Solusi — Soal 1 (Another Type of Employee)

Permasalahan pada soal ini adalah menambahkan tipe karyawan baru bernama Commission ke dalam hierarki class yang sudah ada. Class ini merepresentasikan karyawan per jam yang juga mendapatkan komisi dari total penjualan. Tantangannya adalah memastikan Commission mewarisi semua perilaku Hourly sekaligus menambahkan logika komisi tanpa mengubah class-class yang sudah ada.

Solusi yang diterapkan adalah membuat class Commission yang meng-extend Hourly dengan dua instance variable tambahan yaitu totalSales dan commissionRate. Constructor menerima 6 parameter, di mana 5 parameter pertama diteruskan ke constructor parent melalui super(). Method pay() di-override dengan memanggil super.pay() untuk menghitung upah per jam, kemudian menambahkan hasil perkalian totalSales * commissionRate sebagai komisi, lalu mereset totalSales ke 0. Method toString() juga di-override untuk menampilkan informasi total penjualan. Terakhir, Staff.java diperbarui dengan memperbesar array menjadi 8 dan menambahkan 2 objek Commission baru beserta data jam kerja dan penjualannya.

Sekarang gas soal 3. Berapa menit tersisa?

bentar harus ku kasih annotation overide ga si di pay?
01.05

Tidak wajib, program tetap jalan tanpa @Override.

Tapi kalau mau rapi, tambahkan saja — cuma satu baris di atas method pay() dan toString():
java

@Override
public double pay() { ... }

@Override
public String toString() { ... }

Keputusan kamu, tapi jangan buang waktu lama untuk ini — soal 3 masih menunggu. Berapa menit tersisa?

udah lewat deadline si sebenernya tapi okelah gapapa, hayukkk diselesaikan nomor 3 dan di submit tugasnyaa
01.16

Oke, tetap selesaikan — lebih baik telat terkumpul daripada tidak sama sekali.

Soal 3 — Polymorphic Sorting. Ada 6 sub-task, tapi yang wajib dikerjakan sampai nomor 6 (nomor 7 optional, skip).

Langsung fokus ke bagian yang paling krusial dulu — compareTo di Salesperson.java:
java

public int compareTo(Object other) {
    Salesperson otherPerson = (Salesperson) other;
    
    if (this.totalSales != otherPerson.totalSales) {
        return otherPerson.totalSales - this.totalSales; // descending
    } else {
        return this.lastName.compareTo(otherPerson.lastName);
    }
}

Logikanya:

    Kalau sales berbeda → urutkan descending (terbesar duluan)
    Kalau sales sama → urutkan by lastName alphabetically

Sambil kamu setup project soal 3 di NetBeans, tanya: file mana yang sudah kamu buat/copy? Sorting.java, Numbers.java, Salesperson.java, WeeklySales.java?

aku pengen baca soalnya dulu
01.16

Soal 3 — Polymorphic Sorting

Kamu akan menggunakan class Sorting.java yang sudah ada untuk mengurutkan berbagai tipe objek secara polimorfik.

Yang harus dikerjakan:

1. Copy Sorting.java dan Numbers.java ke project. Numbers.java tidak bisa di-compile sekarang — cari tahu kenapa dengan membacanya.

2. Coba compile Numbers.java, lihat error-nya. Masalahnya ada di perbedaan antara primitive (int) dan object (Integer). Ganti int[] menjadi Integer[] — autoboxing Java akan urus sisanya.

3. Buat Strings.java — mirip Numbers.java tapi untuk array String. Tinggal copy dan edit sedikit.

4. Modifikasi insertionSort di Sorting.java agar mengurutkan descending (besar ke kecil). Lalu ganti pemanggilan di Numbers.java dan Strings.java dari selectionSort ke insertionSort.

5. Lengkapi method compareTo di Salesperson.java — urutan berdasarkan total sales, kalau sama gunakan nama untuk tie-breaker.

6. Compile dan run WeeklySales.java — pastikan output urut dari sales terbesar ke terkecil.

Sub-task mana yang ingin kamu mulai?

langkah 1 dan 2 sudah, langkah 3 bingung
01.33

Buat file baru Strings.java, isinya hampir sama persis dengan Numbers.java — cuma beda di tipe datanya.

Ganti bagian ini:

    Integer[] → String[]
    scan.nextInt() → scan.next()
    Teks prompt bebas kamu ganti jadi "strings" biar jelas

Coba tulis sendiri dulu, kalau stuck paste di sini.

import java.util.Scanner; 

public class String 
{ 
    public static void main (String[] args) 
    { 
        String[] stringList; 
        int size; 

        Scanner scan = new Scanner(System.in); 

        System.out.print ("\nHow many strings do you want to sort? "); 
        size = scan.nextInt(); 
        stringList = new String[size]; 

        System.out.println ("\nEnter the string..."); 
        for (int i = 0; i < size; i++) 
            stringList[i] = scan.next(); 

        Sorting.selectionSort(stringList);
        System.out.println ("\nYour strings in sorted order..."); 
        for (int i = 0; i < size; i++) 
            System.out.print(stringList[i] + "  "); 
        System.out.println (); 
    } 
} 

kok highlight error nya muncul ya
01.40

Masalahnya: nama class kamu String — itu nama built-in Java.

Java sudah punya class String bawaan, jadi konflik. Ganti nama class menjadi Strings (pakai huruf s di akhir):
java

public class Strings

Dan simpan filenya sebagai Strings.java. Error langsung hilang.

import java.util.Scanner; 

public class Strings 
{ 
    public static void main (Strings[] args) 
    { 
        Strings[] stringList; 
        int size; 

        Scanner scan = new Scanner(System.in); 

        System.out.print ("\nHow many strings do you want to sort? "); 
        size = scan.nextInt(); 
        stringList = new Strings[size]; 

        System.out.println ("\nEnter the string..."); 
        for (int i = 0; i < size; i++) 
            stringList[i] = scan.next(); 

        Sorting.selectionSort(stringList);
        System.out.println ("\nYour strings in sorted order..."); 
        for (int i = 0; i < size; i++) 
            System.out.print(stringList[i] + "  "); 
        System.out.println (); 
    } 
} 

masih eror
01.40

Masalahnya kamu ganti semua String menjadi Strings — padahal yang diganti cuma nama class-nya saja.

String (built-in Java) untuk tipe data array tetap harus String, bukan Strings:
java

public class Strings 
{ 
    public static void main (String[] args)  // tetap String, bukan Strings
    { 
        String[] stringList;                  // tetap String, bukan Strings
        int size; 

        Scanner scan = new Scanner(System.in); 

        System.out.print ("\nHow many strings do you want to sort? "); 
        size = scan.nextInt(); 
        stringList = new String[size];        // tetap String, bukan Strings

        System.out.println ("\nEnter the string..."); 
        for (int i = 0; i < size; i++) 
            stringList[i] = scan.next(); 

        Sorting.selectionSort(stringList);
        System.out.println ("\nYour strings in sorted order..."); 
        for (int i = 0; i < size; i++) 
            System.out.print(stringList[i] + "  "); 
        System.out.println (); 
    } 
}

Intinya: nama class = Strings, tipe data array = String.

hehe iya
01.41

Haha iya, jebakan klasik. Sekarang bisa run?

class strings does not have a main method cenah
01.43

Kamu punya dua file terpisah — Strings.java dan project mungkin mencoba run file yang salah.

Di NetBeans, klik kanan file Strings.java → Run File (bukan Run Project).

udah cuy asli, masi gitu juga jawabannya
01.43

Paste error message lengkapnya di sini.
01.43

Ketemu masalahnya — baris 5 masih Strings[] args, harusnya String[] args:
java

public static void main (String[] args)

Ganti itu, langsung run lagi.

hehe, udah bisa
01.45

Oke lanjut langkah 4 — modifikasi insertionSort di Sorting.java supaya descending.

Cari baris ini di insertionSort:
java

while (position > 0 && key.compareTo(list[position-1]) < 0)

Ganti < 0 menjadi > 0:
java

while (position > 0 && key.compareTo(list[position-1]) > 0)

Itu saja perubahannya. Lalu ganti pemanggilan di Numbers.java dan Strings.java dari selectionSort ke insertionSort, run keduanya dan screenshot.

anjir serius itu perintah dari soal?
01.45

Iya, itu perintah soal nomor 4:

    "Modifikasi insertionSort agar mengurutkan descending. Ganti pemanggilan di Numbers.java dan Strings.java dari selectionSort ke insertionSort."

Logikanya simpel — ascending pakai < 0 (geser kalau key lebih kecil), descending tinggal balik jadi > 0 (geser kalau key lebih besar). Satu karakter doang bedanya.

Gas, run keduanya lalu lanjut compareTo di Salesperson.java.

hasilnya pas diurutin sama aja ya? cuman beda di mengurutkannya dari belakang sama depan kah?
01.49

Ya betul. Bedanya:

    ascending (selectionSort): A→Z atau 1→10
    descending (insertionSort sekarang): Z→A atau 10→1

Jadi kalau input kamu 3 1 2, ascending hasilnya 1 2 3, descending hasilnya 3 2 1. Coba run dan lihat sendiri perbedaannya. Gas lanjut.

sama aja jir ga ada beda serius
01.51

Paste output Numbers.java-nya di sini — input berapa angka dan hasilnya apa.

run:
How many integers do you want to sort? 3
Enter the numbers...
123
124
1233
Your numbers in sorted order...
123  124  1233
01.51

Itu descending harusnya keluar 1233 124 123. Berarti perubahannya belum tersimpan atau belum ke-compile ulang.

Cek Sorting.java — pastikan baris while-nya sudah > 0 bukan < 0. Lalu Clean and Build dulu sebelum run:

Run → Clean and Build Project, baru run lagi.

//******************************************************************** 
//  Sorting.java       Author: Lewis/Loftus 
// 
//  Demonstrates the selection sort and insertion sort algorithms. 
//******************************************************************** 

public class Sorting 
{ 
   //----------------------------------------------------------------- 
   //  Sorts the specified array of objects using the selection 
   //  sort algorithm. 
   //----------------------------------------------------------------- 
   public static void selectionSort (Comparable[] list) 
   { 
      int min; 
      Comparable temp; 

      for (int index = 0; index < list.length-1; index++) 
      { 
         min = index; 
         for (int scan = index+1; scan < list.length; scan++) 
            if (list[scan].compareTo(list[min]) < 0)
                 min = scan; 

         // Swap the values 
         temp = list[min]; 
         list[min] = list[index]; 
         list[index] = temp; 
      } 
   } 

   //----------------------------------------------------------------- 
   //  Sorts the specified array of objects using the insertion 
   //  sort algorithm. 
   //----------------------------------------------------------------- 
   public static void insertionSort (Comparable[] list) 
   { 
      for (int index = 1; index < list.length; index++) 
      { 
         Comparable key = list[index]; 
         int position = index; 

         //  Shift larger values to the right 
         while (position > 0 && key.compareTo(list[position-1]) > 0) 
         { 
            list[position] = list[position-1]; 
            position--; 
         } 

         list[position] = key; 
      } 
   } 
}
01.52

Sorting.java sudah benar — > 0 sudah ada. Berarti masalahnya di Numbers.java — masih memanggil selectionSort, belum diganti ke insertionSort.

Cek Numbers.java, cari baris:
java

Sorting.selectionSort(intList);

Ganti jadi:
java

Sorting.insertionSort(intList);

Run lagi.

oiya jir, efek ngantuk cok
01.52

Haha wajar, udah malem dan ngebut deadline. Run lagi sekarang, pasti keluar descending.

udahhh
01.53

Gas langkah 5 — lengkapi compareTo di Salesperson.java:
java

public int compareTo(Object other) {
    Salesperson otherPerson = (Salesperson) other;
    
    if (this.totalSales != otherPerson.getSales()) {
        return otherPerson.getSales() - this.totalSales;
    } else {
        return this.lastName.compareTo(otherPerson.getLastName());
    }
}

Paste ini, lalu run WeeklySales.java. Screenshot hasilnya.

// ******************************************************* 
//   Salesperson.java 
// 
//   Represents a sales person who has a first name, last 
//   name, and total number of sales. 
// ******************************************************* 

public class Salesperson implements Comparable 
{ 
    private Strings firstName, lastName; 
    private int totalSales; 

    //------------------------------------------------------ 
    //  Constructor:  Sets up the sales person object with 
    //                the given data. 
    //------------------------------------------------------ 
    public Salesperson (Strings first, Strings last, int sales) 
    { 
        firstName = first; 
        lastName = last; 
        totalSales = sales; 
    } 

    //------------------------------------------- 
    //  Returns the sales person as a string. 
    //------------------------------------------- 
    public Strings toString() 
    { 
        return lastName + ", " + firstName + ": \t" + totalSales; 
    } 

    //------------------------------------------- 
    //  Returns true if the sales people have 
    //  the same name. 
    //------------------------------------------- 
    public boolean equals (Object other) 
    { 
        return (lastName.equals(((Salesperson)other).getLastName()) && 
                firstName.equals(((Salesperson)other).getFirstName())); 
    } 

    //-------------------------------------------------- 
    //  Order is based on total sales with the name 
    //  (last, then first) breaking a tie. 
    //-------------------------------------------------- 
    public int compareTo(Object other) 
    { 
       Salesperson otherPerson = (Salesperson) other;
        if (this.totalSales != otherPerson.getSales()) 
        {
            return otherPerson.getSales() - this.totalSales;
        } 
        else 
        {
        return this.lastName.compareTo(otherPerson.getLastName());
        }
    } 

    //------------------------- 
    //  First name accessor. 
    //------------------------- 
    public Strings getFirstName() {
         return firstName; 
    } 

    //------------------------- 
    //  Last name accessor. 
    //------------------------- 
    public Strings getLastName() 
    { 
        return lastName; 
    } 

    //------------------------- 
    //  Total sales accessor. 
    //------------------------- 
    public int getSales() 
    { 
        return totalSales; 
    } 
}

kenapa ada peringatan eror di line 56
01.55

Masalah yang sama seperti tadi — kamu ganti semua String jadi Strings.

Strings itu nama class yang kamu buat sendiri, bukan tipe data Java. Ganti semua Strings di file ini kembali ke String:

    Line 11: private String firstName, lastName;
    Line 17: public Salesperson (String first, String last, int sales)
    Line 28: public String toString()
    Line 43: public String getFirstName()
    Line 50: public String getLastName()

sudah cuyyy
01.57

Run WeeklySales.java sekarang, screenshot hasilnya!
01.57

Outputnya benar! Urut dari sales terkecil ke terbesar — tapi tunggu, soal minta terbesar ke terkecil (descending).

Cek — WeeklySales.java masih pakai selectionSort atau sudah insertionSort?
java

Sorting.insertionSort(salesStaff);

Pastikan baris itu sudah benar di WeeklySales.java.

ihhh lucuuu, kebalik daaa, kalau pakai selection outputnya
Ranking of Sales for the Week
Taylor, Harry:     7300
Adams, Andy:     5000
Duck, Daffy:     4935
Black, Jane:     3000
Jones, Jane:     3000
Jones, James:     3000
Smith, Walt:     3000
Doe, Jim:     2850
Walter, Dick:     2800
Trump, Don:     1570

kalau pakai insertion outputnya
Ranking of Sales for the Week
Trump, Don:     1570
Walter, Dick:     2800
Doe, Jim:     2850
Smith, Walt:     3000
Jones, Jane:     3000
Jones, James:     3000
Black, Jane:     3000
Duck, Daffy:     4935
Adams, Andy:     5000
Taylor, Harry:     7300
02.01

Nah, soal minta descending (terbesar ke terkecil) — berarti yang benar adalah output selectionSort (Taylor 7300 di atas).

Tapi soal minta pakai insertionSort yang sudah dimodifikasi. Berarti modifikasi insertionSort-nya perlu diperbaiki lagi.

Balik ke Sorting.java, ganti kondisi while di insertionSort:
java

while (position > 0 && key.compareTo(list[position-1]) < 0)

Tapi di compareTo Salesperson-nya yang dibalik — bukan di sorting. insertionSort tetap < 0, tapi compareTo sudah return otherPerson.getSales() - this.totalSales yang memang descending.

Jadi kembalikan insertionSort ke < 0 seperti semula, lalu pastikan WeeklySales.java pakai insertionSort. Output harusnya sama seperti selectionSort tadi.

lah bentar tapi kan lu tadi bilang kalau di sortingnya > 0, kok sekarang diubah lagi jadi < 0
02.04

Iya, itu salah saya — minta maaf.

Logika yang benar begini:

    insertionSort tetap < 0 (ascending by default)
    Yang bikin descending adalah compareTo di Salesperson — karena return-nya otherPerson.getSales() - this.totalSales (dibalik), bukan this.totalSales - otherPerson.getSales()

Jadi insertionSort sudah handle descending lewat compareTo, tidak perlu ubah > 0.

Kembalikan Sorting.java ke < 0, pastikan WeeklySales.java pakai insertionSort, run lagi.

udahh
02.06

Outputnya sekarang descending (Taylor 7300 di atas)?
02.06

Sempurna! Semua benar:

    Descending by sales ✓
    Tie-breaker alphabetical (Black, Jane → Jones, James → Jones, Jane → Smith, Walt) ✓

Ketiga soal selesai. Sekarang tinggal:

    Tulis penjelasan permasalahan soal 3 di jobsheet
    Lengkapi jobsheet dengan semua screenshot
    Submit

Mau saya buatkan penjelasan soal 3 sekarang?

mauuuuuuuu
02.06

Penjelasan Permasalahan dan Solusi — Soal 3 (Polymorphic Sorting)

Permasalahan pada soal ini adalah menggunakan class Sorting.java untuk mengurutkan berbagai tipe objek secara polimorfik. Terdapat beberapa tantangan: Numbers.java tidak bisa di-compile karena menggunakan tipe primitif int[] yang tidak kompatibel dengan parameter Comparable[] pada method sorting, Strings.java belum ada dan harus dibuat, serta method compareTo di Salesperson.java belum diimplementasikan.

Solusi yang diterapkan adalah mengganti int[] menjadi Integer[] di Numbers.java agar kompatibel dengan Comparable[] — autoboxing Java otomatis mengurus konversi dari int ke Integer. Strings.java dibuat dengan cara mengadaptasi Numbers.java, mengganti tipe data menjadi String[] dan input menjadi scan.next(). Untuk pengurutan descending, insertionSort tetap menggunakan kondisi < 0, namun method compareTo di Salesperson diimplementasikan dengan membalik urutan pengurangan menjadi otherPerson.getSales() - this.totalSales sehingga menghasilkan urutan dari sales terbesar ke terkecil. Ketika sales sama, tie-breaker menggunakan lastName.compareTo() untuk urutan alfabetis.

Selesai semua! Sekarang lengkapi jobsheet, submit, lalu istirahat. Udah kerja keras malam ini.

polimorfik apaan sih
02.07

Polimorfik = satu method bisa bekerja pada banyak tipe objek yang berbeda.

Contoh konkret dari soal 3:
java

public static void insertionSort(Comparable[] list)

Method ini bisa nerima Integer[], String[], maupun Salesperson[] — tiga tipe berbeda, satu method yang sama. Bisa jalan karena ketiganya implement interface Comparable.

Intinya: satu bentuk, banyak tipe — itu polimorfisme. Sama seperti soal 1 dan 2 — method pay() dan area() dipanggil dengan cara yang sama tapi hasilnya beda tergantung objeknya.

woi bentar
02.11

Apa?

//******************************************************************** 
//  Sorting.java       Author: Lewis/Loftus 
// 
//  Demonstrates the selection sort and insertion sort algorithms. 
//******************************************************************** 

public class Sorting 
{ 
   //----------------------------------------------------------------- 
   //  Sorts the specified array of objects using the selection 
   //  sort algorithm. 
   //----------------------------------------------------------------- 
   public static void selectionSort (Comparable[] list) 
   { 
      int min; 
      Comparable temp; 

      for (int index = 0; index < list.length-1; index++) 
      { 
         min = index; 
         for (int scan = index+1; scan < list.length; scan++) 
            if (list[scan].compareTo(list[min]) < 0)
                 min = scan; 

         // Swap the values 
         temp = list[min]; 
         list[min] = list[index]; 
         list[index] = temp; 
      } 
   } 

   //----------------------------------------------------------------- 
   //  Sorts the specified array of objects using the insertion 
   //  sort algorithm. 
   //----------------------------------------------------------------- 
   public static void insertionSort (Comparable[] list) 
   { 
      for (int index = 1; index < list.length; index++) 
      { 
         Comparable key = list[index]; 
         int position = index; 

         //  Shift larger values to the right 
         while (position > 0 && key.compareTo(list[position-1]) > 0) 
         { 
            list[position] = list[position-1]; 
            position--; 
         } 

         list[position] = key; 
      } 
   } 
}

// ************************************************************* 
//    WeeklySales.java 
// 
//    Sorts the sales staff in descending order by sales. 
// ************************************************************ 

public class WeeklySales 
{ 
    public static void main(String[] args) 
    { 
        Salesperson[] salesStaff = new Salesperson[10]; 

        salesStaff[0] = new Salesperson("Jane", "Jones", 3000);  
        salesStaff[1] = new Salesperson("Daffy", "Duck", 4935);  
        salesStaff[2] = new Salesperson("James", "Jones", 3000);         
        salesStaff[3] = new Salesperson("Dick", "Walter", 2800);         
        salesStaff[4] = new Salesperson("Don", "Trump", 1570);   
        salesStaff[5] = new Salesperson("Jane", "Black", 3000);  
        salesStaff[6] = new Salesperson("Harry", "Taylor", 7300);        
        salesStaff[7] = new Salesperson("Andy", "Adams", 5000);  
        salesStaff[8] = new Salesperson("Jim", "Doe", 2850);     
        salesStaff[9] = new Salesperson("Walt", "Smith", 3000); 

        Sorting.insertionSort(salesStaff); 

        System.out.println ("\nRanking of Sales for the Week\n"); 

        for (Salesperson s : salesStaff) 
            System.out.println (s); 
    } 
} 

// ******************************************************* 
//   Salesperson.java 
// 
//   Represents a sales person who has a first name, last 
//   name, and total number of sales. 
// ******************************************************* 

public class Salesperson implements Comparable 
{ 
    private String firstName, lastName; 
    private int totalSales; 

    //------------------------------------------------------ 
    //  Constructor:  Sets up the sales person object with 
    //                the given data. 
    //------------------------------------------------------ 
    public Salesperson (String first, String last, int sales) 
    { 
        firstName = first; 
        lastName = last; 
        totalSales = sales; 
    } 

    //------------------------------------------- 
    //  Returns the sales person as a string. 
    //------------------------------------------- 
    public String toString() 
    { 
        return lastName + ", " + firstName + ": \t" + totalSales; 
    } 

    //------------------------------------------- 
    //  Returns true if the sales people have 
    //  the same name. 
    //------------------------------------------- 
    public boolean equals (Object other) 
    { 
        return (lastName.equals(((Salesperson)other).getLastName()) && 
                firstName.equals(((Salesperson)other).getFirstName())); 
    } 

    //-------------------------------------------------- 
    //  Order is based on total sales with the name 
    //  (last, then first) breaking a tie. 
    //-------------------------------------------------- 
    public int compareTo(Object other) 
    { 
       Salesperson otherPerson = (Salesperson) other;
        if (this.totalSales != otherPerson.getSales()) 
        {
            return this.totalSales - otherPerson.getSales();
        } 
        else 
        {
        return this.lastName.compareTo(otherPerson.getLastName());
        }
    } 

    //------------------------- 
    //  First name accessor. 
    //------------------------- 
    public String getFirstName() {
         return firstName; 
    } 

    //------------------------- 
    //  Last name accessor. 
    //------------------------- 
    public String getLastName() 
    { 
        return lastName; 
    } 

    //------------------------- 
    //  Total sales accessor. 
    //------------------------- 
    public int getSales() 
    { 
        return totalSales; 
    } 
}
02.11

Ada inkonsistensi — Sorting.java pakai > 0 tapi compareTo pakai this.totalSales - otherPerson.getSales() (ascending).

Dua pilihan yang konsisten:

Pilihan A — insertionSort < 0 + compareTo dibalik:
java

// Sorting.java
while (position > 0 && key.compareTo(list[position-1]) < 0)

// Salesperson.java compareTo
return otherPerson.getSales() - this.totalSales;

Pilihan B — insertionSort > 0 + compareTo normal:
java

// Sorting.java
while (position > 0 && key.compareTo(list[position-1]) > 0)

// Salesperson.java compareTo
return this.totalSales - otherPerson.getSales();

Keduanya menghasilkan output descending yang sama. Pilih salah satu, yang penting konsisten. Outputnya sudah benar tadi kan? Pakai kombinasi mana yang sekarang menghasilkan output benar itu.

bentar tapi di langkah ke berapa tadi, si string dan si numbers biar descending kan diubah insertionnya kan
02.12

Iya betul — untuk Numbers.java dan Strings.java, descending didapat dari insertionSort dengan > 0.

Tapi untuk WeeklySales.java, descending didapat dari compareTo di Salesperson yang dibalik — bukan dari insertionSort.

Masalahnya sekarang: Sorting.java cuma ada satu — kalau insertionSort diset > 0 untuk Numbers/Strings, maka WeeklySales juga kena efeknya.

Solusi paling simpel untuk tugas ini: pakai Pilihan B — > 0 di insertionSort, this.totalSales - otherPerson.getSales() di compareTo. Keduanya konsisten descending. Run WeeklySales dan Numbers/Strings, semua harusnya descending.

benahi kalimat solusi dong untuk soal nomor 3 yang baru aja kita bahas
02.13

Penjelasan Permasalahan dan Solusi — Soal 3 (Polymorphic Sorting)

Permasalahan pada soal ini adalah menggunakan class Sorting.java untuk mengurutkan berbagai tipe objek secara polimorfik. Terdapat beberapa tantangan: Numbers.java tidak bisa di-compile karena menggunakan tipe primitif int[] yang tidak kompatibel dengan parameter Comparable[] pada method sorting, Strings.java belum ada dan harus dibuat, serta method compareTo di Salesperson.java belum diimplementasikan.

Solusi yang diterapkan adalah mengganti int[] menjadi Integer[] di Numbers.java agar kompatibel dengan Comparable[] — autoboxing Java otomatis mengurus konversi dari int ke Integer. Strings.java dibuat dengan mengadaptasi Numbers.java, mengganti tipe data menjadi String[] dan input menjadi scan.next(). Untuk pengurutan descending, kondisi while di insertionSort diubah dari < 0 menjadi > 0 agar elemen yang lebih besar digeser ke kanan. Pada Salesperson.java, method compareTo diimplementasikan dengan return this.totalSales - otherPerson.getSales() yang dikombinasikan dengan insertionSort > 0 sehingga menghasilkan urutan dari sales terbesar ke terkecil. Ketika sales sama, tie-breaker menggunakan lastName.compareTo() untuk urutan alfabetis.

tie breaker apaan dah
02.15

Tie-breaker = penentu urutan ketika ada nilai yang sama.

Contoh dari soal — ada 4 orang dengan sales sama 3000:

    Smith, Walt
    Jones, Jane
    Jones, James
    Black, Jane

Karena salesnya sama, program tidak bisa urutkan berdasarkan sales. Jadi dipakai nama belakang (lastName) sebagai penentu urutan kedua — itulah tie-breaker-nya.

Kalau mau bahasa yang lebih mudah di jobsheet, ganti kata "tie-breaker" dengan "penentu urutan kedua" saja.

kelau dari soal dan printah soal nomor 3, yang perlu kutunjukkan hasil screenshots apa aja?
02.16

Berdasarkan soal, screenshot yang perlu ditunjukkan:

    Numbers.java — output angka urut descending
    Strings.java — output string urut descending
    WeeklySales.java — output ranking sales descending (Taylor 7300 di atas)

Kalau mau lebih lengkap, tambahkan juga screenshot error saat Numbers.java pertama kali di-compile (sebelum difix) — tapi itu opsional.

di word biar garis drawku bisa lurus gimana ya caranya soalnya aku pake touchpad
02.23

Tahan Shift sambil drag — otomatis garisnya lurus horizontal atau vertikal.

udah kucoba tpi ga lurus
02.23

Coba cara lain — pakai border tabel aja daripada draw line:

Insert → Table → 1x1 → atur border sesuai kebutuhan. Lebih rapi dan pasti lurus.

Atau kalau tetap mau garis: Insert → Shapes → Line → tahan Shift saat drag.

ribet banget
02.24

Ketik aja --- lalu Enter — Word otomatis bikin garis lurus horizontal. Paling simpel.

soalnya aku mau highlight screenshotku biar lebih jelas
02.24

Pakai Insert → Shapes → Rectangle atau oval — pilih shape tanpa fill (No Fill), cuma border warnanya merah atau kuning. Lebih mudah dari garis dan hasilnya lebih jelas buat highlight area screenshot.

ribet ih, mungkin ada shortcut yang kaya shift tadi? kok ga jalan ya di laptopku
02.25

Coba Shift + drag dari kiri ke kanan secara perlahan dan lurus — jangan diagonal sama sekali.

Kalau tetap ga bisa, screenshot-nya edit dulu di Paint (bawaan Windows) — tinggal pakai tool rectangle/highlight di sana, lebih gampang dari Word.

buatlah readme.md untuk hasil tugas ini, mau aku masukkan ke githubku
02.34

Informasi apa yang mau kamu masukkan ke README? Minimal butuh:

    Nama dan NIM kamu
    Nama mata kuliah/kelas

mata kuliah teknik pemrograman
Abdillah Mahfudin
251524094

jelaskan penerapan prinsip prinsip yang telah ku lakukan
02.35
Viewed a file, created a file, read a file

Ini README-nya. Tinggal upload ke root folder repository GitHub kamu. Sudah mencakup deskripsi ketiga soal, konsep OOP yang diterapkan, dan tabel ringkasan prinsip di bagian akhir.
Readme
Document · MD 


Claude is AI and can make mistakes. Please double-check responses.
Readme · MD
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

