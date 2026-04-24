public class StackSurat03 {
    Surat03[] stack;
    int size;
    int top;

    StackSurat03(int size) {
        this.size = size;
        stack = new Surat03[size];
        top = -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(Surat03 s) {
        if (!isFull()) {
            stack[++top] = s;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    Surat03 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Tidak ada surat!");
            return null;
        }
    }

    Surat03 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    void cari(String nama) {
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
            stack[i].tampil();
            ditemukan = true;
        }
    }
        if (!ditemukan) {
            System.out.println("Surat tidak ditemukan");
        }
    }
}

