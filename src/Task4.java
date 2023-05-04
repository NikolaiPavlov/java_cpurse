public class Task4 {
    public static void main(String[] args) {
        /*
        Во фразе "Добро пожаловать на курс по Java"
        переставить слова в обратном порядке.
         */
        String text = "Добро пожаловать на курс по Java";
        String[] temp = text.split(" ");
        String res = "";
        for (int i = temp.length-1; i >= 0; i--) {
            res += temp[i] + " ";
        }
        System.out.println(res);
    }
}
