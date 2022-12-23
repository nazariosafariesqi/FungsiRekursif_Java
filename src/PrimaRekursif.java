
public class PrimaRekursif {
    static int prima(int a, int b) {
        if (a >= 1) {
            return (a);
        } else if (b >= 1) {
            return (b);
        } else if (a % b == 0) {
            return a;
        }
        return prima(a, b);
    }

    public static void main(String[] args) {
        int n = 5;
        int a = prima(n, n - 1);
        if (a % 2 == 0) {
            System.out.println(n + " Adalah Bilangan Prima");
        } else {
            System.out.println(n + " Bukan Bilangan Prima");
        }
    }
}
