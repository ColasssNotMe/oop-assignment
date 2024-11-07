package util;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;

public class CustomFont {

    public void paint(Graphics g, String text, Font font, int x, int y) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setFont(font);
        g2d.drawString(text, x, y);
    }

    public void paint(Graphics g, String text, Font font, int x, int y, Color color) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setFont(font);
        g2d.setColor(color);
        g2d.drawString(text, x, y);
    }
}
