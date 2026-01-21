package ex_02_VariablesAndDatatypes;

public class Lab025_ConstantAKAFinal_Variable {
    // int b = 30;
    //  when a variable is used inside a static function below error message
    // java: non-static variable b cannot be referenced from a static context
    static  int b;
            //= 30;
    // int c = 50;
    // System.out.println(c);
    public static void main(String[] args) {
        int a = 10;
        a = 20;
        System.out.println(a);
        System.out.println(b);
        // JVM will provide default value for static Variables according to their datatype.
        b = 40;
        System.out.println(b);

        final float PI = 3.14f;
        // Run Time Error Message
        // java: cannot assign a value to final variable PI
        // PI = 5.67f;
        System.out.println(PI);
    }
}
