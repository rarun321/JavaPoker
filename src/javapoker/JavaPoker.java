/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapoker;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author rithv
 */
public class JavaPoker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
         Cards spades2 = new Cards(2, ImageIO.read(new File("2Spades.png")));
       
        
        
        JFrame mainFrame = new JFrame("Panel Example");
        JPanel panel = new JPanel();
        panel.setBounds(0, 0,2000, 2000);
        panel.setBackground(Color.gray);
        JLabel playercard1 = new JLabel(new ImageIcon(spades2.getCardImage()));
        panel.add(playercard1);

        mainFrame.add(panel);
        mainFrame.setSize(2000, 2000);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
    }
    
}
