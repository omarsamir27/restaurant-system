package Kitchen;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
@Root(name = "user")
public  class User {
    @Element(name = "name")
    private  String name;
    @Element(name = "role", required = false)
    private  String role;
    @Element(name = "username")
    private  String username;
    @Element(name = "password")
    private  String password;
    public User(){}

  

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }  

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
   
    
}
