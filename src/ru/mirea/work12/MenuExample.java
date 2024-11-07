package ru.mirea.work12;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class MenuExample extends JFrame{
    private JPanel drawPanel;
    final private RandomShapeDrawer shapeDrawer;

    public MenuExample() {
        super("Меню с функциями");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        shapeDrawer = new RandomShapeDrawer();
        JMenuBar menuBar = new JMenuBar();

        JMenu helloMenu = new JMenu("Приветствие");
        JMenuItem helloItem = new JMenuItem("Ввести имя");
        helloItem.addActionListener(e -> {
            String name = JOptionPane.showInputDialog("Введите ваше имя:");
            if (name != null && !name.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Привет, " + name + "! Хорошего тебе дня!");
            }
        });
        helloMenu.add(helloItem);


        JMenu shapeMenu = new JMenu("Случайная фигура");
        JMenuItem shapeItem = new JMenuItem("Показать фигуру");
        shapeItem.addActionListener(e -> {
            Graphics g = drawPanel.getGraphics();
            shapeDrawer.drawRandomShape(g, drawPanel);
        });
        shapeMenu.add(shapeItem);


        JMenu imageMenu = new JMenu("Показать картинку");
        JMenuItem imageItem = new JMenuItem("Показать изображение");
        imageItem.addActionListener(e -> {
            try {
                BufferedImage image = ImageIO.read(new File("D:\\works_mirea_RTS" +
                        "\\works_mirea_RTS\\src\\ru\\mirea\\work12\\image.jpg")); // Замените "image.jpg" на путь к вашему файлу
                Graphics g = drawPanel.getGraphics();
                g.clearRect(0, 0, drawPanel.getWidth(), drawPanel.getHeight());
                g.drawImage(image, 0, 0, drawPanel.getWidth(), drawPanel.getHeight(), null);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Изображение не найдено.");
            }
        });
        imageMenu.add(imageItem);

        // Добавление всех меню в строку меню
        menuBar.add(helloMenu);
        menuBar.add(shapeMenu);
        menuBar.add(imageMenu);
        setJMenuBar(menuBar);

        drawPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
            }
        };
        add(drawPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MenuExample example = new MenuExample();
            example.setVisible(true);
        });
    }
}
