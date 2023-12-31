import java.util.*;

public class Main {

    final static String salutation = "Hello! ";

    public static void main(String[] args) {
        GreetingService greetingService1 = message -> System.out.println(salutation + message);
        greetingService1.sayMessage("Mahesh");

        /*
        List<String> names1 = new ArrayList<String>();
        names1.add("Mahesh ");
        names1.add("Suresh ");
        names1.add("Ramesh ");
        names1.add("Naresh ");
        names1.add("Kalpesh ");

        List<String> names2 = new ArrayList<String>();
        names2.add("Mahesh ");
        names2.add("Suresh ");
        names2.add("Ramesh ");
        names2.add("Naresh ");
        names2.add("Kalpesh ");

        Main main = new Main();
        System.out.println("Sort using Java 7 syntax: ");
        main.sortUsingJava7(names1);
        System.out.println(names1);

        System.out.println("Sort using Java 8 syntax: ");
        main.sortUsingJava8(names2);
        System.out.println(names2);

        Main main = new Main();

        // with type declaration
        MathOperation addition = (int a, int b) -> a + b;

        // without type declaration
        MathOperation subtraction = (a, b) -> a - b;

        // with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        // without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + main.operate(10, 5, addition));
        System.out.println("10 - 5 = " + main.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + main.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + main.operate(10, 5, division));

        // without parenthesis
        GreetingService greetingService1 = message -> System.out.println("Hello " + message);
        // with parenthesis
        GreetingService greetingService2 = (message) -> System.out.println("Hello " + message);

        greetingService1.sayMessage("Mahesh");
        greetingService2.sayMessage("Suresh");
         */
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    // sort using Java 7
    private void sortUsingJava7(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    private void sortUsingJava8(List<String> names) {
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
    }
}