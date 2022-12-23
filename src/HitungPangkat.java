import java.util.Scanner;

public class HitungPangkat {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }

    public static void main(String[] args) {
        try (Scanner Nazario = new Scanner(System.in)) {
            System.out.println("Bilangan yang dihitung : ");
            int bilangan = Nazario.nextInt();
            System.out.println("Pangkat : ");
            int pangkat = Nazario.nextInt();
            System.out.println(hitungPangkat(bilangan, pangkat));
        }
    }
}
