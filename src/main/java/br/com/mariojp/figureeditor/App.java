package br.com.mariojp.figureeditor;

import classes.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App {

    public static Map colorMap(){

        ColorFactory[] colors = {new BlueFactory(), new RedFactory()};
        Map<String, ColorFactory> colorMap = new HashMap<>();

        for(ColorFactory color : colors){
            colorMap.put(color.getColorName(), color);
        }

        return colorMap;
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ignored) {}

            JFrame frame = new JFrame("Figure Editor — Clique para inserir figuras");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            Map<String, ColorFactory> colorMap = colorMap();
            String[] opcoesCor = colorMap.keySet().toArray(new String[0]);

            //DrawingPanel panel = new DrawingPanel(new CirculoFactory(), new RedFactory());
            DrawingPanel panel = new DrawingPanel(new RetanguloFactory(), new RedFactory());

            frame.setLayout(new BorderLayout());
            frame.add(panel, BorderLayout.CENTER);

            JComboBox<String> comboBoxCor = new JComboBox<>(opcoesCor);
            frame.add(comboBoxCor, BorderLayout.NORTH);

            comboBoxCor.addActionListener(e -> {
                String corSelecionada = (String) comboBoxCor.getSelectedItem();
                panel.setCor(colorMap.get(corSelecionada));
            });

            frame.setSize(900, 600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
