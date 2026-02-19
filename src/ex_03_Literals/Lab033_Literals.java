package ex_03_Literals;

public class Lab033_Literals {
    public static void main(String[] args) {
        int a = 65; // Decimal Base
        System.out.println(a);

        // Binary Literal
        int binaryLiteral = 0b1010; // Binary System
        int binaryLiteral1 = 0B1010;
        // https://www.rapidtables.com/convert/number/binary-to-decimal.html
        System.out.println(binaryLiteral);
        System.out.println(binaryLiteral1);

        int octalLiteral = 0101;
        // https://www.rapidtables.com/convert/number/octal-to-decimal.html
        System.out.println(octalLiteral);

        int hexaDecimalLiteral = 0x1;
        // https://www.rapidtables.com/convert/number/hex-to-decimal.html
        System.out.println(hexaDecimalLiteral);

       /* Literal Type 	Example	Decimal Equivalent
        Integer (int)	0x1A	26
        Long	0x7FFFFFFFL	2,147,483,647
        Byte/Short	(byte) 0xFF	-1 (due to two's complement)
        Floating-Point	0x1.0p1	2.0
        Readable	0xCAFE_BABE	3,405,691,582
      */
    }
}
