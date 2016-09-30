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
 *
 * @author Thomas
 */
public class Innlevering5 {

    /**
     * @param args the command line arguments
     */
    public static String resultString;
    public static int seq_num = 0;
    public static void main(String[] args) {
        final CoinStats c = new CoinStats();
        CoinGUI gui = new CoinGUI("Myntkaster");
        
        JButton button = new JButton("Kast mynt");
        //button.setPreferredSize(new Dimension(200, 50));
        button.setSize(200,50);
        button.setLocation(150, 200);
        
        JLabel label = new JLabel("Klikk på knappen for å kaste mynten");
        label.setLocation(1, 1);
        label.setSize(200, 20);
        resultString = "";
        
        final JLabel result = new JLabel(resultString);
        result.setPreferredSize(new Dimension(450, 20));
        
        final JLabel history = new JLabel("");
        history.setSize(450,20);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(c.flipCoin()) {
                    resultString = "Heads";
                } else {
                    resultString = "Tails";
                }
                
                result.setText("Resultatet ble " + resultString);
                history.setText(c.getHistory());
            }
        });
        
        final JLabel seq_result = new JLabel("");
        final JTextField input = new JTextField("", 10);
        
        JButton checkSeq = new JButton("Sjekk sekvens");
        checkSeq.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seq_num = c.checkSequence(input.getText());
                seq_result.setText("Antall ganger sekvensen gjentar er " + seq_num);
            }
        });
        
        gui.add(label);
        gui.add(button);
        gui.add(result);
        gui.add(input);
        gui.add(checkSeq);
        gui.add(seq_result);
        gui.add(history);
        
        //gui.pack();
        /*
        for(int i=0; i<50; i++) {
            c.flipCoin();
        }
        
        System.out.println(c.getHistory());
        System.out.println("Checking for HHTH");
        System.out.println(c.checkSequence("HHTH"));*/
    }
}
