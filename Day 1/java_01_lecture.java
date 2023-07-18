import java.util.Scanner;

public class java_01_lecture {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello\n");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        // Remember to close the scanner when you're done
        sc.close();
    }
}
