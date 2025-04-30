import java.util.Scanner;

public class SuratDemo02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat02 stackSurat = new StackSurat02(10);
        int pilih;

        do {
            System.out.println("\n===== MENU SURAT IZIN =====");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat berdasarkan Nama");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat     : ");
                    String id = scan.nextLine();
                    System.out.print("Nama         : ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas        : ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = scan.nextLine().charAt(0);
                    System.out.print("Durasi (hr)  : ");
                    int durasi = scan.nextInt();
                    scan.nextLine();
                    Surat02 suratBaru = new Surat02(id, nama, kelas, jenis, durasi);
                    stackSurat.push(suratBaru);
                    break;
                case 2:
                    Surat02 suratDiproses = stackSurat.pop();
                    if (suratDiproses != null) {
                        System.out.println("Memproses surat berikut:");
                        suratDiproses.tampilkan();
                    }
                    break;
                case 3:
                    Surat02 suratTerakhir = stackSurat.peek();
                    if (suratTerakhir != null) {
                        System.out.println("Surat terakhir:");
                        suratTerakhir.tampilkan();
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cariNama = scan.nextLine();
                    stackSurat.cariSurat02(cariNama);
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);

        scan.close();
    }
}
