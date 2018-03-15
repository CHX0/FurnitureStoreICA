/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ica;

/**
 *
 * @author s6089488
 */
public class Driver
{
    public static void main(String[] args)
    {
        Chair chair1 = new Chair(true, 0, 1);
        System.out.println("Chair 1 Price: " + chair1.getItemPrice());
        System.out.println("Chair 1 File name: " + chair1.getImageString());
        
        Chair chair2 = new Chair(false, 1, 1);
        System.out.println("Chair 2 Price: " + chair2.getItemPrice());
        System.out.println("Chair 2 File name: " + chair2.getImageString());
         
        Table table1 = new Table(120,0,0);
        System.out.println("Table 1 Price: " + table1.getItemPrice());
        System.out.println("Table 1 File name: " + table1.getImageString());
        
        Table table2 = new Table(100,1,1);
        System.out.println("Table 2 Price: " + table2.getItemPrice());
        System.out.println("Table 2 File name: " + table2.getImageString());
                
        Desk desk1 = new Desk(3,150,50,1);
        System.out.println("Desk 1 Price: " + desk1.getItemPrice());
        System.out.println("Desk1 File name: " + desk1.getImageString());
    }
}
