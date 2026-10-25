
void main(String[] args) {
    double result = 10 / 3;
    double result2 = 10f / 3f;
    double result3 = (double) 10 / (double) 3;

    // diff results
    System.out.println(result);
    System.out.println(result2);
    System.out.println(result3);

    // increment and decrement works ++, --
    int y = 8;
    y++;
    System.out.println(y);
    // post and pre increment
    int a = 5;
    int b = ++a;
    int c = a++;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    // compound asignment operator works, += *=...
    int x = 2;
    x += 4;
    System.out.println(x);

    // order of operation is PEMDAS

}