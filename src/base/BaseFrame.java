package base;

import java.awt.Color;
import java.awt.Frame;

public class BaseFrame extends Frame {

    public BaseFrame() {
        setSize(800, 600);
        setResizable(false);
        setVisible(true);
        setBackground(Color.lightGray);
        setLayout(null);
        // ...additional common setup...
        addWindowListener(new WindowListenerImp());

    }
    // ...existing code...
}
