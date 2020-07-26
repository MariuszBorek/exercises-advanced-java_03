package zajecia.zad_7;

import java.util.LinkedList;
import java.util.Queue;

public class BulletMagazine {

    private Queue<String> magazine;
    private int sizeMagazine;

    public BulletMagazine(int sizeMagazine) {
        magazine = new LinkedList<>();
        this.sizeMagazine = sizeMagazine;
    }

    public void loadBullet(String bullet) {
        if(magazine.size() < sizeMagazine) {
            magazine.offer(bullet);
        } else {
            System.out.println("magazine is full");
        }
    }

    public boolean isLoaded() {
        if(magazine.isEmpty()) {
            return false;
        } else {
            System.out.println("number of bullets: " + magazine.size());
            return true;
        }
    }

    public void shot() {
        System.out.println("BANG! " + magazine.poll());
    }
}
