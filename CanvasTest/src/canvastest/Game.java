/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canvastest;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Thomas
 */
public class Game {
    private List keys_down;
    private boolean state;
    private Drawer frame;
    private Callback updateCallback;
    private Callback drawCallback;
    private long last_delta = System.nanoTime();
    
    private InputListener input;
    public Game() {
        state = true;
        frame = new Drawer("Testing key input");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        input = new InputListener();
        input.setGame(this);
        
        keys_down = new ArrayList();
        
        panel.addKeyListener(input);
        panel.addMouseListener(input);
        panel.addMouseMotionListener(input);
        
        frame.add(panel);
        
        frame.setSize(500,500);
        frame.setVisible(true);
        
        panel.setFocusable(true);
        panel.requestFocusInWindow();
    }
    
    public boolean running() {
        return state;
    }
    
    public boolean isKeyDown(String k) {
        //System.out.println(keys_down.toString());
        return keys_down.indexOf(k.toCharArray()[0]) > -1;
    }
    
    public void setKeyState(char k, KeyState state) {
        int index = keys_down.indexOf(k);
        
        if(index > -1 && state == KeyState.UP) {
            keys_down.remove(index);
            //System.out.println("Removed key state of " + k);
        } else if(state == KeyState.DOWN && index == -1) {
            keys_down.add(k);
            //System.out.println("Added key state for " + k);
        }
    }
    
    public void Update(Callback c) {
        //c.run(this);
        updateCallback = c;
    }
    
    public void Draw(Callback c) {
        System.out.println("Setting drawcallback");
        frame.onDraw(c);
    }
    
    public void run() {
        while(running()) {
            long time = System.nanoTime();
            int delta_time = (int) ((time - last_delta) / 1000000);
            last_delta = time;
            
            if(updateCallback != null) {
                updateCallback.run(this, delta_time);
            }
            
           frame.repaint();
        }
    }
}

enum KeyState {
    DOWN, UP
}

class Key {
    private KeyState state;
    private char keyCode;
    
    public Key(char k) {
        keyCode = k;
    }
    
    public void setState(KeyState s) {
        state = s;
    }
    
    public KeyState getState() {
        return state;
    }
}