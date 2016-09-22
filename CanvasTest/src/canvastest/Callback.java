/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package canvastest;
import java.awt.Graphics;
/**
 *
 * @author Thomas
 */
public interface Callback {
    void run(Object a);
    void run(Graphics g, float d);
    void run(Game g, float d);
    void run(float d);
}

class DrawCallback implements Callback {
    public void run(Object o) {}
    public void run(Graphics g, float d) {}
    public void run(Game g, float d) {}
    public void run(float d) {}
}

class UpdateCallback implements Callback {
    public void run(Graphics g, float d) {}
    public void run(Game g, float d) {}
    public void run(Object o) {}
    public void run(float d) {}
}