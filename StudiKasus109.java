import java.util.Scanner;

public  class StudiKasus109 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPercup = 18000;
        int jumlahCup, uangBayar, totHarga, diskon, totalBayar, kembalian, kurang;
        System.out.print("Masukkan jumlah cup:  ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar: ");
        uangBayar = sc.nextInt();

        totHarga = jumlahCup * hargaPercup;
        diskon = 0;

        if (totHarga >= 100000) {
            diskon = totHarga * 10 / 100;
        }
        totalBayar = totHarga - diskon;

        System.out.println("total harga     :Rp"+totHarga);
        System.out.println("diskon      :Rp"+diskon);
        System.out.println("total bayar     :Rp"+totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("kembalian   :Rp"+kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("kurang      :Rp"+kurang);
        }
    }
}