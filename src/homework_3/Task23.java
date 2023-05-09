package homework_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task23 {
    public static void main(String[] args) {
        Task2();
    }
    static void Task2(){
        /*
        2. Задан целочисленный список ArrayList.
        Найти минимальное, максимальное и среднее арифметическое
        из этого списка. Collections.max()
        */
        List<Integer> list = new ArrayList<>();
        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int i : arr){
            list.add(i);
        }
        System.out.println("Max = " + Collections.max(list));
        System.out.println("Min = " + Collections.min(list));
        System.out.println("Avg = " + avg(list));
    }
    static <T extends Number> double avg(List<T> list){
        double sum = 0;
        for (T i : list){
            sum += i.doubleValue();
        }
        return sum / list.size();
    }
}
