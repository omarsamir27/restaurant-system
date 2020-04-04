package Kitchen;
import java.io.File;
import java.net.URLDecoder;

import org.simpleframework.xml.*;
import org.simpleframework.xml.core.Persister;
import javax.swing.*;
public class main {

    
    public static void main(String[] args) throws Exception{
        String insideJar = main.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        String step = new File(insideJar).getParentFile().getPath();
        String jarParent = URLDecoder.decode(step, "UTF-8");
        restaurantAgent DATA = new restaurantAgent();
        Serializer serializer = new Persister();
      try{
          if(System.getProperty("os.name").contains("Windows")){
              jarParent=jarParent.concat("\\final.xml");
          }
          else{
              jarParent=jarParent.concat("/final.xml");
          }
          File dataBaseXML= new File(jarParent);
          DATA= serializer.read(DATA.getClass(),dataBaseXML);
      }catch (Exception e) {
          jarParent=jarParent.replace("final.xml","input.xml");
          restaurantAgent bootdata = Boot.BootRestaurant(jarParent);
          jarParent=jarParent.replace("input.xml","final.xml");
          File dataBaseXML= new File(jarParent);
          dataBaseXML.createNewFile();
          serializer.write(bootdata,dataBaseXML);
          Boot.jarParent=jarParent;
          DATA=bootdata;
          bootdata=null;
      }

      JFrame loginPage = new Start(DATA);
      loginPage.setVisible(true);
      





      
      
}
}
