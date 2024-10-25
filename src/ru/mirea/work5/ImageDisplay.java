package ru.mirea.work5;
import javax.swing.*;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageDisplay extends JFrame{
    public ImageDisplay(String imagePath) {

        setTitle("Image Display");
        setSize(800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        try {
            BufferedImage image = ImageIO.read(new File(imagePath));
            JLabel imageLabel = new JLabel(new ImageIcon(image));
            add(imageLabel);
        } catch (IOException e) {
            System.out.println("Could not load image: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ImageDisplay <path_to_image>");
            System.exit(1);
        }

        ImageDisplay frame = new ImageDisplay(args[0]);
        frame.setVisible(true);
    }
}
