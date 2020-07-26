package sesja_samodzielna.zad_1;

public class App {
    public static void main(String[] args) {
        int number = 543;

        String strNumber = Integer.toString(number);
        StringBuilder reversedNumber = new StringBuilder();
        int i = strNumber.length();
        while(i > 0) {
            reversedNumber.append(strNumber.charAt(--i));
        }
        System.out.println(reversedNumber);

    }
}
