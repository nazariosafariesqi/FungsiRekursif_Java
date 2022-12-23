public class Percobaan1 {
    static int rekursif(int a, int b) {
        if (a == b) {
            System.out.println(b);
            return b;
        } else {
            System.out.print(a + "+");
            return a + rekursif(a + 1, b);
        }
    }

    public static void main(String[] args) {
        int n = 0;
        n = rekursif(1, 5);
        System.out.println("=" + n);
    }
}
