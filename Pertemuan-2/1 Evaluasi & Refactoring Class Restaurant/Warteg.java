public class Warteg {
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id = 0;

    public Warteg() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }

    public String getNamaMakanan(int index) {
        return nama_makanan[index];
    }

    public double getHargaMakanan(int index) {
        return harga_makanan[index];
    }

    public int getStok(int index) {
        return stok[index];
    }

    public void setStok(int index, int stokBaru) {
        if (stokBaru <= 0) {
            System.out.println("Stok harus positif");
            return;
        }
        this.stok[index] = stokBaru;
    }

    public static byte getId() {
        return id;
    }
    

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        if (stok < 0) {
            System.out.println("Stok tidak boleh negatif. Menu tidak ditambahkan.");
            return;
        }
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = stok;
    }

    public void tampilMenuMakanan() {
        System.out.println("            === MENU WARTEG ===");
        for (int i = 0; i < id; i++) {
            if (!isOutOfStock(i)) {
                System.out.println((i + 1) + ". " + nama_makanan[i] +
                        " [stok: " + stok[i] + "]" +
                        "\tRp. " + harga_makanan[i]);
            }
        }
    }

    public boolean isOutOfStock(int id) {
        return stok[id] == 0;
    }

    public static void nextId() {
        id++;
    }


    public void pesanMenu(int index, int jumlah) {
        if (index < 0 || index >= id) {
            System.out.println("Menu tidak ditemukan.");
            return;
        }
        if (isOutOfStock(index)) {
            System.out.println("Maaf, " + nama_makanan[index] + " sedang habis.");
            return;
        }
        if (jumlah > stok[index]) {
            System.out.println("Stok tidak mencukupi. Stok tersedia: " + stok[index]);
            return;
        }
        stok[index] -= jumlah;
        double total = harga_makanan[index] * jumlah;
        System.out.println("Pesanan berhasil: " + nama_makanan[index] +
                " x" + jumlah + " = Rp. " + total);
    }
}