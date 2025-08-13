package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int numbertwo = new Scanner(System.in).nextInt();

        int firstNumber= number;
        int secondNumber= numbertwo;
        double quotient = (double) firstNumber/secondNumber;
        System.out.println("Сумма:" + firstNumber+secondNumber);
        System.out.println("Разность:"+ (firstNumber-secondNumber));
        System.out.println("Произведение:" + firstNumber*secondNumber);
        System.out.println("Частное:" + quotient);
    }
}