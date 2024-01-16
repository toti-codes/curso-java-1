import java.util.Arrays;

public class Main {
    // args: ["true", "Daniel"]
    public static void main(String[] args) {
        // Primitive types
        byte _byte = 127;
        short small = 32767;
        int medium = 2147483647;
        long large = 9223372036854775807L;

        float smallDecimal = 3.14f;
        double bigDecimal = 3.1415926538;

        char character = 'A';

        boolean conditional = Boolean.parseBoolean(args[0]);

        if (conditional)
            System.out.println("Hello world! " + args[1]);
        else
            System.out.println("Good bye world!");
    }
}