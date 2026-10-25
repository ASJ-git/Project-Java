void main(String[] args) {
    // For loop => same syntax as in C++, no brace is needed for single statements
    for (int i = 0; i < 5; i++)
        System.out.println(i);

    // While loops, same syntax as in C++, no brace is needed for single statements
    int i = 0;
    while (i < 5) {
        System.out.println(i);
        i++;
    }

    // do while loop, same syntax as in C++, no brace is needed for single
    // statements
    do {
        System.out.println(i);
        i++;
    } while (i < 5);

    // for each loop
    String[] fruits = { "Apple", "Mango", "Orange" };

    for (String fruit : fruits) {
        System.out.println(fruit);
    }

}