import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RectagleMoveApp extends JFrame {
    JPanel drawingPanel;
    int rectX = 50;
    int rectY = 50;
    int RECT_WIDTH = 50;
    int RECT_HEIGHT = 50;

    public RectagleMoveApp() {
        setTitle("Rectangle Move App");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        drawingPanel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.fillRect(rectX, rectY, RECT_WIDTH, RECT_HEIGHT);
            }
        };

        add(drawingPanel);
        drawingPanel.setFocusable(true);
        drawingPanel.requestFocusInWindow();

        // Add key listener to the drawing panel for arrow key controls
        drawingPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_LEFT:
                        moveRectangle(-10, 0); // Move left
                        break;
                    case KeyEvent.VK_RIGHT:
                        moveRectangle(10, 0); // Move right
                        break;
                    case KeyEvent.VK_UP:
                        moveRectangle(0, -10); // Move up
                        break;
                    case KeyEvent.VK_DOWN:
                        moveRectangle(0, 10); // Move down
                        break;
                }
            }
        });

        setVisible(true);
    }

    public void moveRectangle(int x, int y) {
        rectX += x;
        rectY += y;
        repaint(); // Request to repaint the drawing panel
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RectagleMoveApp());
    }
}