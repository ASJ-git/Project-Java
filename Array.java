import java.util.Arrays;
void main(
        String[] args) {

    int[] numbers = { 5, 3, 4, 1, 2 };
    Arrays.sort(numbers);
    System.out.println(Arrays.toString(numbers));
    System.out.println(numbers.length);

    // Two dimentional arrays 
    int[][] twoD = { { 1, 2, 3 }, { 4, 5, 6 } };
    System.out.println(Arrays.deepToString(twoD));
}
