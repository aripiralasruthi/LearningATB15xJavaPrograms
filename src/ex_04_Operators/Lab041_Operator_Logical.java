package ex_04_Operators;

public class Lab041_Operator_Logical {
    public static void main(String[] args) {
        // AND &&
        // OR ||
        // NOT !
        boolean a = true;
        System.out.println(a);
        System.out.println(!a);
        System.out.println(!!a);

        boolean b = true || false;
        System.out.println(b);

        boolean c = false && true;
        System.out.println(c);
    }
}
