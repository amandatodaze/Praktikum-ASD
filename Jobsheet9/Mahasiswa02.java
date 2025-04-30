public class Mahasiswa02 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    public Mahasiswa02() {
    }

    public Mahasiswa02(String nama, String nim, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
