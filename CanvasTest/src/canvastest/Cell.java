/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canvastest;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Thomas
 */
public class Cell {
    public Color color;
    
    public Vector2 position;
    public Vector2 size;
    
    public Cell() {
        color = Color.white;
    }
    
    public void Draw(Graphics g) {
        g.drawRect((int) position.x * (int) size.x, (int) position.y * (int) size.y, (int) size.x, (int) size.y);
    }
}
