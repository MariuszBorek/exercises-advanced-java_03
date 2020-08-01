package zajecia.zad_38;

public class App {
    public static void main(String[] args) {

        Express express = new Express(5);

        Thread thread1 = new Thread(new Maker(express));

        thread1.start();

        while(true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            new Thread(new Filler(express)).start();
        }




    }
}
