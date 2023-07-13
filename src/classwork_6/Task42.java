package classwork_6;

import java.util.*;

public class Task42 {
    public static void main(String[] args) {
        ex0();
    }

    static void ex0(){
        /*
        1. Создайте HashSet, заполнитеего следующими числами: {1, 2, 6, 2, 4, 5, 6, 3}.
        Распечатайте содержимое данного множества.
        2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 6, 2, 4, 5, 6, 3}.
        Распечатайте содержимое данного множества.
        3. Создайте TreeSet, заполните его следующими числами: {1, 2, 6, 2, 4, 5, 6, 3}.
        Распечатайте содержимое данного множества.
        */
        Integer[] arr = new Integer[]{3, 2, 6, 1, 2, 4, 5, 3};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(arr));
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }
}
