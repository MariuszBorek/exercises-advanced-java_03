package zajecia.zad_38;

import java.util.Random;

public class Filler implements Runnable {

    Express express;

    public Filler(Express express) {
        this.express = express;
    }

    @Override
    public void run() {
        express.fillExpress(new Random().nextInt(5) + 1);
        System.out.println("----");
    }
}
