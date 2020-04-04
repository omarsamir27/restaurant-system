package Kitchen;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.util.ArrayList;


@Root (name = "restaurant", strict = false)
public class Restaurant {
    
    @Element(name = "users")
    private  Users users;
    @Element(name = "tables")
    private Tables tables;
    @Element(name = "dishes")
    private Dishes dishes;

    public Users getUsers() {
        return users;
    }
    public Tables getTables() {
        return tables;
    }
    public Dishes getDishes() {
        return dishes;
    }   
}

 class Users {
    
    @ElementList (entry = "user" , inline = true)
    private ArrayList<User> persons;

    public ArrayList<User> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<User> persons) {
        this.persons = persons;
    }
    
}
 class Tables {
    
    @ElementList (entry = "table" , inline = true)
    private ArrayList<Table> tables;

    public ArrayList<Table> getTables() {
        return tables;
    }

    public void setTables(ArrayList<Table> tables) {
        this.tables = tables;
    }
    
    
}
 class Dishes {
    
    @ElementList (entry = "dish" , inline = true)
    private ArrayList<Dish> dishes;

    public ArrayList<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(ArrayList<Dish> dishes) {
        this.dishes = dishes;
    }
    
}


