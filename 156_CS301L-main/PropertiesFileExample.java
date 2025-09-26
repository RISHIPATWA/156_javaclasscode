import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.io.IOException;

public class PropertiesFileExample {

    //ek io stream ki error throw karani to tell what to do if file not found
    
    public static void main(String[] args ){
        try{
        Properties props=new Properties();

        //set prop
        props.setProperty("db.user", "laxmi");


        //save to a file
        FileOutputStream fos=new FileOutputStream("config.prop");
        props.store(fos, "Dtabase Configuration");
        System.out.println("Info has been stored");
        fos.close();

        //now load files
        Properties loadProps=new Properties();
        FileInputStream fis=new FileInputStream("config.properties");
        loadProps.load(fis);
        System.out.println("File has been loaded");
        fis.close();

        //print loaded values
        System.out.println("User" + loadProps.getProperty("db.user"));
        System.out.println("pass"+ loadProps.getProperty("db.password"));
        }
        catch(IOException e){
            System.out.println(e);
        }

    }
}