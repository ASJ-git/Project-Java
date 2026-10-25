import java.text.NumberFormat;

void main(String[] args) {
    // Math fxn is very similar to that of JavaScript.
    double randomNumber = Math.floor(Math.random() * 100);
    String res = "";
    if (randomNumber >= 50) {
        res = "Greater than 50";
    } else {
        res = "Less than 50";
    }
    System.out.println(res);

    // Formating Numbers
    String result = NumberFormat.getCurrencyInstance().format(12345.3498);
    System.out.println(result);

    String percent = NumberFormat.getPercentInstance().format(0.5432);
    System.out.println(percent);

}
