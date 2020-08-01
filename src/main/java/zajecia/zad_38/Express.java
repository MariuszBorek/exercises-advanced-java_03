package zajecia.zad_38;

public class Express {

    int value;

    public Express(int value) {
        this.value = value;
    }

    public synchronized void fillExpress(int value) {
        this.value = value;
        if (this.value > 0) {
            notify();
        }
    }

    public synchronized void makeCoffee() {
        while (true) {
            if (value == 1) {
                try {
                    wait();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            System.out.println("zrobiono kawe");
            value--;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

