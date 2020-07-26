package zajecia.zad_9_10_11;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;

@Data
@AllArgsConstructor
public class Circle implements Movable, Resizable {

    private Point2D center;
    private Point2D point;

    public double getRadius() {
        return sqrt(pow(center.getX() - point.getX(), 2) + pow(center.getY() - point.getY(), 2));
    }

    public double getParameter() {
        return 2 * PI * getRadius();
    }

    public double getArea() {
        return PI * pow(getRadius(), 2);
    }

    public List<Point2D> getSlicePoints() {
        List<Point2D> slicesPoints = new ArrayList<>();
        slicesPoints.add(new Point2D(point.getX(), -point.getY()));
        slicesPoints.add(new Point2D(-point.getX(), point.getY()));
        slicesPoints.add(new Point2D(-point.getX(), -point.getY()));
        return slicesPoints;
    }

    @Override
    public void move(MoveDirection moveDirection) {
        this.center.move(moveDirection);
        this.point.move(moveDirection);
    }

    @Override
    public void resize(double resizeFactor) {
        this.point.setX(point.getX() * resizeFactor);
        this.point.setY(point.getY() * resizeFactor);
    }
}
