/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ica;

import javax.swing.ImageIcon;

/**
 *
 * @author s6089488
 */
public abstract class Furniture
{
    protected enum woodTypes{OAK, WALNUT}
    protected woodTypes woodType;
    protected int itemPrice;
    protected int unitPrice;
    protected int quantity;
    protected static final int OAK_PRICE = 4;
    protected static final int WALNUT_PRICE = 3;
    protected ImageIcon image;

    public final int getItemPrice()
    {
        return itemPrice;
    }

    public final int getQuantity()
    {
        return quantity;
    }

    public final void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public final ImageIcon getImage()
    {
        return image;
    }

    public final void setImage(ImageIcon image)
    {
        this.image = image;
    }

    public final int getWoodType()
    {
        switch (woodType)
        {
            case OAK:
                return 0;
            case WALNUT:
                return 1;
            default:
                return 999;
        }
    }

    public final void setWoodType(int woodType)
    {
        switch (woodType)
        {
            case 0:
                this.woodType = woodTypes.OAK;
                unitPrice = OAK_PRICE;
                break;
            case 1:
                this.woodType = woodTypes.WALNUT;
                unitPrice = WALNUT_PRICE;
                break;
            default:
                break;
        }
    }

    protected abstract void calculatePrice();
    protected abstract String getImageString();
}
