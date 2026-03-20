package ex_03_Literals;

public class Lab034_LiteralsChar {
    public static void main(String[] args) {
        char A1 = 'A';
        char A2 = '#';
        char A3 = ';';
        // char A4 = '';
        // char A5 = ""; -- String is a bunch of char enclosed in ""
        char A6 = ' ';
        char A7 = '1';
        char A8 = '@';

        // Escape Sequence
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("SruthiAripirala"+"---------------------");
        System.out.println("Sruthi\nAripirala"+"---------------------");
        System.out.println("Sruthi"+new_line+"Aripirala"+"---------------------");
        System.out.println("Sruthi"+tab_line+"Aripirala"+"---------------------");
        System.out.println("Sruthi"+back_space+"Aripirala"+"---------------------");
        System.out.println("Sruthi"+carriage_return+"Aripirala"+"---------------------");

        char A9 = 'A';
        // ASCII value - A --> 65
        char dollar = '$';
        System.out.println(dollar);

        // Unicode Escape Characters
        char A10 = '\u9F80';
        char A11 = '\u2F88';
        System.out.println(A10);
        System.out.println(A11);

    }
}