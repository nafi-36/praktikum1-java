// 1.3 PRAKTIK - RITEL MAKANAN

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Ritel1 {
    public static void main(String[] args) {
        Barang brg = new Barang();
        brg.inputData();
        brg.viewData();
    }
}

class Barang {
    String kodeBarang;
    String namaBarang;
    String produsen;
    int beratBersih;
    int hargaBeli;
    int hargaJual;

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(isr);

    public void inputData() {
        try {
            String temp = "";
            System.out.println("Inputan Data Barang ");
            System.out.print("Kode barang : ");
            kodeBarang = input.readLine();
            System.out.print("Nama barang : ");
            namaBarang = input.readLine();
            System.out.print("Produsen : ");
            produsen = input.readLine();
            System.out.print("Berat Bersih : ");
            temp = input.readLine();
            beratBersih = Integer.parseInt(temp);
            System.out.print("Harga Beli : ");
            temp = input.readLine();
            hargaBeli = Integer.parseInt(temp);
            System.out.print("Harga Jual : ");
            temp = input.readLine();
            hargaJual = Integer.parseInt(temp);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void viewData() {
        System.out.println("Menampilkan detail barang");
        System.out.println("Nama : " + namaBarang);
        System.out.println("Kode : " + kodeBarang);
        System.out.println("Produsen : " + produsen);
        System.out.println("Berat Bersih : " + beratBersih);
        System.out.println("Harga Beli : " + hargaBeli);
        System.out.println("Harga Jual : " + hargaJual);
    }
}
