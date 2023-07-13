package classwork_5;

public class Task34 {
    public static void main(String[] args) {
        ex0();
    }

    static void ex0(){
         /*
        Создать структуру для хранения номеров паспортов и фамилий сотрудников организации.
        123456 Иванов
        321456 Васильев
        234561 Петрова
        234432 Иванов
        654321 Петрова
        345678 Иванов
        Вывести данные по сотрудникам с фамилией Иванов.
         */
        Passports passports = new Passports();
        passports.add("123456", "Иванов");
        passports.add("321456", "Васильева");
        passports.add("234561", "Петрова");
        passports.add("234432", "Иванов");
        passports.add("654321", "Петрова");
        passports.add("345678", "Иванов");

        System.out.println(passports.getByLastName("Иванов"));
        //System.out.println(passports.getAllList2());
    }
}
