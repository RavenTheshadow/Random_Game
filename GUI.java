import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class GUI{
    public static void main(String[] args) {
        JFrame FRAME    = new JFrame("SIMPLE GUESSING GAME");
        JTextField tf        = new JTextField();
        JTextField text      = new JTextField(); 
        JButton BUTTON  = new JButton("GUESS");
        JButton BUTTON2 = new JButton("EXIT");
        // DESIGN FRAME
        FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FRAME.setResizable(false);
        FRAME.setSize(300, 250);
        FRAME.setLayout(null);
        FRAME.getContentPane().setBackground(new Color(0, 0, 0));
        ImageIcon im = new ImageIcon("R.jpg");
        FRAME.setIconImage(im.getImage());
        //DESIGN    BUTTON
        text.setBounds(35, 0, 220, 50);
        tf.setBounds(35, 50, 220, 50);
        BUTTON.setBounds(35, 100, 220, 50);

        BUTTON.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent E){
                Random random       = new Random();
                int randomNumber    = random.nextInt(0, 3);
                String TXT = text.getText();
                int YOUR = Integer.parseInt(TXT);
                text.setText("Your guess: " + TXT);

                String OUTPUT = (YOUR == randomNumber) ? "YOU WON" : "YOU LOSE";

                tf.setText(OUTPUT + " Computer Guess:" + randomNumber);
            }
        });
        BUTTON2.setBounds(35, 150, 220, 50);
        BUTTON2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent E) {
                FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                FRAME.dispose();
            }
        });
        //ADD       BUTTON
        FRAME.add(text);
        FRAME.add(tf);
        FRAME.add(BUTTON);
        FRAME.add(BUTTON2);
        FRAME.setVisible(true);
    }
};