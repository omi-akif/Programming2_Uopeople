import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InputCanvas extends JPanel implements MouseListener, MouseMotionListener {
    private DisplayCanvas displayCanvas;
    private Point[] points;

    public InputCanvas(DisplayCanvas displayCanvas) {
        this.displayCanvas = displayCanvas;
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // draw points and lines between them
        if (points != null) {
            for (int i = 0; i < points.length; i++) {
                g.fillOval(points[i].x - 3, points[i].y - 3, 6, 6);
                if (i > 0) {
                    g.drawLine(points[i - 1].x, points[i - 1].y, points[i].x, points[i].y);
                }
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // find the closest point to the mouse click and select it
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // update the position of the selected point and repaint
        // call setPoints on displayCanvas to update the points there as well
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // deselect the point
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseMoved(MouseEvent e) {}
}