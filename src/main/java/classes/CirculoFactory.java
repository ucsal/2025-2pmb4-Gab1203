package classes;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CirculoFactory implements ShapeFactory {
    @Override
    public Shape createShape(double x, double y, double width, double height) {
        return new Ellipse2D.Double(x,y,width,height);
    }
}
