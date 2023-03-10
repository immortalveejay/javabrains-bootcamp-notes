// Program to print Person Details

import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Scanner;

public class PersonDetails {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter the person's Name: ");
        String name = keyboard.next();
        System.out.println("Enter the person's age: ");
        int age = keyboard.nextInt();
        System.out.println("Enter the person's Salary: ");
        int salary = keyboard.nextInt();

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);


    }
}
