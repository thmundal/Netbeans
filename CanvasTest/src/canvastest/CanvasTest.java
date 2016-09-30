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
            public void run(Game g, float deltaTime) {
                if(game.isKeyDown("a")) {
                    speed.x = -1 * deltaTime;
                }
                
                if(game.isKeyDown("d")) {
                    speed.x = 1 * deltaTime;
                }
                
                if(game.isKeyDown("w")) {
                    speed.y = -1 * deltaTime;
                }
                
                if(game.isKeyDown("s")) {
                    speed.y = 1 * deltaTime;
                }
                
                pos = pos.add(speed);
            }
        });
        
        game.Draw(new DrawCallback() {
            public void run(Graphics g, float deltaTime) {
                g.clearRect(0, 0, 500, 500);
                g.drawOval(pos.intX(), pos.intY(), 60, 60); //FOR CIRCLE
            }
        });
        
        game.run();
    }
}