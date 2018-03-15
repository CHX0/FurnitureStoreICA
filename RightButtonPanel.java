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
public final class RightButtonPanel extends JPanel
{
    public RightButtonPanel()
    {
        setLayout(new GridLayout(6,1));  
        
        JButton totalPrice = new JButton ("Total Price");
        add(totalPrice);
        
        JButton addTable = new JButton ("Add Table");
        add(addTable);
        
        JButton addDesk = new JButton ("Add Desk");
        add(addDesk);
        
        JButton clearAll = new JButton ("Clear All");
        add(clearAll);
    }
}
