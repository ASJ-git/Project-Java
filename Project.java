import java.text.NumberFormat;
import java.util.Scanner;

/*
Be proud of yourself.
You complete this project before continuing the video for the suggested solution.
After watching the solution, you declared the two byte constants at the start of the program.
Then some input validation.
*/

// MORTGAGE CALCULATOR
void main(String[] args) {
    // declare constants to prevent hard coding numbers in the program
    final byte MONTH_IN_YEAR = 12;
    final byte PERCENT = 100;

    // declare variaables used in the calculation
    int principal = 0;
    double rate = 0.0;
    byte years = 0;

    // Create scanner to read input
    Scanner scanner = new Scanner(System.in);

    // read principal and store it into principal variable
    while (true) {
        System.out.print("Principal ($1K - $1M): ");
        principal = scanner.nextInt();
        if (principal >= 1_000 && principal <= 1_000_000)
            break;
        System.out.println("Enter a number between 1,000 and 1,000,000.");
    }

    // read rate and store it into rate variable
    while (true) {
        System.out.print("Annual Interest Rate: ");
        rate = scanner.nextDouble();
        if (rate > 0 && rate <= 30)
            break;
        System.out.println("Enter a value greater than 0 and less than or equal to 30.");
    }

    // read years and store it into years variable
    while (true) {
        System.out.print("Period (Years): ");
        years = scanner.nextByte();
        if (years >= 1 && years <= 30)
            break;
        System.out.println("Enter a value between 1 and 30.");
    }

    // main logic
    int numberOfPayments = years * MONTH_IN_YEAR;
    double monthlyRate = rate / PERCENT / MONTH_IN_YEAR;
    double growRate = Math.pow((1 + monthlyRate), numberOfPayments);
    double monthlyPayment = principal * (monthlyRate * (growRate) / (growRate - 1));

    // formating the mortgage as a currency
    String mortgage = NumberFormat.getCurrencyInstance().format(monthlyPayment);
    System.out.println(mortgage);

    // close scanner
    scanner.close();
}