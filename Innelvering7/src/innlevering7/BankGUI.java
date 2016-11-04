/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innlevering7;

<<<<<<< HEAD
import java.awt.BorderLayout;
=======
import innlevering6.Konto;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
>>>>>>> 26b0b1d15c4346bd2cca99055312c27b93bc1eb4
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
<<<<<<< HEAD
=======
import java.awt.event.WindowEvent;
>>>>>>> 26b0b1d15c4346bd2cca99055312c27b93bc1eb4
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
<<<<<<< HEAD
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
=======
>>>>>>> 26b0b1d15c4346bd2cca99055312c27b93bc1eb4
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author 888651
 */
public class BankGUI extends JFrame {
<<<<<<< HEAD
    JPanel mainPanel;
=======
>>>>>>> 26b0b1d15c4346bd2cca99055312c27b93bc1eb4
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
<<<<<<< HEAD
        //setLayout(new GridLayout(0,1));
        
        mainPanel = new JPanel();
        
        //mainPanel.setLayout(new FlowLayout());
        
        Insets insets = getInsets();
        
        mainOutput = new JTextArea();
        mainOutput.setEditable(false);
        
        inputField = new JTextField(10);
        
        
        button = new JButton();
        button.setText("Klikk her");
=======
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
>>>>>>> 26b0b1d15c4346bd2cca99055312c27b93bc1eb4
        
        present();
        setVisible(true);
        
    }
    
    /**
     * Adds component to the frame
     */
    public void present() {
<<<<<<< HEAD
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
=======
        add(mainOutput);
        add(inputField);
        add(button);
>>>>>>> 26b0b1d15c4346bd2cca99055312c27b93bc1eb4
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
    
    public JTextArea output() {
        return mainOutput;
    }
}
