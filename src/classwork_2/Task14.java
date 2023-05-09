package classwork_2;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task14 {
    public static void main(String[] args) {
        ex3("Test", 20);
    }
    static void ex3(String s, int n){
        /*
        Напишите метод, который составит строку, состоящую из 100
        повторений слова TEST и метод, который запишет эту строку
        в простой текстовый файл, обработайте исключения.
         */
        String s1 = repeatString(s, n);
        saveToFile(s1);
    }

    static void saveToFile(String s) {
        Logger logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);
        logger.addHandler(fileHandler);
        String path = "test.txt";
        try (FileWriter fileWriter = new FileWriter(path, false)) {
            fileWriter.append(s);
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
            logger.log(Level.WARNING, e.getMessage());
        }
        System.out.println("Тест");
        fileHandler.close();
    }

    static String repeatString(String s, int n){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }
}
