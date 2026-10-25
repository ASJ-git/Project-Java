import static java.lang.IO.println;

void main(String[] args) {
    // java can infer the variable type when var is used
    var isNew = true;
    var message = "var is not type specific";

    println(isNew); // shoutcut plo + tab
    println(message); // or IO.print(message) without importing
    IO.println(message);

    // new person class
    var boy = new Person("Sampson", 21);
    println(boy);

    var simpsons = new family("simpsons", boy);
    println(simpsons);

    // new switch syntax that can return a value ;
    String result = switch (boy.name) {
        case "Sampson" -> "is a simpson";
        case null, default -> "not a simpson";
    };
    println(result);
}

// Declaration of a person class
record Person(String name, int age) {
};

// class can be nested
record family(String familyName, Person person) {
};