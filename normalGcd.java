import java.util.Scanner;
import static java.lang.IO.println;

public class normalGcd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        println("Enter the two numbers");
        int a = input.nextInt();
        int b = input.nextInt();

        int gcdResult = gcd(a, b);
        int lcmResult = lcm(a, b);
        println("The gcd of " + a + " and " + b + " is: " + gcdResult);
        println("The lcm of " + a + " and " + b + " is: " + lcmResult);

        input.close();
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

}
