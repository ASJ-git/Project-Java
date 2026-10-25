void main(String[] args) {
    // comparison operators => same as C++, ==, != ,< , > , <=, >=

    // Logical operators => same as others , && - and , || - or , ! - not

    // If statements => same as JavaScript and C++

    int temp = 32;
    if (temp > 30) {
        System.out.println("It's a hot day");
        System.out.println("Drink water");
    } else if (temp > 20)
        // brace of If statements is optional when only one statement is in it
        System.out.println("Beautiful day");
    else
        System.out.println("Cold day");

    // Ternary operator works;
    String condition = temp >= 30 ? "Hot" : "Normal";
    System.out.println(condition);

    // Switch statement
    String role = "admin";
    switch (role) {
        case "admin":
            System.out.println("You're an admin");
            break;
        case "moderator":
            System.out.println("You're amoderator");
            break;

        default:
            System.out.println("You're a guest");
    }
}