/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ica;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author s6089488
 */
public final class LeftButtonPanel extends JPanel
{
    public LeftButtonPanel()
    {        
        setLayout(new GridLayout(6,1));
        
        JPanel radioButtons = new JPanel(); 
        
        JRadioButton oak = new JRadioButton("Oak");
        oak.setSelected(true);
        
        JRadioButton walnut = new JRadioButton("Walnut");
        
        radioButtons.add(oak);
        radioButtons.add(walnut);
        
        add(radioButtons);  
        
        JButton addChair = new JButton ("Add Chair");
        add(addChair);       
        
        JButton addTable = new JButton ("Add Table");
        add(addTable);
        
        JButton addDesk = new JButton ("Add Desk");
        add(addDesk);
        
        JButton clearAll = new JButton ("Clear All");
        add(clearAll);
    }
    
}
