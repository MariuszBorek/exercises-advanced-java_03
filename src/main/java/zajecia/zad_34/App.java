package zajecia.zad_34;

public class App {
    public static void main(String[] args) {
        System.out.println("Jestem w wątku: " + Thread.currentThread().getName());

        MyThread myThread = new MyThread("mój wątek");
        myThread.start();
    }
}
