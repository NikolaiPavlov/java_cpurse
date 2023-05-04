public class Task2 {
    public static void main(String[] args) {
        /*
        Дан массив двоичных чисел, например [1,1,0,1,1,1],
        вывести максимальное количество подряд идущих 1.
         */
        int[] arr = new int[]{1, 1, 0, 1, 1, 1};
        int val = 1;
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val){
                count++;
            } else {
                if (count > maxCount){
                    maxCount = count;
                }
                count = 0;
            }
        }
        if (count > maxCount){
            maxCount = count;
        }
        System.out.println(maxCount);
    }
}
