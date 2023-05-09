package classwork_3;

public class Task18 {
    public static void main(String[] args) {
        ex0();
    }
    static void ex0(){
        //Даны следующие строки, сравнить их с помощью == и метода equals() класса Object
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1.equals(s2));
    }
}
