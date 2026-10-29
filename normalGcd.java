public class normalGcd {
    public static void main(String[] args) {
       int result = gcd(4, 6);
       IO.println(result);
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
