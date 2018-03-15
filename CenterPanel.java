/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ica;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author s6089488
 */
public final class CenterPanel extends JPanel
{

    public CenterPanel()
    {
        setBorder(new EmptyBorder(10, 10, 10, 10));
        setLayout(new BorderLayout());
        
        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(3,3,20,20));
        gridPanel.setPreferredSize(new Dimension(400,400));
        
        ImageIcon[] images = new ImageIcon[9];
        
        JLabel red = new JLabel();
        red.setBackground(Color.red);
        red.setPreferredSize(new Dimension(133,133));
        red.setOpaque(true);
        gridPanel.add(red);
        
        JLabel blue = new JLabel();
        blue.setPreferredSize(new Dimension(133,133));
        blue.setBackground(Color.blue);
        blue.setOpaque(true);
        gridPanel.add(blue);
        
        JLabel green = new JLabel();
        green.setBackground(Color.green);
        green.setPreferredSize(new Dimension(133,133));
        green.setOpaque(true);
        gridPanel.add(green);
        
        JLabel yellow = new JLabel();
        yellow.setBackground(Color.yellow);
        yellow.setPreferredSize(new Dimension(133,133));
        yellow.setOpaque(true);
        gridPanel.add(yellow);
        
        JLabel purple = new JLabel();
        purple.setBackground(Color.MAGENTA);
        purple.setPreferredSize(new Dimension(133,133));
        purple.setOpaque(true);
        gridPanel.add(purple);
        
        JLabel black = new JLabel();
        black.setBackground(Color.black);
        black.setOpaque(true);
        gridPanel.add(black);
        
        JLabel white = new JLabel();
        white.setBackground(Color.white);
        white.setOpaque(true);
        gridPanel.add(white);
        
        JLabel cyan = new JLabel();
        cyan.setBackground(Color.cyan);
        cyan.setOpaque(true);
        gridPanel.add(cyan);
        
        JLabel gray = new JLabel();
        gray.setBackground(Color.gray);
        gray.setOpaque(true);
        gridPanel.add(gray);
        
        add(gridPanel, BorderLayout.NORTH);
        
        JPanel outputPanel = new JPanel();
        outputPanel.setPreferredSize(new Dimension (400,200));
        
        JTextPane output = new JTextPane();
        output.setPreferredSize(new Dimension(400,400));
        outputPanel.add(output);
 
        add(outputPanel, BorderLayout.SOUTH);
    }
    
    {
        
    }
}
