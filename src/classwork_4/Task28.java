package classwork_4;

import java.util.*;

public class Task28 {
    public static void main(String[] args) {
        ex2();
    }
    static void ex2(){
        /*
        Реализовать консольное приложение, которое:
        Принимает от пользователя и “запоминает” строки.
        Если введено print, выводит строки так,
        чтобы последняя введенная была первой в списке,
        а первая - последней.
        Если введено revert,
        удаляет предыдущую введенную строку из памяти.
        */
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work){
            System.out.println("Введите команду: ");
            String line = scanner.nextLine();
            switch (line){
                case "print":
                    ListIterator<String> iterator = list.listIterator(list.size());
                    while (iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case "revert":
                    list.removeLast();
                    break;
                case "exit":
                    System.out.println("До скорой встречи!");
                    work = false;
                    break;
                default:
                    list.add(line);
            }
            System.out.println();
        }
    }
}
