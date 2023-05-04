/*
3. Вывести все простые числа от 1 до 1000
(числа, которые делятся только на 1 и на себя без остатка)
 */

public class Task8 {
    public static void main(String[] args) {
        boolean flag = true;
        for (int number = 2; number <= 1000; number++) {
            for (int divider = 2; divider < number; divider++) {
                if (number % divider == 0){
                    flag = false;
                    break;
                }
            }
            if (flag == true)
                System.out.print(number + " ");
            else flag = true;
        }
    }
}
