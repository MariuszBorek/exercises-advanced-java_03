package zajecia.zad_7;

public class App {
    public static void main(String[] args) {
        BulletMagazine bulletMagazine = new BulletMagazine(7);
        bulletMagazine.loadBullet("1");
        bulletMagazine.loadBullet("2");
        bulletMagazine.loadBullet("3");
        bulletMagazine.loadBullet("4");
        bulletMagazine.loadBullet("5");
        bulletMagazine.loadBullet("6");
        bulletMagazine.loadBullet("7");
        bulletMagazine.loadBullet("8");

        System.out.println(bulletMagazine.isLoaded());

        bulletMagazine.shot();
        System.out.println(bulletMagazine.isLoaded());

    }
}
