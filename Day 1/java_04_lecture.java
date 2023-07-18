public class java_04_lecture {
    public static void main(String[] args) {
        // Type Conversion (Implicit)
        int num1 = 10;
        double num2 = num1; // Implicit conversion from int to double

        System.out.println("After type conversion (implicit):");
        System.out.println("num1 (int): " + num1);
        System.out.println("num2 (double): " + num2);

        // Type Conversion (Explicit)
        double num3 = 20.5;
        int num4 = (int) num3; // Explicit conversion from double to int

        System.out.println("\nAfter type conversion (explicit):");
        System.out.println("num3 (double): " + num3);
        System.out.println("num4 (int): " + num4);

        // Type Casting (Implicit)
        int num5 = 5;
        long num6 = num5; // Implicit casting from int to long

        System.out.println("\nAfter type casting (implicit):");
        System.out.println("num5 (int): " + num5);
        System.out.println("num6 (long): " + num6);

        // Type Casting (Explicit)
        long num7 = 100;
        int num8 = (int) num7; // Explicit casting from long to int

        System.out.println("\nAfter type casting (explicit):");
        System.out.println("num7 (long): " + num7);
        System.out.println("num8 (int): " + num8);
    }
}
