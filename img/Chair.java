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
public class Chair extends Furniture
{
    private static final int STANDARD_UNITS = 1625;
    private static final int ARM_UNITS = 250;
    private boolean hasArms;

    public Chair()
    {
        hasArms = false;
        woodType = woodTypes.OAK;
        quantity = 1;
        calculatePrice();
    }

    public Chair(boolean hasArms, int woodType, int quantity)
    {
        this.hasArms = hasArms;      
        setWoodType(woodType);
        this.quantity = quantity;
        calculatePrice();       
    }
    
    public boolean getHasArms()
    {
        return hasArms;
    }
    
    public void setHasArms(boolean hasArms)
    {
        this.hasArms = hasArms;
    } 
    
    @Override
    protected final void calculatePrice()
    {
        itemPrice = STANDARD_UNITS;
        itemPrice += (hasArms) ? ARM_UNITS : 0;          
        itemPrice *= unitPrice;
        itemPrice *= quantity;
    }

    @Override
    protected String getImageString()
    {
        String path = "";
        path += (getWoodType() == 0) ? "Oak" : "Walnut";
        path += " - Chair - ";
        path += (hasArms) ? "Arms" : "No Arms";
        return path;
    }
}
