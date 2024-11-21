package ru.mirea.work15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorFrame extends JFrame {
    private final JTextArea display; // Поле для отображения
    private String currentInput = ""; // Текущее число или операция
    private double firstOperand = 0; // Первый операнд
    private String operator = ""; // Хранение текущего оператора

    public CalculatorFrame() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // дисплей
        display = new JTextArea(2, 20);
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));
        add(buttonPanel, BorderLayout.CENTER);

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }
        setVisible(true);
    }

    //ActionListener
    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if ("0123456789.".contains(command)) {
                currentInput += command;
                display.setText(currentInput);
            } else if ("/*-+".contains(command)) {
                if (!currentInput.isEmpty()) {
                    firstOperand = Double.parseDouble(currentInput);
                }
                operator = command;
                currentInput = "";
            } else if ("=".equals(command)) {

                if (!currentInput.isEmpty() && !operator.isEmpty()) {
                    double secondOperand = Double.parseDouble(currentInput);
                    double result = calculate(firstOperand, secondOperand, operator);
                    display.setText(String.valueOf(result));
                    currentInput = "";
                    operator = "";
                }
            }
        }

        private double calculate(double a, double b, String operator) {
            switch (operator) {
                case "+":
                    return a + b;
                case "-":
                    return a - b;
                case "*":
                    return a * b;
                case "/":
                    if (b != 0) return a / b;
                    else {
                        display.setText("Error: Div by 0");
                        return 0;
                    }
                default:
                    return 0;
            }
        }
    }
}