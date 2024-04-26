/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author CC Adderley
 */
public class Tut extends JFrame implements ActionListener {

    //Create String array with 10 elements
    String[] languages = {"zulu", "english", "xhosa", "sotho", "afrikan", "tsonga", "pedi", "tswana", "swati", "sign"};

    private JTextField arrIndex = new JTextField(9);
    private JTextField arrDisplay = new JTextField(30);
    private JLabel arrI = new JLabel("Enter an array index value ");
    private JLabel arrD = new JLabel("display array element value ");
    JPanel panelNorth = new JPanel();
    JPanel panelCenter = new JPanel();
    JPanel panelSouth = new JPanel();
    JButton btn = new JButton("Show element BTN");
    int numb;

    Tut() {
        super("Prac 8");

        panelNorth.add(arrI);
        panelNorth.add(arrIndex);
        panelCenter.add(arrD);
        panelCenter.add(arrDisplay);
        panelSouth.add(btn);
        this.add(panelNorth, BorderLayout.NORTH);
        this.add(panelCenter, BorderLayout.CENTER);
        this.add(panelSouth, BorderLayout.SOUTH);

        btn.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {// specifiy which button you talking about
            try {
  
                int input = Integer.parseInt(arrIndex.getText());//initialisisng textfield to the input variable,textfield used
                for (int i = 0; i < languages.length; i++) {// looping throught the array element from 0 till 9
                    arrDisplay.setText((String) "The requested array position is " + input + ". The found array element is " + languages[input]);
                } // last line= comparing what the user has enetered,it will retunr the relevant element
            } catch (ArrayIndexOutOfBoundsException ex) {
                JOptionPane.showMessageDialog(null, "The number should be from 0 to 9 \n" + ex, "Error", JOptionPane.ERROR_MESSAGE);
            } catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"You have entered foreign character \n" +nfe);
            }
        }

    }
}
