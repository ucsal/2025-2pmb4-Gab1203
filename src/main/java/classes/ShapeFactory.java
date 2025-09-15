package classes;

import java.awt.*;

public interface ShapeFactory {
    Shape createShape(double x, double y, double width, double height);
    public String getShapeName();
}
