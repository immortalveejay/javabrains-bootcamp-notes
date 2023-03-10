// Basic Syntax

import java.util.Scanner;

public class NumberAirthmetic {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("The first no is: "+num1);
        System.out.println("Enter the second number: ");
        int num2=sc.nextInt();
        System.out.println("The second number is : "+num2);

        System.out.println("The sum is : Sum = "+(num1+num2));
        System.out.println("The product is : Product= "+(num1*num2));
        System.out.println("The difference is : Difference= "+(num1-num2));
        System.out.println("The quotient is : Quotient = "+(num1%num2));

    }
}
