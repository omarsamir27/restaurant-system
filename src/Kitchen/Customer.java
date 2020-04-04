package Kitchen;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.simpleframework.xml.Element;

/**
 *
 * @author ahmed
 */
public class Customer extends User{
 public Customer() {
    }
    @Element(name = "is_Premium",required = false)
    private boolean Premium;
    @Element(name = "discount" , required = false)
    private int Discount;

   

    
    
    

 

    public boolean isPremium() {
        return Premium;
    }

    public void setPremium(boolean Premium) {
        this.Premium = Premium;
    }

    public double getDiscount() {
        return Discount;
    }

    public void setDiscount (int Discount){
        this.Discount=Discount;
    }
}
