import java.util.Scanner;

public class studiKasus209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
             // Deklarasi variabel
        String nama, jenis;
        int jumlahDokumen, peringkat, statusPKM;
 
        // Input data yang selalu ditanyakan
        System.out.print("Nama mahasiswa  : ");
        nama = input.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenis = input.nextLine().toUpperCase(); // huruf besar/kecil tidak berpengaruh
 
        // Cabang 1: Perlombaan (BELMAWA, BAKORMA, Mandiri)
        if (jenis.equals("BELMAWA") || jenis.equals("BAKORMA") || jenis.equals("MANDIRI")) {
            System.out.print("Jumlah dokumen  : ");
            jumlahDokumen = input.nextInt();
            System.out.print("Peringkat juara : ");
            peringkat = input.nextInt();
 
            if (peringkat >= 1 && peringkat <= 3) {          // tingkat 2: juara 1/2/3
                if (jumlahDokumen == 4) {                    // tingkat 3: cek dokumen
                    System.out.println("Status : Berhak memperoleh dana penghargaan (Juara " + peringkat + ", dokumen lengkap).");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
            }
    }
}
    }
