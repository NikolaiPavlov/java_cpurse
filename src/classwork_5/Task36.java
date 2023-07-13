package classwork_5;

import java.util.*;

public class Task36 {
    public static void main(String[] args) {
        System.out.println(ex2("a+(d+3)"));
    }

    static boolean ex2(String line){
        /*
        Написать программу, определяющую правильность расстановки скобок в выражении.
        Пример 1: a+(d*3) - истина
        Пример 2: [a+(1*3) - ложь
        Пример 3: [6+(3*3)] - истина
        Пример 4: {a}[+]{(d*3)} - истина
        Пример 5: <{a}+{(d*3)}> - истина
        Пример 6: {a+]}{(d*3)} - ложь
        */
        Stack<Character> stack = new Stack<>();
        char[] c1 = line.toCharArray();
        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        map.put('<','>');

        for (char c : c1) {
            if (map.containsKey(c)) {
                stack.push(c);
            }
            if (map.containsValue(c)) {
                if (stack.isEmpty() || map.get(stack.pop()) != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
