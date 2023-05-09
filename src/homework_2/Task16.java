package homework_2;/*
2. *Получить исходную json строку из файла, используя FileReader или Scanner
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        System.out.println(readFile("test.txt"));
    }

    public static String readFile(String fileName) {
        File file = new File(fileName);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String res = "";
        while (scanner.hasNext()) {
            res += scanner.nextLine() + "\n";
        }
        return res;
    }
}
