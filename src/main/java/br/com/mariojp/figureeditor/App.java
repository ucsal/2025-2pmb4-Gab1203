package br.com.mariojp.figureeditor;

import classes.CirculoFactory;
import classes.ColorFactory;
import classes.RetanguloFactory;
import classes.ShapeFactory;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        ShapeFactory[] shapes = {new RetanguloFactory(), new CirculoFactory()};
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ignored) {}

            JFrame frame = new JFrame("Figure Editor — Clique para inserir figuras");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            Map <String, Color> opcoesCores= new HashMap<>();
            Map <String, Shape> opcoesShapes= new HashMap<>();

            for(ShapeFactory shape : shapes){
                opcoesShapes.put(shape);
            }

            ShapeFactory shapeSelcionado;
            ColorFactory corSelecionada;

            DrawingPanel panel = new DrawingPanel(shapeSelcionado, corSelecionada);

            frame.setLayout(new BorderLayout());
            frame.add(panel, BorderLayout.CENTER);

            frame.setSize(900, 600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
