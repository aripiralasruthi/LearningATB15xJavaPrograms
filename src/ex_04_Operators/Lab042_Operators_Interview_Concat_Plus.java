package ex_04_Operators;

public class Lab042_Operators_Interview_Concat_Plus {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println(a+b); // Arithmetic Operation

        String first_name = "Sruthi", last_name = " Aripirala";
        System.out.println(first_name + last_name); // Concatenation

        System.out.println(first_name + last_name +" "+ a+" " + b);
        System.out.println(first_name + last_name + (a + b));
        System.out.println(a + b + first_name + last_name);
        System.out.println(a + first_name + last_name + b);
        // BODMAS
        // Brackets
        // Order (powers, indices or roots)
        // Division
        // Multiplication
        // Addition
        // Subtraction
        // However multiplication and division have same precedence.
        // When both appear together without brackets,
        // most programming languages evaluates them from left to right.
    }
}
