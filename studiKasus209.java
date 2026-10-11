import java.util.Scanner;

public class StudiKasus209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenis;
        int jumlahDokumen, peringkat, statusPKM;

        System.out.print("Nama Mahasiswa: ");
        nama = sc.nextLine();
        System.out.print("jenis kegiatan (BERLMAWA, BAKORMA, Mandiri, PKM, atau lainya: ");
        jenis = sc.nextLine().toUpperCase();

        if (jenis.equals("BELMAWA") || jenis.equals("BAKORMA") || jenis.equals("Mandiri")) {
            System.out.print("Jumlah dokumen: ");
            jumlahDokumen = sc.nextInt();
            System.out.print("Peringkat juara: ");
            peringkat = sc.nextInt();

            if (peringkat >= 1 && peringkat <=3) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan (Juara"+ peringkat +", dokumen lengkap). ");
                } else {
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak dapat diberikan.");
                }
            } else {
                System.out.println("Status: tidak memperoleh dana penghargaan (hanya untuk juara 1/2/3). ");
            }
        } else if (jenis.equals("PKM")) {
            System.out.print("Jumlah dokuman: ");
            jumlahDokumen = sc.nextInt();
            System.out.print("Status pendaan PKM ( 1 = lolos, 0 - tidak lolos): ");
            statusPKM = sc.nextInt();

            if (statusPKM == 1) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status: berhak memperoleh dana penghargaan (PKM lolos pendanaan). ");
                } else {
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak dapat diberikan.");
                }
            } else {
                System.out.println("Status: tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan). ");
            }
        } else if (jenis.equals("LAINNYA")) {
            System.out.println("Status: tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan). ");
        } else {
            System.out.println("Jenis kegiatan tidak valid. ");
        }
    }
}
