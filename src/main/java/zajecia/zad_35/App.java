package zajecia.zad_35;

public class App {
    public static void main(String[] args) {
        System.out.println("Jestem w wątku: " + Thread.currentThread().getName());
        Thread myRunnable = new Thread(new MyRunnable(), "wątek 1");
        myRunnable.start();

        new Thread(
                () -> System.out.println(Thread.currentThread().getName())
                , "wątek 2").start();

    }
}
