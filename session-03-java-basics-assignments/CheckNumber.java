// Program to check if a number is positive , negative or zero

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No: ");
        int no = sc.nextInt();
        if(no>0){
            System.out.println("No is positive.");
        }else if(no<0){
            System.out.println("no is negative");
        }else{
            System.out.println("No is zero");
        }
    }
}
