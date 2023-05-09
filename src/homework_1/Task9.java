package homework_1;/*
4. Реализовать простой калькулятор
(введите первое число, введите второе число,
введите требуемую операцию, ответ)
 */

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        double res = 0;

        System.out.print("Введите первое число: ");
        double number1 = iScanner.nextDouble();

        System.out.print("\nВведите операцию (+, -, *, /): ");
        char operation = iScanner.next().charAt(0);

        System.out.print("\nВведите второе число: ");
        double number2 = iScanner.nextDouble();

        iScanner.close();

        switch (operation) {
            case '+':
                res = number1 + number2;
                break;
            case '-':
                res = number1 - number2;
                break;
            case '*':
                res = number1 * number2;
                break;
            case '/':
                if (number2 == 0)
                    System.out.println("На ноль делить нельзя!");
                else
                    res = number1 / number2;
                break;
            default:
                System.out.printf("\nПожалуйста, повторите ввод операции\n");
                return;
        }
        System.out.printf("\nРезультат : %s\n", res);
    }
}
