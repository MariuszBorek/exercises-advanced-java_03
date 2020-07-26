package zajecia.zad_9_10_11;

public class App {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point2D(1, 1), new Point2D(2, 2));
        System.out.printf("Promień okręgu:  %.2f cm\n", circle.getRadius());
        System.out.printf("Promień okręgu: %.2f cm\n", circle.getParameter());
        System.out.printf("Promień okręgu: %.2f cm\n", circle.getArea());
        System.out.println("Punkty na okręgu: " + circle.getSlicePoints());

        circle.move(new MoveDirection(1, -1));

        System.out.println("Center: " + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ", Point: " + circle.getPoint().getX() + ", " + circle.getPoint().getY());

        System.out.println("-------------------");
        circle.resize(2);
        System.out.println(circle);
        System.out.printf("Promień okręgu:  %.2f cm\n", circle.getRadius());
        System.out.printf("Promień okręgu: %.2f cm\n", circle.getParameter());
        System.out.printf("Promień okręgu: %.2f cm\n", circle.getArea());
        System.out.println("Punkty na okręgu: " + circle.getSlicePoints());
        System.out.println("Center: " + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ", Point: " + circle.getPoint().getX() + ", " + circle.getPoint().getY());
    }
}
