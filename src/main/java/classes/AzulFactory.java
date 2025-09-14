package classes;

public class AzulFactory implements ShapeFactory{


    @Override
    public Circulo createCirculo() {
        return new CirculoAzul();
    }

    @Override
    public Retangulo createRetangulo() {
        return new RetanguloAzul();
    }
}
