package sesja_samodzielna.zad_2;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("podaj wielkość tablicy");
        int n = in.nextInt();
        Integer[] array = new Integer[n];
        System.out.println("podaj wartości");
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        int newLength = n;
        boolean isTrue = true;
        while(isTrue){
            isTrue = false;
            for (int i = 0; i < newLength - 1; i++) {
                int temp = 0;
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isTrue = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
