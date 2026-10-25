import java.util.Scanner;
import java.util.InputMismatchException;

void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = 0;
    while (true) {
        System.out.print("How many students? ");
        try {
            n = scanner.nextInt();
            scanner.nextLine();
            if (n > 0)
                break;
            else
                System.out.println("Number of students must be greater than 0.");
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Please enter a valid whole number.");
        }
    }

    double classTotal = 0;

    for (int i = 1; i <= n; i++) {
        double score1 = 0;
        double score2 = 0;
        double score3 = 0;
        double average = 0;
        char grade = ' ';

        System.out.println("--- Student " + i + " ---");
        String name = "";
        while (true) {
            System.out.print("Enter student name: ");
            name = scanner.nextLine();
            if (!name.isBlank())
                break;
            else
                System.out.println("Name cannot be empty.");
        }
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

        while (true) {
            System.out.print("Enter score 1: ");
            try {
                score1 = scanner.nextDouble();
                scanner.nextLine(); // flush newline after successful read
                if (score1 >= 0 && score1 <= 100)
                    break;
                else
                    System.out.println("Score should be from 0 to 100.");
            } catch (InputMismatchException e) {
                scanner.nextLine(); // clear the bad token (e.g. "abc")
                System.out.println("Please enter a valid number.");
            }
        }

        while (true) {
            System.out.print("Enter score 2: ");
            try {
                score2 = scanner.nextDouble();
                scanner.nextLine();
                if (score2 >= 0 && score2 <= 100)
                    break;
                else
                    System.out.println("Score should be from 0 to 100.");
            } catch (InputMismatchException e) {
                scanner.nextLine(); 
                System.out.println("Please enter a valid number.");
            }
        }

        while (true) {
            System.out.print("Enter score 3: ");
            try {
                score3 = scanner.nextDouble();
                scanner.nextLine(); 
                if (score3 >= 0 && score3 <= 100)
                    break;
                else
                    System.out.println("Score should be from 0 to 100.");
            } catch (InputMismatchException e) {
                scanner.nextLine(); 
                System.out.println("Please enter a valid number.");
            }
        }

        average = (score1 + score2 + score3) / 3;

        if (average >= 80)
            grade = 'A';
        else if (average >= 70)
            grade = 'B';
        else if (average >= 60)
            grade = 'C';
        else if (average >= 50)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("===============");
        System.out.println("Student: " + name);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Grade: " + grade);
        System.out.println("===============");

        classTotal += average;
    }
    double classAverage = classTotal / n;
    System.out.println("===============");
    System.out.printf("Class Average: %.2f%n", classAverage);

    scanner.close();

}
