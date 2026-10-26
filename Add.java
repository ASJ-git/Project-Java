import java.util.Scanner;


// This was the first assignment for group 2
void main(String[] args) {
    Scanner input = new Scanner(System.in);

    IO.println("Please input the first number");
    int firstNumber = input.nextInt();

    IO.println("Please enter the second numbeer");
    int secondNumber = input.nextInt();

    int result = firstNumber + secondNumber;

    IO.println("The answer is: " + result);

    input.close();
}