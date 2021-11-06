package main.java.com.valeryvash.javacore.chapter13;

import java.applet.*;
import java.awt.*;
/*
<applet code="SimpleApplet" width=200 height=60>
</applet>
 */

public class SimpleApplet extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawString("Simplest applet", 20,20);
    }
}
