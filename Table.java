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
public class Table extends Furniture
{

    @Override
    protected String getImageString()
    {
        String path = "";
        path += (getWoodType() == 0) ? "Oak" : "Walnut";
        path += " - Table - ";
        path += (baseType == baseTypes.WOOD) ? " Wooden" : " Chrome";
        path += " Base";
        return path;
    }
    enum baseTypes{WOOD, CHROME}
    private int diameter;
    private baseTypes baseType;
    private static final int WOOD_PRICE = 4500;
    private static final int CHROME_PRICE = 3500;

    public Table(int diameter, int woodType, int baseType)
    {
        this.diameter = diameter;
        setWoodType(woodType);
        setBaseType(baseType);
        calculatePrice();
    }

    public Table()
    {
        diameter = 100;
        calculatePrice();
    } 

    public int getDiameter()
    {
        return diameter;
    }

    public void setDiameter(int diameter)
    {
        this.diameter = diameter;
    }
    
    public int getBaseType()
    {
        switch (baseType)
        {
            case WOOD:
                return 0;
            case CHROME:
                return 1;
            default:
                return 999;
        }
    }

    public final void setBaseType(int baseType)
    {
        switch (baseType)
        {
            case 0:
                this.baseType = baseTypes.WOOD;
                break;
            case 1:
                this.baseType = baseTypes.CHROME;
                break;
            default:
                break;
        }
    }
    
    @Override
    protected final void calculatePrice()
    {
        itemPrice = (diameter * diameter);
        itemPrice *= unitPrice;
        
        switch(baseType)
        {
            case WOOD:
                itemPrice += WOOD_PRICE;
                break;
            case CHROME:
                itemPrice += CHROME_PRICE;
                break;
        }
    }
}
