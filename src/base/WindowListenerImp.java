package base;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowListenerImp implements WindowListener {

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("windowListenerImp func not implemented");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("windowListenerImp func not implemented");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("windowListenerImp func not implemented");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("windowListenerImp func not implemented");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("windowListenerImp func not implemented");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("windowListenerImp func not implemented");
    }

}
