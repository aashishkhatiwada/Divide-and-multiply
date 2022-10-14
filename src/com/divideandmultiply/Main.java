package com.divideandmultiply;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
System.out.println("divide or multiply?");
String choice = scanner.nextLine();
if(choice.equalsIgnoreCase("divide")) divideNumbers();
else if(choice.equalsIgnoreCase("multiply")) multiplyNumbers();
else System.out.println("unknown command!");
    }
    private static void divideNumbers() {
        System.out.println("enter first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("enter second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("the quotient is " + firstNumber / secondNumber);
    }
    private static void multiplyNumbers() {
        System.out.println("enter first number");
        int firstnumber = scanner.nextInt();
        System.out.println("enter second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("the result is " + firstnumber *secondNumber);
    }
}