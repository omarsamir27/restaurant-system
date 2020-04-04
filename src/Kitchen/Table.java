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
@Root(name = "table")
public class Table {

    @Element(name = "number")
    private int TableNum;
    @Element(name = "number_of_seats")
    private int SeatsNum;
    @Element(name = "smoking")
    private boolean Smoking;
    @Element(name = "available" , required = false)
    private boolean Available=true;
    @Element(name = "order" , required = false)
    private Order order;
    
    
    
    public Table() {
    }

//    public Table(int TableNum, int SeatsNum, boolean Smoking) {
//        this.TableNum = TableNum;
//        this.SeatsNum = SeatsNum;
//        this.Smoking = Smoking;
//    }

    
    
    public int getTableNum() {
        return TableNum;
    }

    public int getSeatsNum() {
        return SeatsNum;
    }

    public boolean isSmoking() {
        return Smoking;
    }
   
    public boolean isAvailable() {
        return Available;
    }

    public void setTableNum(int TableNum) {
        this.TableNum = TableNum;
    }

    public void setSeatsNum(int SeatsNum) {
        this.SeatsNum = SeatsNum;
    }

    public void setSmoking(boolean Smoking) {
        this.Smoking = Smoking;
    }

    public void setAvailable(boolean Available) {
        this.Available = Available;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }
    
    
    
}
