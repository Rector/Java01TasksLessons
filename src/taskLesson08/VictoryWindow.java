package taskLesson08;

import javax.swing.*;
import java.awt.*;

public class VictoryWindow extends JFrame {
    private static final int WINDOW_POS_X = 550;
    private static final int WINDOW_POS_Y = 500;
    private static final int WINDOW_HEIGHT = 150;
    private static final int WINDOW_WIDTH = 400;
    JLabel winner;

    public VictoryWindow() {
        setTitle("Winner");
        setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setVisible(false);
        setResizable(false);

        Font font = new Font("Times New Roman", Font.BOLD, 20);


        if (Logic.winnerName == 1) {
            setVisible(true);
            winner = new JLabel("Победил игрок!!!");
            winner.setVerticalAlignment(JLabel.CENTER);
            winner.setHorizontalAlignment(JLabel.CENTER);

            winner.setForeground(new Color(255, 0, 6));

            winner.setFont(font);
            add(winner, BorderLayout.CENTER);
        }

        if (Logic.winnerName == 2) {
            setVisible(true);
            winner = new JLabel("Победил искусственный интеллект!!!");
            winner.setVerticalAlignment(JLabel.CENTER);
            winner.setHorizontalAlignment(JLabel.CENTER);

            winner.setForeground(new Color(0, 15, 255));

            winner.setFont(font);
            add(winner, BorderLayout.CENTER);
        }

        if (Logic.winnerName == 3) {
            setVisible(true);
            winner = new JLabel("Ничья!!!");
            winner.setVerticalAlignment(JLabel.CENTER);
            winner.setHorizontalAlignment(JLabel.CENTER);

            winner.setForeground(new Color(0, 171, 8));

            winner.setFont(font);
            add(winner, BorderLayout.CENTER);
        }
    }
}
