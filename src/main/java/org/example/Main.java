package org.example;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gerasFileCount = 0;

        while (true) {
            System.out.println("Введите путь к файлу (или 'exit' для выхода):");
            String path = scanner.nextLine();


            if ("exit".equalsIgnoreCase(path)) {     //вышли из программы
                System.out.println("Программа завершена.");
                break;
            }

            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();


            if (!fileExists || isDirectory) {   //это условия
                if (!fileExists) {
                    System.out.println("Файл не существует по указанному пути: " + path);
                } else {
                    System.out.println("Указанный путь ведет к папке, а не к файлу: " + path);
                }
                System.out.println(); // пустая строка для читаемости. надо?
                continue;
            }


            gerasFileCount++;
            System.out.println("Путь указан верно");
            System.out.println("Это файл номер " + gerasFileCount);
            System.out.println(); // пустая строка для читаемости. надо?

        }

        scanner.close();
    }
}