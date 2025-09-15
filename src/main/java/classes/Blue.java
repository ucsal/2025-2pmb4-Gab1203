package classes;

import java.awt.*;

public class Blue implements ColorFactory{


    @Override
    public String getColorName() {
        return "Azul";
    }

    @Override
    public Color getColor() {
        return new Color(30,144,255);
    }
}
