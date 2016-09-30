/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canvastest;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Thomas
 */
public class Drawer extends JFrame {
    private Callback drawCallback;
    public Game game;
    
    public Drawer(String title) {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void onDraw(Callback c) {
        System.out.println("Drwcallback received");
        drawCallback = c;
    }
    
    public void paint(Graphics g) {
        if(drawCallback != null) {
            drawCallback.run(g, game.deltaTime); // 0 -> deltaTime
        } else {
            System.out.println("No drawcallback defined");
        }
        repaint();
    }
}
