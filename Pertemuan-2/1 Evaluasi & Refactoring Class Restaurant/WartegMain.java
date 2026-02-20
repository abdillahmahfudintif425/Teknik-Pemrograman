import java.util.Scanner;

public class WartegMain {
    public static void main(String[] args) {

        Warteg menu = new Warteg();
        
        menu.tambahMenuMakanan("Kopi        ", 4000, 4);
        Warteg.nextId();
        menu.tambahMenuMakanan("Nasi Telur  ", 8000, 20);
        Warteg.nextId();
        menu.tambahMenuMakanan("Nasi Sayur  ", 6000, 30);
        Warteg.nextId();
        menu.tambahMenuMakanan("Es Teh Manis", 4000, 40);
        Warteg.nextId();

        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== SELAMAT DATANG DI WARTEG JAYA ABADI ===");
            menu.tampilMenuMakanan();
            System.out.println("0. Keluar");
            System.out.print("Pilih nomor menu: ");
            int pilihan = sc.nextInt();

            if (pilihan == 0) {
                System.out.println("Terima kasih!");
                running = false;
            } else {
                System.out.print("Jumlah pesanan: ");
                int jumlah = sc.nextInt();
                menu.pesanMenu(pilihan - 1, jumlah);
            }
        }

        sc.close();
    }
}