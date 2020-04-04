
package Kitchen;
import java.io.File;
import org.simpleframework.xml.*;

import java.util.ArrayList;
import org.simpleframework.xml.core.Persister;


@Root(name = "restaurant")
public class restaurantAgent {
    @Element(name = "users")
    private  Human users;
    @Element(name = "tables")
    private Tables tables;
    @Element(name = "dishes")
    private Dishes dishes;
    @Element(name = "orders" , required = false)
    private Orders orders;
    @Element(name = "revenue",required = false)
    private double Revenue;

    public double getRevenue() {
        return Revenue;
    }

    public void setRevenue(double Revenue) {
        this.Revenue = Revenue;
    }
    
    
    
    public void writeData(String filepath) throws Exception{
        Serializer serializer = new Persister();
        File file = new File(filepath);
        serializer.write(this, file);
    }
    

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }
    
    

    public Human getUsers() {
        return users;
    }
    public Tables getTables() {
        return tables;
    }

    public void setUsers(Human users) {
        this.users = users;
    }

    public void setTables(Tables tables) {
        this.tables = tables;
    }

    public void setDishes(Dishes dishes) {
        this.dishes = dishes;
    }
    public Dishes getDishes() {
        return dishes;
    } 
    
    public Object userLogin(String username , String password , boolean isCustomer , boolean isEmployee ){
       boolean flag = false;
       if (isCustomer){
           for (User user : this.getUsers().getPeople()){
               if(user.getUsername().equals(username) && user.getPassword().equals(password)
                       && user.getClass()== Customer.class){
                   return user;
               }
           }
       if (flag == false){
           return "Incorrect Username Or Password";
       }
       }
       else if (isEmployee){
           for (User user : this.getUsers().getPeople()){
               if(user.getUsername().equals(username) && user.getPassword().equals(password)
                       && (user.getClass()== Manager.class || user.getClass()== Waiter.class || user.getClass()== Cooker.class)){
                  if (user.getClass()==Manager.class){
                       return user;
                   }
                   if (user.getClass()==Waiter.class){
                       return user;
                   }
                   if (user.getClass()==Cooker.class){
                       return user;
                   }
               }
           }
       if (flag == false){
           return "Incorrect Username Or Password";
       }
       }
       else
           return "Please Choose An Option";
       return null;
}
}

     class Orders {
        
        @ElementList(entry = "orders" , inline =true)
        private ArrayList<Order> orders;

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
        
        
        
    }
  

class Human{

    @ElementListUnion({
            @ElementList(entry = "manager",inline = true,type = Manager.class),
            @ElementList(entry = "waiter",inline = true,type = Waiter.class),
            @ElementList(entry = "cook",inline = true,type = Cooker.class),
            @ElementList(entry = "customer",inline = true,type = Customer.class)
    })
    private ArrayList<User> people;


    public Human(){

    }

    public ArrayList<User> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<User> people) {
        this.people = people;
    }
    
    
    
}
