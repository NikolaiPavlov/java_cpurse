package homework_3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task24 {
    public static void main(String[] args) {
        Task3();
    }
    static void Task3(){
        /*
        Заполнить список названиями планет Солнечной системы
        в произвольном порядке с повторениями.
        Вывести название каждой планеты и количество его
        повторений в списке.
         */
        List<String> planets = List.of(
                "Меркурий",
                "Венера",
                "Земля",
                "Марс",
                "Юпитер",
                "Сатурн",
                "Уран",
                "Нептүн",
                "Плутон",
                "Марс",
                "Юпитер",
                "Земля",
                "Меркурий",
                "Меркурий");
        counterPlanet(planets);
    }
    static void counterPlanet(List<String> list){
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            String planet = list.get(i);
            Integer count = map.get(planet);
            count = (count != null) ? count + 1 : 1;
            map.put(planet, count);
        }
        System.out.println(map);
    }
}
