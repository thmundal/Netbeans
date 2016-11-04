/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innlevering7;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author 888651
 */
public class BankGUI extends JFrame {
    JPanel mainPanel;
    JTextArea mainOutput;
    JTextField inputField;
    JButton button;
    
    public BankGUI() {
        super();
        
        setup();
    }
    
    private void setup() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setPreferredSize(new java.awt.Dimension(500, 500));
        setSize(500,500);
        setFocusable(true);
        //setLayout(new GridLayout(0,1));
        
        mainPanel = new JPanel();
        
        //mainPanel.setLayout(new FlowLayout());
        
        Insets insets = getInsets();
        
        mainOutput = new JTextArea();
        mainOutput.setEditable(false);
        
        inputField = new JTextField(10);
        
        
        button = new JButton();
        button.setText("Klikk her");
        
        present();
        setVisible(true);
    }
    
    public void present() {
        add(mainPanel);
        mainPanel.add(mainOutput);
        mainPanel.add(inputField);
        mainPanel.add(button);
        //mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(inputField.getText());
            }
        });
    }
    
    private void mainMenu() {
        
    }
    
    public JTextArea output() {
        return mainOutput;
    }
}
