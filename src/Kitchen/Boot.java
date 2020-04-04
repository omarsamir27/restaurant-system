package Kitchen;
import java.io.File;
import java.util.ArrayList;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import javax.swing.*;

public class Boot {
    static  String jarParent;
   static public restaurantAgent BootRestaurant(String filename) throws Exception{
           Serializer serializer = new Persister();
           File file;
            Restaurant restaurantData;
           try{
                file = new File(filename);
                restaurantData = serializer.read(Restaurant.class,file,false);
           }
           catch (Exception ex){
               JFileChooser getInput = new JFileChooser();
               getInput.setDialogTitle("Please Navigate to and choose input.xml");
               getInput.showOpenDialog(null);
               file=getInput.getSelectedFile();
                restaurantData = serializer.read(Restaurant.class,file,false);
           }
           restaurantAgent finalData = new restaurantAgent();
           finalData.setTables(restaurantData.getTables());
           finalData.setDishes(restaurantData.getDishes());
           ArrayList<User> people = new ArrayList<User>();

           Human human = new Human();

           for(User user : restaurantData.getUsers().getPersons()){
               switch(user.getRole()){
                   case "Manager":
                       Manager manager = new Manager();
                       manager.setName(user.getName());
                       manager.setPassword(user.getPassword());
                       manager.setUsername(user.getUsername());
                       manager.setRole("Manager");
                       people.add(manager);
                       break;
                   case "Cooker":
                       Cooker cooker = new Cooker();
                       cooker.setName(user.getName());
                       cooker.setPassword(user.getPassword());
                       cooker.setUsername(user.getUsername());
                       cooker.setRole("Cook");
                       people.add(cooker);
                       break;
                   case "Client":
                       Customer customer = new Customer();
                       customer.setName(user.getName());
                       customer.setPassword(user.getPassword());
                       customer.setUsername(user.getUsername());
                       customer.setRole("Client");
                       people.add(customer);
                       break;
                   case "Waiter":
                       Waiter waiter = new Waiter();
                       waiter.setName(user.getName());
                       waiter.setPassword(user.getPassword());
                       waiter.setUsername(user.getUsername());
                       waiter.setRole("Waiter");
                       people.add(waiter);
                       break;
               }
           }
           human.setPeople(people);
           finalData.setUsers(human);
           return finalData;

       } }
           
         
 
   
           
