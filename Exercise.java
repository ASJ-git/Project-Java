import java.util.Scanner;

// FizzBuzz Exercise
  void main(String[] args) {
    // Create scanner to read input
    Scanner scanner = new Scanner(System.in);

    // ask user for number
    System.out.print("Number: ");

    // read number and store it into num variable
    int num = scanner.nextInt();

    // main logic
    if (num % 3 == 0 && num % 5 == 0)
        System.out.println("FizzBuss");
    else if (num % 5 == 0)
        System.out.println("Fizz");
    else if (num % 3 == 0)
        System.out.println("Buzz");
    else
        System.out.println(num);

    // close scanner
    scanner.close();

}