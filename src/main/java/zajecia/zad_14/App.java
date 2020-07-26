package zajecia.zad_14;

import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        Random random = new Random();
        Integer[] array = new Integer[10];

        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(11);
        }
        System.out.println(Arrays.toString(array));

        ArrayService arrayService = new ArrayService();
        System.out.println(arrayService.getUniqueValues(array));

        System.out.println(arrayService.countValues(array));

        System.out.println(arrayService.getNonUniqueValues(array));

        System.out.println(arrayService.getTheMostRecurrentValues(array, 2));

    }
}
