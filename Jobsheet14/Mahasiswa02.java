public class Mahasiswa02 {

    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa02() {
    }

    public Mahasiswa02(String nm, String name, String kls, double ipk) {
        this.nama = name;
        this.nim = nm;
        this.kelas = kls;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println("NIM: " + this.nim + " " + "Nama: " + this.nama + " " + "Kelas: " + this.kelas + " " + "IPK: " + this.ipk);
    }
    
}