import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Driver implements ActionListener {
    private JButton button;
    public static void main(String[] args) {
        //Driver d = new Driver();
        //d.go();
        JPanel a = new MyDrawPanel();
        a.setVisible(true);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(a);
        frame.setSize(300, 300);
        frame.setVisible(true);



    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("Click me");

        button.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    public void changeIt() {
        button.setText("I have been clicked!");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        changeIt();
        System.out.println("HI");
        ActionEvent m = e;
        //page is 362 hfj
    }
}
