import java.lang.*;

public class FizzBuzz {
    private static int number;

    public static void main(String[] args) {
        number = (args.length == 0) ? 42 : Integer.parseInt(args[0]);
        output();
    }

    public static void output() {
        for (int i = 1; i <= number; i++) {
            StringBuilder output = new StringBuilder();
            if (i % 3 == 0) {
                output.append("Fizz ");
            }
            if (i % 5 == 0) {
                output.append("Buzz ");
            }
            if (output.length() == 0) {
                output.append(Integer.toString(i));
            }
            System.out.println(output);
        }
    }
}

