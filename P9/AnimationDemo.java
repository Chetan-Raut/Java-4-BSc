import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AnimationDemo extends JPanel implements ActionListener {
    private int x = 0; // x-coordinate of the moving object
    private int y = 150; // y-coordinate of the moving object
    private int xSpeed = 2; // speed of the animation

    public AnimationDemo() {
        Timer timer = new Timer(10, this); // Timer for animation, fires every 10 milliseconds
        timer.start(); // Start the timer
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.WHITE);

        // Draw the moving object (in this case, a ball)
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 30, 30); // Draw a blue ball
    }

    public void actionPerformed(ActionEvent e) {
        // Move the object horizontally
        x += xSpeed;

        // If the object reaches the right edge, reset its position to the left
        if (x > getWidth()) {
            x = -30; // Reset x-coordinate to the left
        }

        repaint(); // Request repaint to update the animation
    }

    public static void main(String[] args) {
        // Create and configure the frame
        JFrame frame = new JFrame("Animation Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create an instance of the animation panel
        AnimationDemo animationPanel = new AnimationDemo();

        // Add the animation panel to the frame
        frame.add(animationPanel);

        // Make the frame visible
        frame.setVisible(true);
    }
}