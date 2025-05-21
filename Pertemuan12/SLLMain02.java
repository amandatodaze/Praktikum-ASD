
import java.util.Scanner;

public class SLLMain02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList02 sll = new SingleLinkedList02();

        Mahasiswa02 mhs1 = new Mahasiswa02("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa02 mhs2 = new Mahasiswa02("23212201", "Bimon", "2B", 3.8);
        Mahasiswa02 mhs3 = new Mahasiswa02("22212206", "Cintia", "3C", 3.5);
        Mahasiswa02 mhs4 = new Mahasiswa02("21212203", "Dirga", "4D", 3.6);

        sll.addFirst(mhs4);
        sll.addLast(mhs1);
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
        
        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa di Awal");
            System.out.println("2. Tambah Mahasiswa di Akhir");
            System.out.println("3. Tambah Mahasiswa pada indeks tertentu");
            System.out.println("4. Tambah Mahasiswa setelah Nama Tententu");
            System.out.println("5. Tampilkan daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    Mahasiswa02 mhsAwal = inputData(sc);
                    sll.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa02 mhsAkhir = inputData(sc);
                    sll.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan indeks posisi: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    Mahasiswa02 mhsIndex = inputData(sc);
                    sll.insertAt(index, mhsIndex);
                    break;
                case 4:
                    inputData(sc);
                    System.out.print("Masukkan nama setelah siapa data ditambahkan: ");
                    String key = sc.nextLine();
                    Mahasiswa02 mhsSetelah = inputData(sc);
                    sll.insertAfter(key, mhsSetelah);
                    break;
                case 5:
                    sll.print();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilih != 0);
    }

    public static Mahasiswa02 inputData(Scanner sc) {
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("IPK: ");
        double ipk = sc.nextDouble();
        sc.nextLine();

        return new Mahasiswa02(nim, nama, kelas, ipk);
    }
}
