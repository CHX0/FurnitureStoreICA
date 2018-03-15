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
public class Desk extends Furniture
{
    private int drawerCount;
    private static final int HEIGHT = 80;
    private int width;
    private int depth;

    public Desk(int drawerCount, int width, int depth, int woodType)
    {
        this.drawerCount = drawerCount;
        this.width = width;
        this.depth = depth;
        setWoodType(woodType);
        calculatePrice();
    }
    
    public Desk()
    {
        this.drawerCount = 1;
        this.width = 150;
        this.depth = 80;
        setWoodType(0);
        calculatePrice();
    }

    public int getDrawerCount()
    {
        return drawerCount;
    }
    
    public void setDrawerCount(int drawerCount)
    {
        this.drawerCount = drawerCount;
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public void setWidth(int width)
    {
        this.width = width;
    }
    
    public int getDepth()
    {
        return depth;
    }
    
    public void setDepth(int depth)
    {
        this.depth = depth;
    }
    
    @Override
    protected final void calculatePrice()
    {
        itemPrice = (((HEIGHT + width + depth) * 12) + (depth * width) * unitPrice) + (drawerCount * 850);
    }

    @Override
    protected String getImageString()
    {
        String path = "";
        path += (getWoodType() == 0) ? "Oak" : "Walnut";
        path += " - Desk - ";
        path += drawerCount + " Drawer";
        return path;
    }
    
}
