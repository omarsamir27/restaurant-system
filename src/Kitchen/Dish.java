package Kitchen;



import org.simpleframework.xml.Element;
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
@Root(name = "dish" , strict = false)
public class Dish {

    @Element(name = "name")
    private String DishName;
    @Element(name = "price")
    private double DishPrice;
    @Element(name = "type")
    private String DishType;   
    @Element(name = "tax" , required = false )
    private double DishTaxPercentage;
    @Element(name = "totalPrice" ,required = false )
    private double TotalDishPrice;
 

    public double getTotalDishPrice() {
        return TotalDishPrice;
    }

    public void setTotalDishPrice(double TotalDishPrice) {
        this.TotalDishPrice = TotalDishPrice;
    }


    public Dish() {
    }

//    public Dish(String DishName, String DishType, double DishPrice) {
//        this.DishName = DishName;
//        this.DishType = DishType;
//        this.DishPrice = DishPrice;
//    }

    public String getDishName() {
        return DishName;
    }

    public void setDishName(String DishName) {
        this.DishName = DishName;
    }

    public String getDishType() {
        return DishType;
    }

    public void setDishType(String DishType) {
        this.DishType = DishType;
    }

    public double getDishPrice() {
        return DishPrice;
    }

    public void setDishPrice(double DishPrice) {
        this.DishPrice = DishPrice;
    }

    public double getDishTaxPercentage() {
        return DishTaxPercentage;
    }
    

    
    
    public double calcDishTaxPercentage(String DishType){
        switch (DishType){
            case "appetizer" : this.DishTaxPercentage=10;break;
            case "main_course" : this.DishTaxPercentage=15;break;
            case "desert" : this.DishTaxPercentage=20;break;
        }
        return DishTaxPercentage;
    }
    public double calcDishTotalPrice(){
        return this.DishPrice+(calcDishTaxPercentage(this.DishType)/100*this.DishPrice);
    }
            
}
