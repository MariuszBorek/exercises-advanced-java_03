package zajecia.zad_38;

public class Maker implements Runnable {

    Express express;

    public Maker(Express express) {
        this.express = express;
    }

    @Override
    public void run() {
        express.makeCoffee();
    }
}
