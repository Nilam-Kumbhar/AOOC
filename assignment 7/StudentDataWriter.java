import java.io.*;
import java.util.Scanner;

public class StudentDataWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter weight (in kg): ");
        float weight = scanner.nextFloat();

        System.out.print("Enter height (in cm): ");
        float height = scanner.nextFloat();
        scanner.nextLine(); // consume leftover newline

        System.out.print("Enter city: ");
        String city = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();

        try {
            FileOutputStream fos = new FileOutputStream("student_data.dat");
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeUTF(name);
            dos.writeInt(age);
            dos.writeFloat(weight);
            dos.writeFloat(height);
            dos.writeUTF(city);
            dos.writeUTF(phone);

           
            System.out.println("\nStudent information saved successfully in student_data.dat");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

    }
}
