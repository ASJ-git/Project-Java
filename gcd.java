void main(String[] a) {
    int[] result = extendedGcd(72, 45);
    IO.println("gcd = " + result[0]);
    IO.println("lcm = " + result[1]);
    IO.println("s = " + result[2]);
    IO.println("t = " + result[3]);
    // Verify: 128*s + 24*t should equal gcd
}

// returns {gcd, lcm, s, t} such that a*s + b*t = gcd(a, b)
static int[] extendedGcd(int a, int b) {
    int oldR = a, r = b;
    int oldS = 1, s = 0; // coefficients for a
    int oldT = 0, t = 1; // coefficients for b

    while (r != 0) {
        int quotient = oldR / r;

        int tempR = r;
        r = oldR - quotient * r;
        oldR = tempR;

        int tempS = s;
        s = oldS - quotient * s;
        oldS = tempS;

        int tempT = t;
        t = oldT - quotient * t;
        oldT = tempT;
    }

    int lcm = (a * b) / oldR;

    return new int[] { oldR, lcm, oldS, oldT };
}
