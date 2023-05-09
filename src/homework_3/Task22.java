package homework_3;

import java.util.ArrayList;
import java.util.List;

public class Task22 {
    public static void main(String[] args) {
        Task1();
    }
    static void Task1(){
        /*
        1. Пусть дан произвольный список целых чисел, удалить из него четные числа
         */
        List<Integer> list = new ArrayList<>();
        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int i : arr){
            list.add(i);
        }
        remove(list);
        System.out.println(list);
    }
    static void remove(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0){
                list.remove(i);
            }
        }
    }
}
