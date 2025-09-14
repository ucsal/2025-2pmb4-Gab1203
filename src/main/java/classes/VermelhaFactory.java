package classes;

public class VermelhaFactory implements ShapeFactory{
    @Override
    public Circulo createCirculo() {
        return new CirculoVermelho();
    }

    @Override
    public Retangulo createRetangulo() {
        return new RetanguloVermelho();
    }
}
