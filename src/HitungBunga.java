import java.util.Scanner;

public class HitungBunga {
    static double hitungBunga(double saldo, int tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * hitungBunga(saldo, tahun - 1));
        }
    }

    public static void main(String[] args) {
        try (Scanner Nazario = new Scanner(System.in)) {
            System.out.println("Jumlah Saldo Awal : ");
            double saldoAwal = Nazario.nextInt();
            System.out.println("Lamanya menabung (Tahun) : ");
            int tahun = Nazario.nextInt();

            System.out.print("Jumlah uang setelah " + tahun + " tahun : ");
            System.out.println(hitungBunga(saldoAwal, tahun));
        }
    }
}
