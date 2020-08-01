package zajecia.zad_34;

public class MyThread extends Thread {

    MyThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println("Jestem w wątku: " + Thread.currentThread().getName());
    }
}
