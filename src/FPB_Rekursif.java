
public class FPB_Rekursif {
    static int FPB(int a, int b) {
        if (b == 0) {
            return (a);
        } else {
            return FPB(b, a % b);
        }
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        int n = FPB(a, b);
        System.out.println("FPBnya dari " + a + " dan " + b + " adalah : " + n);
    }
}
