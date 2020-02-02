import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        Image image = new ImageIcon("C:\\DEV\\github_projects\\HeadFirstJava\\gui\\resources\\cat.png").getImage();
        g.drawImage(image, 3, 4, this);
        JFileChooser fc = new JFileChooser();
        //fc.addActionListener();

    }
}
