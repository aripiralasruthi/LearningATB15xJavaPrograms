package ex_02_VariablesAndDatatypes;

public class Lab026_DefaultValueOfStaticVariable {
        static  int b;
        //= 30;
        public static void main(String[] args) {
            int a = 10;
            a = 20;
            System.out.println(a);

            // int c; --> Local Variable
            // System.out.println(c);
            // JVM will not provide default value for Local Variable.
            // Local variable must be initialized before using.

            System.out.println(b);
            b = 40;
            System.out.println(b);

    }

}
