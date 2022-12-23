
public class Percobaan2 {
    static int belum(int a) {
        if (a < 4) {
            return (1);
        } else {
            return belum(a - 1) + belum(a - 2);
        }
    }

    static int produktif(int a) {
        if (a < 3) {
            return (0);
        } else if (a == 3) {
            return (1);
        } else {
            return produktif(a - 1) + produktif(a - 2);
        }
    }

    static int jumlah(int a) {
        if (a <= 2) {
            return (1);
        } else {
            return jumlah(a - 1) + jumlah(a - 2);
        }
    }

    public static void main(String[] args) {
        int bulan = 12;
        for (int i = 0; i <= bulan; i++) {
            int a = produktif(i);
            int b = belum(i);
            System.out.println(i + b + a + jumlah(i));
        }
    }
}
