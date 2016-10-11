/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innlevering5;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * An application for flipping coins, and checking the flip history
 * @author Thomas
 */
public class Innlevering5 {
    /**
     * A string holding the result of the latest coinflip
     */
    public static String resultString;
    
    /**
     * An integer holding the result of the sequence check for output
     */
    public static int seq_num = 0;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final CoinStats c = new CoinStats();                                // Instantiate the CoinStats object
        CoinGUI gui = new CoinGUI("Myntkaster");                            // Instantiate the graphical user interface

        JButton button = new JButton("Kast mynt");                          // Add a button that will perform the coin flip
        button.setSize(200,50);                                             // Set size and
        button.setLocation(150, 200);                                       // location of the button in the window
        
        JLabel label = new JLabel("Klikk på knappen for å kaste mynten");   // A label cointaining helpful text
        label.setLocation(1, 1);                                            // Location and
        label.setSize(200, 20);                                             // size of the label
        resultString = "";                                                  // Initialize the resultstring as an empty sting
        
        final JLabel result = new JLabel(resultString);                     // A label that will contain the result string
        result.setPreferredSize(new Dimension(450, 20));                    // Size of the label
        
        final JLabel history = new JLabel("");                              // A label that will contain the history string
        history.setSize(450,20);                                            // Size of the label
        
        button.addActionListener(new ActionListener() {                     // The action listener for the flip coin button
            public void actionPerformed(ActionEvent e) {
                // Flip the coin and store a string representation of the result
                // in the resultString variable
                if(c.flipCoin()) {
                    resultString = "Heads";
                } else {
                    resultString = "Tails";
                }
                
                // Output the result to the result label
                result.setText("Resultatet ble " + resultString);
                
                // Output the coin flip history to the history label
                history.setText(c.getHistory());
            }
        });
        
        final JLabel seq_result = new JLabel("");                           // A label for displaying the coin flip history
        final JTextField input = new JTextField("", 10);                    // An input for specifying the sequence to check
        
        JButton checkSeq = new JButton("Sjekk sekvens");                    // A button to press for running the sequence check
        checkSeq.addActionListener(new ActionListener() {                   // Action listener for the sequence check button
            public void actionPerformed(ActionEvent e) {
                // Check the given sequence agains the CoinStats object
                seq_num = c.checkSequence(input.getText());
                
                // Output the result of the sequence check to the seq_result label
                seq_result.setText("Antall ganger sekvensen gjentar er " + seq_num);
            }
        });
        
        // Add the GUI elements
        gui.add(label);
        gui.add(button);
        gui.add(result);
        gui.add(input);
        gui.add(checkSeq);
        gui.add(seq_result);
        gui.add(history);
        
        // Make the GUI visible
        gui.setVisible(true);
    }
}
