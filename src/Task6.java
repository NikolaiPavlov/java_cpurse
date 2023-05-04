/*
1. Вычислить n-ое треугольного число (сумма чисел от 1 до n)
 */

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = iScanner.nextInt();
        iScanner.close();

        int sum;
        sum = n*(n+1)/2;
        System.out.printf("Сумма чисел от 1 до " + n + " равна: %s\n", sum);
    }
}
