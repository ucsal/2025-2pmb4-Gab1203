package classes;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class RetanguloFactory implements ShapeFactory{

    @Override
    public Shape createShape(double x, double y, double width, double height) {
        return new Rectangle2D.Double(x,y,width,height/2);
    }

    @Override
    public String getShapeName() {
        return "Retângulo";
    }


}
