package ru.mirea.work5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {
    private int milanScore = 0;
    private int madridScore = 0;

    private JLabel resultLabel = new JLabel("Result: 0 X 0");
    private JLabel lastScorerLabel = new JLabel("Last Scorer: N/A");
    private JLabel winnerLabel = new JLabel("Winner: DRAW");

    public Game() {
        super("Football Match Score");

        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        // Кнопки для команд
        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");

        panel.add(resultLabel);
        panel.add(lastScorerLabel);
        panel.add(winnerLabel);
        panel.add(milanButton);
        panel.add(madridButton);
        add(panel);

        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                updateScore("AC Milan");
            }
        });

        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                updateScore("Real Madrid");
            }
        });
    }

    private void updateScore(String lastScorer) {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Last Scorer: " + lastScorer);

        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        Game frame = new Game();
        frame.setVisible(true);
    }
}
