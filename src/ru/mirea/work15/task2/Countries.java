package ru.mirea.work15.task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Countries extends JFrame{
    public Countries() {

        super("Тестовое окно");
//        setTitle("Simple Calculator");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Font font = new Font("Verdana", Font.PLAIN, 18);

        String[] items = {
                "Элемент списка 1",
                "Элемент списка 2",
                "Элемент списка 3"
        };

        Container content = getContentPane();

        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));

        final JLabel label = new JLabel(" ");
        label.setAlignmentX(LEFT_ALIGNMENT);
        label.setFont(font);
        content.add(label);

        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox box = (JComboBox)e.getSource();
                String item = (String)box.getSelectedItem();
                label.setText(item);
            }
        };

        JComboBox comboBox = new JComboBox(items);
        comboBox.setFont(font);
        comboBox.setAlignmentX(RIGHT_ALIGNMENT);
        comboBox.addActionListener(actionListener);
        content.add(comboBox);

        setPreferredSize(new Dimension(300, 100));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                new Countries();
            }
        });
    }
}
