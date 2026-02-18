import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Morpion {
    
    int BoardL = 600;
    int BoardH = 650;

    JFrame frame = new JFrame();
    JLabel textlabel = new JLabel();
    JPanel textpanel = new JPanel();        

    Morpion() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setSize(BoardL, BoardH);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());

        textlabel.setBackground(Color.darkGray);
        textlabel.setForeground(Color.white);
        textlabel.setFont(new Font("Arial", Font.BOLD, 50));
        textlabel.setHorizontalAlignment(JLabel.CENTER);

    }
}