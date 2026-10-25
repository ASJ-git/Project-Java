import java.util.Scanner;

void main(String[] args) {
    // Reading inputs from users;
    Scanner scanner = new Scanner(System.in);
    // System.out.print("Age: ");
    // byte age = scanner.nextByte();
    // System.out.println("You're " + age);

    // get name using nextLine for the whole line or next for the first word.

    System.out.print("Name: ");
    String name = scanner.nextLine().trim();
    System.out.println("You're " + name);

    scanner.close();

}