import java.util.Scanner;

class Laundry {
    public static void main(String[] args) {
        Pelanggan plg = new Pelanggan();
        Transaksi tran = new Transaksi();
        plg.daftar();
        plg.data();
        tran.add();
        tran.print();
    }
}

class Pelanggan {

    String nama;
    String telp;
    String alamat;
    String email;
    String gender;

    Scanner input = new Scanner(System.in);

    public void daftar() {
        try {
            System.out.println("=== Masukkan Data Pelanggan ===");
            System.out.print("Nama pelanggan : ");
            nama = input.nextLine();
            System.out.print("No. telepon : ");
            telp = input.nextLine();
            System.out.print("Alamat : ");
            alamat = input.nextLine();
            System.out.print("Email : ");
            email = input.nextLine();
            System.out.print("Gender : ");
            gender = input.nextLine();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void data() {
        System.out.println("=== Menampilkan Data Pelanggan ===");
        System.out.println("Nama pelanggan : " + nama);
        System.out.println("No. telepon : " + telp);
        System.out.println("Alamat : " + alamat);
        System.out.println("Email : " + email);
        System.out.println("Gender : " + gender);
    }

}

class Transaksi {

    String tanggal;
    String ambil;
    double berat;
    double harga;
    double total;

    Scanner input = new Scanner(System.in);

    public void add() {
        try {
            System.out.println("=== Masukkan Data Transaksi ===");
            System.out.print("Tanggal transaksi : ");
            tanggal = input.nextLine();
            System.out.print("Tanggal ambil : ");
            ambil = input.nextLine();
            System.out.print("Berat laundry (kg) : ");
            berat = input.nextDouble();
            System.out.print("Harga kiloan : ");
            harga = input.nextDouble();
            total = berat * harga;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void print() {
        System.out.println("===== Menampilkan Data Transaksi =====");
        System.out.println("Tanggal transaksi : " + tanggal);
        System.out.println("Tanggal ambil : " + ambil);
        System.out.println("Berat laundry : " + berat + " kg");
        System.out.println("Harga kiloan : " + harga);
        System.out.println("======================================");
        System.out.println("TOTAL : " + total);
    }

}