package ru.mirea.work16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessNumberGame {
    private static int targetNumber;
    private static int attempts = 3;
    private static JTextField guessField;
    private static JLabel messageLabel;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Игра - Угадай число");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        Random random = new Random();
        targetNumber = random.nextInt(21);

        JLabel promptLabel = new JLabel("Угадайте число от 0 до 20:");
        guessField = new JTextField(10);  // Текстовое поле для ввода
        JButton guessButton = new JButton("Попробовать");  // Кнопка для отправки попытки
        messageLabel = new JLabel("");  // Метка для сообщений

        frame.add(promptLabel);
        frame.add(guessField);
        frame.add(guessButton);
        frame.add(messageLabel);

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int guess = Integer.parseInt(guessField.getText().trim());

                    // 0-20
                    if (guess < 0 || guess > 20) {
                        messageLabel.setText("Число должно быть от 0 до 20!");
                        return;
                    }

                    // win
                    if (guess == targetNumber) {
                        messageLabel.setText("Поздравляем! Вы угадали число.");
                        guessButton.setEnabled(false);   // ENABLE
                    } else {
                        attempts--;
                        if (attempts > 0) {
                            if (guess < targetNumber) {
                                messageLabel.setText("Число больше.");
                            } else {
                                messageLabel.setText("Число меньше.");
                            }
                        } else {     //lose
                            messageLabel.setText("Вы исчерпали попытки. Загаданное число: " + targetNumber);
                            guessButton.setEnabled(false);  // ENABLE
                        }
                    }
                } catch (NumberFormatException ex) {
                    messageLabel.setText("Введите корректное число!");
                }
            }
        });

        frame.setVisible(true);
    }
}
