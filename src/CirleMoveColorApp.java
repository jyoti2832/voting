import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class CirleMoveColorApp extends JFrame {
    private JPanel drawingPanel;
    private int circleX = 100;
    private int circleY = 100;
    private final int CIRCLE_RADIUS = 30;
    private Color circleColor = Color.RED;

    public CirleMoveColorApp() {
        setTitle("Circle Move Color App");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        drawingPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(circleColor);
                g.fillOval(circleX - CIRCLE_RADIUS, circleY - CIRCLE_RADIUS, 2 * CIRCLE_RADIUS, 2 * CIRCLE_RADIUS);
            }
        };

        add(drawingPanel);
        drawingPanel.setFocusable(true);
        drawingPanel.requestFocusInWindow();

        // Add key listener to the drawing panel for arrow key controls and color change
        drawingPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_LEFT:
                        moveCircle(-10, 0); // Move left
                        break;
                    case KeyEvent.VK_RIGHT:
                        moveCircle(10, 0); // Move right
                        break;
                    case KeyEvent.VK_UP:
                        moveCircle(0, -10); // Move up
                        break;
                    case KeyEvent.VK_DOWN:
                        moveCircle(0, 10); // Move down
                        break;
                    case KeyEvent.VK_SPACE:
                        changeCircleColor(); // Change circle color
                        break;
                }
            }
        });

        setVisible(true);
    }

    private void moveCircle(int dx, int dy) {
        circleX += dx;
        circleY += dy;
        repaint(); // Request to repaint the drawing panel
    }

    private void changeCircleColor() {
        Random random = new Random();
        int r = random.nextInt(256); // Red component (0-255)
        int g = random.nextInt(256); // Green component (0-255)
        int b = random.nextInt(256); // Blue component (0-255)
        circleColor = new Color(r, g, b);
        repaint(); // Request to repaint the drawing panel with the new color
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CirleMoveColorApp());
    }
}