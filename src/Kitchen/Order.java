package Kitchen;

import java.util.ArrayList;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmed
 */
@Root (name = "order" ,strict = false)
public class Order {
    
    @ElementList (entry = "dish" , inline = true)
    ArrayList<Dish> dishes;
    @Element (name = "table_number")
    private int TableNum;
    @Element (name = "order_price")
    private double OrderPrice=0;
    @Element (name = "CustomerName")
    private String CustomerName;
    @Element (name = "PriceWithoutTax")
    private double PriceWithoutTax=0;
    @Element (name = "isCooked")
    private boolean Cooked;

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }
    
    public ArrayList<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(ArrayList<Dish> dishes) {
        this.dishes = dishes;
    }


    public int getTableNum() {
        return TableNum;
    }

    public void setTableNum(int TableNum) {
        this.TableNum = TableNum;
    }

    public double getOrderPrice() {
        return OrderPrice;
    }
    
//    public void addDish (Dish toADD){
//        dishes.add(toADD);
//    }
    
    public void calcOrderPrice (){
        dishes.forEach((var)-> this.PriceWithoutTax+=var.getDishPrice());
    }
    
    public void calcTotalOrderPrice (){
        dishes.forEach((var)-> this.OrderPrice+=var.calcDishTotalPrice());        
    }

    public double getPriceWithoutTax() {
        return PriceWithoutTax;
    }

    public void setPriceWithoutTax(double PriceWithoutTax) {
        this.PriceWithoutTax = PriceWithoutTax;
    }

    public void setOrderPrice(double OrderPrice) {
        this.OrderPrice = OrderPrice;
    }

    public boolean isCooked() {
        return Cooked;
    }

    public void setCooked(boolean Cooked) {
        this.Cooked = Cooked;
    }
    
    
    
}

