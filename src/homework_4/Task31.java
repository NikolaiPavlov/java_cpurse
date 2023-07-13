package homework_4;

import java.util.LinkedList;

public class Task31 {
    public static void main(String[] args) {
        Task1();
    }
    static void Task1(){
        /*
        Пусть дан LinkedList с несколькими элементами.
        Реализуйте метод, который вернет “перевернутый” список.
        Постараться не обращаться к листу по индексам.
         */
        LinkedList<Integer> list = new LinkedList<Integer>();
        int a[] = { 5, 6, 10, 11, 35, 1, 99 };
        for (int i : a)
            list.add(i);
        System.out.println("Исходная коллекция: " + list);
        System.out.println("Перевернутая коллекция: " + reverse(list));
    }
    static <T> LinkedList<T> reverse(LinkedList<T> list) {
        LinkedList<T> newlist = new LinkedList<>();
        for (T t : list)
            newlist.addFirst(t);
        return newlist;
    }
}