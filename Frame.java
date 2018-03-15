/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ica;

import java.awt.*;
import javax.swing.JFrame;

/**
 *
 * @author s6089488
 */
public class Frame 
{
    public static void main(String[] args)
    {
        JFrame myFrame = new JFrame("Real Office Furniture");
        
        myFrame.setSize(900,700);
        myFrame.setLayout(new BorderLayout());
        
        LeftButtonPanel lbp = new LeftButtonPanel();
        lbp.setOpaque(true);
        lbp.setPreferredSize(new Dimension(200,600));
        myFrame.add(lbp, BorderLayout.WEST);
        
        CenterPanel cp = new CenterPanel();
        cp.setOpaque(true);
        cp.setPreferredSize(new Dimension(600,600));
        myFrame.add(cp, BorderLayout.CENTER);
        
        RightButtonPanel rbp = new RightButtonPanel();
        rbp.setOpaque(true);
        rbp.setPreferredSize(new Dimension(200,600));
        myFrame.add(rbp, BorderLayout.EAST);     
        
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setResizable(false);
        myFrame.setVisible(true);
    }
            
}
