import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(
            String[] args) {
        // Primative types
        // byte age = 30;
        // int videos = 234;
        // long viewsCount = 3_123_456_789L;
        // float price = 10.99f;
        // final float PI = 3.14; // constant .. can't be changed
        // char letter = 'A';
        // boolean isLiked = true;

        // Reference types
        Date now = new Date();
        System.out.println(now);

        // string use .equal() for comparison
        String message = "Hello World!";
        System.out.println(message);

        int[] numbers = { 5, 3, 4, 1, 2 };
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

    }

}
