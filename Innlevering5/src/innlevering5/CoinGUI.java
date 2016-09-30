/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innlevering5;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JFrame;

/**
 *
 * @author 888651
 */
public class CoinGUI extends JFrame {
    public CoinGUI(String title) {
        super(title);
        
        setup();
    }
    
    private void setup() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setPreferredSize(new java.awt.Dimension(500, 500));
        setSize(500,500);
        setFocusable(true);
        setLayout(new GridLayout(0,1));
    }
}
