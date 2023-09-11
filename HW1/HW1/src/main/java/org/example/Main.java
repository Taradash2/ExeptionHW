package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Задача№1");
        try {
            System.out.println("Введите число: ");
            int a = sc.nextInt();
            System.out.println("Введите второе число: ");
            int b = sc.nextInt();
            System.out.println("Результат: " + a / b);
        } catch (InputMismatchException e1){
            System.out.println("Ошибка: некорректный ввод. Вводите целые числа!");
        } catch (ArithmeticException e2){
            System.out.println("Деление на ноль недопустимо");

        }
        sc.nextLine();
        System.out.println();

        System.out.println("Задача№2");
        while (true){
            try {
                System.out.println("Введите ваш возраст");
                String userInput = sc.nextLine();
                int age = Integer.parseInt(userInput);
                if (age >= 0){
                    System.out.println("Ваш возраст: " + age);
                    break;

                }else {
                    System.out.println("Введите положительное число");

                }

            }catch (NumberFormatException ex){
                System.out.println("Некоректный ввод");

            }
        }
        System.out.println();
        sc.close();

        System.out.println("====== Задача №3 ======");
        try {
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
            String line;
            int sum = 0;
            try {
                while ((line = br.readLine()) != null) {
                    try {
                        sum += Integer.parseInt(line);
                        System.out.println("Сумма чисел: " + sum);
                    } catch (NumberFormatException ex) {
                        System.out.println("Некорректное значение числа в файле!");
                    }
                }
            } catch (IOException ex) {
                System.out.println("Ошибка чтения файла!");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден!");
        }
    }
}
