package ru.mirea.work12;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class RandomShapeDrawer {
    public void drawRandomShape(Graphics g, JPanel drawPanel) {
        Random rand = new Random();
        int width = drawPanel.getWidth();
        int height = drawPanel.getHeight();

        g.clearRect(0, 0, width, height);

        Color randomColor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        g.setColor(randomColor);

        int shapeType = rand.nextInt(3);
        int size = 100 + rand.nextInt(100);

        switch (shapeType) {
            case 0:
                g.fillOval(rand.nextInt(width - size), rand.nextInt(height - size), size, size);
                break;
            case 1:
                g.fillRect(rand.nextInt(width - size), rand.nextInt(height - size), size, size);
                break;
            case 2:
                int[] xPoints = {rand.nextInt(width), rand.nextInt(width), rand.nextInt(width)};
                int[] yPoints = {rand.nextInt(height), rand.nextInt(height), rand.nextInt(height)};
                g.fillPolygon(xPoints, yPoints, 3);
                break;
        }
    }
}
