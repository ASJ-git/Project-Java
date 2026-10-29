import java.util.Scanner;

import static java.lang.IO.print;
import static java.lang.IO.println;

void main(String[] args) {
    Scanner input = new Scanner(System.in);
    println("Enter sales");
    double sales = input.nextDouble();
    println("Enter transportation");
    double transportation = input.nextDouble();
    println("Enter sales on credit to customers");
    double salesOnCredits = input.nextDouble();
    println("Enter money spent on food");
    double moneySpentOnFood = input.nextDouble();

    println("====== Market Balance Sheet ======");
    println("Sales: " + sales);
    println("Transportation: " + transportation);
    println("Sales on credit to customers: " + salesOnCredits);
    println("Money spent on food: " + moneySpentOnFood);

    input.close();

}