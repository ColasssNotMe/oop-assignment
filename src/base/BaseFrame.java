package base;

import java.awt.Color;
import java.awt.Frame;
import javax.swing.JFrame;

public class BaseFrame extends Frame {
    JFrame root = new JFrame();

    public BaseFrame() {
        root.setSize(800, 600);
        root.setResizable(false);
        root.setVisible(true);
        root.getContentPane().setBackground(Color.lightGray);
        root.setLayout(null);
        root.setLocation(500, 250);

        addWindowListener(new WindowListenerImp());

    }

    public JFrame getRoot() {
        return root;
    }
}
