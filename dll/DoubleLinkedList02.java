package dll;

public class DoubleLinkedList02 {

    Node02 head;
    Node02 tail;

    public DoubleLinkedList02() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa02 data) {
        Node02 newNode = new Node02(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa02 data) {
        Node02 newNode = new Node02(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa02 data) {
        Node02 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node02 newNode = new Node02(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        Node02 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        Mahasiswa02 dataTerhapus = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
        dataTerhapus.tampil();
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        Mahasiswa02 dataTerhapus = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
        dataTerhapus.tampil();
    }

    public Node02 search(String nim) {
        Node02 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void add(int index, Mahasiswa02 data) {
        if (index < 0) {
            System.out.println("Indeks tidak valid.");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node02 current = head;
        int count = 0;

        while (current != null && count < index) {
            current = current.next;
            count++;
        }

        if (current == null) {
            addLast(data);
        } else {
            Node02 newNode = new Node02(data);
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
        }
    }

    public void removeAfter(String keyNim) {
        Node02 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Tidak ada node setelah NIM tersebut atau NIM tidak ditemukan.");
            return;
        }

        Mahasiswa02 dataTerhapus = current.next.data;

        if (current.next == tail) {
            tail = current;
            current.next = null;
        } else {
            current.next = current.next.next;
            current.next.prev = current;
        }

        System.out.println("Node setelah NIM " + keyNim + " berhasil dihapus. Data yang dihapus:");
        dataTerhapus.tampil();
    }

    public void remove(int index) {
        if (index < 0 || isEmpty()) {
            System.out.println("Indeks tidak valid atau list kosong.");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        Node02 current = head;
        int count = 0;

        while (current != null && count < index) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Indeks melebihi jumlah elemen.");
            return;
        }

        Mahasiswa02 dataTerhapus = current.data;

        if (current == tail) {
            removeLast();
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        System.out.println("Node pada indeks " + index + " berhasil dihapus. Data yang dihapus:");
        dataTerhapus.tampil();
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("List kosong.");
        } else {
            System.out.println("Data pertama:");
            head.data.tampil();
        }
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("List kosong.");
        } else {
            System.out.println("Data terakhir:");
            tail.data.tampil();
        }
    }

    public void getIndex(int index) {
        if (isEmpty() || index < 0) {
            System.out.println("List kosong atau indeks tidak valid.");
            return;
        }

        Node02 current = head;
        int count = 0;

        while (current != null && count < index) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Indeks melebihi jumlah data.");
        } else {
            System.out.println("Data pada indeks ke-" + index + ":");
            current.data.tampil();
        }
    }

    public int size() {
        int count = 0;
        Node02 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

}
