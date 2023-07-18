public class java_03_lecture {
    public static void main(String[] args) {
        // Primitive Data Types
        int age = 25;
        double height = 1.75;
        char grade = 'A';
        boolean isStudent = true;

        // Reference Data Types
        String name = "John Doe";
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Printing the values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        System.out.println("Grade: " + grade);
        System.out.println("Is student: " + isStudent);

        System.out.print("Numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
