
public class StackSurat02 {

    Surat02[] stack;
    int top;
    int size;

    public StackSurat02(int size) {
        this.size = size;
        stack = new Surat02[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat02 surat) {
        if (!isFull()) {
            stack[++top] = surat;
            System.out.println("Surat berhasil ditambahkan!");
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat baru.");
        }
    }

    public Surat02 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat02 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat terakhir.");
            return null;
        }
    }

    public void cariSurat02(String nama) {
        boolean ditemukan = false;
        for (Surat02 surat : stack) {
            if (surat != null && surat.namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.print("Surat ditemukan: \n");
                surat.tampilkan();
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }

    }
}
