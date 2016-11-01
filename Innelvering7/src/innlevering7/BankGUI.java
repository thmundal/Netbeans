/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innlevering7;

import innlevering6.Konto;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author 888651
 */
public class BankGUI extends JFrame {
    JTextArea mainOutput;
    JTextField inputField;
    JButton button;
    Konto active_user;
    ActionListener button_listener;
    
    /**
     * Constructor
     */
    public BankGUI() {
        super();
        
        setup();
    }
    
    /**
     * Sets up the GUI frame
     */
    private void setup() {
        active_user = null;
        button_listener = null;
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setFocusable(true);
        setLayout(null);
        
        mainOutput = new JTextArea();
        mainOutput.setEditable(false);
        mainOutput.setSize(500,420);
        mainOutput.setMargin(new Insets(30,20,20,20));
        
        inputField = new JTextField();
        inputField.setBounds(5, 425, 350, 30);
        
        button = new JButton();
        button.setText("Kjør funksjon");
        button.setBounds(360, 425, 110, 30);
        
        present();
        setVisible(true);
        
    }
    
    /**
     * Adds component to the frame
     */
    public void present() {
        add(mainOutput);
        add(inputField);
        add(button);
    }
    
    /**
     * Sets the button listener
     * @param listener 
     */
    public void setButtonListener(ActionListener listener) {
        button.addActionListener(listener);
    }
    
    /**
     * Removes a button listener
     * @param listener 
     */
    public void removeButtonListener(ActionListener listener) {
        button.removeActionListener(listener);
    }
    
    /**
     * Sets the text of the output field
     * @param text 
     */
    public void output(String text) {
        mainOutput.setText(text);
    }
    
    /**
     * Sets the button text
     * @param text 
     */
    public void buttonText(String text) {
        button.setText(text);
    }
    
    /**
     * Returns the value of the input field
     * @return 
     */
    public String getInput() {
        return inputField.getText();
    }
    
    /**
     * Set the value of the input field
     * @param text 
     */
    public void setInput(String text) {
        inputField.setText(text);
    }
    
    /**
     * Exit the program programmatically
     */
    public void exit() {
        dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }
}
