package ex_02_VariablesAndDatatypes;

public class Lab024_PrintFunctions {
    public static void main(String[] args) {
        System.out.print("This places the cursor in same line");
        System.out.println("This moves the cursor to next line");

        String name = "Alice";
        int age = 25;
        double price = 123.4567;
        System.out.printf("This gives us a formatted output %s",name);

        // Basic formatting
        System.out.printf("%nName: %s %nAge: %d%n", name, age);

        // Formatting floating-point numbers to two decimal places
        System.out.printf("Price: %.2f%n", price);

        // Formatting with width and left-alignment
        System.out.printf("|%-10s|%n", "Item"); // Left-align string in 10 spaces
        System.out.printf("|%10.2f|%n", price); // Right-align float with 2 decimal places in 10 spaces
        byte b = 10;
        char c= 70;
        System.out.println("This is a byte value --> "+b);
        System.out.print("This is a byte value --> "+b);
        System.out.printf("This is a byte value --> %d         %c",b,c);
        /*
        %d -- int, short, byte, long
        %c -- char
        %f -- float, double
        %b -- boolean
        %s -- string
         */

    }
}
