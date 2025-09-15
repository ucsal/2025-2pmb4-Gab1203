package classes;

import java.awt.*;

public class Red implements ColorFactory{
    @Override
    public String getColorName() {
        return "Vermelho";
    }

    @Override
    public Color getColor() {
        return new Color(255,0,0);
    }
}
