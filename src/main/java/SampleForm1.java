import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class SampleForm1 {
    public static void main(String[] args) {
        var f = new JFrame("drawing");
        f.setVisible(true);

        var label = new JLabel("test");
        f.add(label);
        f.pack();

        var image = new BufferedImage(600, 400, BufferedImage.TYPE_INT_RGB);
        label.setIcon(new ImageIcon(image));
        f.pack();
        var g = image.createGraphics();
        g.drawLine(0, 0, 600, 400);
        g.drawLine(0,400, 600, 0);
        label.repaint();

        g.setColor(Color.BLUE);
        g.fillRect(300, 200, 150, 100);

    }
}
