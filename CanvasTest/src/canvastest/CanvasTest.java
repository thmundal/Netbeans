/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canvastest;
import java.awt.Graphics;
/**
 *
 * @author Thomas Mundal<thomas@munso.no>
 */
public class CanvasTest {
    /**
     * @param args the command line arguments
     */
    
    public static Vector2 pos = new Vector2(1f, 1f);
    public static Vector2 speed = new Vector2(0f, 0f);
    public static void main(String[] args) {
        final Game game = new Game();
        
        game.Update(new UpdateCallback() {
            public void run(float deltaTime) {
                //System.out.println("Test");
                if(game.isKeyDown("a")) {
                    speed.x = -1;
                }
                
                if(game.isKeyDown("d")) {
                    speed.x = 1;
                }
                
                if(game.isKeyDown("w")) {
                    speed.y = -1;
                }
                
                if(game.isKeyDown("s")) {
                    speed.y = 1;
                }
                
                pos = pos.add(speed);
            }
        });
        
        game.Draw(new DrawCallback() {
            public void run(Graphics g, float deltaTime) {
                g.drawOval(pos.intX(), pos.intY(), 60, 60); //FOR CIRCLE
            }
        });
        
        game.run();
    }
}