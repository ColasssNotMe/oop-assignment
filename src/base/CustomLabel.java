package base;

import java.awt.Graphics;
import java.awt.Canvas;
import java.awt.Font;

public class CustomLabel extends Canvas {
    private String text;
    private Font font;

    public CustomLabel(String text, Font font) {
        this.text = text;
        this.font = font;
        setSize(200, 50);
    }

    @Override
    public void paint(Graphics g) {
        g.setFont(font);
        g.drawString(text, 10, 40);
    }
}