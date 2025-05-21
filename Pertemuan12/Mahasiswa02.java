public class Mahasiswa02 {

    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa02() {
    }

    public Mahasiswa02(String nim, String name, String kls, double ip) {
        this.nim = nim;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }

    void tampilInformasi() {
        System.out.println(nama + "\t\t" + nim + "\t\t" + kelas + "\t\t" + ipk);
    }
}