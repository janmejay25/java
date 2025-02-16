package projects.java_fist_gui;

import javax.swing.*;
import java.awt.*;

public class RockPaperScissorsTwoPlayer {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Rock-Paper-Scissors - Two Player");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new GridLayout(3, 1));

        // Player 1 Panel
        JPanel player1Panel = new JPanel();
        JLabel player1Label = new JLabel("Player 1: ");
        JTextField player1Input = new JTextField(10);
        player1Panel.add(player1Label);
        player1Panel.add(player1Input);

        // Player 2 Panel
        JPanel player2Panel = new JPanel();
        JLabel player2Label = new JLabel("Player 2: ");
        JTextField player2Input = new JTextField(10);
        player2Panel.add(player2Label);
        player2Panel.add(player2Input);

        // Result Panel
        JPanel resultPanel = new JPanel();
        JButton playButton = new JButton("Play");
        JLabel resultLabel = new JLabel("Result: ");
        resultPanel.add(playButton);
        resultPanel.add(resultLabel);

        // Add panels to frame
        frame.add(player1Panel);
        frame.add(player2Panel);
        frame.add(resultPanel);

        // Play button logic
        playButton.addActionListener(e -> {
            String player1Choice = player1Input.getText().trim().toLowerCase();
            String player2Choice = player2Input.getText().trim().toLowerCase();

            // Determine the result
            String result = determineWinner(player1Choice, player2Choice);
            resultLabel.setText("Result: " + result);
        });

        frame.setVisible(true);
    }

    // Method to determine the winner
    private static String determineWinner(String p1, String p2) {
        if (p1.equals(p2)) {
            return "It's a draw!";
        }
        if ((p1.equals("rock") && p2.equals("scissors")) ||
            (p1.equals("paper") && p2.equals("rock")) ||
            (p1.equals("scissors") && p2.equals("paper"))) {
            return "Player 1 wins!";
        }
        if ((p2.equals("rock") && p1.equals("scissors")) ||
            (p2.equals("paper") && p1.equals("rock")) ||
            (p2.equals("scissors") && p1.equals("paper"))) {
            return "Player 2 wins!";
        }
        return "Invalid input! Choices: rock, paper, scissors.";
    }
}
