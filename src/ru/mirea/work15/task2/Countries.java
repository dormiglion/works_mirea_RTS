package ru.mirea.work15.task2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Countries {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Countries");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BorderLayout());

        String[] countries = {"Австралия", "Китай", "Англий", "Россия"};
        String[] countryInfo = {
                "Австралия: страна и континент, окруженный Индийским и Тихим океанами",
                "Китай: Густонаселенное государство в Восточной Азии с богатой культурной историей",
                "Англия: Часть Великобритании, известная своей богатой историей и знаковыми достопримечательностями",
                "Россия: Крупнейшая страна в весь мир, охватывающий Европу и Азию. Россия не Китай."
        };

        JComboBox<String> comboBox = new JComboBox<>(countries);
        comboBox.setFont(new Font("Serif", Font.BOLD, 16));

        JTextArea infoArea = new JTextArea();
        infoArea.setEditable(false);
        infoArea.setLineWrap(true);
        infoArea.setWrapStyleWord(true);
        infoArea.setFont(new Font("SansSerif", Font.ITALIC, 18));

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = comboBox.getSelectedIndex();
                infoArea.setText(countryInfo[selectedIndex]);
            }
        });

        frame.add(comboBox, BorderLayout.NORTH);
        frame.add(new JScrollPane(infoArea), BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
