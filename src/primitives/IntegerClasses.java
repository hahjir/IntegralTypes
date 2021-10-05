package primitives;

public class IntegerClasses {
    public static void main(String[] args) {
        assignBinary();
    }

    public static void assignBinary(){
        // integral types
        // byte holds 8 bits

        byte byteOne = 0b0101_1111;
        System.out.println(byteOne);

        short shortOne = 0b011_0000_1111_1010;
        System.out.println(shortOne);

        // 32 bits in an int
        int intOne = 0b0101;
        System.out.println(intOne);

        long longOne = 0b1000_000_000_000L;
        System.out.println(longOne);

        System.out.println("Num buts in Long: " + Long.SIZE);
        System.out.println("Min " + Long.MIN_VALUE);
        System.out.println("Max " + Long.MAX_VALUE);
    }


    public static void assignHex(){



    }
}
