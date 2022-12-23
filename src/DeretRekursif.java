public class DeretRekursif {
    static int deretRekursif(int a) {
        if (a == 0) {
            return (a);
        } else {
            System.out.print(a);
            return (deretRekursif(a - 1));
        }
    }

    static int deretIteratif(int a) {
        int n = 0;
        for (int i = a; i >= 1; i--) {
            System.out.print(i);
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(deretRekursif(5));
        System.out.println(deretIteratif(5));
    }
}
