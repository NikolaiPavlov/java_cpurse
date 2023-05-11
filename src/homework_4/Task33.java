package homework_4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Task33 {
    public static void main(String[] args) {
        Task3();
    }
    static void Task3(){
        /*
        Найдите сумму всех элементов LinkedList,
        сохраняя все элементы в списке.
        Используйте итератор
         */
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(2);
        list.add(8);
        list.add(1);
        System.out.println("Список элементов: " + list);
        System.out.println("сумма элементов: " + sum(list));
        System.out.println("Список элементов: " + list);
    }
    public static <T extends Number> double sum(List<T> list) {
        Iterator<T> it = list.iterator();
        double res = 0;
        while (it.hasNext())
            res += it.next().doubleValue();
        return res;
    }
}
